FOR /F "eol=# tokens=*" %%i IN (%~dp0.env) DO SET %%i
set mypath=%cd%
cd /D "get-schema"
echo "ApiKey=%ApiKey%"
echo "EndpointBusiness=%EndpointBusiness%"
echo "EndpointCommon=%EndpointCommon%"
npm run loadschema ApiKey=%ApiKey% EndpointBusiness=%EndpointBusiness% EndpointCommon=%EndpointCommon%
cd mypath 