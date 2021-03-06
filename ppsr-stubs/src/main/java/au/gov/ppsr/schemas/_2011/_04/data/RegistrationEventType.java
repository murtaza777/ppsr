
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RegistrationEventType" type="{http://schemas.ppsr.gov.au/2011/04/data}RegistrationEventType"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationEvent", propOrder = {
    "changeNumber",
    "registrationEventType",
    "registrationNumber"
})
public class RegistrationEventType {

    @XmlElementRef(name = "ChangeNumber", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Long> changeNumber;
    @XmlElement(name = "RegistrationEventType", required = true)
    protected RegistrationEventTypeType registrationEventType;
    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;

    /**
     * Gets the value of the changeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getChangeNumber() {
        return changeNumber;
    }

    /**
     * Sets the value of the changeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setChangeNumber(JAXBElement<Long> value) {
        this.changeNumber = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the registrationEventType property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationEventTypeType }
     *     
     */
    public RegistrationEventTypeType getRegistrationEventType() {
        return registrationEventType;
    }

    /**
     * Sets the value of the registrationEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationEventTypeType }
     *     
     */
    public void setRegistrationEventType(RegistrationEventTypeType value) {
        this.registrationEventType = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

}
