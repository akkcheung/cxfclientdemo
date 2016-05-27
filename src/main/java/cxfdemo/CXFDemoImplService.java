package cxfdemo;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-04-07T16:29:30.520+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "CXFDemoImplService", 
                  wsdlLocation = "cxfdemo_wsdl",
                  targetNamespace = "http://cxfdemo/") 
public class CXFDemoImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cxfdemo/", "CXFDemoImplService");
    public final static QName CXFDemoImplPort = new QName("http://cxfdemo/", "CXFDemoImplPort");
    static {
        URL url = CXFDemoImplService.class.getResource("cxfdemo_wsdl");
        if (url == null) {
            url = CXFDemoImplService.class.getClassLoader().getResource("cxfdemo_wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(CXFDemoImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "cxfdemo_wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public CXFDemoImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CXFDemoImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CXFDemoImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CXFDemoImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CXFDemoImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CXFDemoImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CXFDemo
     */
    @WebEndpoint(name = "CXFDemoImplPort")
    public CXFDemo getCXFDemoImplPort() {
        return super.getPort(CXFDemoImplPort, CXFDemo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CXFDemo
     */
    @WebEndpoint(name = "CXFDemoImplPort")
    public CXFDemo getCXFDemoImplPort(WebServiceFeature... features) {
        return super.getPort(CXFDemoImplPort, CXFDemo.class, features);
    }

}