
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressForServiceSearchDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressForServiceSearchDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{http://schemas.ppsr.gov.au/2011/04/data}Address"/>
 *         &lt;element name="PhysicalAddress" type="{http://schemas.ppsr.gov.au/2011/04/data}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressForServiceSearchDetail", propOrder = {
    "addressee",
    "emailAddress",
    "faxNumber",
    "mailingAddress",
    "physicalAddress"
})
public class AddressForServiceSearchDetailType {

    @XmlElementRef(name = "Addressee", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> addressee;
    @XmlElementRef(name = "EmailAddress", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "FaxNumber", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> faxNumber;
    @XmlElement(name = "MailingAddress", required = true, nillable = true)
    protected AddressType mailingAddress;
    @XmlElementRef(name = "PhysicalAddress", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<AddressType> physicalAddress;

    /**
     * Gets the value of the addressee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressee() {
        return addressee;
    }

    /**
     * Sets the value of the addressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressee(JAXBElement<String> value) {
        this.addressee = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxNumber(JAXBElement<String> value) {
        this.faxNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setMailingAddress(AddressType value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public JAXBElement<AddressType> getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public void setPhysicalAddress(JAXBElement<AddressType> value) {
        this.physicalAddress = ((JAXBElement<AddressType> ) value);
    }

}
