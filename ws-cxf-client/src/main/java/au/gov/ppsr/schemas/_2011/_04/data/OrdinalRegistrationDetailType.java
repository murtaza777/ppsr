
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrdinalRegistrationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdinalRegistrationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsAccessRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsArchived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsRemoved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RegistrationEvent" type="{http://schemas.ppsr.gov.au/2011/04/data}RegistrationEvent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdinalRegistrationDetail", propOrder = {
    "eventTime",
    "isAccessRestricted",
    "isArchived",
    "isRemoved",
    "registrationEvent"
})
public class OrdinalRegistrationDetailType {

    @XmlElementRef(name = "EventTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> eventTime;
    @XmlElementRef(name = "IsAccessRestricted", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Boolean> isAccessRestricted;
    @XmlElement(name = "IsArchived")
    protected boolean isArchived;
    @XmlElement(name = "IsRemoved")
    protected boolean isRemoved;
    @XmlElement(name = "RegistrationEvent", required = true, nillable = true)
    protected RegistrationEventType registrationEvent;

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEventTime(JAXBElement<XMLGregorianCalendar> value) {
        this.eventTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the isAccessRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAccessRestricted() {
        return isAccessRestricted;
    }

    /**
     * Sets the value of the isAccessRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAccessRestricted(JAXBElement<Boolean> value) {
        this.isAccessRestricted = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the isArchived property.
     * 
     */
    public boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Sets the value of the isArchived property.
     * 
     */
    public void setIsArchived(boolean value) {
        this.isArchived = value;
    }

    /**
     * Gets the value of the isRemoved property.
     * 
     */
    public boolean isIsRemoved() {
        return isRemoved;
    }

    /**
     * Sets the value of the isRemoved property.
     * 
     */
    public void setIsRemoved(boolean value) {
        this.isRemoved = value;
    }

    /**
     * Gets the value of the registrationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationEventType }
     *     
     */
    public RegistrationEventType getRegistrationEvent() {
        return registrationEvent;
    }

    /**
     * Sets the value of the registrationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationEventType }
     *     
     */
    public void setRegistrationEvent(RegistrationEventType value) {
        this.registrationEvent = value;
    }

}
