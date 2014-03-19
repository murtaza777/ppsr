
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RequestSearchCertificateRequestTypeType;


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
 *         &lt;element name="RequestSearchCertificateRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RequestSearchCertificateRequestType" minOccurs="0"/>
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
    "requestSearchCertificateRequest"
})
@XmlRootElement(name = "RequestSearchCertificateRequestMessage")
public class RequestSearchCertificateRequestMessage {

    @XmlElementRef(name = "RequestSearchCertificateRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RequestSearchCertificateRequestTypeType> requestSearchCertificateRequest;

    /**
     * Gets the value of the requestSearchCertificateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestSearchCertificateRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RequestSearchCertificateRequestTypeType> getRequestSearchCertificateRequest() {
        return requestSearchCertificateRequest;
    }

    /**
     * Sets the value of the requestSearchCertificateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestSearchCertificateRequestTypeType }{@code >}
     *     
     */
    public void setRequestSearchCertificateRequest(JAXBElement<RequestSearchCertificateRequestTypeType> value) {
        this.requestSearchCertificateRequest = ((JAXBElement<RequestSearchCertificateRequestTypeType> ) value);
    }

}
