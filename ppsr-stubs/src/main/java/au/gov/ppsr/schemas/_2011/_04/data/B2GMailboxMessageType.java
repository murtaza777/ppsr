
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for B2GMailboxMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B2GMailboxMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="B2GMailboxMessageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HasPdf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MessageAddedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MessageLastRetrievedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NotificationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B2GMailboxMessage", propOrder = {
    "b2GMailboxMessageId",
    "hasPdf",
    "message",
    "messageAddedDateTime",
    "messageLastRetrievedDateTime",
    "notificationType"
})
public class B2GMailboxMessageType {

    @XmlElement(name = "B2GMailboxMessageId")
    protected long b2GMailboxMessageId;
    @XmlElement(name = "HasPdf")
    protected boolean hasPdf;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected B2GMailboxMessageType.Message message;
    @XmlElement(name = "MessageAddedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageAddedDateTime;
    @XmlElementRef(name = "MessageLastRetrievedDateTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> messageLastRetrievedDateTime;
    @XmlElement(name = "NotificationType", required = true, nillable = true)
    protected String notificationType;

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
     * Gets the value of the hasPdf property.
     * 
     */
    public boolean isHasPdf() {
        return hasPdf;
    }

    /**
     * Sets the value of the hasPdf property.
     * 
     */
    public void setHasPdf(boolean value) {
        this.hasPdf = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link B2GMailboxMessageType.Message }
     *     
     */
    public B2GMailboxMessageType.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link B2GMailboxMessageType.Message }
     *     
     */
    public void setMessage(B2GMailboxMessageType.Message value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageAddedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageAddedDateTime() {
        return messageAddedDateTime;
    }

    /**
     * Sets the value of the messageAddedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageAddedDateTime(XMLGregorianCalendar value) {
        this.messageAddedDateTime = value;
    }

    /**
     * Gets the value of the messageLastRetrievedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMessageLastRetrievedDateTime() {
        return messageLastRetrievedDateTime;
    }

    /**
     * Sets the value of the messageLastRetrievedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMessageLastRetrievedDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.messageLastRetrievedDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationType(String value) {
        this.notificationType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Message {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
