# zuul-routes-issue


rest-api 
request - 
   http://localhost:9090/rest-api/item
response -
   {"code":"1","name":"One","links":[{"rel":"self","href":"http://localhost:9090/rest-api/itemDetails"}]}


api-gateway
request - 
  http://localhost:8080/api-gateway/rest-url/item
response -
  {"code":"1","name":"One","links":[{"rel":"self","href":"http://localhost:8080/api-gateway/rest-url/rest-api/itemDetails"}]}
  
  this response link additional path added.  