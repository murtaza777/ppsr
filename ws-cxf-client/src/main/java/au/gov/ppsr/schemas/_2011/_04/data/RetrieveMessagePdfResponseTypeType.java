
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveMessagePdfResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMessagePdfResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="B2GMailboxPdfMessage" type="{http://schemas.ppsr.gov.au/2011/04/data}B2GMailboxPdfMessage"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMessagePdfResponseType", propOrder = {
    "b2GMailboxPdfMessage"
})
public class RetrieveMessagePdfResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "B2GMailboxPdfMessage", required = true, nillable = true)
    protected B2GMailboxPdfMessageType b2GMailboxPdfMessage;

    /**
     * Gets the value of the b2GMailboxPdfMessage property.
     * 
     * @return
     *     possible object is
     *     {@link B2GMailboxPdfMessageType }
     *     
     */
    public B2GMailboxPdfMessageType getB2GMailboxPdfMessage() {
        return b2GMailboxPdfMessage;
    }

    /**
     * Sets the value of the b2GMailboxPdfMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link B2GMailboxPdfMessageType }
     *     
     */
    public void setB2GMailboxPdfMessage(B2GMailboxPdfMessageType value) {
        this.b2GMailboxPdfMessage = value;
    }

}
