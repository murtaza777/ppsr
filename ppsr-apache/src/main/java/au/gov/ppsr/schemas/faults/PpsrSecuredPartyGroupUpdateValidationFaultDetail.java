
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrSecuredPartyGroupUpdateValidationFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrSecuredPartyGroupUpdateValidationFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="AddressForServiceValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationError"/>
 *         &lt;element name="ReverifySecuredPartyValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationErrorGroup"/>
 *         &lt;element name="SecuredPartyGroupValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationError"/>
 *         &lt;element name="UpdatedSecuredPartyValidationErrors" type="{http://schemas.ppsr.gov.au/faults}ArrayOfPpsrValidationErrorGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrSecuredPartyGroupUpdateValidationFaultDetail", propOrder = {
    "addressForServiceValidationErrors",
    "reverifySecuredPartyValidationErrors",
    "securedPartyGroupValidationErrors",
    "updatedSecuredPartyValidationErrors"
})
public class PpsrSecuredPartyGroupUpdateValidationFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElement(name = "AddressForServiceValidationErrors", required = true, nillable = true)
    protected ArrayOfPpsrValidationError addressForServiceValidationErrors;
    @XmlElement(name = "ReverifySecuredPartyValidationErrors", required = true, nillable = true)
    protected ArrayOfPpsrValidationErrorGroup reverifySecuredPartyValidationErrors;
    @XmlElement(name = "SecuredPartyGroupValidationErrors", required = true, nillable = true)
    protected ArrayOfPpsrValidationError securedPartyGroupValidationErrors;
    @XmlElement(name = "UpdatedSecuredPartyValidationErrors", required = true, nillable = true)
    protected ArrayOfPpsrValidationErrorGroup updatedSecuredPartyValidationErrors;

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
     * Gets the value of the reverifySecuredPartyValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPpsrValidationErrorGroup }
     *     
     */
    public ArrayOfPpsrValidationErrorGroup getReverifySecuredPartyValidationErrors() {
        return reverifySecuredPartyValidationErrors;
    }

    /**
     * Sets the value of the reverifySecuredPartyValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPpsrValidationErrorGroup }
     *     
     */
    public void setReverifySecuredPartyValidationErrors(ArrayOfPpsrValidationErrorGroup value) {
        this.reverifySecuredPartyValidationErrors = value;
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
     * Gets the value of the updatedSecuredPartyValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPpsrValidationErrorGroup }
     *     
     */
    public ArrayOfPpsrValidationErrorGroup getUpdatedSecuredPartyValidationErrors() {
        return updatedSecuredPartyValidationErrors;
    }

    /**
     * Sets the value of the updatedSecuredPartyValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPpsrValidationErrorGroup }
     *     
     */
    public void setUpdatedSecuredPartyValidationErrors(ArrayOfPpsrValidationErrorGroup value) {
        this.updatedSecuredPartyValidationErrors = value;
    }

}
