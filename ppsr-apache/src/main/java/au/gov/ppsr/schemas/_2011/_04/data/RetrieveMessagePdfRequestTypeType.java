
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveMessagePdfRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMessagePdfRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="B2GMailboxMessageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMessagePdfRequestType", propOrder = {
    "b2GMailboxMessageId"
})
public class RetrieveMessagePdfRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "B2GMailboxMessageId")
    protected long b2GMailboxMessageId;

    /**
     * Gets the value of the b2GMailboxMessageId property.
     * 
     */
    public long getB2GMailboxMessageId() {
        return b2GMailboxMessageId;
    }

    /**
     * Sets the value of the b2GMailboxMessageId property.
     * 
     */
    public void setB2GMailboxMessageId(long value) {
        this.b2GMailboxMessageId = value;
    }

}
