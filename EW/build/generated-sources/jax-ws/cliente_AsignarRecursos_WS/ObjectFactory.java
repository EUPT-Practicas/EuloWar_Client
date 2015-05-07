
package cliente_AsignarRecursos_WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente_AsignarRecursos_WS package. 
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

    private final static QName _AsignarMina_QNAME = new QName("http://webservices/", "asignarMina");
    private final static QName _AsignarRecursos_QNAME = new QName("http://webservices/", "asignarRecursos");
    private final static QName _AsignarRecursosResponse_QNAME = new QName("http://webservices/", "asignarRecursosResponse");
    private final static QName _AsignarMinaResponse_QNAME = new QName("http://webservices/", "asignarMinaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente_AsignarRecursos_WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsignarMinaResponse }
     * 
     */
    public AsignarMinaResponse createAsignarMinaResponse() {
        return new AsignarMinaResponse();
    }

    /**
     * Create an instance of {@link AsignarRecursosResponse }
     * 
     */
    public AsignarRecursosResponse createAsignarRecursosResponse() {
        return new AsignarRecursosResponse();
    }

    /**
     * Create an instance of {@link AsignarRecursos }
     * 
     */
    public AsignarRecursos createAsignarRecursos() {
        return new AsignarRecursos();
    }

    /**
     * Create an instance of {@link AsignarMina }
     * 
     */
    public AsignarMina createAsignarMina() {
        return new AsignarMina();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarMina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarMina")
    public JAXBElement<AsignarMina> createAsignarMina(AsignarMina value) {
        return new JAXBElement<AsignarMina>(_AsignarMina_QNAME, AsignarMina.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarRecursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarRecursos")
    public JAXBElement<AsignarRecursos> createAsignarRecursos(AsignarRecursos value) {
        return new JAXBElement<AsignarRecursos>(_AsignarRecursos_QNAME, AsignarRecursos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarRecursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarRecursosResponse")
    public JAXBElement<AsignarRecursosResponse> createAsignarRecursosResponse(AsignarRecursosResponse value) {
        return new JAXBElement<AsignarRecursosResponse>(_AsignarRecursosResponse_QNAME, AsignarRecursosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarMinaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarMinaResponse")
    public JAXBElement<AsignarMinaResponse> createAsignarMinaResponse(AsignarMinaResponse value) {
        return new JAXBElement<AsignarMinaResponse>(_AsignarMinaResponse_QNAME, AsignarMinaResponse.class, null, value);
    }

}
