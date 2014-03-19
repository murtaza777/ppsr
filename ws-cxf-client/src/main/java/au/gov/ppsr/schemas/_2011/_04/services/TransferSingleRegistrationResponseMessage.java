
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.TransferSingleRegistrationResponseTypeType;


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
 *         &lt;element name="TransferSingleRegistrationResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}TransferSingleRegistrationResponseType" minOccurs="0"/>
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
    "transferSingleRegistrationResponse"
})
@XmlRootElement(name = "TransferSingleRegistrationResponseMessage")
public class TransferSingleRegistrationResponseMessage {

    @XmlElementRef(name = "TransferSingleRegistrationResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<TransferSingleRegistrationResponseTypeType> transferSingleRegistrationResponse;

    /**
     * Gets the value of the transferSingleRegistrationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferSingleRegistrationResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<TransferSingleRegistrationResponseTypeType> getTransferSingleRegistrationResponse() {
        return transferSingleRegistrationResponse;
    }

    /**
     * Sets the value of the transferSingleRegistrationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferSingleRegistrationResponseTypeType }{@code >}
     *     
     */
    public void setTransferSingleRegistrationResponse(JAXBElement<TransferSingleRegistrationResponseTypeType> value) {
        this.transferSingleRegistrationResponse = ((JAXBElement<TransferSingleRegistrationResponseTypeType> ) value);
    }

}
