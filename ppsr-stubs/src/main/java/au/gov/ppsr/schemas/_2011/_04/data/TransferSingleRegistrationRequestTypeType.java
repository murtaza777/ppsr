
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferSingleRegistrationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferSingleRegistrationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegistrationToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TransferSingleRegistrationRequestType", propOrder = {
    "registrationNumber",
    "registrationToken",
    "transferFromSecuredPartyGroupAccessCode",
    "transferFromSecuredPartyGroupNumber",
    "transferToSecuredPartyGroupNumber"
})
public class TransferSingleRegistrationRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;
    @XmlElementRef(name = "RegistrationToken", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> registrationToken;
    @XmlElementRef(name = "TransferFromSecuredPartyGroupAccessCode", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> transferFromSecuredPartyGroupAccessCode;
    @XmlElement(name = "TransferFromSecuredPartyGroupNumber", required = true, nillable = true)
    protected String transferFromSecuredPartyGroupNumber;
    @XmlElement(name = "TransferToSecuredPartyGroupNumber", required = true, nillable = true)
    protected String transferToSecuredPartyGroupNumber;

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the registrationToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationToken() {
        return registrationToken;
    }

    /**
     * Sets the value of the registrationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationToken(JAXBElement<String> value) {
        this.registrationToken = ((JAXBElement<String> ) value);
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
