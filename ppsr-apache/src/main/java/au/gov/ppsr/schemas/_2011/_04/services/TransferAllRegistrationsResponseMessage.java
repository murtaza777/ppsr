
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.TransferAllRegistrationsResponseTypeType;


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
 *         &lt;element name="TransferAllRegistrationsResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}TransferAllRegistrationsResponseType" minOccurs="0"/>
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
    "transferAllRegistrationsResponse"
})
@XmlRootElement(name = "TransferAllRegistrationsResponseMessage")
public class TransferAllRegistrationsResponseMessage {

    @XmlElementRef(name = "TransferAllRegistrationsResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<TransferAllRegistrationsResponseTypeType> transferAllRegistrationsResponse;

    /**
     * Gets the value of the transferAllRegistrationsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferAllRegistrationsResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<TransferAllRegistrationsResponseTypeType> getTransferAllRegistrationsResponse() {
        return transferAllRegistrationsResponse;
    }

    /**
     * Sets the value of the transferAllRegistrationsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferAllRegistrationsResponseTypeType }{@code >}
     *     
     */
    public void setTransferAllRegistrationsResponse(JAXBElement<TransferAllRegistrationsResponseTypeType> value) {
        this.transferAllRegistrationsResponse = ((JAXBElement<TransferAllRegistrationsResponseTypeType> ) value);
    }

}
