
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrdinalSearchSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdinalSearchSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationEventOne" type="{http://schemas.ppsr.gov.au/2011/04/data}RegistrationEvent"/>
 *         &lt;element name="RegistrationEventTwo" type="{http://schemas.ppsr.gov.au/2011/04/data}RegistrationEvent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdinalSearchSearchCriteria", propOrder = {
    "registrationEventOne",
    "registrationEventTwo"
})
public class OrdinalSearchSearchCriteriaType {

    @XmlElement(name = "RegistrationEventOne", required = true, nillable = true)
    protected RegistrationEventType registrationEventOne;
    @XmlElement(name = "RegistrationEventTwo", required = true, nillable = true)
    protected RegistrationEventType registrationEventTwo;

    /**
     * Gets the value of the registrationEventOne property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationEventType }
     *     
     */
    public RegistrationEventType getRegistrationEventOne() {
        return registrationEventOne;
    }

    /**
     * Sets the value of the registrationEventOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationEventType }
     *     
     */
    public void setRegistrationEventOne(RegistrationEventType value) {
        this.registrationEventOne = value;
    }

    /**
     * Gets the value of the registrationEventTwo property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationEventType }
     *     
     */
    public RegistrationEventType getRegistrationEventTwo() {
        return registrationEventTwo;
    }

    /**
     * Sets the value of the registrationEventTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationEventType }
     *     
     */
    public void setRegistrationEventTwo(RegistrationEventType value) {
        this.registrationEventTwo = value;
    }

}
