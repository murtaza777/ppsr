
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SecuredPartyGroupChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecuredPartyGroupChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressForService" type="{http://schemas.ppsr.gov.au/2011/04/data}AddressForService"/>
 *         &lt;element name="ChangePpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ChangeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SecuredParties" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfSecuredParty"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuredPartyGroupChange", propOrder = {
    "addressForService",
    "changePpsrTransactionId",
    "changeTime",
    "securedParties"
})
public class SecuredPartyGroupChangeType {

    @XmlElement(name = "AddressForService", required = true, nillable = true)
    protected AddressForServiceType addressForService;
    @XmlElement(name = "ChangePpsrTransactionId")
    protected long changePpsrTransactionId;
    @XmlElement(name = "ChangeTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeTime;
    @XmlElement(name = "SecuredParties", required = true, nillable = true)
    protected ArrayOfSecuredPartyType securedParties;

    /**
     * Gets the value of the addressForService property.
     * 
     * @return
     *     possible object is
     *     {@link AddressForServiceType }
     *     
     */
    public AddressForServiceType getAddressForService() {
        return addressForService;
    }

    /**
     * Sets the value of the addressForService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressForServiceType }
     *     
     */
    public void setAddressForService(AddressForServiceType value) {
        this.addressForService = value;
    }

    /**
     * Gets the value of the changePpsrTransactionId property.
     * 
     */
    public long getChangePpsrTransactionId() {
        return changePpsrTransactionId;
    }

    /**
     * Sets the value of the changePpsrTransactionId property.
     * 
     */
    public void setChangePpsrTransactionId(long value) {
        this.changePpsrTransactionId = value;
    }

    /**
     * Gets the value of the changeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeTime() {
        return changeTime;
    }

    /**
     * Sets the value of the changeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeTime(XMLGregorianCalendar value) {
        this.changeTime = value;
    }

    /**
     * Gets the value of the securedParties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecuredPartyType }
     *     
     */
    public ArrayOfSecuredPartyType getSecuredParties() {
        return securedParties;
    }

    /**
     * Sets the value of the securedParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecuredPartyType }
     *     
     */
    public void setSecuredParties(ArrayOfSecuredPartyType value) {
        this.securedParties = value;
    }

}
