
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NewCollateralRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewCollateralRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreAssetsSubjectToControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AreProceedsClaimed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfNewAttachment" minOccurs="0"/>
 *         &lt;element name="CollateralClassType" type="{http://schemas.ppsr.gov.au/2011/04/data}NewRegistrationCollateralClassType"/>
 *         &lt;element name="CollateralDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EarlierRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GivingOfNoticeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsInventory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPMSI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRegistrationEndTimeNotStated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSubordinate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NewRegistrationSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ProceedsClaimedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SerialNumberDetails" type="{http://schemas.ppsr.gov.au/2011/04/data}NewRegistrationSerialisedCollateralDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewCollateralRegistration", propOrder = {
    "areAssetsSubjectToControl",
    "areProceedsClaimed",
    "attachments",
    "collateralClassType",
    "collateralDescription",
    "earlierRegistrationNumber",
    "givingOfNoticeIdentifier",
    "isInventory",
    "isPMSI",
    "isRegistrationEndTimeNotStated",
    "isSubordinate",
    "newRegistrationSequenceNumber",
    "proceedsClaimedDescription",
    "registrationEndTime",
    "serialNumberDetails"
})
public class NewCollateralRegistrationType {

    @XmlElementRef(name = "AreAssetsSubjectToControl", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Boolean> areAssetsSubjectToControl;
    @XmlElementRef(name = "AreProceedsClaimed", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Boolean> areProceedsClaimed;
    @XmlElementRef(name = "Attachments", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNewAttachmentType> attachments;
    @XmlElement(name = "CollateralClassType", required = true)
    protected NewRegistrationCollateralClassTypeType collateralClassType;
    @XmlElementRef(name = "CollateralDescription", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> collateralDescription;
    @XmlElementRef(name = "EarlierRegistrationNumber", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> earlierRegistrationNumber;
    @XmlElementRef(name = "GivingOfNoticeIdentifier", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> givingOfNoticeIdentifier;
    @XmlElementRef(name = "IsInventory", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Boolean> isInventory;
    @XmlElementRef(name = "IsPMSI", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Boolean> isPMSI;
    @XmlElementRef(name = "IsRegistrationEndTimeNotStated", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Boolean> isRegistrationEndTimeNotStated;
    @XmlElement(name = "IsSubordinate")
    protected boolean isSubordinate;
    @XmlElement(name = "NewRegistrationSequenceNumber")
    protected short newRegistrationSequenceNumber;
    @XmlElementRef(name = "ProceedsClaimedDescription", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> proceedsClaimedDescription;
    @XmlElementRef(name = "RegistrationEndTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> registrationEndTime;
    @XmlElementRef(name = "SerialNumberDetails", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<NewRegistrationSerialisedCollateralDescriptionType> serialNumberDetails;

    /**
     * Gets the value of the areAssetsSubjectToControl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAreAssetsSubjectToControl() {
        return areAssetsSubjectToControl;
    }

    /**
     * Sets the value of the areAssetsSubjectToControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAreAssetsSubjectToControl(JAXBElement<Boolean> value) {
        this.areAssetsSubjectToControl = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the areProceedsClaimed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAreProceedsClaimed() {
        return areProceedsClaimed;
    }

    /**
     * Sets the value of the areProceedsClaimed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAreProceedsClaimed(JAXBElement<Boolean> value) {
        this.areProceedsClaimed = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNewAttachmentType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNewAttachmentType> getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNewAttachmentType }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<ArrayOfNewAttachmentType> value) {
        this.attachments = ((JAXBElement<ArrayOfNewAttachmentType> ) value);
    }

    /**
     * Gets the value of the collateralClassType property.
     * 
     * @return
     *     possible object is
     *     {@link NewRegistrationCollateralClassTypeType }
     *     
     */
    public NewRegistrationCollateralClassTypeType getCollateralClassType() {
        return collateralClassType;
    }

    /**
     * Sets the value of the collateralClassType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRegistrationCollateralClassTypeType }
     *     
     */
    public void setCollateralClassType(NewRegistrationCollateralClassTypeType value) {
        this.collateralClassType = value;
    }

    /**
     * Gets the value of the collateralDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollateralDescription() {
        return collateralDescription;
    }

    /**
     * Sets the value of the collateralDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollateralDescription(JAXBElement<String> value) {
        this.collateralDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the earlierRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEarlierRegistrationNumber() {
        return earlierRegistrationNumber;
    }

    /**
     * Sets the value of the earlierRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEarlierRegistrationNumber(JAXBElement<String> value) {
        this.earlierRegistrationNumber = ((JAXBElement<String> ) value);
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
     * Gets the value of the isInventory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsInventory() {
        return isInventory;
    }

    /**
     * Sets the value of the isInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsInventory(JAXBElement<Boolean> value) {
        this.isInventory = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the isPMSI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPMSI() {
        return isPMSI;
    }

    /**
     * Sets the value of the isPMSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPMSI(JAXBElement<Boolean> value) {
        this.isPMSI = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the isRegistrationEndTimeNotStated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsRegistrationEndTimeNotStated() {
        return isRegistrationEndTimeNotStated;
    }

    /**
     * Sets the value of the isRegistrationEndTimeNotStated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsRegistrationEndTimeNotStated(JAXBElement<Boolean> value) {
        this.isRegistrationEndTimeNotStated = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the isSubordinate property.
     * 
     */
    public boolean isIsSubordinate() {
        return isSubordinate;
    }

    /**
     * Sets the value of the isSubordinate property.
     * 
     */
    public void setIsSubordinate(boolean value) {
        this.isSubordinate = value;
    }

    /**
     * Gets the value of the newRegistrationSequenceNumber property.
     * 
     */
    public short getNewRegistrationSequenceNumber() {
        return newRegistrationSequenceNumber;
    }

    /**
     * Sets the value of the newRegistrationSequenceNumber property.
     * 
     */
    public void setNewRegistrationSequenceNumber(short value) {
        this.newRegistrationSequenceNumber = value;
    }

    /**
     * Gets the value of the proceedsClaimedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProceedsClaimedDescription() {
        return proceedsClaimedDescription;
    }

    /**
     * Sets the value of the proceedsClaimedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProceedsClaimedDescription(JAXBElement<String> value) {
        this.proceedsClaimedDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the registrationEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRegistrationEndTime() {
        return registrationEndTime;
    }

    /**
     * Sets the value of the registrationEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRegistrationEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.registrationEndTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the serialNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewRegistrationSerialisedCollateralDescriptionType }{@code >}
     *     
     */
    public JAXBElement<NewRegistrationSerialisedCollateralDescriptionType> getSerialNumberDetails() {
        return serialNumberDetails;
    }

    /**
     * Sets the value of the serialNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewRegistrationSerialisedCollateralDescriptionType }{@code >}
     *     
     */
    public void setSerialNumberDetails(JAXBElement<NewRegistrationSerialisedCollateralDescriptionType> value) {
        this.serialNumberDetails = ((JAXBElement<NewRegistrationSerialisedCollateralDescriptionType> ) value);
    }

}
