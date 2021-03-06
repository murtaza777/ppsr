
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
 * <p>Java class for AmendRegistrationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendRegistrationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="ChangeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsRegistrationEndTimeChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RegistrationChangeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegistrationEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendRegistrationResponseType", propOrder = {
    "changeNumber",
    "isRegistrationEndTimeChanged",
    "ppsrTransactionId",
    "registrationChangeTime",
    "registrationEndTime",
    "registrationNumber"
})
public class AmendRegistrationResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "ChangeNumber")
    protected long changeNumber;
    @XmlElement(name = "IsRegistrationEndTimeChanged")
    protected boolean isRegistrationEndTimeChanged;
    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;
    @XmlElement(name = "RegistrationChangeTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationChangeTime;
    @XmlElementRef(name = "RegistrationEndTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> registrationEndTime;
    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;

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
     * Gets the value of the registrationChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationChangeTime() {
        return registrationChangeTime;
    }

    /**
     * Sets the value of the registrationChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationChangeTime(XMLGregorianCalendar value) {
        this.registrationChangeTime = value;
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

}
