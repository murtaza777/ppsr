
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for B2GMailboxPdfMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B2GMailboxPdfMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="B2GMailboxMessageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MessagePdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="PdfFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B2GMailboxPdfMessage", propOrder = {
    "b2GMailboxMessageId",
    "messagePdf",
    "pdfFileName"
})
public class B2GMailboxPdfMessageType {

    @XmlElement(name = "B2GMailboxMessageId")
    protected long b2GMailboxMessageId;
    @XmlElement(name = "MessagePdf", required = true, nillable = true)
    protected byte[] messagePdf;
    @XmlElement(name = "PdfFileName", required = true, nillable = true)
    protected String pdfFileName;

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

    /**
     * Gets the value of the messagePdf property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMessagePdf() {
        return messagePdf;
    }

    /**
     * Sets the value of the messagePdf property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMessagePdf(byte[] value) {
        this.messagePdf = ((byte[]) value);
    }

    /**
     * Gets the value of the pdfFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfFileName() {
        return pdfFileName;
    }

    /**
     * Sets the value of the pdfFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfFileName(String value) {
        this.pdfFileName = value;
    }

}
