
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RequestSearchCertificateResponseTypeType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestSearchCertificateResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}RequestSearchCertificateResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestSearchCertificateResponse"
})
@XmlRootElement(name = "RequestSearchCertificateResponseMessage")
public class RequestSearchCertificateResponseMessage {

    @XmlElementRef(name = "RequestSearchCertificateResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RequestSearchCertificateResponseTypeType> requestSearchCertificateResponse;

    /**
     * Gets the value of the requestSearchCertificateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestSearchCertificateResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<RequestSearchCertificateResponseTypeType> getRequestSearchCertificateResponse() {
        return requestSearchCertificateResponse;
    }

    /**
     * Sets the value of the requestSearchCertificateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestSearchCertificateResponseTypeType }{@code >}
     *     
     */
    public void setRequestSearchCertificateResponse(JAXBElement<RequestSearchCertificateResponseTypeType> value) {
        this.requestSearchCertificateResponse = ((JAXBElement<RequestSearchCertificateResponseTypeType> ) value);
    }

}
