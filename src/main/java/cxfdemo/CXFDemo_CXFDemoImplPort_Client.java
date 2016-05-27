
package cxfdemo;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-04-07T16:29:30.490+08:00
 * Generated source version: 2.7.18
 * 
 */
public final class CXFDemo_CXFDemoImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://cxfdemo/", "CXFDemoImplService");
    
    // private static final QName SERVICE_NAME = new QName("http://localhost:8081/cxfdemo/services/cxfdemo?wsdl", "CXFDemoImplService");

    private CXFDemo_CXFDemoImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CXFDemoImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CXFDemoImplService ss = new CXFDemoImplService(wsdlURL, SERVICE_NAME);
        CXFDemo port = ss.getCXFDemoImplPort();  
        
        {
        System.out.println("Invoking sayHello...");
        // java.lang.String _sayHello_arg0 = "";
        java.lang.String _sayHello_arg0 = "CXF Web Service Demo";    
            
        java.lang.String _sayHello__return = port.sayHello(_sayHello_arg0);
        System.out.println("sayHello.result=" + _sayHello__return);


        }

        System.exit(0);
    }

}