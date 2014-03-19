
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
 * <p>Java class for RegistrationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsRegistrationEndTimeChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NewRegistrationSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="PpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RegistrationEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegistrationStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationInfo", propOrder = {
    "changeNumber",
    "isRegistrationEndTimeChanged",
    "newRegistrationSequenceNumber",
    "ppsrTransactionId",
    "registrationEndTime",
    "registrationNumber",
    "registrationStartTime"
})
public class RegistrationInfoType {

    @XmlElement(name = "ChangeNumber")
    protected long changeNumber;
    @XmlElement(name = "IsRegistrationEndTimeChanged")
    protected boolean isRegistrationEndTimeChanged;
    @XmlElement(name = "NewRegistrationSequenceNumber")
    protected short newRegistrationSequenceNumber;
    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;
    @XmlElementRef(name = "RegistrationEndTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> registrationEndTime;
    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;
    @XmlElement(name = "RegistrationStartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationStartTime;

    /**
     * Gets the value of the changeNumber property.
     * 
     */
    public long getChangeNumber() {
        return changeNumber;
    }

    /**
     * Sets the value of the changeNumber property.
     * 
     */
    public void setChangeNumber(long value) {
        this.changeNumber = value;
    }

    /**
     * Gets the value of the isRegistrationEndTimeChanged property.
     * 
     */
    public boolean isIsRegistrationEndTimeChanged() {
        return isRegistrationEndTimeChanged;
    }

    /**
     * Sets the value of the isRegistrationEndTimeChanged property.
     * 
     */
    public void setIsRegistrationEndTimeChanged(boolean value) {
        this.isRegistrationEndTimeChanged = value;
    }

    /**
     * Gets the value of the newRegistrationSequenceNumber property.
     * 
     */
    public short getNewRegistrationSequenceNumber() {
        return newRegistrationSequenceNumber;
    }

    /**
     * Sets the value of the newRegistrationSequenceNumber property.
     * 
     */
    public void setNewRegistrationSequenceNumber(short value) {
        this.newRegistrationSequenceNumber = value;
    }

    /**
     * Gets the value of the ppsrTransactionId property.
     * 
     */
    public long getPpsrTransactionId() {
        return ppsrTransactionId;
    }

    /**
     * Sets the value of the ppsrTransactionId property.
     * 
     */
    public void setPpsrTransactionId(long value) {
        this.ppsrTransactionId = value;
    }

    /**
     * Gets the value of the registrationEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRegistrationEndTime() {
        return registrationEndTime;
    }

    /**
     * Sets the value of the registrationEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRegistrationEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.registrationEndTime = ((JAXBElement<XMLGregorianCalendar> ) value);
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

    /**
     * Gets the value of the registrationStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationStartTime() {
        return registrationStartTime;
    }

    /**
     * Sets the value of the registrationStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationStartTime(XMLGregorianCalendar value) {
        this.registrationStartTime = value;
    }

}
