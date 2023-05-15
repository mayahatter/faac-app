# FAAC-APP
Sample web app that exposes a REST api and a SOAP web service interacting with MySQL database.
 
The frontEnd is simple angularJS with MvvM Pattern Implementation.

Client and server are containerized together with Docker compose.

# LAUNCHING APP
To launch the docker container, assuming you have already the Docker Desktop installed on your machine, you'll have to: 

- navigate with cmd to the root of the project
- execute the following command
```bash
docker-compose up -d --build
```
that runs docker in detached mode, and wait for all the components to be initialized.

After the start, the webapp can be accessed from the following url
```bash
http://localhost:6868/
```

# TERMINATING APP

to terminate the execution of docker, you'll have to execute the following command: 
```bash
docker-compose down --rmi all
```


## RDBMS
The project uses mysql as rdbms

## ORM
The project uses the Hibernates' JPA EntityManager , easily integrable in spring-boot

## API REST
REST api exposes various methods for manipulating User entity.

Rest api is described and documented with swagger 2, exposed at the url
```bash
http://localhost:6868/swagger-ui.html
```

## SOAP
At the following url you will find the SOAP web service's wsdl.
```bash
http://localhost:6868/ws/users.wsdl
```

This is an example of request, you can test the call with SoapUI.
```bash
<soapenv:Envelope 
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:dto="http://com.faac/soap/dto">
   <soapenv:Header/>
   <soapenv:Body>
      <dto:getLoggedUsersRequest/>
   </soapenv:Body>
</soapenv:Envelope>
```

And the corresponding response
```bash
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
   <SOAP-ENV:Header/>
   <SOAP-ENV:Body>
      <ns2:getLoggedUsersResponse xmlns:ns2="http://com.faac/soap/dto">
         <ns2:users>
            <ns2:userid>maya88</ns2:userid>
            <ns2:nome>Lorenzo</ns2:nome>
            <ns2:cognome>Maiani</ns2:cognome>
            <ns2:email>maiani.lorenzo44@gmail.com</ns2:email>
         </ns2:users>
         <ns2:users>
            <ns2:userid>mirkone</ns2:userid>
			<ns2:nome>Mirko</ns2:nome>
            <ns2:cognome>Monti</ns2:cognome>
            <ns2:email>mirkomonti@gmail.com</ns2:email>
         </ns2:users>
      </ns2:getLoggedUsersResponse>
   </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

## PRESENTATION
angularJS with MvvM Pattern Implementation.
- user.service.js : the model
- general.controller.js :  the viewModel
- index.html : è la view

the .war is executed into tomcat


## UNIT TESTING
Simple test in the class 
```bash
UserServiceTests
```

