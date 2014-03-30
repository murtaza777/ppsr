
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CommonResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonB2GMessageType">
 *       &lt;sequence>
 *         &lt;element name="PpsrRequestMessageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RequestProcessedByEnvironment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequestProcessedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonResponseType", propOrder = {
    "ppsrRequestMessageId",
    "requestProcessedByEnvironment",
    "requestProcessedDateTime"
})
@XmlSeeAlso({
    ReissueVerificationStatementResponseTypeType.class,
    RetrieveSearchCertificateRegistrationAttachmentResponseTypeType.class,
    RetrieveRegistrationResponseTypeType.class,
    RetrieveSearchResultRegistrationAttachmentResponseTypeType.class,
    OrdinalSearchResponseTypeType.class,
    RetrieveSecuredPartyGroupHistoryResponseTypeType.class,
    RequestReportResponseTypeType.class,
    TransferAllRegistrationsResponseTypeType.class,
    DischargeRegistrationResponseTypeType.class,
    SearchBySerialNumberResponseTypeType.class,
    SearchByGrantorAndEventDateRangeResponseTypeType.class,
    TransferSingleRegistrationResponseTypeType.class,
    RetrieveReportResponseTypeType.class,
    RetrieveGrantorSearchResultDetailResponseTypeType.class,
    AmendRegistrationResponseTypeType.class,
    RetrieveMessagesResponseTypeType.class,
    DeleteReportResponseTypeType.class,
    FilterGrantorSearchResultResponseTypeType.class,
    RetrieveMessagePdfResponseTypeType.class,
    RequestSearchCertificateResponseTypeType.class,
    SearchByGrantorResponseTypeType.class,
    RetrieveRegistrationHistoryDetailResponseTypeType.class,
    SearchByRegistrationNumberResponseTypeType.class,
    ChangeAccessCodeResponseTypeType.class,
    RetrieveSecuredPartyGroupResponseTypeType.class,
    RetrieveSearchCertificateResponseTypeType.class,
    UploadRegistrationAttachmentResponseTypeType.class,
    ResetAccessCodeResponseTypeType.class,
    RetrieveSearchResultResponseTypeType.class,
    CreateRegistrationsResponseTypeType.class,
    CreateSecuredPartyGroupResponseTypeType.class,
    UpdateSecuredPartyGroupResponseTypeType.class,
    RetrieveRegistrationAttachmentResponseTypeType.class,
    ChangeB2GPasswordResponseTypeType.class,
    RetrieveReportSummariesResponseTypeType.class,
    PingResponseTypeType.class,
    FilterGrantorAndEventDateRangeSearchResultResponseTypeType.class,
    DeleteMessagesResponseTypeType.class,
    ResetRegistrationTokenResponseTypeType.class
})
public class CommonResponseTypeType
    extends CommonB2GMessageTypeType
{

    @XmlElement(name = "PpsrRequestMessageId")
    protected long ppsrRequestMessageId;
    @XmlElement(name = "RequestProcessedByEnvironment", required = true, nillable = true)
    protected String requestProcessedByEnvironment;
    @XmlElement(name = "RequestProcessedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestProcessedDateTime;

    /**
     * Gets the value of the ppsrRequestMessageId property.
     * 
     */
    public long getPpsrRequestMessageId() {
        return ppsrRequestMessageId;
    }

    /**
     * Sets the value of the ppsrRequestMessageId property.
     * 
     */
    public void setPpsrRequestMessageId(long value) {
        this.ppsrRequestMessageId = value;
    }

    /**
     * Gets the value of the requestProcessedByEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestProcessedByEnvironment() {
        return requestProcessedByEnvironment;
    }

    /**
     * Sets the value of the requestProcessedByEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestProcessedByEnvironment(String value) {
        this.requestProcessedByEnvironment = value;
    }

    /**
     * Gets the value of the requestProcessedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestProcessedDateTime() {
        return requestProcessedDateTime;
    }

    /**
     * Sets the value of the requestProcessedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestProcessedDateTime(XMLGregorianCalendar value) {
        this.requestProcessedDateTime = value;
    }

}
