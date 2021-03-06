
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuredPartyGroupWithVerification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecuredPartyGroupWithVerification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressForService" type="{http://schemas.ppsr.gov.au/2011/04/data}AddressForService"/>
 *         &lt;element name="SecuredParties" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfSecuredPartyWithVerification"/>
 *         &lt;element name="SecuredPartyGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecuredPartyGroupVersionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuredPartyGroupWithVerification", propOrder = {
    "addressForService",
    "securedParties",
    "securedPartyGroupNumber",
    "securedPartyGroupVersionId"
})
public class SecuredPartyGroupWithVerificationType {

    @XmlElement(name = "AddressForService", required = true, nillable = true)
    protected AddressForServiceType addressForService;
    @XmlElement(name = "SecuredParties", required = true, nillable = true)
    protected ArrayOfSecuredPartyWithVerificationType securedParties;
    @XmlElement(name = "SecuredPartyGroupNumber", required = true, nillable = true)
    protected String securedPartyGroupNumber;
    @XmlElement(name = "SecuredPartyGroupVersionId", required = true, nillable = true)
    protected String securedPartyGroupVersionId;

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
     * Gets the value of the securedParties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecuredPartyWithVerificationType }
     *     
     */
    public ArrayOfSecuredPartyWithVerificationType getSecuredParties() {
        return securedParties;
    }

    /**
     * Sets the value of the securedParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecuredPartyWithVerificationType }
     *     
     */
    public void setSecuredParties(ArrayOfSecuredPartyWithVerificationType value) {
        this.securedParties = value;
    }

    /**
     * Gets the value of the securedPartyGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuredPartyGroupNumber() {
        return securedPartyGroupNumber;
    }

    /**
     * Sets the value of the securedPartyGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuredPartyGroupNumber(String value) {
        this.securedPartyGroupNumber = value;
    }

    /**
     * Gets the value of the securedPartyGroupVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuredPartyGroupVersionId() {
        return securedPartyGroupVersionId;
    }

    /**
     * Sets the value of the securedPartyGroupVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuredPartyGroupVersionId(String value) {
        this.securedPartyGroupVersionId = value;
    }

}
