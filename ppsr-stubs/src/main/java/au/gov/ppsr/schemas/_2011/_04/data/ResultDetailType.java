
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeHistory" type="{http://schemas.ppsr.gov.au/2011/04/data}ChangeHistory" minOccurs="0"/>
 *         &lt;element name="RegistrationDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}RegistrationDetail" minOccurs="0"/>
 *         &lt;element name="RestrictionDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}RestrictionDetail" minOccurs="0"/>
 *         &lt;element name="ResultSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultDetail", propOrder = {
    "changeHistory",
    "registrationDetail",
    "restrictionDetail",
    "resultSequenceNumber"
})
public class ResultDetailType {

    @XmlElementRef(name = "ChangeHistory", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ChangeHistoryType> changeHistory;
    @XmlElementRef(name = "RegistrationDetail", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<RegistrationDetailType> registrationDetail;
    @XmlElementRef(name = "RestrictionDetail", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<RestrictionDetailType> restrictionDetail;
    @XmlElementRef(name = "ResultSequenceNumber", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Short> resultSequenceNumber;

    /**
     * Gets the value of the changeHistory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeHistoryType }{@code >}
     *     
     */
    public JAXBElement<ChangeHistoryType> getChangeHistory() {
        return changeHistory;
    }

    /**
     * Sets the value of the changeHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeHistoryType }{@code >}
     *     
     */
    public void setChangeHistory(JAXBElement<ChangeHistoryType> value) {
        this.changeHistory = ((JAXBElement<ChangeHistoryType> ) value);
    }

    /**
     * Gets the value of the registrationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegistrationDetailType }{@code >}
     *     
     */
    public JAXBElement<RegistrationDetailType> getRegistrationDetail() {
        return registrationDetail;
    }

    /**
     * Sets the value of the registrationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegistrationDetailType }{@code >}
     *     
     */
    public void setRegistrationDetail(JAXBElement<RegistrationDetailType> value) {
        this.registrationDetail = ((JAXBElement<RegistrationDetailType> ) value);
    }

    /**
     * Gets the value of the restrictionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RestrictionDetailType }{@code >}
     *     
     */
    public JAXBElement<RestrictionDetailType> getRestrictionDetail() {
        return restrictionDetail;
    }

    /**
     * Sets the value of the restrictionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RestrictionDetailType }{@code >}
     *     
     */
    public void setRestrictionDetail(JAXBElement<RestrictionDetailType> value) {
        this.restrictionDetail = ((JAXBElement<RestrictionDetailType> ) value);
    }

    /**
     * Gets the value of the resultSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getResultSequenceNumber() {
        return resultSequenceNumber;
    }

    /**
     * Sets the value of the resultSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setResultSequenceNumber(JAXBElement<Short> value) {
        this.resultSequenceNumber = ((JAXBElement<Short> ) value);
    }

}
