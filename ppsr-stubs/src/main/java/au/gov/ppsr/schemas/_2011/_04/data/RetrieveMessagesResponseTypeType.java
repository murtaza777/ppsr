
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveMessagesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMessagesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="MailboxMessages" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfB2GMailboxMessage"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMessagesResponseType", propOrder = {
    "mailboxMessages"
})
public class RetrieveMessagesResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "MailboxMessages", required = true, nillable = true)
    protected ArrayOfB2GMailboxMessageType mailboxMessages;

    /**
     * Gets the value of the mailboxMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfB2GMailboxMessageType }
     *     
     */
    public ArrayOfB2GMailboxMessageType getMailboxMessages() {
        return mailboxMessages;
    }

    /**
     * Sets the value of the mailboxMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfB2GMailboxMessageType }
     *     
     */
    public void setMailboxMessages(ArrayOfB2GMailboxMessageType value) {
        this.mailboxMessages = value;
    }

}
