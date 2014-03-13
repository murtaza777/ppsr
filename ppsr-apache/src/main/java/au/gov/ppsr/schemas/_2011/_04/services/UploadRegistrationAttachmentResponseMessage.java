
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.UploadRegistrationAttachmentResponseTypeType;


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
 *         &lt;element name="UploadRegistrationAttachmentResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}UploadRegistrationAttachmentResponseType" minOccurs="0"/>
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
    "uploadRegistrationAttachmentResponse"
})
@XmlRootElement(name = "UploadRegistrationAttachmentResponseMessage")
public class UploadRegistrationAttachmentResponseMessage {

    @XmlElementRef(name = "UploadRegistrationAttachmentResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<UploadRegistrationAttachmentResponseTypeType> uploadRegistrationAttachmentResponse;

    /**
     * Gets the value of the uploadRegistrationAttachmentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UploadRegistrationAttachmentResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<UploadRegistrationAttachmentResponseTypeType> getUploadRegistrationAttachmentResponse() {
        return uploadRegistrationAttachmentResponse;
    }

    /**
     * Sets the value of the uploadRegistrationAttachmentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UploadRegistrationAttachmentResponseTypeType }{@code >}
     *     
     */
    public void setUploadRegistrationAttachmentResponse(JAXBElement<UploadRegistrationAttachmentResponseTypeType> value) {
        this.uploadRegistrationAttachmentResponse = ((JAXBElement<UploadRegistrationAttachmentResponseTypeType> ) value);
    }

}
