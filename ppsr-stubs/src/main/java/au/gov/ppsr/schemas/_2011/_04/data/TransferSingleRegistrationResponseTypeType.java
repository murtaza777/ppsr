
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransferSingleRegistrationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferSingleRegistrationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="ChangeNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IsAccessIsRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RegistrationChangeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "TransferSingleRegistrationResponseType", propOrder = {
    "changeNumber",
    "isAccessIsRestricted",
    "ppsrTransactionId",
    "registrationChangeTime",
    "registrationNumber"
})
public class TransferSingleRegistrationResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "ChangeNumber")
    protected Long changeNumber;
    @XmlElement(name = "IsAccessIsRestricted")
    protected boolean isAccessIsRestricted;
    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;
    @XmlElement(name = "RegistrationChangeTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationChangeTime;
    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;

    /**
     * Gets the value of the changeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChangeNumber() {
        return changeNumber;
    }

    /**
     * Sets the value of the changeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChangeNumber(Long value) {
        this.changeNumber = value;
    }

    /**
     * Gets the value of the isAccessIsRestricted property.
     * 
     */
    public boolean isIsAccessIsRestricted() {
        return isAccessIsRestricted;
    }

    /**
     * Sets the value of the isAccessIsRestricted property.
     * 
     */
    public void setIsAccessIsRestricted(boolean value) {
        this.isAccessIsRestricted = value;
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
