
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveSearchCertificateRegistrationAttachmentRequestTypeType;


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
 *         &lt;element name="RetrieveSearchCertificateRegistrationAttachmentRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveSearchCertificateRegistrationAttachmentRequestType" minOccurs="0"/>
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
    "retrieveSearchCertificateRegistrationAttachmentRequest"
})
@XmlRootElement(name = "RetrieveSearchCertificateRegistrationAttachmentRequestMessage")
public class RetrieveSearchCertificateRegistrationAttachmentRequestMessage {

    @XmlElementRef(name = "RetrieveSearchCertificateRegistrationAttachmentRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveSearchCertificateRegistrationAttachmentRequestTypeType> retrieveSearchCertificateRegistrationAttachmentRequest;

    /**
     * Gets the value of the retrieveSearchCertificateRegistrationAttachmentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchCertificateRegistrationAttachmentRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveSearchCertificateRegistrationAttachmentRequestTypeType> getRetrieveSearchCertificateRegistrationAttachmentRequest() {
        return retrieveSearchCertificateRegistrationAttachmentRequest;
    }

    /**
     * Sets the value of the retrieveSearchCertificateRegistrationAttachmentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchCertificateRegistrationAttachmentRequestTypeType }{@code >}
     *     
     */
    public void setRetrieveSearchCertificateRegistrationAttachmentRequest(JAXBElement<RetrieveSearchCertificateRegistrationAttachmentRequestTypeType> value) {
        this.retrieveSearchCertificateRegistrationAttachmentRequest = ((JAXBElement<RetrieveSearchCertificateRegistrationAttachmentRequestTypeType> ) value);
    }

}
