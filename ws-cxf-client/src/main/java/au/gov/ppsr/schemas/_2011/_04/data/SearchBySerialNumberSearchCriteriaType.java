
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchBySerialNumberSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBySerialNumberSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncludeArchived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeRemoved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PointInTimeDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SerialNumberType" type="{http://schemas.ppsr.gov.au/2011/04/data}SerialNumberSearchCriteriaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBySerialNumberSearchCriteria", propOrder = {
    "includeArchived",
    "includeCurrent",
    "includeExpired",
    "includeRemoved",
    "pointInTimeDateTime",
    "serialNumber",
    "serialNumberType"
})
public class SearchBySerialNumberSearchCriteriaType {

    @XmlElement(name = "IncludeArchived")
    protected boolean includeArchived;
    @XmlElement(name = "IncludeCurrent")
    protected boolean includeCurrent;
    @XmlElement(name = "IncludeExpired")
    protected boolean includeExpired;
    @XmlElement(name = "IncludeRemoved")
    protected boolean includeRemoved;
    @XmlElementRef(name = "PointInTimeDateTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> pointInTimeDateTime;
    @XmlElement(name = "SerialNumber", required = true, nillable = true)
    protected String serialNumber;
    @XmlElement(name = "SerialNumberType", required = true)
    protected SerialNumberSearchCriteriaTypeType serialNumberType;

    /**
     * Gets the value of the includeArchived property.
     * 
     */
    public boolean isIncludeArchived() {
        return includeArchived;
    }

    /**
     * Sets the value of the includeArchived property.
     * 
     */
    public void setIncludeArchived(boolean value) {
        this.includeArchived = value;
    }

    /**
     * Gets the value of the includeCurrent property.
     * 
     */
    public boolean isIncludeCurrent() {
        return includeCurrent;
    }

    /**
     * Sets the value of the includeCurrent property.
     * 
     */
    public void setIncludeCurrent(boolean value) {
        this.includeCurrent = value;
    }

    /**
     * Gets the value of the includeExpired property.
     * 
     */
    public boolean isIncludeExpired() {
        return includeExpired;
    }

    /**
     * Sets the value of the includeExpired property.
     * 
     */
    public void setIncludeExpired(boolean value) {
        this.includeExpired = value;
    }

    /**
     * Gets the value of the includeRemoved property.
     * 
     */
    public boolean isIncludeRemoved() {
        return includeRemoved;
    }

    /**
     * Sets the value of the includeRemoved property.
     * 
     */
    public void setIncludeRemoved(boolean value) {
        this.includeRemoved = value;
    }

    /**
     * Gets the value of the pointInTimeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPointInTimeDateTime() {
        return pointInTimeDateTime;
    }

    /**
     * Sets the value of the pointInTimeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPointInTimeDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.pointInTimeDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serialNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link SerialNumberSearchCriteriaTypeType }
     *     
     */
    public SerialNumberSearchCriteriaTypeType getSerialNumberType() {
        return serialNumberType;
    }

    /**
     * Sets the value of the serialNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialNumberSearchCriteriaTypeType }
     *     
     */
    public void setSerialNumberType(SerialNumberSearchCriteriaTypeType value) {
        this.serialNumberType = value;
    }

}
