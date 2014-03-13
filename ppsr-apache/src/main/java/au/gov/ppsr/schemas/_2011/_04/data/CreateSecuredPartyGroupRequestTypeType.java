
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateSecuredPartyGroupRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateSecuredPartyGroupRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="AddressForService" type="{http://schemas.ppsr.gov.au/2011/04/data}NewAddressForService"/>
 *         &lt;element name="SecuredParties" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfNewSecuredParty"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSecuredPartyGroupRequestType", propOrder = {
    "addressForService",
    "securedParties"
})
public class CreateSecuredPartyGroupRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "AddressForService", required = true, nillable = true)
    protected NewAddressForServiceType addressForService;
    @XmlElement(name = "SecuredParties", required = true, nillable = true)
    protected ArrayOfNewSecuredPartyType securedParties;

    /**
     * Gets the value of the addressForService property.
     * 
     * @return
     *     possible object is
     *     {@link NewAddressForServiceType }
     *     
     */
    public NewAddressForServiceType getAddressForService() {
        return addressForService;
    }

    /**
     * Sets the value of the addressForService property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewAddressForServiceType }
     *     
     */
    public void setAddressForService(NewAddressForServiceType value) {
        this.addressForService = value;
    }

    /**
     * Gets the value of the securedParties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNewSecuredPartyType }
     *     
     */
    public ArrayOfNewSecuredPartyType getSecuredParties() {
        return securedParties;
    }

    /**
     * Sets the value of the securedParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNewSecuredPartyType }
     *     
     */
    public void setSecuredParties(ArrayOfNewSecuredPartyType value) {
        this.securedParties = value;
    }

}
