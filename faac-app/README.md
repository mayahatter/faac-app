#RDBMS
Come RDBMS è stato utilizzato mysql

#ORM
Come ORM è stato utilizzato il JPA EntityManager di Hibernate facilmente integrabile in spring-boot

#API REST
L'API rest espone vari metodi per la manipolazione dell'oggetto User che rappresenta l'utente.

L'API è documentata tramite swagger 2 esposto all'indirizzo
http://localhost:6868/swagger-ui.html

#SOAP
Il wsdl del web service SOAP si trova al seguente indirizzo:

http://localhost:6868/ws/users.wsdl

<soapenv:Envelope 
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:dto="http://com.faac/soap/dto">
   <soapenv:Header/>
   <soapenv:Body>
      <dto:getLoggedUsersRequest/>
   </soapenv:Body>
</soapenv:Envelope>


Esempio di risposta
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


#PRESENTATION
Come client è stato utilizzato angularJS, in modalità MvvM:
- user.service.js è il model
- general.controller.js è il viewModel
- index.html è la view
che viene lanciato su un tomcat

#CONTAINER
Il tutto è stato dockerizzato all'interno dello stesso container (db, api rest/soap, tomcat su cui gira la webapp)
e lanciabile tramite docker-compose

Per lanciare il container docker, presupponendo di avere già installato Docker Desktop sulla propria macchina, 
bisogna:

- aprire un terminale cmd e posizionarsi nella root del progetto
- lanciare dal terminale il comando "docker-compose up --build" ed attendere che tutte le componenti 
vengano caricate

- il frontend è esposto sulla porta 6868 ed è raggiunibile all'url http://localhost:6868/

- per terminare l'esecuzione del container lanciare il comando "docker-compose down"