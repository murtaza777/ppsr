
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemovedAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemovedAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RemovedAttachmentSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovedAttachment", propOrder = {
    "attachmentId",
    "removedAttachmentSequenceNumber"
})
public class RemovedAttachmentType {

    @XmlElement(name = "AttachmentId")
    protected long attachmentId;
    @XmlElement(name = "RemovedAttachmentSequenceNumber")
    protected short removedAttachmentSequenceNumber;

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
     * Gets the value of the removedAttachmentSequenceNumber property.
     * 
     */
    public short getRemovedAttachmentSequenceNumber() {
        return removedAttachmentSequenceNumber;
    }

    /**
     * Sets the value of the removedAttachmentSequenceNumber property.
     * 
     */
    public void setRemovedAttachmentSequenceNumber(short value) {
        this.removedAttachmentSequenceNumber = value;
    }

}
