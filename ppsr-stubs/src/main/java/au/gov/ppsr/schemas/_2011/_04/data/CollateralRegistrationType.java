
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CollateralRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollateralRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressForService" type="{http://schemas.ppsr.gov.au/2011/04/data}AddressForService"/>
 *         &lt;element name="AreAssetsSubjectToControl" type="{http://schemas.ppsr.gov.au/2011/04/data}ExtendedBooleanType" minOccurs="0"/>
 *         &lt;element name="AreProceedsClaimed" type="{http://schemas.ppsr.gov.au/2011/04/data}ExtendedBooleanType" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfAttachmentDetail"/>
 *         &lt;element name="ChangeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CollateralClassType" type="{http://schemas.ppsr.gov.au/2011/04/data}CollateralClassType"/>
 *         &lt;element name="CollateralDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollateralType" type="{http://schemas.ppsr.gov.au/2011/04/data}CollateralType"/>
 *         &lt;element name="EarlierRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GivingOfNoticeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grantors" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfGrantor"/>
 *         &lt;element name="IsInventory" type="{http://schemas.ppsr.gov.au/2011/04/data}ExtendedBooleanType" minOccurs="0"/>
 *         &lt;element name="IsMigrated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPMSI" type="{http://schemas.ppsr.gov.au/2011/04/data}ExtendedBooleanType" minOccurs="0"/>
 *         &lt;element name="IsRegistrationEndTimeNotStated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSecurityInterestRegistrationKind" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsSubordinate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsTransitional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MigrationDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}MigrationDetail" minOccurs="0"/>
 *         &lt;element name="ProceedsClaimedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationChangeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegistrationEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RegistrationKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegistrationStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SecuredPartyGroup" type="{http://schemas.ppsr.gov.au/2011/04/data}CollateralRegistrationSecuredPartyGroup"/>
 *         &lt;element name="SerialNumberDetails" type="{http://schemas.ppsr.gov.au/2011/04/data}SerialisedCollateralDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralRegistration", propOrder = {
    "addressForService",
    "areAssetsSubjectToControl",
    "areProceedsClaimed",
    "attachments",
    "changeNumber",
    "collateralClassType",
    "collateralDescription",
    "collateralType",
    "earlierRegistrationNumber",
    "givingOfNoticeIdentifier",
    "grantors",
    "isInventory",
    "isMigrated",
    "isPMSI",
    "isRegistrationEndTimeNotStated",
    "isSecurityInterestRegistrationKind",
    "isSubordinate",
    "isTransitional",
    "migrationDetail",
    "proceedsClaimedDescription",
    "registrationChangeTime",
    "registrationEndTime",
    "registrationKind",
    "registrationNumber",
    "registrationStartTime",
    "securedPartyGroup",
    "serialNumberDetails"
})
public class CollateralRegistrationType {

    @XmlElement(name = "AddressForService", required = true, nillable = true)
    protected AddressForServiceType addressForService;
    @XmlElementRef(name = "AreAssetsSubjectToControl", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ExtendedBooleanTypeType> areAssetsSubjectToControl;
    @XmlElementRef(name = "AreProceedsClaimed", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ExtendedBooleanTypeType> areProceedsClaimed;
    @XmlElement(name = "Attachments", required = true, nillable = true)
    protected ArrayOfAttachmentDetailType attachments;
    @XmlElement(name = "ChangeNumber")
    protected long changeNumber;
    @XmlElement(name = "CollateralClassType", required = true)
    protected CollateralClassTypeType collateralClassType;
    @XmlElementRef(name = "CollateralDescription", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> collateralDescription;
    @XmlElement(name = "CollateralType", required = true)
    protected CollateralTypeType collateralType;
    @XmlElementRef(name = "EarlierRegistrationNumber", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> earlierRegistrationNumber;
    @XmlElementRef(name = "GivingOfNoticeIdentifier", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> givingOfNoticeIdentifier;
    @XmlElement(name = "Grantors", required = true, nillable = true)
    protected ArrayOfGrantorType grantors;
    @XmlElementRef(name = "IsInventory", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ExtendedBooleanTypeType> isInventory;
    @XmlElement(name = "IsMigrated")
    protected boolean isMigrated;
    @XmlElementRef(name = "IsPMSI", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ExtendedBooleanTypeType> isPMSI;
    @XmlElementRef(name = "IsRegistrationEndTimeNotStated", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Boolean> isRegistrationEndTimeNotStated;
    @XmlElement(name = "IsSecurityInterestRegistrationKind")
    protected boolean isSecurityInterestRegistrationKind;
    @XmlElement(name = "IsSubordinate")
    protected boolean isSubordinate;
    @XmlElement(name = "IsTransitional")
    protected boolean isTransitional;
    @XmlElementRef(name = "MigrationDetail", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<MigrationDetailType> migrationDetail;
    @XmlElementRef(name = "ProceedsClaimedDescription", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> proceedsClaimedDescription;
    @XmlElement(name = "RegistrationChangeTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationChangeTime;
    @XmlElementRef(name = "RegistrationEndTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> registrationEndTime;
    @XmlElement(name = "RegistrationKind", required = true, nillable = true)
    protected String registrationKind;
    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;
    @XmlElement(name = "RegistrationStartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationStartTime;
    @XmlElement(name = "SecuredPartyGroup", required = true, nillable = true)
    protected CollateralRegistrationSecuredPartyGroupType securedPartyGroup;
    @XmlElementRef(name = "SerialNumberDetails", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<SerialisedCollateralDescriptionType> serialNumberDetails;

    /**
     * Gets the value of the addressForService property.
     * 
     * @return
     *     possible object is
     *     {@link AddressForServiceType }
     *     
     */
    public AddressForServiceType getAddressForService() {
        return addressForService;
    }

    /**
     * Sets the value of the addressForService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressForServiceType }
     *     
     */
    public void setAddressForService(AddressForServiceType value) {
        this.addressForService = value;
    }

    /**
     * Gets the value of the areAssetsSubjectToControl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}
     *     
     */
    public JAXBElement<ExtendedBooleanTypeType> getAreAssetsSubjectToControl() {
        return areAssetsSubjectToControl;
    }

    /**
     * Sets the value of the areAssetsSubjectToControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}
     *     
     */
    public void setAreAssetsSubjectToControl(JAXBElement<ExtendedBooleanTypeType> value) {
        this.areAssetsSubjectToControl = ((JAXBElement<ExtendedBooleanTypeType> ) value);
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
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachmentDetailType }
     *     
     */
    public ArrayOfAttachmentDetailType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachmentDetailType }
     *     
     */
    public void setAttachments(ArrayOfAttachmentDetailType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the changeNumber property.
     * 
     */
    public long getChangeNumber() {
        return changeNumber;
    }

    /**
     * Sets the value of the changeNumber property.
     * 
     */
    public void setChangeNumber(long value) {
        this.changeNumber = value;
    }

    /**
     * Gets the value of the collateralClassType property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralClassTypeType }
     *     
     */
    public CollateralClassTypeType getCollateralClassType() {
        return collateralClassType;
    }

    /**
     * Sets the value of the collateralClassType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralClassTypeType }
     *     
     */
    public void setCollateralClassType(CollateralClassTypeType value) {
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
     * Gets the value of the collateralType property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralTypeType }
     *     
     */
    public CollateralTypeType getCollateralType() {
        return collateralType;
    }

    /**
     * Sets the value of the collateralType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralTypeType }
     *     
     */
    public void setCollateralType(CollateralTypeType value) {
        this.collateralType = value;
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
     * Gets the value of the grantors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGrantorType }
     *     
     */
    public ArrayOfGrantorType getGrantors() {
        return grantors;
    }

    /**
     * Sets the value of the grantors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGrantorType }
     *     
     */
    public void setGrantors(ArrayOfGrantorType value) {
        this.grantors = value;
    }

    /**
     * Gets the value of the isInventory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}
     *     
     */
    public JAXBElement<ExtendedBooleanTypeType> getIsInventory() {
        return isInventory;
    }

    /**
     * Sets the value of the isInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}
     *     
     */
    public void setIsInventory(JAXBElement<ExtendedBooleanTypeType> value) {
        this.isInventory = ((JAXBElement<ExtendedBooleanTypeType> ) value);
    }

    /**
     * Gets the value of the isMigrated property.
     * 
     */
    public boolean isIsMigrated() {
        return isMigrated;
    }

    /**
     * Sets the value of the isMigrated property.
     * 
     */
    public void setIsMigrated(boolean value) {
        this.isMigrated = value;
    }

    /**
     * Gets the value of the isPMSI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}
     *     
     */
    public JAXBElement<ExtendedBooleanTypeType> getIsPMSI() {
        return isPMSI;
    }

    /**
     * Sets the value of the isPMSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}
     *     
     */
    public void setIsPMSI(JAXBElement<ExtendedBooleanTypeType> value) {
        this.isPMSI = ((JAXBElement<ExtendedBooleanTypeType> ) value);
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
     * Gets the value of the isSecurityInterestRegistrationKind property.
     * 
     */
    public boolean isIsSecurityInterestRegistrationKind() {
        return isSecurityInterestRegistrationKind;
    }

    /**
     * Sets the value of the isSecurityInterestRegistrationKind property.
     * 
     */
    public void setIsSecurityInterestRegistrationKind(boolean value) {
        this.isSecurityInterestRegistrationKind = value;
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
     * Gets the value of the isTransitional property.
     * 
     */
    public boolean isIsTransitional() {
        return isTransitional;
    }

    /**
     * Sets the value of the isTransitional property.
     * 
     */
    public void setIsTransitional(boolean value) {
        this.isTransitional = value;
    }

    /**
     * Gets the value of the migrationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MigrationDetailType }{@code >}
     *     
     */
    public JAXBElement<MigrationDetailType> getMigrationDetail() {
        return migrationDetail;
    }

    /**
     * Sets the value of the migrationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MigrationDetailType }{@code >}
     *     
     */
    public void setMigrationDetail(JAXBElement<MigrationDetailType> value) {
        this.migrationDetail = ((JAXBElement<MigrationDetailType> ) value);
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
     * Gets the value of the registrationChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationChangeTime() {
        return registrationChangeTime;
    }

    /**
     * Sets the value of the registrationChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationChangeTime(XMLGregorianCalendar value) {
        this.registrationChangeTime = value;
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
     * Gets the value of the registrationKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationKind() {
        return registrationKind;
    }

    /**
     * Sets the value of the registrationKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationKind(String value) {
        this.registrationKind = value;
    }

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
     * Gets the value of the registrationStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationStartTime() {
        return registrationStartTime;
    }

    /**
     * Sets the value of the registrationStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationStartTime(XMLGregorianCalendar value) {
        this.registrationStartTime = value;
    }

    /**
     * Gets the value of the securedPartyGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRegistrationSecuredPartyGroupType }
     *     
     */
    public CollateralRegistrationSecuredPartyGroupType getSecuredPartyGroup() {
        return securedPartyGroup;
    }

    /**
     * Sets the value of the securedPartyGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRegistrationSecuredPartyGroupType }
     *     
     */
    public void setSecuredPartyGroup(CollateralRegistrationSecuredPartyGroupType value) {
        this.securedPartyGroup = value;
    }

    /**
     * Gets the value of the serialNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerialisedCollateralDescriptionType }{@code >}
     *     
     */
    public JAXBElement<SerialisedCollateralDescriptionType> getSerialNumberDetails() {
        return serialNumberDetails;
    }

    /**
     * Sets the value of the serialNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerialisedCollateralDescriptionType }{@code >}
     *     
     */
    public void setSerialNumberDetails(JAXBElement<SerialisedCollateralDescriptionType> value) {
        this.serialNumberDetails = ((JAXBElement<SerialisedCollateralDescriptionType> ) value);
    }

}
