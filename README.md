# docoon-samples

GraphQL samples for the Docoon API.
This project is an add-on to the Documentation API:
https://docgraphapi.docoon.com/

# How to use this project ?

You can directly use the generated examples and files or generate your own files. 

## Generate your own files

### Install
1. Install Node.js 18
https://nodejs.org/en/

2. Intall the modules

```cmd
npm install
```

### Generate the files

Run this command in the root folder:
```cmd
npm generate
```

## Get the last graphql schema

1. Create a .env file in the root folder with your ApiKey

```cmd
ApiKey=<YourApiKeyGeneratedFronWebsite>
Endpoint=https://graphqlapi.docoon.com/api/BusinessApi
```

2. Launch the loadschema cmd file in the root folder
```cmd
loadschema.cmd
```