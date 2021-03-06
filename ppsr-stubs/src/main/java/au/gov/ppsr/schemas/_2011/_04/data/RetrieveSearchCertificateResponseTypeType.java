
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
 * <p>Java class for RetrieveSearchCertificateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveSearchCertificateResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="AccessToSearchCertificateExpiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Attachments" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfAttachmentDetail" minOccurs="0"/>
 *         &lt;element name="PpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SearchCertificateCreatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SearchCertificateFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="SearchCertificateFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveSearchCertificateResponseType", propOrder = {
    "accessToSearchCertificateExpiryTime",
    "attachments",
    "ppsrTransactionId",
    "searchCertificateCreatedDateTime",
    "searchCertificateFile",
    "searchCertificateFileName",
    "searchCertificateNumber"
})
public class RetrieveSearchCertificateResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "AccessToSearchCertificateExpiryTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accessToSearchCertificateExpiryTime;
    @XmlElementRef(name = "Attachments", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAttachmentDetailType> attachments;
    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;
    @XmlElement(name = "SearchCertificateCreatedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchCertificateCreatedDateTime;
    @XmlElementRef(name = "SearchCertificateFile", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<byte[]> searchCertificateFile;
    @XmlElementRef(name = "SearchCertificateFileName", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> searchCertificateFileName;
    @XmlElement(name = "SearchCertificateNumber", required = true, nillable = true)
    protected String searchCertificateNumber;

    /**
     * Gets the value of the accessToSearchCertificateExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccessToSearchCertificateExpiryTime() {
        return accessToSearchCertificateExpiryTime;
    }

    /**
     * Sets the value of the accessToSearchCertificateExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccessToSearchCertificateExpiryTime(XMLGregorianCalendar value) {
        this.accessToSearchCertificateExpiryTime = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetailType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAttachmentDetailType> getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetailType }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<ArrayOfAttachmentDetailType> value) {
        this.attachments = ((JAXBElement<ArrayOfAttachmentDetailType> ) value);
    }

    /**
     * Gets the value of the ppsrTransactionId property.
     * 
     */
    public long getPpsrTransactionId() {
        return ppsrTransactionId;
    }

    /**
     * Sets the value of the ppsrTransactionId property.
     * 
     */
    public void setPpsrTransactionId(long value) {
        this.ppsrTransactionId = value;
    }

    /**
     * Gets the value of the searchCertificateCreatedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchCertificateCreatedDateTime() {
        return searchCertificateCreatedDateTime;
    }

    /**
     * Sets the value of the searchCertificateCreatedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchCertificateCreatedDateTime(XMLGregorianCalendar value) {
        this.searchCertificateCreatedDateTime = value;
    }

    /**
     * Gets the value of the searchCertificateFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSearchCertificateFile() {
        return searchCertificateFile;
    }

    /**
     * Sets the value of the searchCertificateFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSearchCertificateFile(JAXBElement<byte[]> value) {
        this.searchCertificateFile = ((JAXBElement<byte[]> ) value);
    }

    /**
     * Gets the value of the searchCertificateFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSearchCertificateFileName() {
        return searchCertificateFileName;
    }

    /**
     * Sets the value of the searchCertificateFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSearchCertificateFileName(JAXBElement<String> value) {
        this.searchCertificateFileName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the searchCertificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCertificateNumber() {
        return searchCertificateNumber;
    }

    /**
     * Sets the value of the searchCertificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCertificateNumber(String value) {
        this.searchCertificateNumber = value;
    }

}
