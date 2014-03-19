
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.UploadRegistrationAttachmentRequestTypeType;


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
 *         &lt;element name="UploadRegistrationAttachmentRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}UploadRegistrationAttachmentRequestType" minOccurs="0"/>
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
    "uploadRegistrationAttachmentRequest"
})
@XmlRootElement(name = "UploadRegistrationAttachmentRequestMessage")
public class UploadRegistrationAttachmentRequestMessage {

    @XmlElementRef(name = "UploadRegistrationAttachmentRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<UploadRegistrationAttachmentRequestTypeType> uploadRegistrationAttachmentRequest;

    /**
     * Gets the value of the uploadRegistrationAttachmentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UploadRegistrationAttachmentRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<UploadRegistrationAttachmentRequestTypeType> getUploadRegistrationAttachmentRequest() {
        return uploadRegistrationAttachmentRequest;
    }

    /**
     * Sets the value of the uploadRegistrationAttachmentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UploadRegistrationAttachmentRequestTypeType }{@code >}
     *     
     */
    public void setUploadRegistrationAttachmentRequest(JAXBElement<UploadRegistrationAttachmentRequestTypeType> value) {
        this.uploadRegistrationAttachmentRequest = ((JAXBElement<UploadRegistrationAttachmentRequestTypeType> ) value);
    }

}
