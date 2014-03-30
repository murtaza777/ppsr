
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachmentFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttachmentFileSizeBytes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttachmentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsMigratedAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentDetail", propOrder = {
    "attachmentDescription",
    "attachmentFileName",
    "attachmentFileSizeBytes",
    "attachmentId",
    "isMigratedAttachment"
})
public class AttachmentDetailType {

    @XmlElementRef(name = "AttachmentDescription", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> attachmentDescription;
    @XmlElement(name = "AttachmentFileName", required = true, nillable = true)
    protected String attachmentFileName;
    @XmlElement(name = "AttachmentFileSizeBytes")
    protected int attachmentFileSizeBytes;
    @XmlElement(name = "AttachmentId")
    protected long attachmentId;
    @XmlElement(name = "IsMigratedAttachment")
    protected boolean isMigratedAttachment;

    /**
     * Gets the value of the attachmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttachmentDescription() {
        return attachmentDescription;
    }

    /**
     * Sets the value of the attachmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttachmentDescription(JAXBElement<String> value) {
        this.attachmentDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the attachmentFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentFileName() {
        return attachmentFileName;
    }

    /**
     * Sets the value of the attachmentFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentFileName(String value) {
        this.attachmentFileName = value;
    }

    /**
     * Gets the value of the attachmentFileSizeBytes property.
     * 
     */
    public int getAttachmentFileSizeBytes() {
        return attachmentFileSizeBytes;
    }

    /**
     * Sets the value of the attachmentFileSizeBytes property.
     * 
     */
    public void setAttachmentFileSizeBytes(int value) {
        this.attachmentFileSizeBytes = value;
    }

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
     * Gets the value of the isMigratedAttachment property.
     * 
     */
    public boolean isIsMigratedAttachment() {
        return isMigratedAttachment;
    }

    /**
     * Sets the value of the isMigratedAttachment property.
     * 
     */
    public void setIsMigratedAttachment(boolean value) {
        this.isMigratedAttachment = value;
    }

}
