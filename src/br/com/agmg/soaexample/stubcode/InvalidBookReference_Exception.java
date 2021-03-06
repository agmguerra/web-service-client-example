
package br.com.agmg.soaexample.stubcode;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidBookReference", targetNamespace = "http://www.agmg.soapexample.com.br")
public class InvalidBookReference_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidBookReference faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidBookReference_Exception(String message, InvalidBookReference faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidBookReference_Exception(String message, InvalidBookReference faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.com.agmg.soaexample.stubcode.InvalidBookReference
     */
    public InvalidBookReference getFaultInfo() {
        return faultInfo;
    }

}
