
package com.movie.moviesoapservice.services;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MovieService", targetNamespace = "http://services.moviesoapservice.movie.com/", wsdlLocation = "http://secure-eyrie-37089.herokuapp.com/MovieService?wsdl")
public class MovieService_Service
    extends Service
{

    private final static URL MOVIESERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIESERVICE_EXCEPTION;
    private final static QName MOVIESERVICE_QNAME = new QName("http://services.moviesoapservice.movie.com/", "MovieService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://secure-eyrie-37089.herokuapp.com/MovieService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIESERVICE_WSDL_LOCATION = url;
        MOVIESERVICE_EXCEPTION = e;
    }

    public MovieService_Service() {
        super(__getWsdlLocation(), MOVIESERVICE_QNAME);
    }

    public MovieService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIESERVICE_QNAME, features);
    }

    public MovieService_Service(URL wsdlLocation) {
        super(wsdlLocation, MOVIESERVICE_QNAME);
    }

    public MovieService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIESERVICE_QNAME, features);
    }

    public MovieService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MovieService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MovieService
     */
    @WebEndpoint(name = "MovieServicePort")
    public MovieService getMovieServicePort() {
        return super.getPort(new QName("http://services.moviesoapservice.movie.com/", "MovieServicePort"), MovieService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MovieService
     */
    @WebEndpoint(name = "MovieServicePort")
    public MovieService getMovieServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.moviesoapservice.movie.com/", "MovieServicePort"), MovieService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIESERVICE_EXCEPTION!= null) {
            throw MOVIESERVICE_EXCEPTION;
        }
        return MOVIESERVICE_WSDL_LOCATION;
    }

}
