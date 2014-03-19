
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RetrieveMessagesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMessagesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="ChangeNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GivingOfNoticeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludePreviouslyRetrievedMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MessagesAddedFromDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MessagesAddedToDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MessagesAfterMessageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MessagesBeforeMessageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NotificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalCustomersRequestMessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecuredPartyGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMessagesRequestType", propOrder = {
    "changeNumber",
    "givingOfNoticeIdentifier",
    "includePreviouslyRetrievedMessages",
    "messagesAddedFromDateTime",
    "messagesAddedToDateTime",
    "messagesAfterMessageId",
    "messagesBeforeMessageId",
    "notificationType",
    "originalCustomersRequestMessageId",
    "registrationNumber",
    "securedPartyGroupNumber"
})
public class RetrieveMessagesRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElementRef(name = "ChangeNumber", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Long> changeNumber;
    @XmlElementRef(name = "GivingOfNoticeIdentifier", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> givingOfNoticeIdentifier;
    @XmlElementRef(name = "IncludePreviouslyRetrievedMessages", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Boolean> includePreviouslyRetrievedMessages;
    @XmlElementRef(name = "MessagesAddedFromDateTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> messagesAddedFromDateTime;
    @XmlElementRef(name = "MessagesAddedToDateTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> messagesAddedToDateTime;
    @XmlElementRef(name = "MessagesAfterMessageId", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Long> messagesAfterMessageId;
    @XmlElementRef(name = "MessagesBeforeMessageId", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Long> messagesBeforeMessageId;
    @XmlElementRef(name = "NotificationType", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> notificationType;
    @XmlElementRef(name = "OriginalCustomersRequestMessageId", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> originalCustomersRequestMessageId;
    @XmlElementRef(name = "RegistrationNumber", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> registrationNumber;
    @XmlElementRef(name = "SecuredPartyGroupNumber", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> securedPartyGroupNumber;

    /**
     * Gets the value of the changeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getChangeNumber() {
        return changeNumber;
    }

    /**
     * Sets the value of the changeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setChangeNumber(JAXBElement<Long> value) {
        this.changeNumber = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the givingOfNoticeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGivingOfNoticeIdentifier() {
        return givingOfNoticeIdentifier;
    }

    /**
     * Sets the value of the givingOfNoticeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGivingOfNoticeIdentifier(JAXBElement<String> value) {
        this.givingOfNoticeIdentifier = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the includePreviouslyRetrievedMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIncludePreviouslyRetrievedMessages() {
        return includePreviouslyRetrievedMessages;
    }

    /**
     * Sets the value of the includePreviouslyRetrievedMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIncludePreviouslyRetrievedMessages(JAXBElement<Boolean> value) {
        this.includePreviouslyRetrievedMessages = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the messagesAddedFromDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMessagesAddedFromDateTime() {
        return messagesAddedFromDateTime;
    }

    /**
     * Sets the value of the messagesAddedFromDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMessagesAddedFromDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.messagesAddedFromDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the messagesAddedToDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMessagesAddedToDateTime() {
        return messagesAddedToDateTime;
    }

    /**
     * Sets the value of the messagesAddedToDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMessagesAddedToDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.messagesAddedToDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the messagesAfterMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMessagesAfterMessageId() {
        return messagesAfterMessageId;
    }

    /**
     * Sets the value of the messagesAfterMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMessagesAfterMessageId(JAXBElement<Long> value) {
        this.messagesAfterMessageId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the messagesBeforeMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMessagesBeforeMessageId() {
        return messagesBeforeMessageId;
    }

    /**
     * Sets the value of the messagesBeforeMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMessagesBeforeMessageId(JAXBElement<Long> value) {
        this.messagesBeforeMessageId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationType(JAXBElement<String> value) {
        this.notificationType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the originalCustomersRequestMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalCustomersRequestMessageId() {
        return originalCustomersRequestMessageId;
    }

    /**
     * Sets the value of the originalCustomersRequestMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalCustomersRequestMessageId(JAXBElement<String> value) {
        this.originalCustomersRequestMessageId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationNumber(JAXBElement<String> value) {
        this.registrationNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the securedPartyGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecuredPartyGroupNumber() {
        return securedPartyGroupNumber;
    }

    /**
     * Sets the value of the securedPartyGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecuredPartyGroupNumber(JAXBElement<String> value) {
        this.securedPartyGroupNumber = ((JAXBElement<String> ) value);
    }

}
