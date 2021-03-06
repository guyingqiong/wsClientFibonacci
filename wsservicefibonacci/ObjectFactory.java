
package wsservicefibonacci;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsservicefibonacci package. 
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

    private final static QName _GetGreeting_QNAME = new QName("http://wsServiceFibonacci/", "getGreeting");
    private final static QName _CalculateFibonacciResponse_QNAME = new QName("http://wsServiceFibonacci/", "calculateFibonacciResponse");
    private final static QName _CalculateFibonacci_QNAME = new QName("http://wsServiceFibonacci/", "calculateFibonacci");
    private final static QName _GetGreetingResponse_QNAME = new QName("http://wsServiceFibonacci/", "getGreetingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsservicefibonacci
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateFibonacci }
     * 
     */
    public CalculateFibonacci createCalculateFibonacci() {
        return new CalculateFibonacci();
    }

    /**
     * Create an instance of {@link CalculateFibonacciResponse }
     * 
     */
    public CalculateFibonacciResponse createCalculateFibonacciResponse() {
        return new CalculateFibonacciResponse();
    }

    /**
     * Create an instance of {@link GetGreetingResponse }
     * 
     */
    public GetGreetingResponse createGetGreetingResponse() {
        return new GetGreetingResponse();
    }

    /**
     * Create an instance of {@link GetGreeting }
     * 
     */
    public GetGreeting createGetGreeting() {
        return new GetGreeting();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGreeting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsServiceFibonacci/", name = "getGreeting")
    public JAXBElement<GetGreeting> createGetGreeting(GetGreeting value) {
        return new JAXBElement<GetGreeting>(_GetGreeting_QNAME, GetGreeting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateFibonacciResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsServiceFibonacci/", name = "calculateFibonacciResponse")
    public JAXBElement<CalculateFibonacciResponse> createCalculateFibonacciResponse(CalculateFibonacciResponse value) {
        return new JAXBElement<CalculateFibonacciResponse>(_CalculateFibonacciResponse_QNAME, CalculateFibonacciResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateFibonacci }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsServiceFibonacci/", name = "calculateFibonacci")
    public JAXBElement<CalculateFibonacci> createCalculateFibonacci(CalculateFibonacci value) {
        return new JAXBElement<CalculateFibonacci>(_CalculateFibonacci_QNAME, CalculateFibonacci.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGreetingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsServiceFibonacci/", name = "getGreetingResponse")
    public JAXBElement<GetGreetingResponse> createGetGreetingResponse(GetGreetingResponse value) {
        return new JAXBElement<GetGreetingResponse>(_GetGreetingResponse_QNAME, GetGreetingResponse.class, null, value);
    }

}
