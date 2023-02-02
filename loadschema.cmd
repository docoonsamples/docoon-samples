FOR /F "eol=# tokens=*" %%i IN (%~dp0.env) DO SET %%i
set mypath=%cd%
cd /D "get-schema"
npm run loadschema ApiKey=%ApiKey% Endpoint=%Endpoint%
cd mypath 