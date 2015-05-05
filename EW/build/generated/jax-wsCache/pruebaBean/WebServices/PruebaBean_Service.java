
package WebServices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "pruebaBean", targetNamespace = "http://webservices/", wsdlLocation = "http://155.210.68.154:8080/pruebaBean/pruebaBean?wsdl")
public class PruebaBean_Service
    extends Service
{

    private final static URL PRUEBABEAN_WSDL_LOCATION;
    private final static WebServiceException PRUEBABEAN_EXCEPTION;
    private final static QName PRUEBABEAN_QNAME = new QName("http://webservices/", "pruebaBean");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://155.210.68.154:8080/pruebaBean/pruebaBean?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRUEBABEAN_WSDL_LOCATION = url;
        PRUEBABEAN_EXCEPTION = e;
    }

    public PruebaBean_Service() {
        super(__getWsdlLocation(), PRUEBABEAN_QNAME);
    }

    public PruebaBean_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRUEBABEAN_QNAME, features);
    }

    public PruebaBean_Service(URL wsdlLocation) {
        super(wsdlLocation, PRUEBABEAN_QNAME);
    }

    public PruebaBean_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRUEBABEAN_QNAME, features);
    }

    public PruebaBean_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PruebaBean_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PruebaBean
     */
    @WebEndpoint(name = "pruebaBeanPort")
    public PruebaBean getPruebaBeanPort() {
        return super.getPort(new QName("http://webservices/", "pruebaBeanPort"), PruebaBean.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PruebaBean
     */
    @WebEndpoint(name = "pruebaBeanPort")
    public PruebaBean getPruebaBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "pruebaBeanPort"), PruebaBean.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRUEBABEAN_EXCEPTION!= null) {
            throw PRUEBABEAN_EXCEPTION;
        }
        return PRUEBABEAN_WSDL_LOCATION;
    }

}
