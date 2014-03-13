
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequestSearchCertificateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestSearchCertificateResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="AccessToSearchCertificateExpiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SearchCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SearchCertificateRequestedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestSearchCertificateResponseType", propOrder = {
    "accessToSearchCertificateExpiryTime",
    "ppsrTransactionId",
    "searchCertificateNumber",
    "searchCertificateRequestedDateTime"
})
public class RequestSearchCertificateResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "AccessToSearchCertificateExpiryTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accessToSearchCertificateExpiryTime;
    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;
    @XmlElement(name = "SearchCertificateNumber", required = true, nillable = true)
    protected String searchCertificateNumber;
    @XmlElement(name = "SearchCertificateRequestedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchCertificateRequestedDateTime;

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

    /**
     * Gets the value of the searchCertificateRequestedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchCertificateRequestedDateTime() {
        return searchCertificateRequestedDateTime;
    }

    /**
     * Sets the value of the searchCertificateRequestedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchCertificateRequestedDateTime(XMLGregorianCalendar value) {
        this.searchCertificateRequestedDateTime = value;
    }

}
