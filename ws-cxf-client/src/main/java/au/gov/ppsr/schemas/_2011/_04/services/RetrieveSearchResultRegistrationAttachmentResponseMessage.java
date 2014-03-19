
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveSearchResultRegistrationAttachmentResponseTypeType;


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
 *         &lt;element name="RetrieveSearchResultRegistrationAttachmentResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveSearchResultRegistrationAttachmentResponseType" minOccurs="0"/>
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
    "retrieveSearchResultRegistrationAttachmentResponse"
})
@XmlRootElement(name = "RetrieveSearchResultRegistrationAttachmentResponseMessage")
public class RetrieveSearchResultRegistrationAttachmentResponseMessage {

    @XmlElementRef(name = "RetrieveSearchResultRegistrationAttachmentResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveSearchResultRegistrationAttachmentResponseTypeType> retrieveSearchResultRegistrationAttachmentResponse;

    /**
     * Gets the value of the retrieveSearchResultRegistrationAttachmentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchResultRegistrationAttachmentResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveSearchResultRegistrationAttachmentResponseTypeType> getRetrieveSearchResultRegistrationAttachmentResponse() {
        return retrieveSearchResultRegistrationAttachmentResponse;
    }

    /**
     * Sets the value of the retrieveSearchResultRegistrationAttachmentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveSearchResultRegistrationAttachmentResponseTypeType }{@code >}
     *     
     */
    public void setRetrieveSearchResultRegistrationAttachmentResponse(JAXBElement<RetrieveSearchResultRegistrationAttachmentResponseTypeType> value) {
        this.retrieveSearchResultRegistrationAttachmentResponse = ((JAXBElement<RetrieveSearchResultRegistrationAttachmentResponseTypeType> ) value);
    }

}
