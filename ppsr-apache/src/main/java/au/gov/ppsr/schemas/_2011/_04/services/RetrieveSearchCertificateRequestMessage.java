
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveSearchCertificateRequestTypeType;


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
 *         &lt;element name="RetrieveSearchCertificateRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveSearchCertificateRequestType" minOccurs="0"/>
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
    "retrieveSearchCertificateRequest"
})
@XmlRootElement(name = "RetrieveSearchCertificateRequestMessage")
public class RetrieveSearchCertificateRequestMessage {

    @XmlElementRef(name = "RetrieveSearchCertificateRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveSearchCertificateRequestTypeType> retrieveSearchCertificateRequest;

    /**
     * Gets the value of the retrieveSearchCertificateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchCertificateRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveSearchCertificateRequestTypeType> getRetrieveSearchCertificateRequest() {
        return retrieveSearchCertificateRequest;
    }

    /**
     * Sets the value of the retrieveSearchCertificateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchCertificateRequestTypeType }{@code >}
     *     
     */
    public void setRetrieveSearchCertificateRequest(JAXBElement<RetrieveSearchCertificateRequestTypeType> value) {
        this.retrieveSearchCertificateRequest = ((JAXBElement<RetrieveSearchCertificateRequestTypeType> ) value);
    }

}
