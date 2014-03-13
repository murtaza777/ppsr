
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveSearchResultRegistrationAttachmentRequestTypeType;


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
 *         &lt;element name="RetrieveSearchResultRegistrationAttachmentRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveSearchResultRegistrationAttachmentRequestType" minOccurs="0"/>
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
    "retrieveSearchResultRegistrationAttachmentRequest"
})
@XmlRootElement(name = "RetrieveSearchResultRegistrationAttachmentRequestMessage")
public class RetrieveSearchResultRegistrationAttachmentRequestMessage {

    @XmlElementRef(name = "RetrieveSearchResultRegistrationAttachmentRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveSearchResultRegistrationAttachmentRequestTypeType> retrieveSearchResultRegistrationAttachmentRequest;

    /**
     * Gets the value of the retrieveSearchResultRegistrationAttachmentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchResultRegistrationAttachmentRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveSearchResultRegistrationAttachmentRequestTypeType> getRetrieveSearchResultRegistrationAttachmentRequest() {
        return retrieveSearchResultRegistrationAttachmentRequest;
    }

    /**
     * Sets the value of the retrieveSearchResultRegistrationAttachmentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchResultRegistrationAttachmentRequestTypeType }{@code >}
     *     
     */
    public void setRetrieveSearchResultRegistrationAttachmentRequest(JAXBElement<RetrieveSearchResultRegistrationAttachmentRequestTypeType> value) {
        this.retrieveSearchResultRegistrationAttachmentRequest = ((JAXBElement<RetrieveSearchResultRegistrationAttachmentRequestTypeType> ) value);
    }

}
