package org.example.transport;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-04-12T00:03:47.920+03:00
 * Generated source version: 2.7.4
 * 
 */
@WebService(targetNamespace = "http://www.example.org/transport/", name = "transport")
@XmlSeeAlso({ObjectFactory.class})
public interface Transport {

    @WebResult(name = "track_id", targetNamespace = "")
    @RequestWrapper(localName = "Transport", targetNamespace = "http://www.example.org/transport/", className = "org.example.transport.Transport_Type")
    @WebMethod(operationName = "Transport", action = "http://www.example.org/transport/Transport")
    @ResponseWrapper(localName = "TransportResponse", targetNamespace = "http://www.example.org/transport/", className = "org.example.transport.TransportResponse")
    public java.lang.String transport(
        @WebParam(name = "pakkumus_id", targetNamespace = "")
        java.lang.String pakkumusId
    );
}
