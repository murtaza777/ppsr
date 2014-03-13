
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrCollateralRegistrationDischargeFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrCollateralRegistrationDischargeFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
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
@XmlType(name = "PpsrCollateralRegistrationDischargeFaultDetail", propOrder = {
    "registrationNumber"
})
public class PpsrCollateralRegistrationDischargeFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;

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
