package cxfdemo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-04-07T16:29:30.513+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://cxfdemo/", name = "CXFDemo")
@XmlSeeAlso({ObjectFactory.class})
public interface CXFDemo {

    @WebResult(name = "return", targetNamespace = "")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://cxfdemo/", className = "cxfdemo.SayHelloResponse")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://cxfdemo/", className = "cxfdemo.SayHello")
    @WebMethod
    public java.lang.String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
