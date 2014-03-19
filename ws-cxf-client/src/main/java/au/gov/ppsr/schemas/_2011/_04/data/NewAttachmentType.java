
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NewAttachmentSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewAttachment", propOrder = {
    "attachmentId",
    "newAttachmentSequenceNumber"
})
public class NewAttachmentType {

    @XmlElement(name = "AttachmentId")
    protected long attachmentId;
    @XmlElement(name = "NewAttachmentSequenceNumber")
    protected short newAttachmentSequenceNumber;

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
     * Gets the value of the newAttachmentSequenceNumber property.
     * 
     */
    public short getNewAttachmentSequenceNumber() {
        return newAttachmentSequenceNumber;
    }

    /**
     * Sets the value of the newAttachmentSequenceNumber property.
     * 
     */
    public void setNewAttachmentSequenceNumber(short value) {
        this.newAttachmentSequenceNumber = value;
    }

}
