
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrSecuredPartyGroupUpdateFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrSecuredPartyGroupUpdateFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
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
@XmlType(name = "PpsrSecuredPartyGroupUpdateFaultDetail", propOrder = {
    "securedPartyGroupNumber"
})
public class PpsrSecuredPartyGroupUpdateFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElement(name = "SecuredPartyGroupNumber", required = true, nillable = true)
    protected String securedPartyGroupNumber;

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
