//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.05.14 alle 06:33:54 PM CEST 
//


package com.faac.soap.dto;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the faac.com.soap.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: faac.com.soap.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLoggedUsersResponse }
     * 
     */
    public GetLoggedUsersResponse createGetLoggedUsersResponse() {
        return new GetLoggedUsersResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link GetLoggedUsersRequest }
     * 
     */
    public GetLoggedUsersRequest createGetLoggedUsersRequest() {
        return new GetLoggedUsersRequest();
    }

}
