
package com.fuzzy.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2.11
 * 
 */
@XmlRootElement(name = "JAXBException", namespace = "http://service.fuzzy.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JAXBException", namespace = "http://service.fuzzy.com/", propOrder = {
    "errorCode",
    "linkedException",
    "message"
})
public class JAXBExceptionBean {

    private String errorCode;
    private Throwable linkedException;
    private String message;

    /**
     * 
     * @return
     *     returns String
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * 
     * @param errorCode
     *     the value for the errorCode property
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 
     * @return
     *     returns Throwable
     */
    public Throwable getLinkedException() {
        return this.linkedException;
    }

    /**
     * 
     * @param linkedException
     *     the value for the linkedException property
     */
    public void setLinkedException(Throwable linkedException) {
        this.linkedException = linkedException;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * 
     * @param message
     *     the value for the message property
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
