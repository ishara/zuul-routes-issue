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
    
Note - If we remove contextPath from rest-api, this will work. But I can not remove contextPath, we have multiple war files in tomcat.     


Solution -  Thanks - Dave Syer (Pivotal)

 Include the context path in the caller
 
 zuul:
   addProxyHeaders: true
   routes:
     api:
       path: /rest-url/**
       url: http://localhost:9090
       stripPrefix: true
  
 $ curl localhost:8080/api-gateway/rest-url/rest-api/item
 {"code":"1","name":"One","links":[{"rel":"self","href":"http://localhost:8080/api-gateway/rest-url/rest-api/itemDetails"}]}      

