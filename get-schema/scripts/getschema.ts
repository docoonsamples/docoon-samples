import fetch from 'node-fetch'
import * as fs from 'fs'
import * as path from 'path'
// import mkdirp from 'mkdirp'
import { introspectionQuery } from 'graphql/utilities/introspectionQuery'
import { buildClientSchema } from 'graphql/utilities/buildClientSchema'
import { printSchema } from 'graphql/utilities/schemaPrinter'
import * as query from 'querystringify'

/**
 *
 * Normalizes header input from CLI
 *
 * @param cli
 */
export function getHeadersFromInput(
  cli: any,
): { key: string; value: string }[] {
  switch (typeof cli.flags.header) {
    case 'string': {
      const keys = query.parse(cli.flags.header)
      const key = Object.keys(keys)[0]
      return [{ key: key, value: keys[key] }]
    }
    case 'object': {
      return cli.flags.header.map(header => {
        const keys = query.parse(header)
        const key = Object.keys(keys)[0]
        return { key: key, value: keys[key] }
      })
    }
    default: {
      return []
    }
  }
}

interface Options {
  method?: 'GET' | 'POST' | 'PUT' | 'DELETE'
  headers?: { [key: string]: string }
  json?: boolean
}

/**
 *
 * Fetch remote schema and turn it into string
 *
 * @param endpoint
 * @param options
 */
export async function getRemoteSchema(
  endpoint: string,
  options: Options,
): Promise<
  { status: 'ok'; schema: string } | { status: 'err'; message: string }
> {
  try {
    const { data, errors, message } = await fetch(endpoint, {
      method: options.method,
      headers: options.headers,
      body: JSON.stringify({ query: introspectionQuery }),
    }).then(res => res.json())

    const errorMessage = errors || message;
    if (errorMessage) {
      return { status: 'err', message: JSON.stringify(errorMessage, null, 2) }
    }

    if (options.json) {
      return {
        status: 'ok',
        schema: JSON.stringify(data, null, 2),
      }
    } else {
      const schema = buildClientSchema(data)
      return {
        status: 'ok',
        schema: printSchema(schema),
      }
    }
  } catch (err) {
    return { status: 'err', message: err.message }
  }
}

/**
 *
 * Prints schema to file.
 *
 * @param dist
 * @param schema
 */
export function printToFile(
  dist: string,
  schema: string,
): { status: 'ok'; path: string } | { status: 'err'; message: string } {
  try {
    const output = path.resolve(process.cwd(), dist)

    /*
    if (!fs.existsSync(output)) {
      mkdirp.sync(output)
    }
    */
    fs.writeFileSync(output, schema)

    return { status: 'ok', path: output }
  } catch (err) {
    return { status: 'err', message: err.message }
  }
}