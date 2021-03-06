
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrCollateralRegistrationTransferSingleFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrCollateralRegistrationTransferSingleFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransferFromSecuredPartyGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransferToSecuredPartyGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrCollateralRegistrationTransferSingleFaultDetail", propOrder = {
    "registrationNumber",
    "transferFromSecuredPartyGroupNumber",
    "transferToSecuredPartyGroupNumber"
})
public class PpsrCollateralRegistrationTransferSingleFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;
    @XmlElement(name = "TransferFromSecuredPartyGroupNumber", required = true, nillable = true)
    protected String transferFromSecuredPartyGroupNumber;
    @XmlElement(name = "TransferToSecuredPartyGroupNumber", required = true, nillable = true)
    protected String transferToSecuredPartyGroupNumber;

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
     * Gets the value of the transferFromSecuredPartyGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromSecuredPartyGroupNumber() {
        return transferFromSecuredPartyGroupNumber;
    }

    /**
     * Sets the value of the transferFromSecuredPartyGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromSecuredPartyGroupNumber(String value) {
        this.transferFromSecuredPartyGroupNumber = value;
    }

    /**
     * Gets the value of the transferToSecuredPartyGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToSecuredPartyGroupNumber() {
        return transferToSecuredPartyGroupNumber;
    }

    /**
     * Sets the value of the transferToSecuredPartyGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToSecuredPartyGroupNumber(String value) {
        this.transferToSecuredPartyGroupNumber = value;
    }

}
