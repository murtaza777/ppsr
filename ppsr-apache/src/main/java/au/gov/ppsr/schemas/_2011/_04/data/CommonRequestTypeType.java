
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonB2GMessageType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonRequestType")
@XmlSeeAlso({
    RetrieveGrantorSearchResultDetailRequestTypeType.class,
    DeleteMessagesRequestTypeType.class,
    RetrieveSearchResultRegistrationAttachmentRequestTypeType.class,
    DischargeRegistrationRequestTypeType.class,
    SearchByGrantorRequestTypeType.class,
    RequestSearchCertificateRequestTypeType.class,
    RetrieveReportSummariesRequestTypeType.class,
    ResetAccessCodeRequestTypeType.class,
    SearchByGrantorAndEventDateRangeRequestTypeType.class,
    TransferSingleRegistrationRequestTypeType.class,
    OrdinalSearchRequestTypeType.class,
    TransferAllRegistrationsRequestTypeType.class,
    FilterGrantorSearchResultRequestTypeType.class,
    ResetRegistrationTokenRequestTypeType.class,
    RetrieveSecuredPartyGroupHistoryRequestTypeType.class,
    RetrieveMessagesRequestTypeType.class,
    FilterGrantorAndEventDateRangeSearchResultRequestTypeType.class,
    SearchByRegistrationNumberRequestTypeType.class,
    SearchBySerialNumberRequestTypeType.class,
    RequestReportRequestTypeType.class,
    ChangeB2GPasswordRequestTypeType.class,
    RetrieveRegistrationHistoryDetailRequestTypeType.class,
    RetrieveSearchCertificateRequestTypeType.class,
    PingRequestTypeType.class,
    RetrieveRegistrationRequestTypeType.class,
    UpdateSecuredPartyGroupRequestTypeType.class,
    CreateSecuredPartyGroupRequestTypeType.class,
    CreateRegistrationsRequestTypeType.class,
    ReissueVerificationStatementRequestTypeType.class,
    RetrieveReportRequestTypeType.class,
    ChangeAccessCodeRequestTypeType.class,
    UploadRegistrationAttachmentRequestTypeType.class,
    RetrieveMessagePdfRequestTypeType.class,
    AmendRegistrationRequestTypeType.class,
    RetrieveSearchResultRequestTypeType.class,
    RetrieveSecuredPartyGroupRequestTypeType.class,
    RetrieveRegistrationAttachmentRequestTypeType.class,
    DeleteReportRequestTypeType.class,
    RetrieveSearchCertificateRegistrationAttachmentRequestTypeType.class
})
public class CommonRequestTypeType
    extends CommonB2GMessageTypeType
{


}
