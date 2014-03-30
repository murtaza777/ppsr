
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrB2GMailboxMessageAccessFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrB2GMailboxMessageAccessFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="B2GMailboxMessageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrB2GMailboxMessageAccessFaultDetail", propOrder = {
    "b2GMailboxMessageId"
})
public class PpsrB2GMailboxMessageAccessFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElement(name = "B2GMailboxMessageId", required = true, nillable = true)
    protected String b2GMailboxMessageId;

    /**
     * Gets the value of the b2GMailboxMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB2GMailboxMessageId() {
        return b2GMailboxMessageId;
    }

    /**
     * Sets the value of the b2GMailboxMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB2GMailboxMessageId(String value) {
        this.b2GMailboxMessageId = value;
    }

}
