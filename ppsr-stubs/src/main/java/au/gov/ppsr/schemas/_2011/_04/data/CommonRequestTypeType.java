
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
    RetrieveRegistrationHistoryDetailRequestTypeType.class,
    ResetAccessCodeRequestTypeType.class,
    SearchByRegistrationNumberRequestTypeType.class,
    RetrieveSearchResultRequestTypeType.class,
    UpdateSecuredPartyGroupRequestTypeType.class,
    RequestSearchCertificateRequestTypeType.class,
    RetrieveRegistrationRequestTypeType.class,
    FilterGrantorSearchResultRequestTypeType.class,
    RequestReportRequestTypeType.class,
    TransferAllRegistrationsRequestTypeType.class,
    ReissueVerificationStatementRequestTypeType.class,
    RetrieveRegistrationAttachmentRequestTypeType.class,
    CreateRegistrationsRequestTypeType.class,
    RetrieveSearchResultRegistrationAttachmentRequestTypeType.class,
    TransferSingleRegistrationRequestTypeType.class,
    RetrieveReportRequestTypeType.class,
    DischargeRegistrationRequestTypeType.class,
    SearchByGrantorAndEventDateRangeRequestTypeType.class,
    RetrieveSearchCertificateRegistrationAttachmentRequestTypeType.class,
    RetrieveGrantorSearchResultDetailRequestTypeType.class,
    CreateSecuredPartyGroupRequestTypeType.class,
    DeleteReportRequestTypeType.class,
    UploadRegistrationAttachmentRequestTypeType.class,
    ResetRegistrationTokenRequestTypeType.class,
    FilterGrantorAndEventDateRangeSearchResultRequestTypeType.class,
    SearchByGrantorRequestTypeType.class,
    RetrieveReportSummariesRequestTypeType.class,
    DeleteMessagesRequestTypeType.class,
    ChangeB2GPasswordRequestTypeType.class,
    OrdinalSearchRequestTypeType.class,
    ChangeAccessCodeRequestTypeType.class,
    AmendRegistrationRequestTypeType.class,
    RetrieveMessagesRequestTypeType.class,
    RetrieveSecuredPartyGroupRequestTypeType.class,
    PingRequestTypeType.class,
    RetrieveMessagePdfRequestTypeType.class,
    SearchBySerialNumberRequestTypeType.class,
    RetrieveSecuredPartyGroupHistoryRequestTypeType.class,
    RetrieveSearchCertificateRequestTypeType.class
})
public class CommonRequestTypeType
    extends CommonB2GMessageTypeType
{


}
