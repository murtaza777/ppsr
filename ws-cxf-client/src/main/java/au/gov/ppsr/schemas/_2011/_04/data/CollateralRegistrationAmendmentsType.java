
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CollateralRegistrationAmendments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollateralRegistrationAmendments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalAircraftDetails" type="{http://schemas.ppsr.gov.au/2011/04/data}AdditionalAircraftCollateralDescriptionAmendments" minOccurs="0"/>
 *         &lt;element name="AdditionalVehicleDetails" type="{http://schemas.ppsr.gov.au/2011/04/data}AdditionalVehicleCollateralDescriptionAmendments" minOccurs="0"/>
 *         &lt;element name="AreProceedsClaimed" type="{http://schemas.ppsr.gov.au/2011/04/data}ExtendedBooleanType" minOccurs="0"/>
 *         &lt;element name="AttachmentIdsToAdd" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfNewAttachment" minOccurs="0"/>
 *         &lt;element name="AttachmentIdsToRemove" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfRemovedAttachment" minOccurs="0"/>
 *         &lt;element name="CollateralDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GivingOfNoticeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrantorsToAdd" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfNewGrantor" minOccurs="0"/>
 *         &lt;element name="GrantorsToRemove" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfRemovedGrantor" minOccurs="0"/>
 *         &lt;element name="IsRegistrationEndTimeNotStated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSubordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProceedsClaimedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralRegistrationAmendments", propOrder = {
    "additionalAircraftDetails",
    "additionalVehicleDetails",
    "areProceedsClaimed",
    "attachmentIdsToAdd",
    "attachmentIdsToRemove",
    "collateralDescription",
    "givingOfNoticeIdentifier",
    "grantorsToAdd",
    "grantorsToRemove",
    "isRegistrationEndTimeNotStated",
    "isSubordinate",
    "proceedsClaimedDescription",
    "registrationEndTime"
})
public class CollateralRegistrationAmendmentsType {

    @XmlElementRef(name = "AdditionalAircraftDetails", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<AdditionalAircraftCollateralDescriptionAmendmentsType> additionalAircraftDetails;
    @XmlElementRef(name = "AdditionalVehicleDetails", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<AdditionalVehicleCollateralDescriptionAmendmentsType> additionalVehicleDetails;
    @XmlElementRef(name = "AreProceedsClaimed", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ExtendedBooleanTypeType> areProceedsClaimed;
    @XmlElementRef(name = "AttachmentIdsToAdd", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNewAttachmentType> attachmentIdsToAdd;
    @XmlElementRef(name = "AttachmentIdsToRemove", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRemovedAttachmentType> attachmentIdsToRemove;
    @XmlElementRef(name = "CollateralDescription", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> collateralDescription;
    @XmlElementRef(name = "GivingOfNoticeIdentifier", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> givingOfNoticeIdentifier;
    @XmlElementRef(name = "GrantorsToAdd", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNewGrantorType> grantorsToAdd;
    @XmlElementRef(name = "GrantorsToRemove", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRemovedGrantorType> grantorsToRemove;
    @XmlElementRef(name = "IsRegistrationEndTimeNotStated", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Boolean> isRegistrationEndTimeNotStated;
    @XmlElementRef(name = "IsSubordinate", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Boolean> isSubordinate;
    @XmlElementRef(name = "ProceedsClaimedDescription", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> proceedsClaimedDescription;
    @XmlElementRef(name = "RegistrationEndTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> registrationEndTime;

    /**
     * Gets the value of the additionalAircraftDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdditionalAircraftCollateralDescriptionAmendmentsType }{@code >}
     *     
     */
    public JAXBElement<AdditionalAircraftCollateralDescriptionAmendmentsType> getAdditionalAircraftDetails() {
        return additionalAircraftDetails;
    }

    /**
     * Sets the value of the additionalAircraftDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdditionalAircraftCollateralDescriptionAmendmentsType }{@code >}
     *     
     */
    public void setAdditionalAircraftDetails(JAXBElement<AdditionalAircraftCollateralDescriptionAmendmentsType> value) {
        this.additionalAircraftDetails = ((JAXBElement<AdditionalAircraftCollateralDescriptionAmendmentsType> ) value);
    }

    /**
     * Gets the value of the additionalVehicleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdditionalVehicleCollateralDescriptionAmendmentsType }{@code >}
     *     
     */
    public JAXBElement<AdditionalVehicleCollateralDescriptionAmendmentsType> getAdditionalVehicleDetails() {
        return additionalVehicleDetails;
    }

    /**
     * Sets the value of the additionalVehicleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdditionalVehicleCollateralDescriptionAmendmentsType }{@code >}
     *     
     */
    public void setAdditionalVehicleDetails(JAXBElement<AdditionalVehicleCollateralDescriptionAmendmentsType> value) {
        this.additionalVehicleDetails = ((JAXBElement<AdditionalVehicleCollateralDescriptionAmendmentsType> ) value);
    }

    /**
     * Gets the value of the areProceedsClaimed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}
     *     
     */
    public JAXBElement<ExtendedBooleanTypeType> getAreProceedsClaimed() {
        return areProceedsClaimed;
    }

    /**
     * Sets the value of the areProceedsClaimed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}
     *     
     */
    public void setAreProceedsClaimed(JAXBElement<ExtendedBooleanTypeType> value) {
        this.areProceedsClaimed = ((JAXBElement<ExtendedBooleanTypeType> ) value);
    }

    /**
     * Gets the value of the attachmentIdsToAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNewAttachmentType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNewAttachmentType> getAttachmentIdsToAdd() {
        return attachmentIdsToAdd;
    }

    /**
     * Sets the value of the attachmentIdsToAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNewAttachmentType }{@code >}
     *     
     */
    public void setAttachmentIdsToAdd(JAXBElement<ArrayOfNewAttachmentType> value) {
        this.attachmentIdsToAdd = ((JAXBElement<ArrayOfNewAttachmentType> ) value);
    }

    /**
     * Gets the value of the attachmentIdsToRemove property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemovedAttachmentType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemovedAttachmentType> getAttachmentIdsToRemove() {
        return attachmentIdsToRemove;
    }

    /**
     * Sets the value of the attachmentIdsToRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemovedAttachmentType }{@code >}
     *     
     */
    public void setAttachmentIdsToRemove(JAXBElement<ArrayOfRemovedAttachmentType> value) {
        this.attachmentIdsToRemove = ((JAXBElement<ArrayOfRemovedAttachmentType> ) value);
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
     * Gets the value of the grantorsToAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNewGrantorType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNewGrantorType> getGrantorsToAdd() {
        return grantorsToAdd;
    }

    /**
     * Sets the value of the grantorsToAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNewGrantorType }{@code >}
     *     
     */
    public void setGrantorsToAdd(JAXBElement<ArrayOfNewGrantorType> value) {
        this.grantorsToAdd = ((JAXBElement<ArrayOfNewGrantorType> ) value);
    }

    /**
     * Gets the value of the grantorsToRemove property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemovedGrantorType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemovedGrantorType> getGrantorsToRemove() {
        return grantorsToRemove;
    }

    /**
     * Sets the value of the grantorsToRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemovedGrantorType }{@code >}
     *     
     */
    public void setGrantorsToRemove(JAXBElement<ArrayOfRemovedGrantorType> value) {
        this.grantorsToRemove = ((JAXBElement<ArrayOfRemovedGrantorType> ) value);
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
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSubordinate() {
        return isSubordinate;
    }

    /**
     * Sets the value of the isSubordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSubordinate(JAXBElement<Boolean> value) {
        this.isSubordinate = ((JAXBElement<Boolean> ) value);
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

}
