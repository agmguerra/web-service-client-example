
package br.com.agmg.soaexample.stubcode;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BookCatalogService", targetNamespace = "http://webservice.soapexample.agmg.com.br/", wsdlLocation = "http://guerra-pc:8080/web-service-example/BookCatalogService?wsdl")
public class BookCatalogService
    extends Service
{

    private final static URL BOOKCATALOGSERVICE_WSDL_LOCATION;
    private final static WebServiceException BOOKCATALOGSERVICE_EXCEPTION;
    private final static QName BOOKCATALOGSERVICE_QNAME = new QName("http://webservice.soapexample.agmg.com.br/", "BookCatalogService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://guerra-pc:8080/web-service-example/BookCatalogService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKCATALOGSERVICE_WSDL_LOCATION = url;
        BOOKCATALOGSERVICE_EXCEPTION = e;
    }

    public BookCatalogService() {
        super(__getWsdlLocation(), BOOKCATALOGSERVICE_QNAME);
    }

    public BookCatalogService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKCATALOGSERVICE_QNAME, features);
    }

    public BookCatalogService(URL wsdlLocation) {
        super(wsdlLocation, BOOKCATALOGSERVICE_QNAME);
    }

    public BookCatalogService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKCATALOGSERVICE_QNAME, features);
    }

    public BookCatalogService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookCatalogService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookCatalog
     */
    @WebEndpoint(name = "BookCatalogPort")
    public BookCatalog getBookCatalogPort() {
        return super.getPort(new QName("http://webservice.soapexample.agmg.com.br/", "BookCatalogPort"), BookCatalog.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookCatalog
     */
    @WebEndpoint(name = "BookCatalogPort")
    public BookCatalog getBookCatalogPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.soapexample.agmg.com.br/", "BookCatalogPort"), BookCatalog.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKCATALOGSERVICE_EXCEPTION!= null) {
            throw BOOKCATALOGSERVICE_EXCEPTION;
        }
        return BOOKCATALOGSERVICE_WSDL_LOCATION;
    }

}
