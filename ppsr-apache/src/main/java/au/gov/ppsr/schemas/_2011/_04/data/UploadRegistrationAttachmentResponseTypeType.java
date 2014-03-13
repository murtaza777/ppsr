
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadRegistrationAttachmentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadRegistrationAttachmentResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadRegistrationAttachmentResponseType", propOrder = {
    "attachmentId",
    "ppsrTransactionId"
})
public class UploadRegistrationAttachmentResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "AttachmentId")
    protected long attachmentId;
    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;

    /**
     * Gets the value of the attachmentId property.
     * 
     */
    public long getAttachmentId() {
        return attachmentId;
    }

    /**
     * Sets the value of the attachmentId property.
     * 
     */
    public void setAttachmentId(long value) {
        this.attachmentId = value;
    }

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

}
