
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResetRegistrationTokenRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResetRegistrationTokenRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecuredPartyGroupAccessCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecuredPartyGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetRegistrationTokenRequestType", propOrder = {
    "registrationNumber",
    "securedPartyGroupAccessCode",
    "securedPartyGroupNumber"
})
public class ResetRegistrationTokenRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;
    @XmlElement(name = "SecuredPartyGroupAccessCode", required = true, nillable = true)
    protected String securedPartyGroupAccessCode;
    @XmlElement(name = "SecuredPartyGroupNumber", required = true, nillable = true)
    protected String securedPartyGroupNumber;

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
     * Gets the value of the securedPartyGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuredPartyGroupAccessCode() {
        return securedPartyGroupAccessCode;
    }

    /**
     * Sets the value of the securedPartyGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuredPartyGroupAccessCode(String value) {
        this.securedPartyGroupAccessCode = value;
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

}
