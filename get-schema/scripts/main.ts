/* eslint-disable no-console */
const { execSync, exec } = require('child_process');
const { getRemoteSchema , printToFile } = require('./getSchema');

let sync = false;
// const del = require('del');
// const fs = require('fs');

// Makes the script crash on unhandled rejections instead of silently
// ignoring them. In the future, promise rejections that are not handled will
// terminate the Node.js process with a non-zero exit code.
process.on('unhandledRejection', (err) => {
  throw err;
});


async function launchScripts(businnesSchema : boolean) {

  let api_key = '';
  //Sync mode

  let endpoint : string;
  let envVar : string;
  let fileName : string;
  if (businnesSchema) {
    endpoint = "https://graphqlapi.docoon.com/api/BusinessApi";
    envVar = "EndpointBusiness=";
    fileName= "./schema.graphql";
  } else {
    endpoint = "https://graphqlcommonapi.docoon.com/api/CommonApi";
    envVar = "EndpointCommon=";
    fileName= "./common_schema.graphql";
  }

  process.argv.forEach((value, index) => {
    if (value.startsWith("ApiKey=")) {
      api_key = value.substring(7);
    } else if (value.startsWith(envVar)) {
      endpoint = value.substring(envVar.length);
    }
  });

  console.log('ApiKey =' + api_key + ', Endpoint=' + endpoint );

  const options = {
    "method" : "POST",
    "headers" : {
        "ApiKey" : api_key,
        "Content-Type" : "application/json"
    }
  };
  const valret = await getRemoteSchema(endpoint, options);
  if (valret.status == "err") {
    console.error(valret.message);
    return;
  } else if (valret.status == "ok") {
    const schema = valret.schema;
    const valret2 = printToFile(fileName,schema);
    if (valret2.status == "err") {
      console.error(valret2.message);
      return;
    } else {
      console.log("File generated:" + fileName);
    }
  } else {
    console.error(valret);
    return;
  }

}

launchScripts(true);
launchScripts(false);