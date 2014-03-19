
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.TransferAllRegistrationsRequestTypeType;


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
 *         &lt;element name="TransferAllRegistrationsRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}TransferAllRegistrationsRequestType" minOccurs="0"/>
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
    "transferAllRegistrationsRequest"
})
@XmlRootElement(name = "TransferAllRegistrationsRequestMessage")
public class TransferAllRegistrationsRequestMessage {

    @XmlElementRef(name = "TransferAllRegistrationsRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<TransferAllRegistrationsRequestTypeType> transferAllRegistrationsRequest;

    /**
     * Gets the value of the transferAllRegistrationsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferAllRegistrationsRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<TransferAllRegistrationsRequestTypeType> getTransferAllRegistrationsRequest() {
        return transferAllRegistrationsRequest;
    }

    /**
     * Sets the value of the transferAllRegistrationsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferAllRegistrationsRequestTypeType }{@code >}
     *     
     */
    public void setTransferAllRegistrationsRequest(JAXBElement<TransferAllRegistrationsRequestTypeType> value) {
        this.transferAllRegistrationsRequest = ((JAXBElement<TransferAllRegistrationsRequestTypeType> ) value);
    }

}
