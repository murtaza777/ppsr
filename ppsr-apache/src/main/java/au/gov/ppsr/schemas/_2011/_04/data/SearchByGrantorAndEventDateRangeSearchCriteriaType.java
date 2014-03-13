
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchByGrantorAndEventDateRangeSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByGrantorAndEventDateRangeSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrantorIndividualSearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}GrantorIndividualSearchCriteria" minOccurs="0"/>
 *         &lt;element name="GrantorOrganisationSearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}GrantorOrganisationSearchCriteria" minOccurs="0"/>
 *         &lt;element name="GrantorType" type="{http://schemas.ppsr.gov.au/2011/04/data}GrantorType"/>
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
@XmlType(name = "SearchByGrantorAndEventDateRangeSearchCriteria", propOrder = {
    "grantorIndividualSearchCriteria",
    "grantorOrganisationSearchCriteria",
    "grantorType",
    "registrationEventFromDate",
    "registrationEventToDate"
})
public class SearchByGrantorAndEventDateRangeSearchCriteriaType {

    @XmlElementRef(name = "GrantorIndividualSearchCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<GrantorIndividualSearchCriteriaType> grantorIndividualSearchCriteria;
    @XmlElementRef(name = "GrantorOrganisationSearchCriteria", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<GrantorOrganisationSearchCriteriaType> grantorOrganisationSearchCriteria;
    @XmlElement(name = "GrantorType", required = true)
    protected GrantorTypeType grantorType;
    @XmlElement(name = "RegistrationEventFromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationEventFromDate;
    @XmlElement(name = "RegistrationEventToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationEventToDate;

    /**
     * Gets the value of the grantorIndividualSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GrantorIndividualSearchCriteriaType }{@code >}
     *     
     */
    public JAXBElement<GrantorIndividualSearchCriteriaType> getGrantorIndividualSearchCriteria() {
        return grantorIndividualSearchCriteria;
    }

    /**
     * Sets the value of the grantorIndividualSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GrantorIndividualSearchCriteriaType }{@code >}
     *     
     */
    public void setGrantorIndividualSearchCriteria(JAXBElement<GrantorIndividualSearchCriteriaType> value) {
        this.grantorIndividualSearchCriteria = ((JAXBElement<GrantorIndividualSearchCriteriaType> ) value);
    }

    /**
     * Gets the value of the grantorOrganisationSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GrantorOrganisationSearchCriteriaType }{@code >}
     *     
     */
    public JAXBElement<GrantorOrganisationSearchCriteriaType> getGrantorOrganisationSearchCriteria() {
        return grantorOrganisationSearchCriteria;
    }

    /**
     * Sets the value of the grantorOrganisationSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GrantorOrganisationSearchCriteriaType }{@code >}
     *     
     */
    public void setGrantorOrganisationSearchCriteria(JAXBElement<GrantorOrganisationSearchCriteriaType> value) {
        this.grantorOrganisationSearchCriteria = ((JAXBElement<GrantorOrganisationSearchCriteriaType> ) value);
    }

    /**
     * Gets the value of the grantorType property.
     * 
     * @return
     *     possible object is
     *     {@link GrantorTypeType }
     *     
     */
    public GrantorTypeType getGrantorType() {
        return grantorType;
    }

    /**
     * Sets the value of the grantorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantorTypeType }
     *     
     */
    public void setGrantorType(GrantorTypeType value) {
        this.grantorType = value;
    }

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
