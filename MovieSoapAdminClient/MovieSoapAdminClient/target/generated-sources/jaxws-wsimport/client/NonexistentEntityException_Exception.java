
package client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NonexistentEntityException", targetNamespace = "http://services.moviesoapservice.movie.com/")
public class NonexistentEntityException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NonexistentEntityException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public NonexistentEntityException_Exception(String message, NonexistentEntityException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public NonexistentEntityException_Exception(String message, NonexistentEntityException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: client.NonexistentEntityException
     */
    public NonexistentEntityException getFaultInfo() {
        return faultInfo;
    }

}
