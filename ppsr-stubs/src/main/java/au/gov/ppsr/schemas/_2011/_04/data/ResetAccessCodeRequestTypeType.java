
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResetAccessCodeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResetAccessCodeRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
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
@XmlType(name = "ResetAccessCodeRequestType", propOrder = {
    "securedPartyGroupNumber"
})
public class ResetAccessCodeRequestTypeType
    extends CommonRequestTypeType
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
