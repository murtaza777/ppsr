
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferAllRegistrationsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferAllRegistrationsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="CompletionNotificationEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferFromSecuredPartyGroupAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferFromSecuredPartyGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransferToSecuredPartyGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferAllRegistrationsRequestType", propOrder = {
    "completionNotificationEmailAddress",
    "transferFromSecuredPartyGroupAccessCode",
    "transferFromSecuredPartyGroupNumber",
    "transferToSecuredPartyGroupNumber"
})
public class TransferAllRegistrationsRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElementRef(name = "CompletionNotificationEmailAddress", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> completionNotificationEmailAddress;
    @XmlElementRef(name = "TransferFromSecuredPartyGroupAccessCode", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> transferFromSecuredPartyGroupAccessCode;
    @XmlElement(name = "TransferFromSecuredPartyGroupNumber", required = true, nillable = true)
    protected String transferFromSecuredPartyGroupNumber;
    @XmlElement(name = "TransferToSecuredPartyGroupNumber", required = true, nillable = true)
    protected String transferToSecuredPartyGroupNumber;

    /**
     * Gets the value of the completionNotificationEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompletionNotificationEmailAddress() {
        return completionNotificationEmailAddress;
    }

    /**
     * Sets the value of the completionNotificationEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompletionNotificationEmailAddress(JAXBElement<String> value) {
        this.completionNotificationEmailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the transferFromSecuredPartyGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferFromSecuredPartyGroupAccessCode() {
        return transferFromSecuredPartyGroupAccessCode;
    }

    /**
     * Sets the value of the transferFromSecuredPartyGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferFromSecuredPartyGroupAccessCode(JAXBElement<String> value) {
        this.transferFromSecuredPartyGroupAccessCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the transferFromSecuredPartyGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromSecuredPartyGroupNumber() {
        return transferFromSecuredPartyGroupNumber;
    }

    /**
     * Sets the value of the transferFromSecuredPartyGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromSecuredPartyGroupNumber(String value) {
        this.transferFromSecuredPartyGroupNumber = value;
    }

    /**
     * Gets the value of the transferToSecuredPartyGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToSecuredPartyGroupNumber() {
        return transferToSecuredPartyGroupNumber;
    }

    /**
     * Sets the value of the transferToSecuredPartyGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToSecuredPartyGroupNumber(String value) {
        this.transferToSecuredPartyGroupNumber = value;
    }

}
