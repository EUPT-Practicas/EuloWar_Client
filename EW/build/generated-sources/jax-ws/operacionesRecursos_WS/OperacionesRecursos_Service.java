
package operacionesRecursos_WS;

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
@WebServiceClient(name = "OperacionesRecursos", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8080/OperacionesRecursos/OperacionesRecursos?WSDL")
public class OperacionesRecursos_Service
    extends Service
{

    private final static URL OPERACIONESRECURSOS_WSDL_LOCATION;
    private final static WebServiceException OPERACIONESRECURSOS_EXCEPTION;
    private final static QName OPERACIONESRECURSOS_QNAME = new QName("http://webservices/", "OperacionesRecursos");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/OperacionesRecursos/OperacionesRecursos?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPERACIONESRECURSOS_WSDL_LOCATION = url;
        OPERACIONESRECURSOS_EXCEPTION = e;
    }

    public OperacionesRecursos_Service() {
        super(__getWsdlLocation(), OPERACIONESRECURSOS_QNAME);
    }

    public OperacionesRecursos_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPERACIONESRECURSOS_QNAME, features);
    }

    public OperacionesRecursos_Service(URL wsdlLocation) {
        super(wsdlLocation, OPERACIONESRECURSOS_QNAME);
    }

    public OperacionesRecursos_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPERACIONESRECURSOS_QNAME, features);
    }

    public OperacionesRecursos_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OperacionesRecursos_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OperacionesRecursos
     */
    @WebEndpoint(name = "OperacionesRecursosPort")
    public OperacionesRecursos getOperacionesRecursosPort() {
        return super.getPort(new QName("http://webservices/", "OperacionesRecursosPort"), OperacionesRecursos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperacionesRecursos
     */
    @WebEndpoint(name = "OperacionesRecursosPort")
    public OperacionesRecursos getOperacionesRecursosPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "OperacionesRecursosPort"), OperacionesRecursos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPERACIONESRECURSOS_EXCEPTION!= null) {
            throw OPERACIONESRECURSOS_EXCEPTION;
        }
        return OPERACIONESRECURSOS_WSDL_LOCATION;
    }

}
