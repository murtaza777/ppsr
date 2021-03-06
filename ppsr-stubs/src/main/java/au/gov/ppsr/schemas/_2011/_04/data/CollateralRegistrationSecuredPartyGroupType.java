
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralRegistrationSecuredPartyGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollateralRegistrationSecuredPartyGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecuredParties" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfCollateralRegistrationSecuredParty"/>
 *         &lt;element name="SecuredPartyGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralRegistrationSecuredPartyGroup", propOrder = {
    "securedParties",
    "securedPartyGroupNumber"
})
public class CollateralRegistrationSecuredPartyGroupType {

    @XmlElement(name = "SecuredParties", required = true, nillable = true)
    protected ArrayOfCollateralRegistrationSecuredPartyType securedParties;
    @XmlElement(name = "SecuredPartyGroupNumber", required = true, nillable = true)
    protected String securedPartyGroupNumber;

    /**
     * Gets the value of the securedParties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCollateralRegistrationSecuredPartyType }
     *     
     */
    public ArrayOfCollateralRegistrationSecuredPartyType getSecuredParties() {
        return securedParties;
    }

    /**
     * Sets the value of the securedParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCollateralRegistrationSecuredPartyType }
     *     
     */
    public void setSecuredParties(ArrayOfCollateralRegistrationSecuredPartyType value) {
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

}
