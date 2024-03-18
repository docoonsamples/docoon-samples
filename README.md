# docoon-samples

GraphQL samples for the Docoon API.
This project is an add-on to the Documentation API:
https://docgraphapi.docoon.com/

# How to use this project ?

You can directly use the generated examples and files or generate your own files. 

## Generate your own files

### Install
1. Install GIT / Git client 
Suggestion : install https://desktop.github.com/

2. Clone this repository
```cmd
git clone https://github.com/docoonsamples/docoon-samples.git
```

3. Install Node.js 20
https://nodejs.org/en/

3. Intall the modules

```cmd
npm install
```

### Run (Generate the files)

Run this command in the root folder:
```cmd
npm run generate
```

## Get the last graphql schema

### Install
1. Create a .env file in the root folder with your ApiKey

```cmd
ApiKey=<YourApiKeyGeneratedFronWebsite>
EndpointBusiness=https://graphqlapi.docoon.com/api/BusinessApi
EndpointCommon=https://graphqlcommonapi.docoon.com/api/CommonApi
```

2. Install the modules in the get-schema folder

```cmd
cd get-schema
npm install
```

### Run (get the graphql schema)

Launch the loadschema cmd file in the root folder
```cmd
loadschema.cmd
```