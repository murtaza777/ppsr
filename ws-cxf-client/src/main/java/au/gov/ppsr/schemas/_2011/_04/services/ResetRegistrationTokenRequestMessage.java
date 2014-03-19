
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.ResetRegistrationTokenRequestTypeType;


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
 *         &lt;element name="ResetRegistrationTokenRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}ResetRegistrationTokenRequestType" minOccurs="0"/>
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
    "resetRegistrationTokenRequest"
})
@XmlRootElement(name = "ResetRegistrationTokenRequestMessage")
public class ResetRegistrationTokenRequestMessage {

    @XmlElementRef(name = "ResetRegistrationTokenRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<ResetRegistrationTokenRequestTypeType> resetRegistrationTokenRequest;

    /**
     * Gets the value of the resetRegistrationTokenRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResetRegistrationTokenRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<ResetRegistrationTokenRequestTypeType> getResetRegistrationTokenRequest() {
        return resetRegistrationTokenRequest;
    }

    /**
     * Sets the value of the resetRegistrationTokenRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResetRegistrationTokenRequestTypeType }{@code >}
     *     
     */
    public void setResetRegistrationTokenRequest(JAXBElement<ResetRegistrationTokenRequestTypeType> value) {
        this.resetRegistrationTokenRequest = ((JAXBElement<ResetRegistrationTokenRequestTypeType> ) value);
    }

}
