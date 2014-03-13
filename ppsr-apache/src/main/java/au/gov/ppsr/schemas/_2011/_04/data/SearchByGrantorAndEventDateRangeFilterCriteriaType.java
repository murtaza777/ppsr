
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchByGrantorAndEventDateRangeFilterCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByGrantorAndEventDateRangeFilterCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationEventFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegistrationEventToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByGrantorAndEventDateRangeFilterCriteria", propOrder = {
    "registrationEventFromDate",
    "registrationEventToDate"
})
public class SearchByGrantorAndEventDateRangeFilterCriteriaType {

    @XmlElement(name = "RegistrationEventFromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationEventFromDate;
    @XmlElement(name = "RegistrationEventToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationEventToDate;

    /**
     * Gets the value of the registrationEventFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationEventFromDate() {
        return registrationEventFromDate;
    }

    /**
     * Sets the value of the registrationEventFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationEventFromDate(XMLGregorianCalendar value) {
        this.registrationEventFromDate = value;
    }

    /**
     * Gets the value of the registrationEventToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationEventToDate() {
        return registrationEventToDate;
    }

    /**
     * Sets the value of the registrationEventToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationEventToDate(XMLGregorianCalendar value) {
        this.registrationEventToDate = value;
    }

}
