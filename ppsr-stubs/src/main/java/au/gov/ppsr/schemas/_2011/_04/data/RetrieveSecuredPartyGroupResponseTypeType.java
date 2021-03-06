
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveSecuredPartyGroupResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveSecuredPartyGroupResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="PpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SecuredPartyGroup" type="{http://schemas.ppsr.gov.au/2011/04/data}SecuredPartyGroupWithVerification"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveSecuredPartyGroupResponseType", propOrder = {
    "ppsrTransactionId",
    "securedPartyGroup"
})
public class RetrieveSecuredPartyGroupResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;
    @XmlElement(name = "SecuredPartyGroup", required = true, nillable = true)
    protected SecuredPartyGroupWithVerificationType securedPartyGroup;

    /**
     * Gets the value of the ppsrTransactionId property.
     * 
     */
    public long getPpsrTransactionId() {
        return ppsrTransactionId;
    }

    /**
     * Sets the value of the ppsrTransactionId property.
     * 
     */
    public void setPpsrTransactionId(long value) {
        this.ppsrTransactionId = value;
    }

    /**
     * Gets the value of the securedPartyGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SecuredPartyGroupWithVerificationType }
     *     
     */
    public SecuredPartyGroupWithVerificationType getSecuredPartyGroup() {
        return securedPartyGroup;
    }

    /**
     * Sets the value of the securedPartyGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuredPartyGroupWithVerificationType }
     *     
     */
    public void setSecuredPartyGroup(SecuredPartyGroupWithVerificationType value) {
        this.securedPartyGroup = value;
    }

}
