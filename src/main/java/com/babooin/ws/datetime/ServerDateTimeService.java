
package com.babooin.ws.datetime;

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
@WebServiceClient(name = "ServerDateTimeService", targetNamespace = "http://datetime.ws.babooin.com", wsdlLocation = "http://localhost:8080/ServerDateTime/services/ServerDateTime?wsdl")
public class ServerDateTimeService
    extends Service
{

    private final static URL SERVERDATETIMESERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVERDATETIMESERVICE_EXCEPTION;
    private final static QName SERVERDATETIMESERVICE_QNAME = new QName("http://datetime.ws.babooin.com", "ServerDateTimeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServerDateTime/services/ServerDateTime?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVERDATETIMESERVICE_WSDL_LOCATION = url;
        SERVERDATETIMESERVICE_EXCEPTION = e;
    }

    public ServerDateTimeService() {
        super(__getWsdlLocation(), SERVERDATETIMESERVICE_QNAME);
    }

    public ServerDateTimeService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVERDATETIMESERVICE_QNAME, features);
    }

    public ServerDateTimeService(URL wsdlLocation) {
        super(wsdlLocation, SERVERDATETIMESERVICE_QNAME);
    }

    public ServerDateTimeService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVERDATETIMESERVICE_QNAME, features);
    }

    public ServerDateTimeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServerDateTimeService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServerDateTime
     */
    @WebEndpoint(name = "ServerDateTime")
    public ServerDateTime getServerDateTime() {
        return super.getPort(new QName("http://datetime.ws.babooin.com", "ServerDateTime"), ServerDateTime.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServerDateTime
     */
    @WebEndpoint(name = "ServerDateTime")
    public ServerDateTime getServerDateTime(WebServiceFeature... features) {
        return super.getPort(new QName("http://datetime.ws.babooin.com", "ServerDateTime"), ServerDateTime.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVERDATETIMESERVICE_EXCEPTION!= null) {
            throw SERVERDATETIMESERVICE_EXCEPTION;
        }
        return SERVERDATETIMESERVICE_WSDL_LOCATION;
    }

}