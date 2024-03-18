/* eslint-disable no-console */
var fs = require("fs");
var path = require("path");


var introspectionQuery_1 = require("graphql/utilities/introspectionQuery");
var buildClientSchema_1 = require("graphql/utilities/buildClientSchema");
var printSchema_1 = require("graphql/utilities/schemaPrinter");
var query = require("querystringify");

let sync = false
// const del = require('del');
// const fs = require('fs');

// Makes the script crash on unhandled rejections instead of silently
// ignoring them. In the future, promise rejections that are not handled will
// terminate the Node.js process with a non-zero exit code.
process.on("unhandledRejection", err => {
  throw err
})


/**
 *
 * Normalizes header input from CLI
 *
 * @param cli
 */
function getHeadersFromInput(cli) {
    switch (typeof cli.flags.header) {
      case "string": {
        const keys = query.parse(cli.flags.header)
        const key = Object.keys(keys)[0]
        return [{ key: key, value: keys[key] }]
      }
      case "object": {
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
  
  /**
   *
   * Fetch remote schema and turn it into string
   *
   * @param endpoint
   * @param options
   */
async function getRemoteSchema(endpoint, options) {
    try {
      const valret = await fetch(endpoint, options)
  
      const jsonVal = await valret.json()
      const data = jsonVal.data;
      const errors = jsonVal.errors
      const message = jsonVal.message
  
      const errorMessage = errors || message
      if (errorMessage) {
        return { status: "err", message: JSON.stringify(errorMessage, null, 2) }
      }
  
      const schema = buildClientSchema_1.buildClientSchema(data)
      return {
        status: "ok",
        schema: printSchema_1.printSchema(schema)
      }

    } catch (err) {
      return { status: "err", message: err.message }
    }
  }
  
  /**
   *
   * Prints schema to file.
   *
   * @param dist
   * @param schema
   */
  function printToFile(dist, schema) {
    try {
      const output = path.resolve(process.cwd(), dist)
  
      /*
      if (!fs.existsSync(output)) {
        mkdirp.sync(output)
      }
      */
      fs.writeFileSync(output, schema)
  
      return { status: "ok", path: output }
    } catch (err) {
      return { status: "err", message: err.message }
    }
  }
  

async function launchScripts(businnesSchema) {
  let api_key = ""
  //Sync mode

  let endpoint
  let envVar
  let fileName
  if (businnesSchema) {
    endpoint = "https://graphqlapi.docoon.com/api/BusinessApi"
    envVar = "EndpointBusiness="
    fileName = "./schema.graphql"
  } else {
    endpoint = "https://graphqlcommonapi.docoon.com/api/CommonApi"
    envVar = "EndpointCommon="
    fileName = "./common_schema.graphql"
  }

  process.argv.forEach((value, index) => {
    if (value.startsWith("ApiKey=")) {
      api_key = value.substring(7)
    } else if (value.startsWith(envVar)) {
      endpoint = value.substring(envVar.length)
    }
  })

  api_key = '6yPVSYtCvecgMoOIGCj2A/EXNV7dcPJ+VYENb+zip+A='

  console.log("ApiKey =" + api_key + ", Endpoint=" + endpoint)

  const myHeaders = new Headers()
  myHeaders.append("Content-Type", "application/json")
  myHeaders.append("ApiKey", api_key)

  const requestOptions = {
    method: "POST",
    headers: myHeaders,
    body: JSON.stringify({ query: introspectionQuery_1.introspectionQuery })
  }

  const valret = await getRemoteSchema(endpoint, requestOptions)
  if (valret.status == "err") {
    console.error(valret.message)
    return
  } else if (valret.status == "ok") {
    const schema = valret.schema
    const valret2 = printToFile(fileName, schema)
    if (valret2.status == "err") {
      console.error(valret2.message)
      return
    } else {
      console.log("File generated:" + fileName)
    }
  } else {
    console.error(valret)
    return
  }
}

launchScripts(true)
launchScripts(false)