
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveSecuredPartyGroupHistoryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveSecuredPartyGroupHistoryResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="PpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SecuredPartyGroupHistory" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfSecuredPartyGroupChange"/>
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
@XmlType(name = "RetrieveSecuredPartyGroupHistoryResponseType", propOrder = {
    "ppsrTransactionId",
    "securedPartyGroupHistory",
    "securedPartyGroupNumber"
})
public class RetrieveSecuredPartyGroupHistoryResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;
    @XmlElement(name = "SecuredPartyGroupHistory", required = true, nillable = true)
    protected ArrayOfSecuredPartyGroupChangeType securedPartyGroupHistory;
    @XmlElement(name = "SecuredPartyGroupNumber", required = true, nillable = true)
    protected String securedPartyGroupNumber;

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
     * Gets the value of the securedPartyGroupHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecuredPartyGroupChangeType }
     *     
     */
    public ArrayOfSecuredPartyGroupChangeType getSecuredPartyGroupHistory() {
        return securedPartyGroupHistory;
    }

    /**
     * Sets the value of the securedPartyGroupHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecuredPartyGroupChangeType }
     *     
     */
    public void setSecuredPartyGroupHistory(ArrayOfSecuredPartyGroupChangeType value) {
        this.securedPartyGroupHistory = value;
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
