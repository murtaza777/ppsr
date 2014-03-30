
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeAccessCodeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAccessCodeRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="CurrentSecuredPartyGroupAccessCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewSecuredPartyGroupAccessCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ChangeAccessCodeRequestType", propOrder = {
    "currentSecuredPartyGroupAccessCode",
    "newSecuredPartyGroupAccessCode",
    "securedPartyGroupNumber"
})
public class ChangeAccessCodeRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "CurrentSecuredPartyGroupAccessCode", required = true, nillable = true)
    protected String currentSecuredPartyGroupAccessCode;
    @XmlElement(name = "NewSecuredPartyGroupAccessCode", required = true, nillable = true)
    protected String newSecuredPartyGroupAccessCode;
    @XmlElement(name = "SecuredPartyGroupNumber", required = true, nillable = true)
    protected String securedPartyGroupNumber;

    /**
     * Gets the value of the currentSecuredPartyGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentSecuredPartyGroupAccessCode() {
        return currentSecuredPartyGroupAccessCode;
    }

    /**
     * Sets the value of the currentSecuredPartyGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentSecuredPartyGroupAccessCode(String value) {
        this.currentSecuredPartyGroupAccessCode = value;
    }

    /**
     * Gets the value of the newSecuredPartyGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSecuredPartyGroupAccessCode() {
        return newSecuredPartyGroupAccessCode;
    }

    /**
     * Sets the value of the newSecuredPartyGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSecuredPartyGroupAccessCode(String value) {
        this.newSecuredPartyGroupAccessCode = value;
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
