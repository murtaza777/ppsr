
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.DischargeRegistrationResponseTypeType;


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
 *         &lt;element name="DischargeRegistrationResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}DischargeRegistrationResponseType" minOccurs="0"/>
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
    "dischargeRegistrationResponse"
})
@XmlRootElement(name = "DischargeRegistrationResponseMessage")
public class DischargeRegistrationResponseMessage {

    @XmlElementRef(name = "DischargeRegistrationResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<DischargeRegistrationResponseTypeType> dischargeRegistrationResponse;

    /**
     * Gets the value of the dischargeRegistrationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DischargeRegistrationResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<DischargeRegistrationResponseTypeType> getDischargeRegistrationResponse() {
        return dischargeRegistrationResponse;
    }

    /**
     * Sets the value of the dischargeRegistrationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DischargeRegistrationResponseTypeType }{@code >}
     *     
     */
    public void setDischargeRegistrationResponse(JAXBElement<DischargeRegistrationResponseTypeType> value) {
        this.dischargeRegistrationResponse = ((JAXBElement<DischargeRegistrationResponseTypeType> ) value);
    }

}
