
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.TransferSingleRegistrationRequestTypeType;


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
 *         &lt;element name="TransferSingleRegistrationRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}TransferSingleRegistrationRequestType" minOccurs="0"/>
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
    "transferSingleRegistrationRequest"
})
@XmlRootElement(name = "TransferSingleRegistrationRequestMessage")
public class TransferSingleRegistrationRequestMessage {

    @XmlElementRef(name = "TransferSingleRegistrationRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<TransferSingleRegistrationRequestTypeType> transferSingleRegistrationRequest;

    /**
     * Gets the value of the transferSingleRegistrationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferSingleRegistrationRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<TransferSingleRegistrationRequestTypeType> getTransferSingleRegistrationRequest() {
        return transferSingleRegistrationRequest;
    }

    /**
     * Sets the value of the transferSingleRegistrationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferSingleRegistrationRequestTypeType }{@code >}
     *     
     */
    public void setTransferSingleRegistrationRequest(JAXBElement<TransferSingleRegistrationRequestTypeType> value) {
        this.transferSingleRegistrationRequest = ((JAXBElement<TransferSingleRegistrationRequestTypeType> ) value);
    }

}
