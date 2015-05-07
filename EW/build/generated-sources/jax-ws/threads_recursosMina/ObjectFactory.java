
package threads_recursosMina;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the threads_recursosMina package. 
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

    private final static QName _ProducirRecursos_QNAME = new QName("http://webservices/", "producirRecursos");
    private final static QName _ProducirRecursosResponse_QNAME = new QName("http://webservices/", "producirRecursosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: threads_recursosMina
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProducirRecursosResponse }
     * 
     */
    public ProducirRecursosResponse createProducirRecursosResponse() {
        return new ProducirRecursosResponse();
    }

    /**
     * Create an instance of {@link ProducirRecursos }
     * 
     */
    public ProducirRecursos createProducirRecursos() {
        return new ProducirRecursos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducirRecursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "producirRecursos")
    public JAXBElement<ProducirRecursos> createProducirRecursos(ProducirRecursos value) {
        return new JAXBElement<ProducirRecursos>(_ProducirRecursos_QNAME, ProducirRecursos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducirRecursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "producirRecursosResponse")
    public JAXBElement<ProducirRecursosResponse> createProducirRecursosResponse(ProducirRecursosResponse value) {
        return new JAXBElement<ProducirRecursosResponse>(_ProducirRecursosResponse_QNAME, ProducirRecursosResponse.class, null, value);
    }

}
