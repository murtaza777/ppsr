
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrSecuredPartyGroupCreateValidationFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrSecuredPartyGroupCreateValidationFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="AddressForServiceValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationError"/>
 *         &lt;element name="SecuredPartyGroupValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationError"/>
 *         &lt;element name="SecuredPartyValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationErrorGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrSecuredPartyGroupCreateValidationFaultDetail", propOrder = {
    "addressForServiceValidationErrors",
    "securedPartyGroupValidationErrors",
    "securedPartyValidationErrors"
})
public class PpsrSecuredPartyGroupCreateValidationFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElement(name = "AddressForServiceValidationErrors", required = true, nillable = true)
    protected ArrayOfPpsrValidationError addressForServiceValidationErrors;
    @XmlElement(name = "SecuredPartyGroupValidationErrors", required = true, nillable = true)
    protected ArrayOfPpsrValidationError securedPartyGroupValidationErrors;
    @XmlElement(name = "SecuredPartyValidationErrors", required = true, nillable = true)
    protected ArrayOfPpsrValidationErrorGroup securedPartyValidationErrors;

    /**
     * Gets the value of the addressForServiceValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPpsrValidationError }
     *     
     */
    public ArrayOfPpsrValidationError getAddressForServiceValidationErrors() {
        return addressForServiceValidationErrors;
    }

    /**
     * Sets the value of the addressForServiceValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPpsrValidationError }
     *     
     */
    public void setAddressForServiceValidationErrors(ArrayOfPpsrValidationError value) {
        this.addressForServiceValidationErrors = value;
    }

    /**
     * Gets the value of the securedPartyGroupValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPpsrValidationError }
     *     
     */
    public ArrayOfPpsrValidationError getSecuredPartyGroupValidationErrors() {
        return securedPartyGroupValidationErrors;
    }

    /**
     * Sets the value of the securedPartyGroupValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPpsrValidationError }
     *     
     */
    public void setSecuredPartyGroupValidationErrors(ArrayOfPpsrValidationError value) {
        this.securedPartyGroupValidationErrors = value;
    }

    /**
     * Gets the value of the securedPartyValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPpsrValidationErrorGroup }
     *     
     */
    public ArrayOfPpsrValidationErrorGroup getSecuredPartyValidationErrors() {
        return securedPartyValidationErrors;
    }

    /**
     * Sets the value of the securedPartyValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPpsrValidationErrorGroup }
     *     
     */
    public void setSecuredPartyValidationErrors(ArrayOfPpsrValidationErrorGroup value) {
        this.securedPartyValidationErrors = value;
    }

}
