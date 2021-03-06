
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveSearchCertificateRegistrationAttachmentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveSearchCertificateRegistrationAttachmentRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "RetrieveSearchCertificateRegistrationAttachmentRequestType", propOrder = {
    "attachmentId",
    "searchCertificateNumber"
})
public class RetrieveSearchCertificateRegistrationAttachmentRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "AttachmentId")
    protected long attachmentId;
    @XmlElement(name = "SearchCertificateNumber", required = true, nillable = true)
    protected String searchCertificateNumber;

    /**
     * Gets the value of the attachmentId property.
     * 
     */
    public long getAttachmentId() {
        return attachmentId;
    }

    /**
     * Sets the value of the attachmentId property.
     * 
     */
    public void setAttachmentId(long value) {
        this.attachmentId = value;
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
