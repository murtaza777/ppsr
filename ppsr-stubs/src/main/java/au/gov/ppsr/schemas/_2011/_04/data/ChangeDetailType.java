
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChangeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ChangeType" type="{http://schemas.ppsr.gov.au/2011/04/data}ChangeType" minOccurs="0"/>
 *         &lt;element name="RegistrationChangeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeDetail", propOrder = {
    "changeNumber",
    "changeType",
    "registrationChangeTime"
})
public class ChangeDetailType {

    @XmlElement(name = "ChangeNumber")
    protected long changeNumber;
    @XmlElement(name = "ChangeType")
    protected ChangeTypeType changeType;
    @XmlElement(name = "RegistrationChangeTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationChangeTime;

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
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeTypeType }
     *     
     */
    public ChangeTypeType getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeTypeType }
     *     
     */
    public void setChangeType(ChangeTypeType value) {
        this.changeType = value;
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

}
