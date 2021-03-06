
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.gov.ppsr.schemas._2011._04.data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IdentifierVerificationStatusType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "IdentifierVerificationStatusType");
    private final static QName _OrdinalSearchSearchCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrdinalSearchSearchCriteria");
    private final static QName _RetrieveSecuredPartyGroupHistoryResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSecuredPartyGroupHistoryResponseType");
    private final static QName _CollateralType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralType");
    private final static QName _SearchByGrantorResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByGrantorResponseType");
    private final static QName _ResetAccessCodeRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ResetAccessCodeRequestType");
    private final static QName _CreateRegistrationsResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CreateRegistrationsResponseType");
    private final static QName _SearchByGrantorSearchResultSummary_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByGrantorSearchResultSummary");
    private final static QName _CollateralClassSearchCriteriaType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralClassSearchCriteriaType");
    private final static QName _NewSecuredParty_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NewSecuredParty");
    private final static QName _ArrayOfNewCollateralRegistration_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfNewCollateralRegistration");
    private final static QName _RetrieveReportSummariesRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveReportSummariesRequestType");
    private final static QName _ReissueVerificationStatementResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReissueVerificationStatementResponseType");
    private final static QName _NevdisVehicleIdentifier_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NevdisVehicleIdentifier");
    private final static QName _SearchByRegistrationNumberSearchCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByRegistrationNumberSearchCriteria");
    private final static QName _ArrayOfCollateralType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfCollateralType");
    private final static QName _ArrayOfChangeDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfChangeDetail");
    private final static QName _SerialisedCollateralDescription_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SerialisedCollateralDescription");
    private final static QName _UpdatedSecuredParty_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "UpdatedSecuredParty");
    private final static QName _AdditionalAircraftCollateralDescription_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AdditionalAircraftCollateralDescription");
    private final static QName _UpdateSecuredPartyGroupResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "UpdateSecuredPartyGroupResponseType");
    private final static QName _CommonRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CommonRequestType");
    private final static QName _NevdisVehicleDescription_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NevdisVehicleDescription");
    private final static QName _NewAddress_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NewAddress");
    private final static QName _ArrayOfGrantor_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfGrantor");
    private final static QName _ArrayOfCustomersUserDefinedField_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfCustomersUserDefinedField");
    private final static QName _RetrieveGrantorSearchResultDetailResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveGrantorSearchResultDetailResponseType");
    private final static QName _OrdinalSearchRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrdinalSearchRequestType");
    private final static QName _GrantorIndividual_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GrantorIndividual");
    private final static QName _ArrayOfUpdatedSecuredParty_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfUpdatedSecuredParty");
    private final static QName _TransferSingleRegistrationRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "TransferSingleRegistrationRequestType");
    private final static QName _ChangeDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ChangeDetail");
    private final static QName _SearchByGrantorAndEventDateRangeRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByGrantorAndEventDateRangeRequestType");
    private final static QName _RetrieveRegistrationHistoryDetailResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveRegistrationHistoryDetailResponseType");
    private final static QName _RetrieveSearchResultRegistrationAttachmentRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSearchResultRegistrationAttachmentRequestType");
    private final static QName _RetrieveRegistrationResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveRegistrationResponseType");
    private final static QName _ChangeHistory_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ChangeHistory");
    private final static QName _RetrieveMessagesResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveMessagesResponseType");
    private final static QName _DischargeRegistrationRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "DischargeRegistrationRequestType");
    private final static QName _ReportSummary_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportSummary");
    private final static QName _ChangeB2GPasswordResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ChangeB2GPasswordResponseType");
    private final static QName _IsLaxSupportedResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "IsLaxSupportedResponseType");
    private final static QName _GrantorOrganisationSearchCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GrantorOrganisationSearchCriteria");
    private final static QName _CollateralClassSearchSummaryDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralClassSearchSummaryDetail");
    private final static QName _DeleteMessagesRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "DeleteMessagesRequestType");
    private final static QName _CommonB2GMessageType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CommonB2GMessageType");
    private final static QName _RetrieveSearchCertificateRegistrationAttachmentResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSearchCertificateRegistrationAttachmentResponseType");
    private final static QName _PingResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "PingResponseType");
    private final static QName _RetrieveGrantorSearchResultDetailRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveGrantorSearchResultDetailRequestType");
    private final static QName _AddressForService_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AddressForService");
    private final static QName _WrittenOffDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "WrittenOffDetail");
    private final static QName _RequestSearchCertificateRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RequestSearchCertificateRequestType");
    private final static QName _ArrayOfCollateralClassFilterCriteriaType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfCollateralClassFilterCriteriaType");
    private final static QName _SearchByGrantorRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByGrantorRequestType");
    private final static QName _RemovedGrantor_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RemovedGrantor");
    private final static QName _Grantor_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Grantor");
    private final static QName _NevdisVehicleDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NevdisVehicleDetail");
    private final static QName _NewRegistrationSerialNumberType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NewRegistrationSerialNumberType");
    private final static QName _SortOrderType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SortOrderType");
    private final static QName _ArrayOfSecuredPartyWithVerification_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfSecuredPartyWithVerification");
    private final static QName _SecuredPartyGroupChange_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SecuredPartyGroupChange");
    private final static QName _TransferAllRegistrationsResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "TransferAllRegistrationsResponseType");
    private final static QName _ResultDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ResultDetail");
    private final static QName _RemovalDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RemovalDetail");
    private final static QName _StolenDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "StolenDetail");
    private final static QName _ArrayOfCollateralClassSearchCriteriaType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfCollateralClassSearchCriteriaType");
    private final static QName _SearchByGrantorFilterCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByGrantorFilterCriteria");
    private final static QName _NewAddressForService_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NewAddressForService");
    private final static QName _FilterGrantorAndEventDateRangeSearchResultRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "FilterGrantorAndEventDateRangeSearchResultRequestType");
    private final static QName _SecuredParty_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SecuredParty");
    private final static QName _ArrayOfGrantorSearchDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfGrantorSearchDetail");
    private final static QName _DischargeRegistrationResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "DischargeRegistrationResponseType");
    private final static QName _RetrieveMessagesRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveMessagesRequestType");
    private final static QName _RetrieveSecuredPartyGroupResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSecuredPartyGroupResponseType");
    private final static QName _AmendRegistrationResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AmendRegistrationResponseType");
    private final static QName _CollateralRegistrationAmendments_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralRegistrationAmendments");
    private final static QName _NevdisVehicle_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NevdisVehicle");
    private final static QName _ArrayOfRemovedAttachment_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfRemovedAttachment");
    private final static QName _RetrieveReportSummariesResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveReportSummariesResponseType");
    private final static QName _ArrayOfReportSummary_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfReportSummary");
    private final static QName _UpdatedAddressForService_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "UpdatedAddressForService");
    private final static QName _SearchBySerialNumberRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchBySerialNumberRequestType");
    private final static QName _ResetRegistrationTokenResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ResetRegistrationTokenResponseType");
    private final static QName _ChangeAccessCodeResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ChangeAccessCodeResponseType");
    private final static QName _SearchByRegistrationNumberRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByRegistrationNumberRequestType");
    private final static QName _NewCollateralRegistration_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NewCollateralRegistration");
    private final static QName _MigrationDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "MigrationDetail");
    private final static QName _ReportFormatType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportFormatType");
    private final static QName _FilterGrantorSearchResultResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "FilterGrantorSearchResultResponseType");
    private final static QName _CollateralClassFilterCriteriaType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralClassFilterCriteriaType");
    private final static QName _AdditionalVehicleCollateralDescriptionAmendments_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AdditionalVehicleCollateralDescriptionAmendments");
    private final static QName _NewAttachment_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NewAttachment");
    private final static QName _RegistrationEvent_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RegistrationEvent");
    private final static QName _ResetAccessCodeResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ResetAccessCodeResponseType");
    private final static QName _ArrayOfRemovedGrantor_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfRemovedGrantor");
    private final static QName _GrantorIndividualSearchDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GrantorIndividualSearchDetail");
    private final static QName _RetrieveSearchCertificateResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSearchCertificateResponseType");
    private final static QName _ChangeType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ChangeType");
    private final static QName _OrdinalSearchSearchResult_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrdinalSearchSearchResult");
    private final static QName _SerialNumberType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SerialNumberType");
    private final static QName _TransferAllRegistrationsRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "TransferAllRegistrationsRequestType");
    private final static QName _SearchByGrantorAndEventDateRangeSearchCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByGrantorAndEventDateRangeSearchCriteria");
    private final static QName _RetrieveRegistrationAttachmentResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveRegistrationAttachmentResponseType");
    private final static QName _ArrayOfResultDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfResultDetail");
    private final static QName _AdditionalVehicleCollateralDescription_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AdditionalVehicleCollateralDescription");
    private final static QName _AdditionalAircraftCollateralDescriptionAmendments_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AdditionalAircraftCollateralDescriptionAmendments");
    private final static QName _ReportRequestedChannelType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportRequestedChannelType");
    private final static QName _SearchType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchType");
    private final static QName _RetrieveSecuredPartyGroupHistoryRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSecuredPartyGroupHistoryRequestType");
    private final static QName _ResetRegistrationTokenRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ResetRegistrationTokenRequestType");
    private final static QName _ArrayOfCollateralRegistrationSecuredParty_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfCollateralRegistrationSecuredParty");
    private final static QName _FilterGrantorSearchResultRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "FilterGrantorSearchResultRequestType");
    private final static QName _SearchBySerialNumberSearchResult_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchBySerialNumberSearchResult");
    private final static QName _SearchCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchCriteria");
    private final static QName _GrantorOrganisationWithVerificationStatus_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GrantorOrganisationWithVerificationStatus");
    private final static QName _RegistrationDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RegistrationDetail");
    private final static QName _B2GMailboxMessage_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "B2GMailboxMessage");
    private final static QName _UploadRegistrationAttachmentResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "UploadRegistrationAttachmentResponseType");
    private final static QName _ArrayOfRegistrationInfo_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfRegistrationInfo");
    private final static QName _CreateRegistrationsRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CreateRegistrationsRequestType");
    private final static QName _NevdisData_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NevdisData");
    private final static QName _SearchSummary_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchSummary");
    private final static QName _SearchByGrantorSearchResult_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByGrantorSearchResult");
    private final static QName _CustomersUserDefinedField_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CustomersUserDefinedField");
    private final static QName _UpdateSecuredPartyGroupRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "UpdateSecuredPartyGroupRequestType");
    private final static QName _RequestReportResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RequestReportResponseType");
    private final static QName _ArrayOfSecuredParty_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfSecuredParty");
    private final static QName _CreateSecuredPartyGroupRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CreateSecuredPartyGroupRequestType");
    private final static QName _ExtendedBooleanType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ExtendedBooleanType");
    private final static QName _ArrayOfCollateralClassSearchSummaryDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfCollateralClassSearchSummaryDetail");
    private final static QName _OrdinalSearchSearchResultDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrdinalSearchSearchResultDetail");
    private final static QName _RestrictionDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RestrictionDetail");
    private final static QName _RemovedAttachment_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RemovedAttachment");
    private final static QName _RetrieveRegistrationRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveRegistrationRequestType");
    private final static QName _SearchBySerialNumberSearchCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchBySerialNumberSearchCriteria");
    private final static QName _RetrieveReportRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveReportRequestType");
    private final static QName _DeleteReportResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "DeleteReportResponseType");
    private final static QName _OrdinalRegistrationDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrdinalRegistrationDetail");
    private final static QName _Address_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Address");
    private final static QName _OrganisationNumberType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrganisationNumberType");
    private final static QName _RestrictedAccessDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RestrictedAccessDetail");
    private final static QName _ReportStatusType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportStatusType");
    private final static QName _NewRegistrationCollateralType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NewRegistrationCollateralType");
    private final static QName _CreateSecuredPartyGroupResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CreateSecuredPartyGroupResponseType");
    private final static QName _ReissueVerificationStatementRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReissueVerificationStatementRequestType");
    private final static QName _ArrayOfNewGrantor_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfNewGrantor");
    private final static QName _PingRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "PingRequestType");
    private final static QName _RetrieveSearchCertificateRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSearchCertificateRequestType");
    private final static QName _RetrieveRegistrationHistoryDetailRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveRegistrationHistoryDetailRequestType");
    private final static QName _FilterSummary_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "FilterSummary");
    private final static QName _ChangeB2GPasswordRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ChangeB2GPasswordRequestType");
    private final static QName _RequestSearchCertificateResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RequestSearchCertificateResponseType");
    private final static QName _SecuredPartyIndividual_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SecuredPartyIndividual");
    private final static QName _B2GMailboxPdfMessage_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "B2GMailboxPdfMessage");
    private final static QName _RetrieveSearchResultResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSearchResultResponseType");
    private final static QName _RequestReportRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RequestReportRequestType");
    private final static QName _ArrayOfSecuredPartyGroupChange_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfSecuredPartyGroupChange");
    private final static QName _ArrayOfCollateralTypeSearchSummaryDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfCollateralTypeSearchSummaryDetail");
    private final static QName _NewGrantorIndividual_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NewGrantorIndividual");
    private final static QName _AttachmentDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AttachmentDetail");
    private final static QName _SecuredPartyWithVerification_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SecuredPartyWithVerification");
    private final static QName _RetrieveSearchResultRegistrationAttachmentResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSearchResultRegistrationAttachmentResponseType");
    private final static QName _ArrayOfStolenDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfStolenDetail");
    private final static QName _RegistrationEventType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RegistrationEventType");
    private final static QName _SecuredPartyOrganisation_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SecuredPartyOrganisation");
    private final static QName _DeleteReportRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "DeleteReportRequestType");
    private final static QName _RetrieveRegistrationAttachmentRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveRegistrationAttachmentRequestType");
    private final static QName _RetrieveSecuredPartyGroupRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSecuredPartyGroupRequestType");
    private final static QName _ArrayOfB2GMailboxMessage_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfB2GMailboxMessage");
    private final static QName _SecuredPartyGroupWithVerification_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SecuredPartyGroupWithVerification");
    private final static QName _FilterGrantorAndEventDateRangeSearchResultResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "FilterGrantorAndEventDateRangeSearchResultResponseType");
    private final static QName _ArrayOfReverifySecuredParty_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfReverifySecuredParty");
    private final static QName _CollateralTypeSearchSummaryDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralTypeSearchSummaryDetail");
    private final static QName _NewRegistrationSerialisedCollateralDescription_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NewRegistrationSerialisedCollateralDescription");
    private final static QName _RetrieveSearchResultRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSearchResultRequestType");
    private final static QName _NewGrantor_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NewGrantor");
    private final static QName _OrdinalSearchResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrdinalSearchResponseType");
    private final static QName _NevdisVehicleIdentifierType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NevdisVehicleIdentifierType");
    private final static QName _AddressForServiceSearchDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AddressForServiceSearchDetail");
    private final static QName _GrantorOrganisation_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GrantorOrganisation");
    private final static QName _SearchSelectionFlagType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchSelectionFlagType");
    private final static QName _SecuredPartyOrganisationWithVerification_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SecuredPartyOrganisationWithVerification");
    private final static QName _CollateralClassType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralClassType");
    private final static QName _SearchByRegistrationNumberSearchResult_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByRegistrationNumberSearchResult");
    private final static QName _CommonResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CommonResponseType");
    private final static QName _SearchByGrantorSearchCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByGrantorSearchCriteria");
    private final static QName _RetrieveSearchCertificateRegistrationAttachmentRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveSearchCertificateRegistrationAttachmentRequestType");
    private final static QName _CollateralRegistrationSecuredPartyGroup_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralRegistrationSecuredPartyGroup");
    private final static QName _GrantorIndividualSearchCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GrantorIndividualSearchCriteria");
    private final static QName _OrdinalSearchResultType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrdinalSearchResultType");
    private final static QName _ArrayOfNewSecuredParty_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfNewSecuredParty");
    private final static QName _CollateralRegistration_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralRegistration");
    private final static QName _GrantorSearchDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GrantorSearchDetail");
    private final static QName _ArrayOfNevdisVehicle_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfNevdisVehicle");
    private final static QName _ReverifySecuredParty_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReverifySecuredParty");
    private final static QName _SerialNumberSearchCriteriaType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SerialNumberSearchCriteriaType");
    private final static QName _TransferSingleRegistrationResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "TransferSingleRegistrationResponseType");
    private final static QName _ArrayOfWrittenOffDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfWrittenOffDetail");
    private final static QName _SearchBySerialNumberResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchBySerialNumberResponseType");
    private final static QName _SearchResult_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchResult");
    private final static QName _RetrieveMessagePdfRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveMessagePdfRequestType");
    private final static QName _DeleteMessagesResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "DeleteMessagesResponseType");
    private final static QName _UploadRegistrationAttachmentRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "UploadRegistrationAttachmentRequestType");
    private final static QName _GrantorType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GrantorType");
    private final static QName _ArrayOfAttachmentDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfAttachmentDetail");
    private final static QName _NewRegistrationCollateralClassType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NewRegistrationCollateralClassType");
    private final static QName _ChangeAccessCodeRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ChangeAccessCodeRequestType");
    private final static QName _SearchByGrantorAndEventDateRangeFilterCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByGrantorAndEventDateRangeFilterCriteria");
    private final static QName _NevdisRegistration_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NevdisRegistration");
    private final static QName _SearchByRegistrationNumberResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByRegistrationNumberResponseType");
    private final static QName _ArrayOfNewAttachment_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ArrayOfNewAttachment");
    private final static QName _AmendRegistrationRequestType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AmendRegistrationRequestType");
    private final static QName _RegistrationInfo_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RegistrationInfo");
    private final static QName _CollateralRegistrationSecuredParty_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralRegistrationSecuredParty");
    private final static QName _SearchByGrantorAndEventDateRangeResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByGrantorAndEventDateRangeResponseType");
    private final static QName _SecuredPartyType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SecuredPartyType");
    private final static QName _RetrieveReportResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveReportResponseType");
    private final static QName _RetrieveMessagePdfResponseType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RetrieveMessagePdfResponseType");
    private final static QName _IsLaxSupportedResponseTypeTypeValue_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Value");
    private final static QName _RetrieveReportSummariesRequestTypeTypeReportType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportType");
    private final static QName _RetrieveReportSummariesRequestTypeTypeReportNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportNumber");
    private final static QName _AdditionalAircraftCollateralDescriptionAmendmentsTypeAircraftNationality_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AircraftNationality");
    private final static QName _AdditionalAircraftCollateralDescriptionAmendmentsTypeAircraftNationalityCodeAndRegistrationMark_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AircraftNationalityCodeAndRegistrationMark");
    private final static QName _DischargeRegistrationRequestTypeTypeSecuredPartyGroupAccessCode_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SecuredPartyGroupAccessCode");
    private final static QName _DischargeRegistrationRequestTypeTypeRegistrationToken_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RegistrationToken");
    private final static QName _DischargeRegistrationRequestTypeTypeSecuredPartyGroupNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SecuredPartyGroupNumber");
    private final static QName _GrantorSearchDetailTypeOrganisation_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Organisation");
    private final static QName _GrantorSearchDetailTypeIndividual_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Individual");
    private final static QName _RetrieveMessagesRequestTypeTypeGivingOfNoticeIdentifier_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GivingOfNoticeIdentifier");
    private final static QName _RetrieveMessagesRequestTypeTypeChangeNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ChangeNumber");
    private final static QName _RetrieveMessagesRequestTypeTypeMessagesAddedFromDateTime_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "MessagesAddedFromDateTime");
    private final static QName _RetrieveMessagesRequestTypeTypeMessagesBeforeMessageId_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "MessagesBeforeMessageId");
    private final static QName _RetrieveMessagesRequestTypeTypeIncludePreviouslyRetrievedMessages_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "IncludePreviouslyRetrievedMessages");
    private final static QName _RetrieveMessagesRequestTypeTypeMessagesAfterMessageId_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "MessagesAfterMessageId");
    private final static QName _RetrieveMessagesRequestTypeTypeMessagesAddedToDateTime_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "MessagesAddedToDateTime");
    private final static QName _RetrieveMessagesRequestTypeTypeOriginalCustomersRequestMessageId_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OriginalCustomersRequestMessageId");
    private final static QName _RetrieveMessagesRequestTypeTypeRegistrationNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RegistrationNumber");
    private final static QName _RetrieveMessagesRequestTypeTypeNotificationType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NotificationType");
    private final static QName _UpdateSecuredPartyGroupRequestTypeTypeReverifySecuredParties_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReverifySecuredParties");
    private final static QName _UpdateSecuredPartyGroupRequestTypeTypeUpdatedSecuredParties_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "UpdatedSecuredParties");
    private final static QName _TransferSingleRegistrationRequestTypeTypeTransferFromSecuredPartyGroupAccessCode_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "TransferFromSecuredPartyGroupAccessCode");
    private final static QName _AddressForServiceTypeAddressee_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Addressee");
    private final static QName _AddressForServiceTypeB2GAccountCustomerName_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "B2GAccountCustomerName");
    private final static QName _AddressForServiceTypeEmailAddress_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "EmailAddress");
    private final static QName _AddressForServiceTypeB2GAccountCustomerNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "B2GAccountCustomerNumber");
    private final static QName _AddressForServiceTypePhysicalAddress_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "PhysicalAddress");
    private final static QName _AddressForServiceTypeFaxNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "FaxNumber");
    private final static QName _SecuredPartyOrganisationTypeOrganisationName_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrganisationName");
    private final static QName _SecuredPartyOrganisationTypeOrganisationNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrganisationNumber");
    private final static QName _NewAddressTypeISO3166CountryCode_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ISO3166CountryCode");
    private final static QName _NewAddressTypeLine2_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Line2");
    private final static QName _NewAddressTypePostcode_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Postcode");
    private final static QName _NewAddressTypeLine3_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Line3");
    private final static QName _NewAddressTypeLocality_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Locality");
    private final static QName _NewAddressTypeState_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "State");
    private final static QName _UpdatedSecuredPartyTypeContactPhone_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ContactPhone");
    private final static QName _UpdatedSecuredPartyTypeMailingAddress_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "MailingAddress");
    private final static QName _UpdatedSecuredPartyTypeContactName_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ContactName");
    private final static QName _RestrictedAccessDetailTypeRestrictedAccessReasonDescription_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RestrictedAccessReasonDescription");
    private final static QName _RestrictedAccessDetailTypeRegistrationEndTime_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RegistrationEndTime");
    private final static QName _ReportSummaryTypeReportProducedDateTime_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportProducedDateTime");
    private final static QName _ReportSummaryTypeReportExpiryDateTime_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportExpiryDateTime");
    private final static QName _ReportSummaryTypePdfFilePageCount_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "PdfFilePageCount");
    private final static QName _ReportSummaryTypeReportRequestedB2GAccountCustomerLocation_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportRequestedB2GAccountCustomerLocation");
    private final static QName _ReportSummaryTypeReportFileName_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportFileName");
    private final static QName _ReportSummaryTypeReportFileSizeBytes_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportFileSizeBytes");
    private final static QName _SecuredPartyOrganisationWithVerificationTypeOrganisationNumberVerificationStatus_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrganisationNumberVerificationStatus");
    private final static QName _SecuredPartyOrganisationWithVerificationTypeOrganisationNumberVerificationDateTime_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "OrganisationNumberVerificationDateTime");
    private final static QName _B2GMailboxMessageTypeMessageLastRetrievedDateTime_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "MessageLastRetrievedDateTime");
    private final static QName _NevdisRegistrationTypeExpiryDate_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ExpiryDate");
    private final static QName _NevdisRegistrationTypePlateNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "PlateNumber");
    private final static QName _NewRegistrationSerialisedCollateralDescriptionTypeAdditionalVehicleDetails_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AdditionalVehicleDetails");
    private final static QName _NewRegistrationSerialisedCollateralDescriptionTypeAdditionalAircraftDetails_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AdditionalAircraftDetails");
    private final static QName _AdditionalVehicleCollateralDescriptionTypeVehicleRegistrationNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "VehicleRegistrationNumber");
    private final static QName _AdditionalVehicleCollateralDescriptionTypeVehicleDescriptiveText_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "VehicleDescriptiveText");
    private final static QName _CollateralRegistrationAmendmentsTypeAreProceedsClaimed_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AreProceedsClaimed");
    private final static QName _CollateralRegistrationAmendmentsTypeAttachmentIdsToAdd_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AttachmentIdsToAdd");
    private final static QName _CollateralRegistrationAmendmentsTypeProceedsClaimedDescription_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ProceedsClaimedDescription");
    private final static QName _CollateralRegistrationAmendmentsTypeIsRegistrationEndTimeNotStated_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "IsRegistrationEndTimeNotStated");
    private final static QName _CollateralRegistrationAmendmentsTypeGrantorsToRemove_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GrantorsToRemove");
    private final static QName _CollateralRegistrationAmendmentsTypeCollateralDescription_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralDescription");
    private final static QName _CollateralRegistrationAmendmentsTypeAttachmentIdsToRemove_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AttachmentIdsToRemove");
    private final static QName _CollateralRegistrationAmendmentsTypeGrantorsToAdd_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GrantorsToAdd");
    private final static QName _CollateralRegistrationAmendmentsTypeIsSubordinate_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "IsSubordinate");
    private final static QName _OrdinalRegistrationDetailTypeIsAccessRestricted_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "IsAccessRestricted");
    private final static QName _OrdinalRegistrationDetailTypeEventTime_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "EventTime");
    private final static QName _TransferAllRegistrationsRequestTypeTypeCompletionNotificationEmailAddress_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CompletionNotificationEmailAddress");
    private final static QName _NevdisVehicleTypeWrittenOffDetails_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "WrittenOffDetails");
    private final static QName _NevdisVehicleTypeStolenDetails_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "StolenDetails");
    private final static QName _GrantorIndividualTypeDateOfBirth_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "DateOfBirth");
    private final static QName _RegistrationDetailTypeAreAssetsSubjectToControl_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AreAssetsSubjectToControl");
    private final static QName _RegistrationDetailTypeAttachments_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Attachments");
    private final static QName _RegistrationDetailTypeIsInventory_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "IsInventory");
    private final static QName _RegistrationDetailTypeSerialNumberDetails_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SerialNumberDetails");
    private final static QName _RegistrationDetailTypeIsPMSI_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "IsPMSI");
    private final static QName _RegistrationDetailTypeGrantors_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Grantors");
    private final static QName _RegistrationDetailTypeEarlierRegistrationNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "EarlierRegistrationNumber");
    private final static QName _WrittenOffDetailTypeWrittenOffSummary_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "WrittenOffSummary");
    private final static QName _NevdisDataTypeNevdisVehicles_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "NevdisVehicles");
    private final static QName _RetrieveGrantorSearchResultDetailResponseTypeTypeResultDetails_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ResultDetails");
    private final static QName _AddressTypeCountryName_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CountryName");
    private final static QName _UploadRegistrationAttachmentRequestTypeTypeAttachmentDescription_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "AttachmentDescription");
    private final static QName _GrantorIndividualSearchDetailTypeFamilyName_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "FamilyName");
    private final static QName _GrantorIndividualSearchDetailTypeGivenNames_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GivenNames");
    private final static QName _ResultDetailTypeResultSequenceNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ResultSequenceNumber");
    private final static QName _StolenDetailTypeStolenSummary_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "StolenSummary");
    private final static QName _SearchBySerialNumberSearchResultTypeTransitionalPeriodMessage_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "TransitionalPeriodMessage");
    private final static QName _RequestReportRequestTypeTypeReportReadyNotificationEmailAddress_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportReadyNotificationEmailAddress");
    private final static QName _RetrieveSearchResultRegistrationAttachmentResponseTypeTypeAttachment_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Attachment");
    private final static QName _SearchBySerialNumberSearchCriteriaTypePointInTimeDateTime_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "PointInTimeDateTime");
    private final static QName _PingResponseTypeTypeExtension_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Extension");
    private final static QName _RetrieveReportResponseTypeTypeReportFile_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ReportFile");
    private final static QName _OrdinalSearchSearchResultDetailTypeTransitionalMessage_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "TransitionalMessage");
    private final static QName _SearchByGrantorSearchCriteriaTypeCollateralClassSearchCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralClassSearchCriteria");
    private final static QName _NevdisVehicleDetailTypeVehicleDescription_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "VehicleDescription");
    private final static QName _NevdisVehicleDetailTypeRegistration_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Registration");
    private final static QName _NevdisVehicleDetailTypeJurisdiction_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Jurisdiction");
    private final static QName _AdditionalAircraftCollateralDescriptionTypeManufacturersName_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ManufacturersName");
    private final static QName _AdditionalAircraftCollateralDescriptionTypeManufacturersModel_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ManufacturersModel");
    private final static QName _RemovalDetailTypeRemovalReasonFurtherDetails_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "RemovalReasonFurtherDetails");
    private final static QName _SearchResultTypeSearchByGrantorAndEventDateRangeSearchResult_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchByGrantorAndEventDateRangeSearchResult");
    private final static QName _SearchByGrantorFilterCriteriaTypeStartTimeYear_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "StartTimeYear");
    private final static QName _SearchByGrantorFilterCriteriaTypeCollateralTypeFilterCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralTypeFilterCriteria");
    private final static QName _SearchByGrantorFilterCriteriaTypeCollateralClassFilterCriteria_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "CollateralClassFilterCriteria");
    private final static QName _SearchByGrantorFilterCriteriaTypeLastChangeTimeYear_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "LastChangeTimeYear");
    private final static QName _NevdisVehicleDescriptionTypeVehicleType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "VehicleType");
    private final static QName _NevdisVehicleDescriptionTypeManufactureYear_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ManufactureYear");
    private final static QName _NevdisVehicleDescriptionTypeMake_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Make");
    private final static QName _NevdisVehicleDescriptionTypeModel_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Model");
    private final static QName _NevdisVehicleDescriptionTypeEngineNumber_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "EngineNumber");
    private final static QName _NevdisVehicleDescriptionTypeColour_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "Colour");
    private final static QName _NevdisVehicleDescriptionTypeBodyType_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "BodyType");
    private final static QName _NevdisVehicleDescriptionTypeComplianceYearMonth_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "ComplianceYearMonth");
    private final static QName _SearchByGrantorSearchResultTypeGrantorOrganisationSearchCriteriaVerificationDetail_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "GrantorOrganisationSearchCriteriaVerificationDetail");
    private final static QName _RetrieveSearchCertificateResponseTypeTypeSearchCertificateFile_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchCertificateFile");
    private final static QName _RetrieveSearchCertificateResponseTypeTypeSearchCertificateFileName_QNAME = new QName("http://schemas.ppsr.gov.au/2011/04/data", "SearchCertificateFileName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.gov.ppsr.schemas._2011._04.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveReportSummariesRequestTypeType }
     * 
     */
    public RetrieveReportSummariesRequestTypeType createRetrieveReportSummariesRequestTypeType() {
        return new RetrieveReportSummariesRequestTypeType();
    }

    /**
     * Create an instance of {@link CustomersUserDefinedFieldType }
     * 
     */
    public CustomersUserDefinedFieldType createCustomersUserDefinedFieldType() {
        return new CustomersUserDefinedFieldType();
    }

    /**
     * Create an instance of {@link UploadRegistrationAttachmentResponseTypeType }
     * 
     */
    public UploadRegistrationAttachmentResponseTypeType createUploadRegistrationAttachmentResponseTypeType() {
        return new UploadRegistrationAttachmentResponseTypeType();
    }

    /**
     * Create an instance of {@link CollateralRegistrationSecuredPartyGroupType }
     * 
     */
    public CollateralRegistrationSecuredPartyGroupType createCollateralRegistrationSecuredPartyGroupType() {
        return new CollateralRegistrationSecuredPartyGroupType();
    }

    /**
     * Create an instance of {@link RemovedAttachmentType }
     * 
     */
    public RemovedAttachmentType createRemovedAttachmentType() {
        return new RemovedAttachmentType();
    }

    /**
     * Create an instance of {@link ReportSummaryType.ReportCriteria }
     * 
     */
    public ReportSummaryType.ReportCriteria createReportSummaryTypeReportCriteria() {
        return new ReportSummaryType.ReportCriteria();
    }

    /**
     * Create an instance of {@link GrantorIndividualSearchCriteriaType }
     * 
     */
    public GrantorIndividualSearchCriteriaType createGrantorIndividualSearchCriteriaType() {
        return new GrantorIndividualSearchCriteriaType();
    }

    /**
     * Create an instance of {@link SearchSummaryType }
     * 
     */
    public SearchSummaryType createSearchSummaryType() {
        return new SearchSummaryType();
    }

    /**
     * Create an instance of {@link SearchCriteriaType }
     * 
     */
    public SearchCriteriaType createSearchCriteriaType() {
        return new SearchCriteriaType();
    }

    /**
     * Create an instance of {@link AddressForServiceType }
     * 
     */
    public AddressForServiceType createAddressForServiceType() {
        return new AddressForServiceType();
    }

    /**
     * Create an instance of {@link RetrieveGrantorSearchResultDetailRequestTypeType }
     * 
     */
    public RetrieveGrantorSearchResultDetailRequestTypeType createRetrieveGrantorSearchResultDetailRequestTypeType() {
        return new RetrieveGrantorSearchResultDetailRequestTypeType();
    }

    /**
     * Create an instance of {@link SearchByGrantorResponseTypeType }
     * 
     */
    public SearchByGrantorResponseTypeType createSearchByGrantorResponseTypeType() {
        return new SearchByGrantorResponseTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfChangeDetailType }
     * 
     */
    public ArrayOfChangeDetailType createArrayOfChangeDetailType() {
        return new ArrayOfChangeDetailType();
    }

    /**
     * Create an instance of {@link ArrayOfReverifySecuredPartyType }
     * 
     */
    public ArrayOfReverifySecuredPartyType createArrayOfReverifySecuredPartyType() {
        return new ArrayOfReverifySecuredPartyType();
    }

    /**
     * Create an instance of {@link TransferAllRegistrationsResponseTypeType }
     * 
     */
    public TransferAllRegistrationsResponseTypeType createTransferAllRegistrationsResponseTypeType() {
        return new TransferAllRegistrationsResponseTypeType();
    }

    /**
     * Create an instance of {@link NewAddressType }
     * 
     */
    public NewAddressType createNewAddressType() {
        return new NewAddressType();
    }

    /**
     * Create an instance of {@link CommonB2GMessageTypeType }
     * 
     */
    public CommonB2GMessageTypeType createCommonB2GMessageTypeType() {
        return new CommonB2GMessageTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfStolenDetailType }
     * 
     */
    public ArrayOfStolenDetailType createArrayOfStolenDetailType() {
        return new ArrayOfStolenDetailType();
    }

    /**
     * Create an instance of {@link UpdatedSecuredPartyType }
     * 
     */
    public UpdatedSecuredPartyType createUpdatedSecuredPartyType() {
        return new UpdatedSecuredPartyType();
    }

    /**
     * Create an instance of {@link AmendRegistrationResponseTypeType }
     * 
     */
    public AmendRegistrationResponseTypeType createAmendRegistrationResponseTypeType() {
        return new AmendRegistrationResponseTypeType();
    }

    /**
     * Create an instance of {@link ReportSummaryType }
     * 
     */
    public ReportSummaryType createReportSummaryType() {
        return new ReportSummaryType();
    }

    /**
     * Create an instance of {@link RetrieveRegistrationRequestTypeType }
     * 
     */
    public RetrieveRegistrationRequestTypeType createRetrieveRegistrationRequestTypeType() {
        return new RetrieveRegistrationRequestTypeType();
    }

    /**
     * Create an instance of {@link UpdateSecuredPartyGroupResponseTypeType }
     * 
     */
    public UpdateSecuredPartyGroupResponseTypeType createUpdateSecuredPartyGroupResponseTypeType() {
        return new UpdateSecuredPartyGroupResponseTypeType();
    }

    /**
     * Create an instance of {@link NevdisRegistrationType }
     * 
     */
    public NevdisRegistrationType createNevdisRegistrationType() {
        return new NevdisRegistrationType();
    }

    /**
     * Create an instance of {@link OrdinalSearchSearchResultType }
     * 
     */
    public OrdinalSearchSearchResultType createOrdinalSearchSearchResultType() {
        return new OrdinalSearchSearchResultType();
    }

    /**
     * Create an instance of {@link NewRegistrationSerialisedCollateralDescriptionType }
     * 
     */
    public NewRegistrationSerialisedCollateralDescriptionType createNewRegistrationSerialisedCollateralDescriptionType() {
        return new NewRegistrationSerialisedCollateralDescriptionType();
    }

    /**
     * Create an instance of {@link AdditionalVehicleCollateralDescriptionType }
     * 
     */
    public AdditionalVehicleCollateralDescriptionType createAdditionalVehicleCollateralDescriptionType() {
        return new AdditionalVehicleCollateralDescriptionType();
    }

    /**
     * Create an instance of {@link FilterSummaryType }
     * 
     */
    public FilterSummaryType createFilterSummaryType() {
        return new FilterSummaryType();
    }

    /**
     * Create an instance of {@link NewSecuredPartyType }
     * 
     */
    public NewSecuredPartyType createNewSecuredPartyType() {
        return new NewSecuredPartyType();
    }

    /**
     * Create an instance of {@link CollateralRegistrationAmendmentsType }
     * 
     */
    public CollateralRegistrationAmendmentsType createCollateralRegistrationAmendmentsType() {
        return new CollateralRegistrationAmendmentsType();
    }

    /**
     * Create an instance of {@link FilterGrantorSearchResultRequestTypeType }
     * 
     */
    public FilterGrantorSearchResultRequestTypeType createFilterGrantorSearchResultRequestTypeType() {
        return new FilterGrantorSearchResultRequestTypeType();
    }

    /**
     * Create an instance of {@link CreateRegistrationsResponseTypeType }
     * 
     */
    public CreateRegistrationsResponseTypeType createCreateRegistrationsResponseTypeType() {
        return new CreateRegistrationsResponseTypeType();
    }

    /**
     * Create an instance of {@link SearchByRegistrationNumberSearchCriteriaType }
     * 
     */
    public SearchByRegistrationNumberSearchCriteriaType createSearchByRegistrationNumberSearchCriteriaType() {
        return new SearchByRegistrationNumberSearchCriteriaType();
    }

    /**
     * Create an instance of {@link ArrayOfCollateralTypeSearchSummaryDetailType }
     * 
     */
    public ArrayOfCollateralTypeSearchSummaryDetailType createArrayOfCollateralTypeSearchSummaryDetailType() {
        return new ArrayOfCollateralTypeSearchSummaryDetailType();
    }

    /**
     * Create an instance of {@link SearchByGrantorAndEventDateRangeResponseTypeType }
     * 
     */
    public SearchByGrantorAndEventDateRangeResponseTypeType createSearchByGrantorAndEventDateRangeResponseTypeType() {
        return new SearchByGrantorAndEventDateRangeResponseTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfNewCollateralRegistrationType }
     * 
     */
    public ArrayOfNewCollateralRegistrationType createArrayOfNewCollateralRegistrationType() {
        return new ArrayOfNewCollateralRegistrationType();
    }

    /**
     * Create an instance of {@link GrantorOrganisationSearchCriteriaType }
     * 
     */
    public GrantorOrganisationSearchCriteriaType createGrantorOrganisationSearchCriteriaType() {
        return new GrantorOrganisationSearchCriteriaType();
    }

    /**
     * Create an instance of {@link TransferAllRegistrationsRequestTypeType }
     * 
     */
    public TransferAllRegistrationsRequestTypeType createTransferAllRegistrationsRequestTypeType() {
        return new TransferAllRegistrationsRequestTypeType();
    }

    /**
     * Create an instance of {@link RetrieveSearchCertificateRequestTypeType }
     * 
     */
    public RetrieveSearchCertificateRequestTypeType createRetrieveSearchCertificateRequestTypeType() {
        return new RetrieveSearchCertificateRequestTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfSecuredPartyType }
     * 
     */
    public ArrayOfSecuredPartyType createArrayOfSecuredPartyType() {
        return new ArrayOfSecuredPartyType();
    }

    /**
     * Create an instance of {@link UpdatedAddressForServiceType }
     * 
     */
    public UpdatedAddressForServiceType createUpdatedAddressForServiceType() {
        return new UpdatedAddressForServiceType();
    }

    /**
     * Create an instance of {@link NewGrantorIndividualType }
     * 
     */
    public NewGrantorIndividualType createNewGrantorIndividualType() {
        return new NewGrantorIndividualType();
    }

    /**
     * Create an instance of {@link RetrieveRegistrationHistoryDetailRequestTypeType }
     * 
     */
    public RetrieveRegistrationHistoryDetailRequestTypeType createRetrieveRegistrationHistoryDetailRequestTypeType() {
        return new RetrieveRegistrationHistoryDetailRequestTypeType();
    }

    /**
     * Create an instance of {@link GrantorIndividualType }
     * 
     */
    public GrantorIndividualType createGrantorIndividualType() {
        return new GrantorIndividualType();
    }

    /**
     * Create an instance of {@link ReissueVerificationStatementRequestTypeType }
     * 
     */
    public ReissueVerificationStatementRequestTypeType createReissueVerificationStatementRequestTypeType() {
        return new ReissueVerificationStatementRequestTypeType();
    }

    /**
     * Create an instance of {@link SearchByGrantorRequestTypeType }
     * 
     */
    public SearchByGrantorRequestTypeType createSearchByGrantorRequestTypeType() {
        return new SearchByGrantorRequestTypeType();
    }

    /**
     * Create an instance of {@link MigrationDetailType }
     * 
     */
    public MigrationDetailType createMigrationDetailType() {
        return new MigrationDetailType();
    }

    /**
     * Create an instance of {@link RequestSearchCertificateRequestTypeType }
     * 
     */
    public RequestSearchCertificateRequestTypeType createRequestSearchCertificateRequestTypeType() {
        return new RequestSearchCertificateRequestTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfNewSecuredPartyType }
     * 
     */
    public ArrayOfNewSecuredPartyType createArrayOfNewSecuredPartyType() {
        return new ArrayOfNewSecuredPartyType();
    }

    /**
     * Create an instance of {@link ArrayOfWrittenOffDetailType }
     * 
     */
    public ArrayOfWrittenOffDetailType createArrayOfWrittenOffDetailType() {
        return new ArrayOfWrittenOffDetailType();
    }

    /**
     * Create an instance of {@link SearchByGrantorAndEventDateRangeSearchCriteriaType }
     * 
     */
    public SearchByGrantorAndEventDateRangeSearchCriteriaType createSearchByGrantorAndEventDateRangeSearchCriteriaType() {
        return new SearchByGrantorAndEventDateRangeSearchCriteriaType();
    }

    /**
     * Create an instance of {@link SearchByGrantorAndEventDateRangeFilterCriteriaType }
     * 
     */
    public SearchByGrantorAndEventDateRangeFilterCriteriaType createSearchByGrantorAndEventDateRangeFilterCriteriaType() {
        return new SearchByGrantorAndEventDateRangeFilterCriteriaType();
    }

    /**
     * Create an instance of {@link RegistrationEventType }
     * 
     */
    public RegistrationEventType createRegistrationEventType() {
        return new RegistrationEventType();
    }

    /**
     * Create an instance of {@link RegistrationInfoType }
     * 
     */
    public RegistrationInfoType createRegistrationInfoType() {
        return new RegistrationInfoType();
    }

    /**
     * Create an instance of {@link PingRequestTypeType }
     * 
     */
    public PingRequestTypeType createPingRequestTypeType() {
        return new PingRequestTypeType();
    }

    /**
     * Create an instance of {@link WrittenOffDetailType }
     * 
     */
    public WrittenOffDetailType createWrittenOffDetailType() {
        return new WrittenOffDetailType();
    }

    /**
     * Create an instance of {@link NevdisDataType }
     * 
     */
    public NevdisDataType createNevdisDataType() {
        return new NevdisDataType();
    }

    /**
     * Create an instance of {@link RetrieveGrantorSearchResultDetailResponseTypeType }
     * 
     */
    public RetrieveGrantorSearchResultDetailResponseTypeType createRetrieveGrantorSearchResultDetailResponseTypeType() {
        return new RetrieveGrantorSearchResultDetailResponseTypeType();
    }

    /**
     * Create an instance of {@link CommonRequestTypeType }
     * 
     */
    public CommonRequestTypeType createCommonRequestTypeType() {
        return new CommonRequestTypeType();
    }

    /**
     * Create an instance of {@link AmendRegistrationRequestTypeType }
     * 
     */
    public AmendRegistrationRequestTypeType createAmendRegistrationRequestTypeType() {
        return new AmendRegistrationRequestTypeType();
    }

    /**
     * Create an instance of {@link GrantorType }
     * 
     */
    public GrantorType createGrantorType() {
        return new GrantorType();
    }

    /**
     * Create an instance of {@link RetrieveRegistrationResponseTypeType }
     * 
     */
    public RetrieveRegistrationResponseTypeType createRetrieveRegistrationResponseTypeType() {
        return new RetrieveRegistrationResponseTypeType();
    }

    /**
     * Create an instance of {@link DischargeRegistrationResponseTypeType }
     * 
     */
    public DischargeRegistrationResponseTypeType createDischargeRegistrationResponseTypeType() {
        return new DischargeRegistrationResponseTypeType();
    }

    /**
     * Create an instance of {@link TransferSingleRegistrationResponseTypeType }
     * 
     */
    public TransferSingleRegistrationResponseTypeType createTransferSingleRegistrationResponseTypeType() {
        return new TransferSingleRegistrationResponseTypeType();
    }

    /**
     * Create an instance of {@link ChangeB2GPasswordRequestTypeType }
     * 
     */
    public ChangeB2GPasswordRequestTypeType createChangeB2GPasswordRequestTypeType() {
        return new ChangeB2GPasswordRequestTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfUpdatedSecuredPartyType }
     * 
     */
    public ArrayOfUpdatedSecuredPartyType createArrayOfUpdatedSecuredPartyType() {
        return new ArrayOfUpdatedSecuredPartyType();
    }

    /**
     * Create an instance of {@link RequestReportResponseTypeType }
     * 
     */
    public RequestReportResponseTypeType createRequestReportResponseTypeType() {
        return new RequestReportResponseTypeType();
    }

    /**
     * Create an instance of {@link ResultDetailType }
     * 
     */
    public ResultDetailType createResultDetailType() {
        return new ResultDetailType();
    }

    /**
     * Create an instance of {@link PingResponseTypeType.Extension }
     * 
     */
    public PingResponseTypeType.Extension createPingResponseTypeTypeExtension() {
        return new PingResponseTypeType.Extension();
    }

    /**
     * Create an instance of {@link NewAddressForServiceType }
     * 
     */
    public NewAddressForServiceType createNewAddressForServiceType() {
        return new NewAddressForServiceType();
    }

    /**
     * Create an instance of {@link AttachmentDetailType }
     * 
     */
    public AttachmentDetailType createAttachmentDetailType() {
        return new AttachmentDetailType();
    }

    /**
     * Create an instance of {@link SearchBySerialNumberSearchResultType }
     * 
     */
    public SearchBySerialNumberSearchResultType createSearchBySerialNumberSearchResultType() {
        return new SearchBySerialNumberSearchResultType();
    }

    /**
     * Create an instance of {@link RetrieveSearchResultRequestTypeType }
     * 
     */
    public RetrieveSearchResultRequestTypeType createRetrieveSearchResultRequestTypeType() {
        return new RetrieveSearchResultRequestTypeType();
    }

    /**
     * Create an instance of {@link RetrieveSearchResultRegistrationAttachmentResponseTypeType }
     * 
     */
    public RetrieveSearchResultRegistrationAttachmentResponseTypeType createRetrieveSearchResultRegistrationAttachmentResponseTypeType() {
        return new RetrieveSearchResultRegistrationAttachmentResponseTypeType();
    }

    /**
     * Create an instance of {@link RetrieveReportResponseTypeType }
     * 
     */
    public RetrieveReportResponseTypeType createRetrieveReportResponseTypeType() {
        return new RetrieveReportResponseTypeType();
    }

    /**
     * Create an instance of {@link SearchByGrantorSearchCriteriaType }
     * 
     */
    public SearchByGrantorSearchCriteriaType createSearchByGrantorSearchCriteriaType() {
        return new SearchByGrantorSearchCriteriaType();
    }

    /**
     * Create an instance of {@link CommonResponseTypeType }
     * 
     */
    public CommonResponseTypeType createCommonResponseTypeType() {
        return new CommonResponseTypeType();
    }

    /**
     * Create an instance of {@link CollateralTypeSearchSummaryDetailType }
     * 
     */
    public CollateralTypeSearchSummaryDetailType createCollateralTypeSearchSummaryDetailType() {
        return new CollateralTypeSearchSummaryDetailType();
    }

    /**
     * Create an instance of {@link RestrictionDetailType }
     * 
     */
    public RestrictionDetailType createRestrictionDetailType() {
        return new RestrictionDetailType();
    }

    /**
     * Create an instance of {@link SecuredPartyWithVerificationType }
     * 
     */
    public SecuredPartyWithVerificationType createSecuredPartyWithVerificationType() {
        return new SecuredPartyWithVerificationType();
    }

    /**
     * Create an instance of {@link NevdisVehicleDetailType }
     * 
     */
    public NevdisVehicleDetailType createNevdisVehicleDetailType() {
        return new NevdisVehicleDetailType();
    }

    /**
     * Create an instance of {@link GrantorOrganisationWithVerificationStatusType }
     * 
     */
    public GrantorOrganisationWithVerificationStatusType createGrantorOrganisationWithVerificationStatusType() {
        return new GrantorOrganisationWithVerificationStatusType();
    }

    /**
     * Create an instance of {@link NewAttachmentType }
     * 
     */
    public NewAttachmentType createNewAttachmentType() {
        return new NewAttachmentType();
    }

    /**
     * Create an instance of {@link CollateralRegistrationType }
     * 
     */
    public CollateralRegistrationType createCollateralRegistrationType() {
        return new CollateralRegistrationType();
    }

    /**
     * Create an instance of {@link ArrayOfRegistrationInfoType }
     * 
     */
    public ArrayOfRegistrationInfoType createArrayOfRegistrationInfoType() {
        return new ArrayOfRegistrationInfoType();
    }

    /**
     * Create an instance of {@link SearchByGrantorAndEventDateRangeRequestTypeType }
     * 
     */
    public SearchByGrantorAndEventDateRangeRequestTypeType createSearchByGrantorAndEventDateRangeRequestTypeType() {
        return new SearchByGrantorAndEventDateRangeRequestTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfSecuredPartyGroupChangeType }
     * 
     */
    public ArrayOfSecuredPartyGroupChangeType createArrayOfSecuredPartyGroupChangeType() {
        return new ArrayOfSecuredPartyGroupChangeType();
    }

    /**
     * Create an instance of {@link RemovalDetailType }
     * 
     */
    public RemovalDetailType createRemovalDetailType() {
        return new RemovalDetailType();
    }

    /**
     * Create an instance of {@link DeleteReportRequestTypeType }
     * 
     */
    public DeleteReportRequestTypeType createDeleteReportRequestTypeType() {
        return new DeleteReportRequestTypeType();
    }

    /**
     * Create an instance of {@link SecuredPartyIndividualType }
     * 
     */
    public SecuredPartyIndividualType createSecuredPartyIndividualType() {
        return new SecuredPartyIndividualType();
    }

    /**
     * Create an instance of {@link RemovedGrantorType }
     * 
     */
    public RemovedGrantorType createRemovedGrantorType() {
        return new RemovedGrantorType();
    }

    /**
     * Create an instance of {@link ResetRegistrationTokenResponseTypeType }
     * 
     */
    public ResetRegistrationTokenResponseTypeType createResetRegistrationTokenResponseTypeType() {
        return new ResetRegistrationTokenResponseTypeType();
    }

    /**
     * Create an instance of {@link RetrieveSearchResultResponseTypeType }
     * 
     */
    public RetrieveSearchResultResponseTypeType createRetrieveSearchResultResponseTypeType() {
        return new RetrieveSearchResultResponseTypeType();
    }

    /**
     * Create an instance of {@link NevdisVehicleDescriptionType }
     * 
     */
    public NevdisVehicleDescriptionType createNevdisVehicleDescriptionType() {
        return new NevdisVehicleDescriptionType();
    }

    /**
     * Create an instance of {@link RetrieveReportRequestTypeType }
     * 
     */
    public RetrieveReportRequestTypeType createRetrieveReportRequestTypeType() {
        return new RetrieveReportRequestTypeType();
    }

    /**
     * Create an instance of {@link RetrieveSearchCertificateResponseTypeType }
     * 
     */
    public RetrieveSearchCertificateResponseTypeType createRetrieveSearchCertificateResponseTypeType() {
        return new RetrieveSearchCertificateResponseTypeType();
    }

    /**
     * Create an instance of {@link B2GMailboxPdfMessageType }
     * 
     */
    public B2GMailboxPdfMessageType createB2GMailboxPdfMessageType() {
        return new B2GMailboxPdfMessageType();
    }

    /**
     * Create an instance of {@link IsLaxSupportedResponseTypeType }
     * 
     */
    public IsLaxSupportedResponseTypeType createIsLaxSupportedResponseTypeType() {
        return new IsLaxSupportedResponseTypeType();
    }

    /**
     * Create an instance of {@link SecuredPartyGroupWithVerificationType }
     * 
     */
    public SecuredPartyGroupWithVerificationType createSecuredPartyGroupWithVerificationType() {
        return new SecuredPartyGroupWithVerificationType();
    }

    /**
     * Create an instance of {@link AdditionalAircraftCollateralDescriptionAmendmentsType }
     * 
     */
    public AdditionalAircraftCollateralDescriptionAmendmentsType createAdditionalAircraftCollateralDescriptionAmendmentsType() {
        return new AdditionalAircraftCollateralDescriptionAmendmentsType();
    }

    /**
     * Create an instance of {@link DischargeRegistrationRequestTypeType }
     * 
     */
    public DischargeRegistrationRequestTypeType createDischargeRegistrationRequestTypeType() {
        return new DischargeRegistrationRequestTypeType();
    }

    /**
     * Create an instance of {@link GrantorSearchDetailType }
     * 
     */
    public GrantorSearchDetailType createGrantorSearchDetailType() {
        return new GrantorSearchDetailType();
    }

    /**
     * Create an instance of {@link RetrieveSecuredPartyGroupRequestTypeType }
     * 
     */
    public RetrieveSecuredPartyGroupRequestTypeType createRetrieveSecuredPartyGroupRequestTypeType() {
        return new RetrieveSecuredPartyGroupRequestTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfCollateralClassSearchSummaryDetailType }
     * 
     */
    public ArrayOfCollateralClassSearchSummaryDetailType createArrayOfCollateralClassSearchSummaryDetailType() {
        return new ArrayOfCollateralClassSearchSummaryDetailType();
    }

    /**
     * Create an instance of {@link RetrieveMessagesRequestTypeType }
     * 
     */
    public RetrieveMessagesRequestTypeType createRetrieveMessagesRequestTypeType() {
        return new RetrieveMessagesRequestTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfRemovedGrantorType }
     * 
     */
    public ArrayOfRemovedGrantorType createArrayOfRemovedGrantorType() {
        return new ArrayOfRemovedGrantorType();
    }

    /**
     * Create an instance of {@link UpdateSecuredPartyGroupRequestTypeType }
     * 
     */
    public UpdateSecuredPartyGroupRequestTypeType createUpdateSecuredPartyGroupRequestTypeType() {
        return new UpdateSecuredPartyGroupRequestTypeType();
    }

    /**
     * Create an instance of {@link RetrieveSecuredPartyGroupHistoryRequestTypeType }
     * 
     */
    public RetrieveSecuredPartyGroupHistoryRequestTypeType createRetrieveSecuredPartyGroupHistoryRequestTypeType() {
        return new RetrieveSecuredPartyGroupHistoryRequestTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfNewGrantorType }
     * 
     */
    public ArrayOfNewGrantorType createArrayOfNewGrantorType() {
        return new ArrayOfNewGrantorType();
    }

    /**
     * Create an instance of {@link TransferSingleRegistrationRequestTypeType }
     * 
     */
    public TransferSingleRegistrationRequestTypeType createTransferSingleRegistrationRequestTypeType() {
        return new TransferSingleRegistrationRequestTypeType();
    }

    /**
     * Create an instance of {@link ChangeAccessCodeRequestTypeType }
     * 
     */
    public ChangeAccessCodeRequestTypeType createChangeAccessCodeRequestTypeType() {
        return new ChangeAccessCodeRequestTypeType();
    }

    /**
     * Create an instance of {@link SecuredPartyOrganisationType }
     * 
     */
    public SecuredPartyOrganisationType createSecuredPartyOrganisationType() {
        return new SecuredPartyOrganisationType();
    }

    /**
     * Create an instance of {@link SearchBySerialNumberRequestTypeType }
     * 
     */
    public SearchBySerialNumberRequestTypeType createSearchBySerialNumberRequestTypeType() {
        return new SearchBySerialNumberRequestTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfCustomersUserDefinedFieldType }
     * 
     */
    public ArrayOfCustomersUserDefinedFieldType createArrayOfCustomersUserDefinedFieldType() {
        return new ArrayOfCustomersUserDefinedFieldType();
    }

    /**
     * Create an instance of {@link ArrayOfNevdisVehicleType }
     * 
     */
    public ArrayOfNevdisVehicleType createArrayOfNevdisVehicleType() {
        return new ArrayOfNevdisVehicleType();
    }

    /**
     * Create an instance of {@link RestrictedAccessDetailType }
     * 
     */
    public RestrictedAccessDetailType createRestrictedAccessDetailType() {
        return new RestrictedAccessDetailType();
    }

    /**
     * Create an instance of {@link ArrayOfCollateralClassSearchCriteriaTypeType }
     * 
     */
    public ArrayOfCollateralClassSearchCriteriaTypeType createArrayOfCollateralClassSearchCriteriaTypeType() {
        return new ArrayOfCollateralClassSearchCriteriaTypeType();
    }

    /**
     * Create an instance of {@link ChangeAccessCodeResponseTypeType }
     * 
     */
    public ChangeAccessCodeResponseTypeType createChangeAccessCodeResponseTypeType() {
        return new ChangeAccessCodeResponseTypeType();
    }

    /**
     * Create an instance of {@link OrdinalSearchSearchCriteriaType }
     * 
     */
    public OrdinalSearchSearchCriteriaType createOrdinalSearchSearchCriteriaType() {
        return new OrdinalSearchSearchCriteriaType();
    }

    /**
     * Create an instance of {@link SecuredPartyOrganisationWithVerificationType }
     * 
     */
    public SecuredPartyOrganisationWithVerificationType createSecuredPartyOrganisationWithVerificationType() {
        return new SecuredPartyOrganisationWithVerificationType();
    }

    /**
     * Create an instance of {@link B2GMailboxMessageType }
     * 
     */
    public B2GMailboxMessageType createB2GMailboxMessageType() {
        return new B2GMailboxMessageType();
    }

    /**
     * Create an instance of {@link RetrieveReportSummariesResponseTypeType }
     * 
     */
    public RetrieveReportSummariesResponseTypeType createRetrieveReportSummariesResponseTypeType() {
        return new RetrieveReportSummariesResponseTypeType();
    }

    /**
     * Create an instance of {@link NewGrantorType }
     * 
     */
    public NewGrantorType createNewGrantorType() {
        return new NewGrantorType();
    }

    /**
     * Create an instance of {@link RetrieveSearchCertificateRegistrationAttachmentRequestTypeType }
     * 
     */
    public RetrieveSearchCertificateRegistrationAttachmentRequestTypeType createRetrieveSearchCertificateRegistrationAttachmentRequestTypeType() {
        return new RetrieveSearchCertificateRegistrationAttachmentRequestTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfNewAttachmentType }
     * 
     */
    public ArrayOfNewAttachmentType createArrayOfNewAttachmentType() {
        return new ArrayOfNewAttachmentType();
    }

    /**
     * Create an instance of {@link CollateralClassSearchSummaryDetailType }
     * 
     */
    public CollateralClassSearchSummaryDetailType createCollateralClassSearchSummaryDetailType() {
        return new CollateralClassSearchSummaryDetailType();
    }

    /**
     * Create an instance of {@link SearchBySerialNumberResponseTypeType }
     * 
     */
    public SearchBySerialNumberResponseTypeType createSearchBySerialNumberResponseTypeType() {
        return new SearchBySerialNumberResponseTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfResultDetailType }
     * 
     */
    public ArrayOfResultDetailType createArrayOfResultDetailType() {
        return new ArrayOfResultDetailType();
    }

    /**
     * Create an instance of {@link ArrayOfCollateralClassFilterCriteriaTypeType }
     * 
     */
    public ArrayOfCollateralClassFilterCriteriaTypeType createArrayOfCollateralClassFilterCriteriaTypeType() {
        return new ArrayOfCollateralClassFilterCriteriaTypeType();
    }

    /**
     * Create an instance of {@link OrdinalRegistrationDetailType }
     * 
     */
    public OrdinalRegistrationDetailType createOrdinalRegistrationDetailType() {
        return new OrdinalRegistrationDetailType();
    }

    /**
     * Create an instance of {@link ArrayOfCollateralTypeType }
     * 
     */
    public ArrayOfCollateralTypeType createArrayOfCollateralTypeType() {
        return new ArrayOfCollateralTypeType();
    }

    /**
     * Create an instance of {@link DeleteMessagesResponseTypeType }
     * 
     */
    public DeleteMessagesResponseTypeType createDeleteMessagesResponseTypeType() {
        return new DeleteMessagesResponseTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfRemovedAttachmentType }
     * 
     */
    public ArrayOfRemovedAttachmentType createArrayOfRemovedAttachmentType() {
        return new ArrayOfRemovedAttachmentType();
    }

    /**
     * Create an instance of {@link RetrieveSearchResultRegistrationAttachmentRequestTypeType }
     * 
     */
    public RetrieveSearchResultRegistrationAttachmentRequestTypeType createRetrieveSearchResultRegistrationAttachmentRequestTypeType() {
        return new RetrieveSearchResultRegistrationAttachmentRequestTypeType();
    }

    /**
     * Create an instance of {@link FilterGrantorAndEventDateRangeSearchResultRequestTypeType }
     * 
     */
    public FilterGrantorAndEventDateRangeSearchResultRequestTypeType createFilterGrantorAndEventDateRangeSearchResultRequestTypeType() {
        return new FilterGrantorAndEventDateRangeSearchResultRequestTypeType();
    }

    /**
     * Create an instance of {@link NevdisVehicleType }
     * 
     */
    public NevdisVehicleType createNevdisVehicleType() {
        return new NevdisVehicleType();
    }

    /**
     * Create an instance of {@link CollateralRegistrationSecuredPartyType }
     * 
     */
    public CollateralRegistrationSecuredPartyType createCollateralRegistrationSecuredPartyType() {
        return new CollateralRegistrationSecuredPartyType();
    }

    /**
     * Create an instance of {@link SerialisedCollateralDescriptionType }
     * 
     */
    public SerialisedCollateralDescriptionType createSerialisedCollateralDescriptionType() {
        return new SerialisedCollateralDescriptionType();
    }

    /**
     * Create an instance of {@link RetrieveRegistrationHistoryDetailResponseTypeType }
     * 
     */
    public RetrieveRegistrationHistoryDetailResponseTypeType createRetrieveRegistrationHistoryDetailResponseTypeType() {
        return new RetrieveRegistrationHistoryDetailResponseTypeType();
    }

    /**
     * Create an instance of {@link ReverifySecuredPartyType }
     * 
     */
    public ReverifySecuredPartyType createReverifySecuredPartyType() {
        return new ReverifySecuredPartyType();
    }

    /**
     * Create an instance of {@link ArrayOfCollateralRegistrationSecuredPartyType }
     * 
     */
    public ArrayOfCollateralRegistrationSecuredPartyType createArrayOfCollateralRegistrationSecuredPartyType() {
        return new ArrayOfCollateralRegistrationSecuredPartyType();
    }

    /**
     * Create an instance of {@link OrdinalSearchRequestTypeType }
     * 
     */
    public OrdinalSearchRequestTypeType createOrdinalSearchRequestTypeType() {
        return new OrdinalSearchRequestTypeType();
    }

    /**
     * Create an instance of {@link CreateSecuredPartyGroupRequestTypeType }
     * 
     */
    public CreateSecuredPartyGroupRequestTypeType createCreateSecuredPartyGroupRequestTypeType() {
        return new CreateSecuredPartyGroupRequestTypeType();
    }

    /**
     * Create an instance of {@link RequestSearchCertificateResponseTypeType }
     * 
     */
    public RequestSearchCertificateResponseTypeType createRequestSearchCertificateResponseTypeType() {
        return new RequestSearchCertificateResponseTypeType();
    }

    /**
     * Create an instance of {@link GrantorOrganisationType }
     * 
     */
    public GrantorOrganisationType createGrantorOrganisationType() {
        return new GrantorOrganisationType();
    }

    /**
     * Create an instance of {@link ArrayOfReportSummaryType }
     * 
     */
    public ArrayOfReportSummaryType createArrayOfReportSummaryType() {
        return new ArrayOfReportSummaryType();
    }

    /**
     * Create an instance of {@link RegistrationDetailType }
     * 
     */
    public RegistrationDetailType createRegistrationDetailType() {
        return new RegistrationDetailType();
    }

    /**
     * Create an instance of {@link ReissueVerificationStatementResponseTypeType }
     * 
     */
    public ReissueVerificationStatementResponseTypeType createReissueVerificationStatementResponseTypeType() {
        return new ReissueVerificationStatementResponseTypeType();
    }

    /**
     * Create an instance of {@link RequestReportRequestTypeType.ReportCriteria }
     * 
     */
    public RequestReportRequestTypeType.ReportCriteria createRequestReportRequestTypeTypeReportCriteria() {
        return new RequestReportRequestTypeType.ReportCriteria();
    }

    /**
     * Create an instance of {@link FilterGrantorAndEventDateRangeSearchResultResponseTypeType }
     * 
     */
    public FilterGrantorAndEventDateRangeSearchResultResponseTypeType createFilterGrantorAndEventDateRangeSearchResultResponseTypeType() {
        return new FilterGrantorAndEventDateRangeSearchResultResponseTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfSecuredPartyWithVerificationType }
     * 
     */
    public ArrayOfSecuredPartyWithVerificationType createArrayOfSecuredPartyWithVerificationType() {
        return new ArrayOfSecuredPartyWithVerificationType();
    }

    /**
     * Create an instance of {@link RetrieveMessagePdfResponseTypeType }
     * 
     */
    public RetrieveMessagePdfResponseTypeType createRetrieveMessagePdfResponseTypeType() {
        return new RetrieveMessagePdfResponseTypeType();
    }

    /**
     * Create an instance of {@link RetrieveSecuredPartyGroupHistoryResponseTypeType }
     * 
     */
    public RetrieveSecuredPartyGroupHistoryResponseTypeType createRetrieveSecuredPartyGroupHistoryResponseTypeType() {
        return new RetrieveSecuredPartyGroupHistoryResponseTypeType();
    }

    /**
     * Create an instance of {@link NewCollateralRegistrationType }
     * 
     */
    public NewCollateralRegistrationType createNewCollateralRegistrationType() {
        return new NewCollateralRegistrationType();
    }

    /**
     * Create an instance of {@link RetrieveSecuredPartyGroupResponseTypeType }
     * 
     */
    public RetrieveSecuredPartyGroupResponseTypeType createRetrieveSecuredPartyGroupResponseTypeType() {
        return new RetrieveSecuredPartyGroupResponseTypeType();
    }

    /**
     * Create an instance of {@link CreateRegistrationsRequestTypeType }
     * 
     */
    public CreateRegistrationsRequestTypeType createCreateRegistrationsRequestTypeType() {
        return new CreateRegistrationsRequestTypeType();
    }

    /**
     * Create an instance of {@link SearchByRegistrationNumberSearchResultType }
     * 
     */
    public SearchByRegistrationNumberSearchResultType createSearchByRegistrationNumberSearchResultType() {
        return new SearchByRegistrationNumberSearchResultType();
    }

    /**
     * Create an instance of {@link DeleteMessagesRequestTypeType }
     * 
     */
    public DeleteMessagesRequestTypeType createDeleteMessagesRequestTypeType() {
        return new DeleteMessagesRequestTypeType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link DeleteReportResponseTypeType }
     * 
     */
    public DeleteReportResponseTypeType createDeleteReportResponseTypeType() {
        return new DeleteReportResponseTypeType();
    }

    /**
     * Create an instance of {@link SecuredPartyType }
     * 
     */
    public SecuredPartyType createSecuredPartyType() {
        return new SecuredPartyType();
    }

    /**
     * Create an instance of {@link UploadRegistrationAttachmentRequestTypeType }
     * 
     */
    public UploadRegistrationAttachmentRequestTypeType createUploadRegistrationAttachmentRequestTypeType() {
        return new UploadRegistrationAttachmentRequestTypeType();
    }

    /**
     * Create an instance of {@link SecuredPartyGroupChangeType }
     * 
     */
    public SecuredPartyGroupChangeType createSecuredPartyGroupChangeType() {
        return new SecuredPartyGroupChangeType();
    }

    /**
     * Create an instance of {@link GrantorIndividualSearchDetailType }
     * 
     */
    public GrantorIndividualSearchDetailType createGrantorIndividualSearchDetailType() {
        return new GrantorIndividualSearchDetailType();
    }

    /**
     * Create an instance of {@link FilterGrantorSearchResultResponseTypeType }
     * 
     */
    public FilterGrantorSearchResultResponseTypeType createFilterGrantorSearchResultResponseTypeType() {
        return new FilterGrantorSearchResultResponseTypeType();
    }

    /**
     * Create an instance of {@link StolenDetailType }
     * 
     */
    public StolenDetailType createStolenDetailType() {
        return new StolenDetailType();
    }

    /**
     * Create an instance of {@link SearchByRegistrationNumberResponseTypeType }
     * 
     */
    public SearchByRegistrationNumberResponseTypeType createSearchByRegistrationNumberResponseTypeType() {
        return new SearchByRegistrationNumberResponseTypeType();
    }

    /**
     * Create an instance of {@link RequestReportRequestTypeType }
     * 
     */
    public RequestReportRequestTypeType createRequestReportRequestTypeType() {
        return new RequestReportRequestTypeType();
    }

    /**
     * Create an instance of {@link SearchBySerialNumberSearchCriteriaType }
     * 
     */
    public SearchBySerialNumberSearchCriteriaType createSearchBySerialNumberSearchCriteriaType() {
        return new SearchBySerialNumberSearchCriteriaType();
    }

    /**
     * Create an instance of {@link AdditionalVehicleCollateralDescriptionAmendmentsType }
     * 
     */
    public AdditionalVehicleCollateralDescriptionAmendmentsType createAdditionalVehicleCollateralDescriptionAmendmentsType() {
        return new AdditionalVehicleCollateralDescriptionAmendmentsType();
    }

    /**
     * Create an instance of {@link B2GMailboxMessageType.Message }
     * 
     */
    public B2GMailboxMessageType.Message createB2GMailboxMessageTypeMessage() {
        return new B2GMailboxMessageType.Message();
    }

    /**
     * Create an instance of {@link PingResponseTypeType }
     * 
     */
    public PingResponseTypeType createPingResponseTypeType() {
        return new PingResponseTypeType();
    }

    /**
     * Create an instance of {@link OrdinalSearchSearchResultDetailType }
     * 
     */
    public OrdinalSearchSearchResultDetailType createOrdinalSearchSearchResultDetailType() {
        return new OrdinalSearchSearchResultDetailType();
    }

    /**
     * Create an instance of {@link ArrayOfB2GMailboxMessageType }
     * 
     */
    public ArrayOfB2GMailboxMessageType createArrayOfB2GMailboxMessageType() {
        return new ArrayOfB2GMailboxMessageType();
    }

    /**
     * Create an instance of {@link ArrayOfAttachmentDetailType }
     * 
     */
    public ArrayOfAttachmentDetailType createArrayOfAttachmentDetailType() {
        return new ArrayOfAttachmentDetailType();
    }

    /**
     * Create an instance of {@link ResetRegistrationTokenRequestTypeType }
     * 
     */
    public ResetRegistrationTokenRequestTypeType createResetRegistrationTokenRequestTypeType() {
        return new ResetRegistrationTokenRequestTypeType();
    }

    /**
     * Create an instance of {@link SearchByRegistrationNumberRequestTypeType }
     * 
     */
    public SearchByRegistrationNumberRequestTypeType createSearchByRegistrationNumberRequestTypeType() {
        return new SearchByRegistrationNumberRequestTypeType();
    }

    /**
     * Create an instance of {@link ResetAccessCodeResponseTypeType }
     * 
     */
    public ResetAccessCodeResponseTypeType createResetAccessCodeResponseTypeType() {
        return new ResetAccessCodeResponseTypeType();
    }

    /**
     * Create an instance of {@link AddressForServiceSearchDetailType }
     * 
     */
    public AddressForServiceSearchDetailType createAddressForServiceSearchDetailType() {
        return new AddressForServiceSearchDetailType();
    }

    /**
     * Create an instance of {@link RetrieveMessagesResponseTypeType }
     * 
     */
    public RetrieveMessagesResponseTypeType createRetrieveMessagesResponseTypeType() {
        return new RetrieveMessagesResponseTypeType();
    }

    /**
     * Create an instance of {@link RetrieveRegistrationAttachmentResponseTypeType }
     * 
     */
    public RetrieveRegistrationAttachmentResponseTypeType createRetrieveRegistrationAttachmentResponseTypeType() {
        return new RetrieveRegistrationAttachmentResponseTypeType();
    }

    /**
     * Create an instance of {@link AdditionalAircraftCollateralDescriptionType }
     * 
     */
    public AdditionalAircraftCollateralDescriptionType createAdditionalAircraftCollateralDescriptionType() {
        return new AdditionalAircraftCollateralDescriptionType();
    }

    /**
     * Create an instance of {@link OrdinalSearchResponseTypeType }
     * 
     */
    public OrdinalSearchResponseTypeType createOrdinalSearchResponseTypeType() {
        return new OrdinalSearchResponseTypeType();
    }

    /**
     * Create an instance of {@link ResetAccessCodeRequestTypeType }
     * 
     */
    public ResetAccessCodeRequestTypeType createResetAccessCodeRequestTypeType() {
        return new ResetAccessCodeRequestTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfGrantorSearchDetailType }
     * 
     */
    public ArrayOfGrantorSearchDetailType createArrayOfGrantorSearchDetailType() {
        return new ArrayOfGrantorSearchDetailType();
    }

    /**
     * Create an instance of {@link ChangeB2GPasswordResponseTypeType }
     * 
     */
    public ChangeB2GPasswordResponseTypeType createChangeB2GPasswordResponseTypeType() {
        return new ChangeB2GPasswordResponseTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfGrantorType }
     * 
     */
    public ArrayOfGrantorType createArrayOfGrantorType() {
        return new ArrayOfGrantorType();
    }

    /**
     * Create an instance of {@link RetrieveRegistrationAttachmentRequestTypeType }
     * 
     */
    public RetrieveRegistrationAttachmentRequestTypeType createRetrieveRegistrationAttachmentRequestTypeType() {
        return new RetrieveRegistrationAttachmentRequestTypeType();
    }

    /**
     * Create an instance of {@link RetrieveSearchCertificateRegistrationAttachmentResponseTypeType }
     * 
     */
    public RetrieveSearchCertificateRegistrationAttachmentResponseTypeType createRetrieveSearchCertificateRegistrationAttachmentResponseTypeType() {
        return new RetrieveSearchCertificateRegistrationAttachmentResponseTypeType();
    }

    /**
     * Create an instance of {@link SearchByGrantorSearchResultSummaryType }
     * 
     */
    public SearchByGrantorSearchResultSummaryType createSearchByGrantorSearchResultSummaryType() {
        return new SearchByGrantorSearchResultSummaryType();
    }

    /**
     * Create an instance of {@link ChangeDetailType }
     * 
     */
    public ChangeDetailType createChangeDetailType() {
        return new ChangeDetailType();
    }

    /**
     * Create an instance of {@link SearchResultType }
     * 
     */
    public SearchResultType createSearchResultType() {
        return new SearchResultType();
    }

    /**
     * Create an instance of {@link ChangeHistoryType }
     * 
     */
    public ChangeHistoryType createChangeHistoryType() {
        return new ChangeHistoryType();
    }

    /**
     * Create an instance of {@link SearchByGrantorFilterCriteriaType }
     * 
     */
    public SearchByGrantorFilterCriteriaType createSearchByGrantorFilterCriteriaType() {
        return new SearchByGrantorFilterCriteriaType();
    }

    /**
     * Create an instance of {@link SearchByGrantorSearchResultType }
     * 
     */
    public SearchByGrantorSearchResultType createSearchByGrantorSearchResultType() {
        return new SearchByGrantorSearchResultType();
    }

    /**
     * Create an instance of {@link CreateSecuredPartyGroupResponseTypeType }
     * 
     */
    public CreateSecuredPartyGroupResponseTypeType createCreateSecuredPartyGroupResponseTypeType() {
        return new CreateSecuredPartyGroupResponseTypeType();
    }

    /**
     * Create an instance of {@link NevdisVehicleIdentifierType }
     * 
     */
    public NevdisVehicleIdentifierType createNevdisVehicleIdentifierType() {
        return new NevdisVehicleIdentifierType();
    }

    /**
     * Create an instance of {@link RetrieveMessagePdfRequestTypeType }
     * 
     */
    public RetrieveMessagePdfRequestTypeType createRetrieveMessagePdfRequestTypeType() {
        return new RetrieveMessagePdfRequestTypeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierVerificationStatusTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IdentifierVerificationStatusType")
    public JAXBElement<IdentifierVerificationStatusTypeType> createIdentifierVerificationStatusType(IdentifierVerificationStatusTypeType value) {
        return new JAXBElement<IdentifierVerificationStatusTypeType>(_IdentifierVerificationStatusType_QNAME, IdentifierVerificationStatusTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinalSearchSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrdinalSearchSearchCriteria")
    public JAXBElement<OrdinalSearchSearchCriteriaType> createOrdinalSearchSearchCriteria(OrdinalSearchSearchCriteriaType value) {
        return new JAXBElement<OrdinalSearchSearchCriteriaType>(_OrdinalSearchSearchCriteria_QNAME, OrdinalSearchSearchCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSecuredPartyGroupHistoryResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSecuredPartyGroupHistoryResponseType")
    public JAXBElement<RetrieveSecuredPartyGroupHistoryResponseTypeType> createRetrieveSecuredPartyGroupHistoryResponseType(RetrieveSecuredPartyGroupHistoryResponseTypeType value) {
        return new JAXBElement<RetrieveSecuredPartyGroupHistoryResponseTypeType>(_RetrieveSecuredPartyGroupHistoryResponseType_QNAME, RetrieveSecuredPartyGroupHistoryResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollateralTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralType")
    public JAXBElement<CollateralTypeType> createCollateralType(CollateralTypeType value) {
        return new JAXBElement<CollateralTypeType>(_CollateralType_QNAME, CollateralTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorResponseType")
    public JAXBElement<SearchByGrantorResponseTypeType> createSearchByGrantorResponseType(SearchByGrantorResponseTypeType value) {
        return new JAXBElement<SearchByGrantorResponseTypeType>(_SearchByGrantorResponseType_QNAME, SearchByGrantorResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetAccessCodeRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ResetAccessCodeRequestType")
    public JAXBElement<ResetAccessCodeRequestTypeType> createResetAccessCodeRequestType(ResetAccessCodeRequestTypeType value) {
        return new JAXBElement<ResetAccessCodeRequestTypeType>(_ResetAccessCodeRequestType_QNAME, ResetAccessCodeRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRegistrationsResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CreateRegistrationsResponseType")
    public JAXBElement<CreateRegistrationsResponseTypeType> createCreateRegistrationsResponseType(CreateRegistrationsResponseTypeType value) {
        return new JAXBElement<CreateRegistrationsResponseTypeType>(_CreateRegistrationsResponseType_QNAME, CreateRegistrationsResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorSearchResultSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorSearchResultSummary")
    public JAXBElement<SearchByGrantorSearchResultSummaryType> createSearchByGrantorSearchResultSummary(SearchByGrantorSearchResultSummaryType value) {
        return new JAXBElement<SearchByGrantorSearchResultSummaryType>(_SearchByGrantorSearchResultSummary_QNAME, SearchByGrantorSearchResultSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollateralClassSearchCriteriaTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralClassSearchCriteriaType")
    public JAXBElement<CollateralClassSearchCriteriaTypeType> createCollateralClassSearchCriteriaType(CollateralClassSearchCriteriaTypeType value) {
        return new JAXBElement<CollateralClassSearchCriteriaTypeType>(_CollateralClassSearchCriteriaType_QNAME, CollateralClassSearchCriteriaTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewSecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NewSecuredParty")
    public JAXBElement<NewSecuredPartyType> createNewSecuredParty(NewSecuredPartyType value) {
        return new JAXBElement<NewSecuredPartyType>(_NewSecuredParty_QNAME, NewSecuredPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewCollateralRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfNewCollateralRegistration")
    public JAXBElement<ArrayOfNewCollateralRegistrationType> createArrayOfNewCollateralRegistration(ArrayOfNewCollateralRegistrationType value) {
        return new JAXBElement<ArrayOfNewCollateralRegistrationType>(_ArrayOfNewCollateralRegistration_QNAME, ArrayOfNewCollateralRegistrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveReportSummariesRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveReportSummariesRequestType")
    public JAXBElement<RetrieveReportSummariesRequestTypeType> createRetrieveReportSummariesRequestType(RetrieveReportSummariesRequestTypeType value) {
        return new JAXBElement<RetrieveReportSummariesRequestTypeType>(_RetrieveReportSummariesRequestType_QNAME, RetrieveReportSummariesRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReissueVerificationStatementResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReissueVerificationStatementResponseType")
    public JAXBElement<ReissueVerificationStatementResponseTypeType> createReissueVerificationStatementResponseType(ReissueVerificationStatementResponseTypeType value) {
        return new JAXBElement<ReissueVerificationStatementResponseTypeType>(_ReissueVerificationStatementResponseType_QNAME, ReissueVerificationStatementResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NevdisVehicleIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NevdisVehicleIdentifier")
    public JAXBElement<NevdisVehicleIdentifierType> createNevdisVehicleIdentifier(NevdisVehicleIdentifierType value) {
        return new JAXBElement<NevdisVehicleIdentifierType>(_NevdisVehicleIdentifier_QNAME, NevdisVehicleIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByRegistrationNumberSearchCriteria")
    public JAXBElement<SearchByRegistrationNumberSearchCriteriaType> createSearchByRegistrationNumberSearchCriteria(SearchByRegistrationNumberSearchCriteriaType value) {
        return new JAXBElement<SearchByRegistrationNumberSearchCriteriaType>(_SearchByRegistrationNumberSearchCriteria_QNAME, SearchByRegistrationNumberSearchCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCollateralTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfCollateralType")
    public JAXBElement<ArrayOfCollateralTypeType> createArrayOfCollateralType(ArrayOfCollateralTypeType value) {
        return new JAXBElement<ArrayOfCollateralTypeType>(_ArrayOfCollateralType_QNAME, ArrayOfCollateralTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChangeDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfChangeDetail")
    public JAXBElement<ArrayOfChangeDetailType> createArrayOfChangeDetail(ArrayOfChangeDetailType value) {
        return new JAXBElement<ArrayOfChangeDetailType>(_ArrayOfChangeDetail_QNAME, ArrayOfChangeDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerialisedCollateralDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SerialisedCollateralDescription")
    public JAXBElement<SerialisedCollateralDescriptionType> createSerialisedCollateralDescription(SerialisedCollateralDescriptionType value) {
        return new JAXBElement<SerialisedCollateralDescriptionType>(_SerialisedCollateralDescription_QNAME, SerialisedCollateralDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatedSecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "UpdatedSecuredParty")
    public JAXBElement<UpdatedSecuredPartyType> createUpdatedSecuredParty(UpdatedSecuredPartyType value) {
        return new JAXBElement<UpdatedSecuredPartyType>(_UpdatedSecuredParty_QNAME, UpdatedSecuredPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalAircraftCollateralDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AdditionalAircraftCollateralDescription")
    public JAXBElement<AdditionalAircraftCollateralDescriptionType> createAdditionalAircraftCollateralDescription(AdditionalAircraftCollateralDescriptionType value) {
        return new JAXBElement<AdditionalAircraftCollateralDescriptionType>(_AdditionalAircraftCollateralDescription_QNAME, AdditionalAircraftCollateralDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSecuredPartyGroupResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "UpdateSecuredPartyGroupResponseType")
    public JAXBElement<UpdateSecuredPartyGroupResponseTypeType> createUpdateSecuredPartyGroupResponseType(UpdateSecuredPartyGroupResponseTypeType value) {
        return new JAXBElement<UpdateSecuredPartyGroupResponseTypeType>(_UpdateSecuredPartyGroupResponseType_QNAME, UpdateSecuredPartyGroupResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CommonRequestType")
    public JAXBElement<CommonRequestTypeType> createCommonRequestType(CommonRequestTypeType value) {
        return new JAXBElement<CommonRequestTypeType>(_CommonRequestType_QNAME, CommonRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NevdisVehicleDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NevdisVehicleDescription")
    public JAXBElement<NevdisVehicleDescriptionType> createNevdisVehicleDescription(NevdisVehicleDescriptionType value) {
        return new JAXBElement<NevdisVehicleDescriptionType>(_NevdisVehicleDescription_QNAME, NevdisVehicleDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NewAddress")
    public JAXBElement<NewAddressType> createNewAddress(NewAddressType value) {
        return new JAXBElement<NewAddressType>(_NewAddress_QNAME, NewAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrantorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfGrantor")
    public JAXBElement<ArrayOfGrantorType> createArrayOfGrantor(ArrayOfGrantorType value) {
        return new JAXBElement<ArrayOfGrantorType>(_ArrayOfGrantor_QNAME, ArrayOfGrantorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomersUserDefinedFieldType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfCustomersUserDefinedField")
    public JAXBElement<ArrayOfCustomersUserDefinedFieldType> createArrayOfCustomersUserDefinedField(ArrayOfCustomersUserDefinedFieldType value) {
        return new JAXBElement<ArrayOfCustomersUserDefinedFieldType>(_ArrayOfCustomersUserDefinedField_QNAME, ArrayOfCustomersUserDefinedFieldType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveGrantorSearchResultDetailResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveGrantorSearchResultDetailResponseType")
    public JAXBElement<RetrieveGrantorSearchResultDetailResponseTypeType> createRetrieveGrantorSearchResultDetailResponseType(RetrieveGrantorSearchResultDetailResponseTypeType value) {
        return new JAXBElement<RetrieveGrantorSearchResultDetailResponseTypeType>(_RetrieveGrantorSearchResultDetailResponseType_QNAME, RetrieveGrantorSearchResultDetailResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinalSearchRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrdinalSearchRequestType")
    public JAXBElement<OrdinalSearchRequestTypeType> createOrdinalSearchRequestType(OrdinalSearchRequestTypeType value) {
        return new JAXBElement<OrdinalSearchRequestTypeType>(_OrdinalSearchRequestType_QNAME, OrdinalSearchRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorIndividual")
    public JAXBElement<GrantorIndividualType> createGrantorIndividual(GrantorIndividualType value) {
        return new JAXBElement<GrantorIndividualType>(_GrantorIndividual_QNAME, GrantorIndividualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdatedSecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfUpdatedSecuredParty")
    public JAXBElement<ArrayOfUpdatedSecuredPartyType> createArrayOfUpdatedSecuredParty(ArrayOfUpdatedSecuredPartyType value) {
        return new JAXBElement<ArrayOfUpdatedSecuredPartyType>(_ArrayOfUpdatedSecuredParty_QNAME, ArrayOfUpdatedSecuredPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferSingleRegistrationRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "TransferSingleRegistrationRequestType")
    public JAXBElement<TransferSingleRegistrationRequestTypeType> createTransferSingleRegistrationRequestType(TransferSingleRegistrationRequestTypeType value) {
        return new JAXBElement<TransferSingleRegistrationRequestTypeType>(_TransferSingleRegistrationRequestType_QNAME, TransferSingleRegistrationRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ChangeDetail")
    public JAXBElement<ChangeDetailType> createChangeDetail(ChangeDetailType value) {
        return new JAXBElement<ChangeDetailType>(_ChangeDetail_QNAME, ChangeDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorAndEventDateRangeRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorAndEventDateRangeRequestType")
    public JAXBElement<SearchByGrantorAndEventDateRangeRequestTypeType> createSearchByGrantorAndEventDateRangeRequestType(SearchByGrantorAndEventDateRangeRequestTypeType value) {
        return new JAXBElement<SearchByGrantorAndEventDateRangeRequestTypeType>(_SearchByGrantorAndEventDateRangeRequestType_QNAME, SearchByGrantorAndEventDateRangeRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRegistrationHistoryDetailResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveRegistrationHistoryDetailResponseType")
    public JAXBElement<RetrieveRegistrationHistoryDetailResponseTypeType> createRetrieveRegistrationHistoryDetailResponseType(RetrieveRegistrationHistoryDetailResponseTypeType value) {
        return new JAXBElement<RetrieveRegistrationHistoryDetailResponseTypeType>(_RetrieveRegistrationHistoryDetailResponseType_QNAME, RetrieveRegistrationHistoryDetailResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSearchResultRegistrationAttachmentRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSearchResultRegistrationAttachmentRequestType")
    public JAXBElement<RetrieveSearchResultRegistrationAttachmentRequestTypeType> createRetrieveSearchResultRegistrationAttachmentRequestType(RetrieveSearchResultRegistrationAttachmentRequestTypeType value) {
        return new JAXBElement<RetrieveSearchResultRegistrationAttachmentRequestTypeType>(_RetrieveSearchResultRegistrationAttachmentRequestType_QNAME, RetrieveSearchResultRegistrationAttachmentRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRegistrationResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveRegistrationResponseType")
    public JAXBElement<RetrieveRegistrationResponseTypeType> createRetrieveRegistrationResponseType(RetrieveRegistrationResponseTypeType value) {
        return new JAXBElement<RetrieveRegistrationResponseTypeType>(_RetrieveRegistrationResponseType_QNAME, RetrieveRegistrationResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ChangeHistory")
    public JAXBElement<ChangeHistoryType> createChangeHistory(ChangeHistoryType value) {
        return new JAXBElement<ChangeHistoryType>(_ChangeHistory_QNAME, ChangeHistoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMessagesResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveMessagesResponseType")
    public JAXBElement<RetrieveMessagesResponseTypeType> createRetrieveMessagesResponseType(RetrieveMessagesResponseTypeType value) {
        return new JAXBElement<RetrieveMessagesResponseTypeType>(_RetrieveMessagesResponseType_QNAME, RetrieveMessagesResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DischargeRegistrationRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "DischargeRegistrationRequestType")
    public JAXBElement<DischargeRegistrationRequestTypeType> createDischargeRegistrationRequestType(DischargeRegistrationRequestTypeType value) {
        return new JAXBElement<DischargeRegistrationRequestTypeType>(_DischargeRegistrationRequestType_QNAME, DischargeRegistrationRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportSummary")
    public JAXBElement<ReportSummaryType> createReportSummary(ReportSummaryType value) {
        return new JAXBElement<ReportSummaryType>(_ReportSummary_QNAME, ReportSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeB2GPasswordResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ChangeB2GPasswordResponseType")
    public JAXBElement<ChangeB2GPasswordResponseTypeType> createChangeB2GPasswordResponseType(ChangeB2GPasswordResponseTypeType value) {
        return new JAXBElement<ChangeB2GPasswordResponseTypeType>(_ChangeB2GPasswordResponseType_QNAME, ChangeB2GPasswordResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLaxSupportedResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsLaxSupportedResponseType")
    public JAXBElement<IsLaxSupportedResponseTypeType> createIsLaxSupportedResponseType(IsLaxSupportedResponseTypeType value) {
        return new JAXBElement<IsLaxSupportedResponseTypeType>(_IsLaxSupportedResponseType_QNAME, IsLaxSupportedResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorOrganisationSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorOrganisationSearchCriteria")
    public JAXBElement<GrantorOrganisationSearchCriteriaType> createGrantorOrganisationSearchCriteria(GrantorOrganisationSearchCriteriaType value) {
        return new JAXBElement<GrantorOrganisationSearchCriteriaType>(_GrantorOrganisationSearchCriteria_QNAME, GrantorOrganisationSearchCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollateralClassSearchSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralClassSearchSummaryDetail")
    public JAXBElement<CollateralClassSearchSummaryDetailType> createCollateralClassSearchSummaryDetail(CollateralClassSearchSummaryDetailType value) {
        return new JAXBElement<CollateralClassSearchSummaryDetailType>(_CollateralClassSearchSummaryDetail_QNAME, CollateralClassSearchSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMessagesRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "DeleteMessagesRequestType")
    public JAXBElement<DeleteMessagesRequestTypeType> createDeleteMessagesRequestType(DeleteMessagesRequestTypeType value) {
        return new JAXBElement<DeleteMessagesRequestTypeType>(_DeleteMessagesRequestType_QNAME, DeleteMessagesRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonB2GMessageTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CommonB2GMessageType")
    public JAXBElement<CommonB2GMessageTypeType> createCommonB2GMessageType(CommonB2GMessageTypeType value) {
        return new JAXBElement<CommonB2GMessageTypeType>(_CommonB2GMessageType_QNAME, CommonB2GMessageTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSearchCertificateRegistrationAttachmentResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSearchCertificateRegistrationAttachmentResponseType")
    public JAXBElement<RetrieveSearchCertificateRegistrationAttachmentResponseTypeType> createRetrieveSearchCertificateRegistrationAttachmentResponseType(RetrieveSearchCertificateRegistrationAttachmentResponseTypeType value) {
        return new JAXBElement<RetrieveSearchCertificateRegistrationAttachmentResponseTypeType>(_RetrieveSearchCertificateRegistrationAttachmentResponseType_QNAME, RetrieveSearchCertificateRegistrationAttachmentResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "PingResponseType")
    public JAXBElement<PingResponseTypeType> createPingResponseType(PingResponseTypeType value) {
        return new JAXBElement<PingResponseTypeType>(_PingResponseType_QNAME, PingResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveGrantorSearchResultDetailRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveGrantorSearchResultDetailRequestType")
    public JAXBElement<RetrieveGrantorSearchResultDetailRequestTypeType> createRetrieveGrantorSearchResultDetailRequestType(RetrieveGrantorSearchResultDetailRequestTypeType value) {
        return new JAXBElement<RetrieveGrantorSearchResultDetailRequestTypeType>(_RetrieveGrantorSearchResultDetailRequestType_QNAME, RetrieveGrantorSearchResultDetailRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressForServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AddressForService")
    public JAXBElement<AddressForServiceType> createAddressForService(AddressForServiceType value) {
        return new JAXBElement<AddressForServiceType>(_AddressForService_QNAME, AddressForServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrittenOffDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "WrittenOffDetail")
    public JAXBElement<WrittenOffDetailType> createWrittenOffDetail(WrittenOffDetailType value) {
        return new JAXBElement<WrittenOffDetailType>(_WrittenOffDetail_QNAME, WrittenOffDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestSearchCertificateRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RequestSearchCertificateRequestType")
    public JAXBElement<RequestSearchCertificateRequestTypeType> createRequestSearchCertificateRequestType(RequestSearchCertificateRequestTypeType value) {
        return new JAXBElement<RequestSearchCertificateRequestTypeType>(_RequestSearchCertificateRequestType_QNAME, RequestSearchCertificateRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCollateralClassFilterCriteriaTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfCollateralClassFilterCriteriaType")
    public JAXBElement<ArrayOfCollateralClassFilterCriteriaTypeType> createArrayOfCollateralClassFilterCriteriaType(ArrayOfCollateralClassFilterCriteriaTypeType value) {
        return new JAXBElement<ArrayOfCollateralClassFilterCriteriaTypeType>(_ArrayOfCollateralClassFilterCriteriaType_QNAME, ArrayOfCollateralClassFilterCriteriaTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorRequestType")
    public JAXBElement<SearchByGrantorRequestTypeType> createSearchByGrantorRequestType(SearchByGrantorRequestTypeType value) {
        return new JAXBElement<SearchByGrantorRequestTypeType>(_SearchByGrantorRequestType_QNAME, SearchByGrantorRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovedGrantorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RemovedGrantor")
    public JAXBElement<RemovedGrantorType> createRemovedGrantor(RemovedGrantorType value) {
        return new JAXBElement<RemovedGrantorType>(_RemovedGrantor_QNAME, RemovedGrantorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Grantor")
    public JAXBElement<GrantorType> createGrantor(GrantorType value) {
        return new JAXBElement<GrantorType>(_Grantor_QNAME, GrantorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NevdisVehicleDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NevdisVehicleDetail")
    public JAXBElement<NevdisVehicleDetailType> createNevdisVehicleDetail(NevdisVehicleDetailType value) {
        return new JAXBElement<NevdisVehicleDetailType>(_NevdisVehicleDetail_QNAME, NevdisVehicleDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRegistrationSerialNumberTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NewRegistrationSerialNumberType")
    public JAXBElement<NewRegistrationSerialNumberTypeType> createNewRegistrationSerialNumberType(NewRegistrationSerialNumberTypeType value) {
        return new JAXBElement<NewRegistrationSerialNumberTypeType>(_NewRegistrationSerialNumberType_QNAME, NewRegistrationSerialNumberTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortOrderTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SortOrderType")
    public JAXBElement<SortOrderTypeType> createSortOrderType(SortOrderTypeType value) {
        return new JAXBElement<SortOrderTypeType>(_SortOrderType_QNAME, SortOrderTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSecuredPartyWithVerificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfSecuredPartyWithVerification")
    public JAXBElement<ArrayOfSecuredPartyWithVerificationType> createArrayOfSecuredPartyWithVerification(ArrayOfSecuredPartyWithVerificationType value) {
        return new JAXBElement<ArrayOfSecuredPartyWithVerificationType>(_ArrayOfSecuredPartyWithVerification_QNAME, ArrayOfSecuredPartyWithVerificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyGroupChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupChange")
    public JAXBElement<SecuredPartyGroupChangeType> createSecuredPartyGroupChange(SecuredPartyGroupChangeType value) {
        return new JAXBElement<SecuredPartyGroupChangeType>(_SecuredPartyGroupChange_QNAME, SecuredPartyGroupChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferAllRegistrationsResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "TransferAllRegistrationsResponseType")
    public JAXBElement<TransferAllRegistrationsResponseTypeType> createTransferAllRegistrationsResponseType(TransferAllRegistrationsResponseTypeType value) {
        return new JAXBElement<TransferAllRegistrationsResponseTypeType>(_TransferAllRegistrationsResponseType_QNAME, TransferAllRegistrationsResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ResultDetail")
    public JAXBElement<ResultDetailType> createResultDetail(ResultDetailType value) {
        return new JAXBElement<ResultDetailType>(_ResultDetail_QNAME, ResultDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovalDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RemovalDetail")
    public JAXBElement<RemovalDetailType> createRemovalDetail(RemovalDetailType value) {
        return new JAXBElement<RemovalDetailType>(_RemovalDetail_QNAME, RemovalDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StolenDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "StolenDetail")
    public JAXBElement<StolenDetailType> createStolenDetail(StolenDetailType value) {
        return new JAXBElement<StolenDetailType>(_StolenDetail_QNAME, StolenDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCollateralClassSearchCriteriaTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfCollateralClassSearchCriteriaType")
    public JAXBElement<ArrayOfCollateralClassSearchCriteriaTypeType> createArrayOfCollateralClassSearchCriteriaType(ArrayOfCollateralClassSearchCriteriaTypeType value) {
        return new JAXBElement<ArrayOfCollateralClassSearchCriteriaTypeType>(_ArrayOfCollateralClassSearchCriteriaType_QNAME, ArrayOfCollateralClassSearchCriteriaTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorFilterCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorFilterCriteria")
    public JAXBElement<SearchByGrantorFilterCriteriaType> createSearchByGrantorFilterCriteria(SearchByGrantorFilterCriteriaType value) {
        return new JAXBElement<SearchByGrantorFilterCriteriaType>(_SearchByGrantorFilterCriteria_QNAME, SearchByGrantorFilterCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewAddressForServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NewAddressForService")
    public JAXBElement<NewAddressForServiceType> createNewAddressForService(NewAddressForServiceType value) {
        return new JAXBElement<NewAddressForServiceType>(_NewAddressForService_QNAME, NewAddressForServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterGrantorAndEventDateRangeSearchResultRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "FilterGrantorAndEventDateRangeSearchResultRequestType")
    public JAXBElement<FilterGrantorAndEventDateRangeSearchResultRequestTypeType> createFilterGrantorAndEventDateRangeSearchResultRequestType(FilterGrantorAndEventDateRangeSearchResultRequestTypeType value) {
        return new JAXBElement<FilterGrantorAndEventDateRangeSearchResultRequestTypeType>(_FilterGrantorAndEventDateRangeSearchResultRequestType_QNAME, FilterGrantorAndEventDateRangeSearchResultRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredParty")
    public JAXBElement<SecuredPartyType> createSecuredParty(SecuredPartyType value) {
        return new JAXBElement<SecuredPartyType>(_SecuredParty_QNAME, SecuredPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrantorSearchDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfGrantorSearchDetail")
    public JAXBElement<ArrayOfGrantorSearchDetailType> createArrayOfGrantorSearchDetail(ArrayOfGrantorSearchDetailType value) {
        return new JAXBElement<ArrayOfGrantorSearchDetailType>(_ArrayOfGrantorSearchDetail_QNAME, ArrayOfGrantorSearchDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DischargeRegistrationResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "DischargeRegistrationResponseType")
    public JAXBElement<DischargeRegistrationResponseTypeType> createDischargeRegistrationResponseType(DischargeRegistrationResponseTypeType value) {
        return new JAXBElement<DischargeRegistrationResponseTypeType>(_DischargeRegistrationResponseType_QNAME, DischargeRegistrationResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMessagesRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveMessagesRequestType")
    public JAXBElement<RetrieveMessagesRequestTypeType> createRetrieveMessagesRequestType(RetrieveMessagesRequestTypeType value) {
        return new JAXBElement<RetrieveMessagesRequestTypeType>(_RetrieveMessagesRequestType_QNAME, RetrieveMessagesRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSecuredPartyGroupResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSecuredPartyGroupResponseType")
    public JAXBElement<RetrieveSecuredPartyGroupResponseTypeType> createRetrieveSecuredPartyGroupResponseType(RetrieveSecuredPartyGroupResponseTypeType value) {
        return new JAXBElement<RetrieveSecuredPartyGroupResponseTypeType>(_RetrieveSecuredPartyGroupResponseType_QNAME, RetrieveSecuredPartyGroupResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmendRegistrationResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AmendRegistrationResponseType")
    public JAXBElement<AmendRegistrationResponseTypeType> createAmendRegistrationResponseType(AmendRegistrationResponseTypeType value) {
        return new JAXBElement<AmendRegistrationResponseTypeType>(_AmendRegistrationResponseType_QNAME, AmendRegistrationResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollateralRegistrationAmendmentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralRegistrationAmendments")
    public JAXBElement<CollateralRegistrationAmendmentsType> createCollateralRegistrationAmendments(CollateralRegistrationAmendmentsType value) {
        return new JAXBElement<CollateralRegistrationAmendmentsType>(_CollateralRegistrationAmendments_QNAME, CollateralRegistrationAmendmentsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NevdisVehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NevdisVehicle")
    public JAXBElement<NevdisVehicleType> createNevdisVehicle(NevdisVehicleType value) {
        return new JAXBElement<NevdisVehicleType>(_NevdisVehicle_QNAME, NevdisVehicleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemovedAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfRemovedAttachment")
    public JAXBElement<ArrayOfRemovedAttachmentType> createArrayOfRemovedAttachment(ArrayOfRemovedAttachmentType value) {
        return new JAXBElement<ArrayOfRemovedAttachmentType>(_ArrayOfRemovedAttachment_QNAME, ArrayOfRemovedAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveReportSummariesResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveReportSummariesResponseType")
    public JAXBElement<RetrieveReportSummariesResponseTypeType> createRetrieveReportSummariesResponseType(RetrieveReportSummariesResponseTypeType value) {
        return new JAXBElement<RetrieveReportSummariesResponseTypeType>(_RetrieveReportSummariesResponseType_QNAME, RetrieveReportSummariesResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReportSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfReportSummary")
    public JAXBElement<ArrayOfReportSummaryType> createArrayOfReportSummary(ArrayOfReportSummaryType value) {
        return new JAXBElement<ArrayOfReportSummaryType>(_ArrayOfReportSummary_QNAME, ArrayOfReportSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatedAddressForServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "UpdatedAddressForService")
    public JAXBElement<UpdatedAddressForServiceType> createUpdatedAddressForService(UpdatedAddressForServiceType value) {
        return new JAXBElement<UpdatedAddressForServiceType>(_UpdatedAddressForService_QNAME, UpdatedAddressForServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySerialNumberRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchBySerialNumberRequestType")
    public JAXBElement<SearchBySerialNumberRequestTypeType> createSearchBySerialNumberRequestType(SearchBySerialNumberRequestTypeType value) {
        return new JAXBElement<SearchBySerialNumberRequestTypeType>(_SearchBySerialNumberRequestType_QNAME, SearchBySerialNumberRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetRegistrationTokenResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ResetRegistrationTokenResponseType")
    public JAXBElement<ResetRegistrationTokenResponseTypeType> createResetRegistrationTokenResponseType(ResetRegistrationTokenResponseTypeType value) {
        return new JAXBElement<ResetRegistrationTokenResponseTypeType>(_ResetRegistrationTokenResponseType_QNAME, ResetRegistrationTokenResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeAccessCodeResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ChangeAccessCodeResponseType")
    public JAXBElement<ChangeAccessCodeResponseTypeType> createChangeAccessCodeResponseType(ChangeAccessCodeResponseTypeType value) {
        return new JAXBElement<ChangeAccessCodeResponseTypeType>(_ChangeAccessCodeResponseType_QNAME, ChangeAccessCodeResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByRegistrationNumberRequestType")
    public JAXBElement<SearchByRegistrationNumberRequestTypeType> createSearchByRegistrationNumberRequestType(SearchByRegistrationNumberRequestTypeType value) {
        return new JAXBElement<SearchByRegistrationNumberRequestTypeType>(_SearchByRegistrationNumberRequestType_QNAME, SearchByRegistrationNumberRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCollateralRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NewCollateralRegistration")
    public JAXBElement<NewCollateralRegistrationType> createNewCollateralRegistration(NewCollateralRegistrationType value) {
        return new JAXBElement<NewCollateralRegistrationType>(_NewCollateralRegistration_QNAME, NewCollateralRegistrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrationDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "MigrationDetail")
    public JAXBElement<MigrationDetailType> createMigrationDetail(MigrationDetailType value) {
        return new JAXBElement<MigrationDetailType>(_MigrationDetail_QNAME, MigrationDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportFormatTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportFormatType")
    public JAXBElement<ReportFormatTypeType> createReportFormatType(ReportFormatTypeType value) {
        return new JAXBElement<ReportFormatTypeType>(_ReportFormatType_QNAME, ReportFormatTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterGrantorSearchResultResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "FilterGrantorSearchResultResponseType")
    public JAXBElement<FilterGrantorSearchResultResponseTypeType> createFilterGrantorSearchResultResponseType(FilterGrantorSearchResultResponseTypeType value) {
        return new JAXBElement<FilterGrantorSearchResultResponseTypeType>(_FilterGrantorSearchResultResponseType_QNAME, FilterGrantorSearchResultResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollateralClassFilterCriteriaTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralClassFilterCriteriaType")
    public JAXBElement<CollateralClassFilterCriteriaTypeType> createCollateralClassFilterCriteriaType(CollateralClassFilterCriteriaTypeType value) {
        return new JAXBElement<CollateralClassFilterCriteriaTypeType>(_CollateralClassFilterCriteriaType_QNAME, CollateralClassFilterCriteriaTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalVehicleCollateralDescriptionAmendmentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AdditionalVehicleCollateralDescriptionAmendments")
    public JAXBElement<AdditionalVehicleCollateralDescriptionAmendmentsType> createAdditionalVehicleCollateralDescriptionAmendments(AdditionalVehicleCollateralDescriptionAmendmentsType value) {
        return new JAXBElement<AdditionalVehicleCollateralDescriptionAmendmentsType>(_AdditionalVehicleCollateralDescriptionAmendments_QNAME, AdditionalVehicleCollateralDescriptionAmendmentsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NewAttachment")
    public JAXBElement<NewAttachmentType> createNewAttachment(NewAttachmentType value) {
        return new JAXBElement<NewAttachmentType>(_NewAttachment_QNAME, NewAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationEvent")
    public JAXBElement<RegistrationEventType> createRegistrationEvent(RegistrationEventType value) {
        return new JAXBElement<RegistrationEventType>(_RegistrationEvent_QNAME, RegistrationEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetAccessCodeResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ResetAccessCodeResponseType")
    public JAXBElement<ResetAccessCodeResponseTypeType> createResetAccessCodeResponseType(ResetAccessCodeResponseTypeType value) {
        return new JAXBElement<ResetAccessCodeResponseTypeType>(_ResetAccessCodeResponseType_QNAME, ResetAccessCodeResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemovedGrantorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfRemovedGrantor")
    public JAXBElement<ArrayOfRemovedGrantorType> createArrayOfRemovedGrantor(ArrayOfRemovedGrantorType value) {
        return new JAXBElement<ArrayOfRemovedGrantorType>(_ArrayOfRemovedGrantor_QNAME, ArrayOfRemovedGrantorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorIndividualSearchDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorIndividualSearchDetail")
    public JAXBElement<GrantorIndividualSearchDetailType> createGrantorIndividualSearchDetail(GrantorIndividualSearchDetailType value) {
        return new JAXBElement<GrantorIndividualSearchDetailType>(_GrantorIndividualSearchDetail_QNAME, GrantorIndividualSearchDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSearchCertificateResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSearchCertificateResponseType")
    public JAXBElement<RetrieveSearchCertificateResponseTypeType> createRetrieveSearchCertificateResponseType(RetrieveSearchCertificateResponseTypeType value) {
        return new JAXBElement<RetrieveSearchCertificateResponseTypeType>(_RetrieveSearchCertificateResponseType_QNAME, RetrieveSearchCertificateResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ChangeType")
    public JAXBElement<ChangeTypeType> createChangeType(ChangeTypeType value) {
        return new JAXBElement<ChangeTypeType>(_ChangeType_QNAME, ChangeTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinalSearchSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrdinalSearchSearchResult")
    public JAXBElement<OrdinalSearchSearchResultType> createOrdinalSearchSearchResult(OrdinalSearchSearchResultType value) {
        return new JAXBElement<OrdinalSearchSearchResultType>(_OrdinalSearchSearchResult_QNAME, OrdinalSearchSearchResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerialNumberTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SerialNumberType")
    public JAXBElement<SerialNumberTypeType> createSerialNumberType(SerialNumberTypeType value) {
        return new JAXBElement<SerialNumberTypeType>(_SerialNumberType_QNAME, SerialNumberTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferAllRegistrationsRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "TransferAllRegistrationsRequestType")
    public JAXBElement<TransferAllRegistrationsRequestTypeType> createTransferAllRegistrationsRequestType(TransferAllRegistrationsRequestTypeType value) {
        return new JAXBElement<TransferAllRegistrationsRequestTypeType>(_TransferAllRegistrationsRequestType_QNAME, TransferAllRegistrationsRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorAndEventDateRangeSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorAndEventDateRangeSearchCriteria")
    public JAXBElement<SearchByGrantorAndEventDateRangeSearchCriteriaType> createSearchByGrantorAndEventDateRangeSearchCriteria(SearchByGrantorAndEventDateRangeSearchCriteriaType value) {
        return new JAXBElement<SearchByGrantorAndEventDateRangeSearchCriteriaType>(_SearchByGrantorAndEventDateRangeSearchCriteria_QNAME, SearchByGrantorAndEventDateRangeSearchCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRegistrationAttachmentResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveRegistrationAttachmentResponseType")
    public JAXBElement<RetrieveRegistrationAttachmentResponseTypeType> createRetrieveRegistrationAttachmentResponseType(RetrieveRegistrationAttachmentResponseTypeType value) {
        return new JAXBElement<RetrieveRegistrationAttachmentResponseTypeType>(_RetrieveRegistrationAttachmentResponseType_QNAME, RetrieveRegistrationAttachmentResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResultDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfResultDetail")
    public JAXBElement<ArrayOfResultDetailType> createArrayOfResultDetail(ArrayOfResultDetailType value) {
        return new JAXBElement<ArrayOfResultDetailType>(_ArrayOfResultDetail_QNAME, ArrayOfResultDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalVehicleCollateralDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AdditionalVehicleCollateralDescription")
    public JAXBElement<AdditionalVehicleCollateralDescriptionType> createAdditionalVehicleCollateralDescription(AdditionalVehicleCollateralDescriptionType value) {
        return new JAXBElement<AdditionalVehicleCollateralDescriptionType>(_AdditionalVehicleCollateralDescription_QNAME, AdditionalVehicleCollateralDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalAircraftCollateralDescriptionAmendmentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AdditionalAircraftCollateralDescriptionAmendments")
    public JAXBElement<AdditionalAircraftCollateralDescriptionAmendmentsType> createAdditionalAircraftCollateralDescriptionAmendments(AdditionalAircraftCollateralDescriptionAmendmentsType value) {
        return new JAXBElement<AdditionalAircraftCollateralDescriptionAmendmentsType>(_AdditionalAircraftCollateralDescriptionAmendments_QNAME, AdditionalAircraftCollateralDescriptionAmendmentsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequestedChannelTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportRequestedChannelType")
    public JAXBElement<ReportRequestedChannelTypeType> createReportRequestedChannelType(ReportRequestedChannelTypeType value) {
        return new JAXBElement<ReportRequestedChannelTypeType>(_ReportRequestedChannelType_QNAME, ReportRequestedChannelTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchType")
    public JAXBElement<SearchTypeType> createSearchType(SearchTypeType value) {
        return new JAXBElement<SearchTypeType>(_SearchType_QNAME, SearchTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSecuredPartyGroupHistoryRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSecuredPartyGroupHistoryRequestType")
    public JAXBElement<RetrieveSecuredPartyGroupHistoryRequestTypeType> createRetrieveSecuredPartyGroupHistoryRequestType(RetrieveSecuredPartyGroupHistoryRequestTypeType value) {
        return new JAXBElement<RetrieveSecuredPartyGroupHistoryRequestTypeType>(_RetrieveSecuredPartyGroupHistoryRequestType_QNAME, RetrieveSecuredPartyGroupHistoryRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetRegistrationTokenRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ResetRegistrationTokenRequestType")
    public JAXBElement<ResetRegistrationTokenRequestTypeType> createResetRegistrationTokenRequestType(ResetRegistrationTokenRequestTypeType value) {
        return new JAXBElement<ResetRegistrationTokenRequestTypeType>(_ResetRegistrationTokenRequestType_QNAME, ResetRegistrationTokenRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCollateralRegistrationSecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfCollateralRegistrationSecuredParty")
    public JAXBElement<ArrayOfCollateralRegistrationSecuredPartyType> createArrayOfCollateralRegistrationSecuredParty(ArrayOfCollateralRegistrationSecuredPartyType value) {
        return new JAXBElement<ArrayOfCollateralRegistrationSecuredPartyType>(_ArrayOfCollateralRegistrationSecuredParty_QNAME, ArrayOfCollateralRegistrationSecuredPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterGrantorSearchResultRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "FilterGrantorSearchResultRequestType")
    public JAXBElement<FilterGrantorSearchResultRequestTypeType> createFilterGrantorSearchResultRequestType(FilterGrantorSearchResultRequestTypeType value) {
        return new JAXBElement<FilterGrantorSearchResultRequestTypeType>(_FilterGrantorSearchResultRequestType_QNAME, FilterGrantorSearchResultRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySerialNumberSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchBySerialNumberSearchResult")
    public JAXBElement<SearchBySerialNumberSearchResultType> createSearchBySerialNumberSearchResult(SearchBySerialNumberSearchResultType value) {
        return new JAXBElement<SearchBySerialNumberSearchResultType>(_SearchBySerialNumberSearchResult_QNAME, SearchBySerialNumberSearchResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchCriteria")
    public JAXBElement<SearchCriteriaType> createSearchCriteria(SearchCriteriaType value) {
        return new JAXBElement<SearchCriteriaType>(_SearchCriteria_QNAME, SearchCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorOrganisationWithVerificationStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorOrganisationWithVerificationStatus")
    public JAXBElement<GrantorOrganisationWithVerificationStatusType> createGrantorOrganisationWithVerificationStatus(GrantorOrganisationWithVerificationStatusType value) {
        return new JAXBElement<GrantorOrganisationWithVerificationStatusType>(_GrantorOrganisationWithVerificationStatus_QNAME, GrantorOrganisationWithVerificationStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationDetail")
    public JAXBElement<RegistrationDetailType> createRegistrationDetail(RegistrationDetailType value) {
        return new JAXBElement<RegistrationDetailType>(_RegistrationDetail_QNAME, RegistrationDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link B2GMailboxMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "B2GMailboxMessage")
    public JAXBElement<B2GMailboxMessageType> createB2GMailboxMessage(B2GMailboxMessageType value) {
        return new JAXBElement<B2GMailboxMessageType>(_B2GMailboxMessage_QNAME, B2GMailboxMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadRegistrationAttachmentResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "UploadRegistrationAttachmentResponseType")
    public JAXBElement<UploadRegistrationAttachmentResponseTypeType> createUploadRegistrationAttachmentResponseType(UploadRegistrationAttachmentResponseTypeType value) {
        return new JAXBElement<UploadRegistrationAttachmentResponseTypeType>(_UploadRegistrationAttachmentResponseType_QNAME, UploadRegistrationAttachmentResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRegistrationInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfRegistrationInfo")
    public JAXBElement<ArrayOfRegistrationInfoType> createArrayOfRegistrationInfo(ArrayOfRegistrationInfoType value) {
        return new JAXBElement<ArrayOfRegistrationInfoType>(_ArrayOfRegistrationInfo_QNAME, ArrayOfRegistrationInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRegistrationsRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CreateRegistrationsRequestType")
    public JAXBElement<CreateRegistrationsRequestTypeType> createCreateRegistrationsRequestType(CreateRegistrationsRequestTypeType value) {
        return new JAXBElement<CreateRegistrationsRequestTypeType>(_CreateRegistrationsRequestType_QNAME, CreateRegistrationsRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NevdisDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NevdisData")
    public JAXBElement<NevdisDataType> createNevdisData(NevdisDataType value) {
        return new JAXBElement<NevdisDataType>(_NevdisData_QNAME, NevdisDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchSummary")
    public JAXBElement<SearchSummaryType> createSearchSummary(SearchSummaryType value) {
        return new JAXBElement<SearchSummaryType>(_SearchSummary_QNAME, SearchSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorSearchResult")
    public JAXBElement<SearchByGrantorSearchResultType> createSearchByGrantorSearchResult(SearchByGrantorSearchResultType value) {
        return new JAXBElement<SearchByGrantorSearchResultType>(_SearchByGrantorSearchResult_QNAME, SearchByGrantorSearchResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomersUserDefinedFieldType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CustomersUserDefinedField")
    public JAXBElement<CustomersUserDefinedFieldType> createCustomersUserDefinedField(CustomersUserDefinedFieldType value) {
        return new JAXBElement<CustomersUserDefinedFieldType>(_CustomersUserDefinedField_QNAME, CustomersUserDefinedFieldType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSecuredPartyGroupRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "UpdateSecuredPartyGroupRequestType")
    public JAXBElement<UpdateSecuredPartyGroupRequestTypeType> createUpdateSecuredPartyGroupRequestType(UpdateSecuredPartyGroupRequestTypeType value) {
        return new JAXBElement<UpdateSecuredPartyGroupRequestTypeType>(_UpdateSecuredPartyGroupRequestType_QNAME, UpdateSecuredPartyGroupRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestReportResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RequestReportResponseType")
    public JAXBElement<RequestReportResponseTypeType> createRequestReportResponseType(RequestReportResponseTypeType value) {
        return new JAXBElement<RequestReportResponseTypeType>(_RequestReportResponseType_QNAME, RequestReportResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfSecuredParty")
    public JAXBElement<ArrayOfSecuredPartyType> createArrayOfSecuredParty(ArrayOfSecuredPartyType value) {
        return new JAXBElement<ArrayOfSecuredPartyType>(_ArrayOfSecuredParty_QNAME, ArrayOfSecuredPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSecuredPartyGroupRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CreateSecuredPartyGroupRequestType")
    public JAXBElement<CreateSecuredPartyGroupRequestTypeType> createCreateSecuredPartyGroupRequestType(CreateSecuredPartyGroupRequestTypeType value) {
        return new JAXBElement<CreateSecuredPartyGroupRequestTypeType>(_CreateSecuredPartyGroupRequestType_QNAME, CreateSecuredPartyGroupRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ExtendedBooleanType")
    public JAXBElement<ExtendedBooleanTypeType> createExtendedBooleanType(ExtendedBooleanTypeType value) {
        return new JAXBElement<ExtendedBooleanTypeType>(_ExtendedBooleanType_QNAME, ExtendedBooleanTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCollateralClassSearchSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfCollateralClassSearchSummaryDetail")
    public JAXBElement<ArrayOfCollateralClassSearchSummaryDetailType> createArrayOfCollateralClassSearchSummaryDetail(ArrayOfCollateralClassSearchSummaryDetailType value) {
        return new JAXBElement<ArrayOfCollateralClassSearchSummaryDetailType>(_ArrayOfCollateralClassSearchSummaryDetail_QNAME, ArrayOfCollateralClassSearchSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinalSearchSearchResultDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrdinalSearchSearchResultDetail")
    public JAXBElement<OrdinalSearchSearchResultDetailType> createOrdinalSearchSearchResultDetail(OrdinalSearchSearchResultDetailType value) {
        return new JAXBElement<OrdinalSearchSearchResultDetailType>(_OrdinalSearchSearchResultDetail_QNAME, OrdinalSearchSearchResultDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictionDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RestrictionDetail")
    public JAXBElement<RestrictionDetailType> createRestrictionDetail(RestrictionDetailType value) {
        return new JAXBElement<RestrictionDetailType>(_RestrictionDetail_QNAME, RestrictionDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovedAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RemovedAttachment")
    public JAXBElement<RemovedAttachmentType> createRemovedAttachment(RemovedAttachmentType value) {
        return new JAXBElement<RemovedAttachmentType>(_RemovedAttachment_QNAME, RemovedAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRegistrationRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveRegistrationRequestType")
    public JAXBElement<RetrieveRegistrationRequestTypeType> createRetrieveRegistrationRequestType(RetrieveRegistrationRequestTypeType value) {
        return new JAXBElement<RetrieveRegistrationRequestTypeType>(_RetrieveRegistrationRequestType_QNAME, RetrieveRegistrationRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySerialNumberSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchBySerialNumberSearchCriteria")
    public JAXBElement<SearchBySerialNumberSearchCriteriaType> createSearchBySerialNumberSearchCriteria(SearchBySerialNumberSearchCriteriaType value) {
        return new JAXBElement<SearchBySerialNumberSearchCriteriaType>(_SearchBySerialNumberSearchCriteria_QNAME, SearchBySerialNumberSearchCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveReportRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveReportRequestType")
    public JAXBElement<RetrieveReportRequestTypeType> createRetrieveReportRequestType(RetrieveReportRequestTypeType value) {
        return new JAXBElement<RetrieveReportRequestTypeType>(_RetrieveReportRequestType_QNAME, RetrieveReportRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReportResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "DeleteReportResponseType")
    public JAXBElement<DeleteReportResponseTypeType> createDeleteReportResponseType(DeleteReportResponseTypeType value) {
        return new JAXBElement<DeleteReportResponseTypeType>(_DeleteReportResponseType_QNAME, DeleteReportResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinalRegistrationDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrdinalRegistrationDetail")
    public JAXBElement<OrdinalRegistrationDetailType> createOrdinalRegistrationDetail(OrdinalRegistrationDetailType value) {
        return new JAXBElement<OrdinalRegistrationDetailType>(_OrdinalRegistrationDetail_QNAME, OrdinalRegistrationDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationNumberTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumberType")
    public JAXBElement<OrganisationNumberTypeType> createOrganisationNumberType(OrganisationNumberTypeType value) {
        return new JAXBElement<OrganisationNumberTypeType>(_OrganisationNumberType_QNAME, OrganisationNumberTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictedAccessDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RestrictedAccessDetail")
    public JAXBElement<RestrictedAccessDetailType> createRestrictedAccessDetail(RestrictedAccessDetailType value) {
        return new JAXBElement<RestrictedAccessDetailType>(_RestrictedAccessDetail_QNAME, RestrictedAccessDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportStatusTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportStatusType")
    public JAXBElement<ReportStatusTypeType> createReportStatusType(ReportStatusTypeType value) {
        return new JAXBElement<ReportStatusTypeType>(_ReportStatusType_QNAME, ReportStatusTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRegistrationCollateralTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NewRegistrationCollateralType")
    public JAXBElement<NewRegistrationCollateralTypeType> createNewRegistrationCollateralType(NewRegistrationCollateralTypeType value) {
        return new JAXBElement<NewRegistrationCollateralTypeType>(_NewRegistrationCollateralType_QNAME, NewRegistrationCollateralTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSecuredPartyGroupResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CreateSecuredPartyGroupResponseType")
    public JAXBElement<CreateSecuredPartyGroupResponseTypeType> createCreateSecuredPartyGroupResponseType(CreateSecuredPartyGroupResponseTypeType value) {
        return new JAXBElement<CreateSecuredPartyGroupResponseTypeType>(_CreateSecuredPartyGroupResponseType_QNAME, CreateSecuredPartyGroupResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReissueVerificationStatementRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReissueVerificationStatementRequestType")
    public JAXBElement<ReissueVerificationStatementRequestTypeType> createReissueVerificationStatementRequestType(ReissueVerificationStatementRequestTypeType value) {
        return new JAXBElement<ReissueVerificationStatementRequestTypeType>(_ReissueVerificationStatementRequestType_QNAME, ReissueVerificationStatementRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewGrantorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfNewGrantor")
    public JAXBElement<ArrayOfNewGrantorType> createArrayOfNewGrantor(ArrayOfNewGrantorType value) {
        return new JAXBElement<ArrayOfNewGrantorType>(_ArrayOfNewGrantor_QNAME, ArrayOfNewGrantorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "PingRequestType")
    public JAXBElement<PingRequestTypeType> createPingRequestType(PingRequestTypeType value) {
        return new JAXBElement<PingRequestTypeType>(_PingRequestType_QNAME, PingRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSearchCertificateRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSearchCertificateRequestType")
    public JAXBElement<RetrieveSearchCertificateRequestTypeType> createRetrieveSearchCertificateRequestType(RetrieveSearchCertificateRequestTypeType value) {
        return new JAXBElement<RetrieveSearchCertificateRequestTypeType>(_RetrieveSearchCertificateRequestType_QNAME, RetrieveSearchCertificateRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRegistrationHistoryDetailRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveRegistrationHistoryDetailRequestType")
    public JAXBElement<RetrieveRegistrationHistoryDetailRequestTypeType> createRetrieveRegistrationHistoryDetailRequestType(RetrieveRegistrationHistoryDetailRequestTypeType value) {
        return new JAXBElement<RetrieveRegistrationHistoryDetailRequestTypeType>(_RetrieveRegistrationHistoryDetailRequestType_QNAME, RetrieveRegistrationHistoryDetailRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "FilterSummary")
    public JAXBElement<FilterSummaryType> createFilterSummary(FilterSummaryType value) {
        return new JAXBElement<FilterSummaryType>(_FilterSummary_QNAME, FilterSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeB2GPasswordRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ChangeB2GPasswordRequestType")
    public JAXBElement<ChangeB2GPasswordRequestTypeType> createChangeB2GPasswordRequestType(ChangeB2GPasswordRequestTypeType value) {
        return new JAXBElement<ChangeB2GPasswordRequestTypeType>(_ChangeB2GPasswordRequestType_QNAME, ChangeB2GPasswordRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestSearchCertificateResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RequestSearchCertificateResponseType")
    public JAXBElement<RequestSearchCertificateResponseTypeType> createRequestSearchCertificateResponseType(RequestSearchCertificateResponseTypeType value) {
        return new JAXBElement<RequestSearchCertificateResponseTypeType>(_RequestSearchCertificateResponseType_QNAME, RequestSearchCertificateResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyIndividual")
    public JAXBElement<SecuredPartyIndividualType> createSecuredPartyIndividual(SecuredPartyIndividualType value) {
        return new JAXBElement<SecuredPartyIndividualType>(_SecuredPartyIndividual_QNAME, SecuredPartyIndividualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link B2GMailboxPdfMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "B2GMailboxPdfMessage")
    public JAXBElement<B2GMailboxPdfMessageType> createB2GMailboxPdfMessage(B2GMailboxPdfMessageType value) {
        return new JAXBElement<B2GMailboxPdfMessageType>(_B2GMailboxPdfMessage_QNAME, B2GMailboxPdfMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSearchResultResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSearchResultResponseType")
    public JAXBElement<RetrieveSearchResultResponseTypeType> createRetrieveSearchResultResponseType(RetrieveSearchResultResponseTypeType value) {
        return new JAXBElement<RetrieveSearchResultResponseTypeType>(_RetrieveSearchResultResponseType_QNAME, RetrieveSearchResultResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestReportRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RequestReportRequestType")
    public JAXBElement<RequestReportRequestTypeType> createRequestReportRequestType(RequestReportRequestTypeType value) {
        return new JAXBElement<RequestReportRequestTypeType>(_RequestReportRequestType_QNAME, RequestReportRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSecuredPartyGroupChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfSecuredPartyGroupChange")
    public JAXBElement<ArrayOfSecuredPartyGroupChangeType> createArrayOfSecuredPartyGroupChange(ArrayOfSecuredPartyGroupChangeType value) {
        return new JAXBElement<ArrayOfSecuredPartyGroupChangeType>(_ArrayOfSecuredPartyGroupChange_QNAME, ArrayOfSecuredPartyGroupChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCollateralTypeSearchSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfCollateralTypeSearchSummaryDetail")
    public JAXBElement<ArrayOfCollateralTypeSearchSummaryDetailType> createArrayOfCollateralTypeSearchSummaryDetail(ArrayOfCollateralTypeSearchSummaryDetailType value) {
        return new JAXBElement<ArrayOfCollateralTypeSearchSummaryDetailType>(_ArrayOfCollateralTypeSearchSummaryDetail_QNAME, ArrayOfCollateralTypeSearchSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewGrantorIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NewGrantorIndividual")
    public JAXBElement<NewGrantorIndividualType> createNewGrantorIndividual(NewGrantorIndividualType value) {
        return new JAXBElement<NewGrantorIndividualType>(_NewGrantorIndividual_QNAME, NewGrantorIndividualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AttachmentDetail")
    public JAXBElement<AttachmentDetailType> createAttachmentDetail(AttachmentDetailType value) {
        return new JAXBElement<AttachmentDetailType>(_AttachmentDetail_QNAME, AttachmentDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyWithVerificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyWithVerification")
    public JAXBElement<SecuredPartyWithVerificationType> createSecuredPartyWithVerification(SecuredPartyWithVerificationType value) {
        return new JAXBElement<SecuredPartyWithVerificationType>(_SecuredPartyWithVerification_QNAME, SecuredPartyWithVerificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSearchResultRegistrationAttachmentResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSearchResultRegistrationAttachmentResponseType")
    public JAXBElement<RetrieveSearchResultRegistrationAttachmentResponseTypeType> createRetrieveSearchResultRegistrationAttachmentResponseType(RetrieveSearchResultRegistrationAttachmentResponseTypeType value) {
        return new JAXBElement<RetrieveSearchResultRegistrationAttachmentResponseTypeType>(_RetrieveSearchResultRegistrationAttachmentResponseType_QNAME, RetrieveSearchResultRegistrationAttachmentResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStolenDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfStolenDetail")
    public JAXBElement<ArrayOfStolenDetailType> createArrayOfStolenDetail(ArrayOfStolenDetailType value) {
        return new JAXBElement<ArrayOfStolenDetailType>(_ArrayOfStolenDetail_QNAME, ArrayOfStolenDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationEventTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationEventType")
    public JAXBElement<RegistrationEventTypeType> createRegistrationEventType(RegistrationEventTypeType value) {
        return new JAXBElement<RegistrationEventTypeType>(_RegistrationEventType_QNAME, RegistrationEventTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyOrganisationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyOrganisation")
    public JAXBElement<SecuredPartyOrganisationType> createSecuredPartyOrganisation(SecuredPartyOrganisationType value) {
        return new JAXBElement<SecuredPartyOrganisationType>(_SecuredPartyOrganisation_QNAME, SecuredPartyOrganisationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReportRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "DeleteReportRequestType")
    public JAXBElement<DeleteReportRequestTypeType> createDeleteReportRequestType(DeleteReportRequestTypeType value) {
        return new JAXBElement<DeleteReportRequestTypeType>(_DeleteReportRequestType_QNAME, DeleteReportRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRegistrationAttachmentRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveRegistrationAttachmentRequestType")
    public JAXBElement<RetrieveRegistrationAttachmentRequestTypeType> createRetrieveRegistrationAttachmentRequestType(RetrieveRegistrationAttachmentRequestTypeType value) {
        return new JAXBElement<RetrieveRegistrationAttachmentRequestTypeType>(_RetrieveRegistrationAttachmentRequestType_QNAME, RetrieveRegistrationAttachmentRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSecuredPartyGroupRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSecuredPartyGroupRequestType")
    public JAXBElement<RetrieveSecuredPartyGroupRequestTypeType> createRetrieveSecuredPartyGroupRequestType(RetrieveSecuredPartyGroupRequestTypeType value) {
        return new JAXBElement<RetrieveSecuredPartyGroupRequestTypeType>(_RetrieveSecuredPartyGroupRequestType_QNAME, RetrieveSecuredPartyGroupRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfB2GMailboxMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfB2GMailboxMessage")
    public JAXBElement<ArrayOfB2GMailboxMessageType> createArrayOfB2GMailboxMessage(ArrayOfB2GMailboxMessageType value) {
        return new JAXBElement<ArrayOfB2GMailboxMessageType>(_ArrayOfB2GMailboxMessage_QNAME, ArrayOfB2GMailboxMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyGroupWithVerificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupWithVerification")
    public JAXBElement<SecuredPartyGroupWithVerificationType> createSecuredPartyGroupWithVerification(SecuredPartyGroupWithVerificationType value) {
        return new JAXBElement<SecuredPartyGroupWithVerificationType>(_SecuredPartyGroupWithVerification_QNAME, SecuredPartyGroupWithVerificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterGrantorAndEventDateRangeSearchResultResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "FilterGrantorAndEventDateRangeSearchResultResponseType")
    public JAXBElement<FilterGrantorAndEventDateRangeSearchResultResponseTypeType> createFilterGrantorAndEventDateRangeSearchResultResponseType(FilterGrantorAndEventDateRangeSearchResultResponseTypeType value) {
        return new JAXBElement<FilterGrantorAndEventDateRangeSearchResultResponseTypeType>(_FilterGrantorAndEventDateRangeSearchResultResponseType_QNAME, FilterGrantorAndEventDateRangeSearchResultResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReverifySecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfReverifySecuredParty")
    public JAXBElement<ArrayOfReverifySecuredPartyType> createArrayOfReverifySecuredParty(ArrayOfReverifySecuredPartyType value) {
        return new JAXBElement<ArrayOfReverifySecuredPartyType>(_ArrayOfReverifySecuredParty_QNAME, ArrayOfReverifySecuredPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollateralTypeSearchSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralTypeSearchSummaryDetail")
    public JAXBElement<CollateralTypeSearchSummaryDetailType> createCollateralTypeSearchSummaryDetail(CollateralTypeSearchSummaryDetailType value) {
        return new JAXBElement<CollateralTypeSearchSummaryDetailType>(_CollateralTypeSearchSummaryDetail_QNAME, CollateralTypeSearchSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRegistrationSerialisedCollateralDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NewRegistrationSerialisedCollateralDescription")
    public JAXBElement<NewRegistrationSerialisedCollateralDescriptionType> createNewRegistrationSerialisedCollateralDescription(NewRegistrationSerialisedCollateralDescriptionType value) {
        return new JAXBElement<NewRegistrationSerialisedCollateralDescriptionType>(_NewRegistrationSerialisedCollateralDescription_QNAME, NewRegistrationSerialisedCollateralDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSearchResultRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSearchResultRequestType")
    public JAXBElement<RetrieveSearchResultRequestTypeType> createRetrieveSearchResultRequestType(RetrieveSearchResultRequestTypeType value) {
        return new JAXBElement<RetrieveSearchResultRequestTypeType>(_RetrieveSearchResultRequestType_QNAME, RetrieveSearchResultRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewGrantorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NewGrantor")
    public JAXBElement<NewGrantorType> createNewGrantor(NewGrantorType value) {
        return new JAXBElement<NewGrantorType>(_NewGrantor_QNAME, NewGrantorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinalSearchResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrdinalSearchResponseType")
    public JAXBElement<OrdinalSearchResponseTypeType> createOrdinalSearchResponseType(OrdinalSearchResponseTypeType value) {
        return new JAXBElement<OrdinalSearchResponseTypeType>(_OrdinalSearchResponseType_QNAME, OrdinalSearchResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NevdisVehicleIdentifierTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NevdisVehicleIdentifierType")
    public JAXBElement<NevdisVehicleIdentifierTypeType> createNevdisVehicleIdentifierType(NevdisVehicleIdentifierTypeType value) {
        return new JAXBElement<NevdisVehicleIdentifierTypeType>(_NevdisVehicleIdentifierType_QNAME, NevdisVehicleIdentifierTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressForServiceSearchDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AddressForServiceSearchDetail")
    public JAXBElement<AddressForServiceSearchDetailType> createAddressForServiceSearchDetail(AddressForServiceSearchDetailType value) {
        return new JAXBElement<AddressForServiceSearchDetailType>(_AddressForServiceSearchDetail_QNAME, AddressForServiceSearchDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorOrganisationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorOrganisation")
    public JAXBElement<GrantorOrganisationType> createGrantorOrganisation(GrantorOrganisationType value) {
        return new JAXBElement<GrantorOrganisationType>(_GrantorOrganisation_QNAME, GrantorOrganisationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSelectionFlagTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchSelectionFlagType")
    public JAXBElement<SearchSelectionFlagTypeType> createSearchSelectionFlagType(SearchSelectionFlagTypeType value) {
        return new JAXBElement<SearchSelectionFlagTypeType>(_SearchSelectionFlagType_QNAME, SearchSelectionFlagTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyOrganisationWithVerificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyOrganisationWithVerification")
    public JAXBElement<SecuredPartyOrganisationWithVerificationType> createSecuredPartyOrganisationWithVerification(SecuredPartyOrganisationWithVerificationType value) {
        return new JAXBElement<SecuredPartyOrganisationWithVerificationType>(_SecuredPartyOrganisationWithVerification_QNAME, SecuredPartyOrganisationWithVerificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollateralClassTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralClassType")
    public JAXBElement<CollateralClassTypeType> createCollateralClassType(CollateralClassTypeType value) {
        return new JAXBElement<CollateralClassTypeType>(_CollateralClassType_QNAME, CollateralClassTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByRegistrationNumberSearchResult")
    public JAXBElement<SearchByRegistrationNumberSearchResultType> createSearchByRegistrationNumberSearchResult(SearchByRegistrationNumberSearchResultType value) {
        return new JAXBElement<SearchByRegistrationNumberSearchResultType>(_SearchByRegistrationNumberSearchResult_QNAME, SearchByRegistrationNumberSearchResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CommonResponseType")
    public JAXBElement<CommonResponseTypeType> createCommonResponseType(CommonResponseTypeType value) {
        return new JAXBElement<CommonResponseTypeType>(_CommonResponseType_QNAME, CommonResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorSearchCriteria")
    public JAXBElement<SearchByGrantorSearchCriteriaType> createSearchByGrantorSearchCriteria(SearchByGrantorSearchCriteriaType value) {
        return new JAXBElement<SearchByGrantorSearchCriteriaType>(_SearchByGrantorSearchCriteria_QNAME, SearchByGrantorSearchCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSearchCertificateRegistrationAttachmentRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveSearchCertificateRegistrationAttachmentRequestType")
    public JAXBElement<RetrieveSearchCertificateRegistrationAttachmentRequestTypeType> createRetrieveSearchCertificateRegistrationAttachmentRequestType(RetrieveSearchCertificateRegistrationAttachmentRequestTypeType value) {
        return new JAXBElement<RetrieveSearchCertificateRegistrationAttachmentRequestTypeType>(_RetrieveSearchCertificateRegistrationAttachmentRequestType_QNAME, RetrieveSearchCertificateRegistrationAttachmentRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollateralRegistrationSecuredPartyGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralRegistrationSecuredPartyGroup")
    public JAXBElement<CollateralRegistrationSecuredPartyGroupType> createCollateralRegistrationSecuredPartyGroup(CollateralRegistrationSecuredPartyGroupType value) {
        return new JAXBElement<CollateralRegistrationSecuredPartyGroupType>(_CollateralRegistrationSecuredPartyGroup_QNAME, CollateralRegistrationSecuredPartyGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorIndividualSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorIndividualSearchCriteria")
    public JAXBElement<GrantorIndividualSearchCriteriaType> createGrantorIndividualSearchCriteria(GrantorIndividualSearchCriteriaType value) {
        return new JAXBElement<GrantorIndividualSearchCriteriaType>(_GrantorIndividualSearchCriteria_QNAME, GrantorIndividualSearchCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinalSearchResultTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrdinalSearchResultType")
    public JAXBElement<OrdinalSearchResultTypeType> createOrdinalSearchResultType(OrdinalSearchResultTypeType value) {
        return new JAXBElement<OrdinalSearchResultTypeType>(_OrdinalSearchResultType_QNAME, OrdinalSearchResultTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewSecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfNewSecuredParty")
    public JAXBElement<ArrayOfNewSecuredPartyType> createArrayOfNewSecuredParty(ArrayOfNewSecuredPartyType value) {
        return new JAXBElement<ArrayOfNewSecuredPartyType>(_ArrayOfNewSecuredParty_QNAME, ArrayOfNewSecuredPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollateralRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralRegistration")
    public JAXBElement<CollateralRegistrationType> createCollateralRegistration(CollateralRegistrationType value) {
        return new JAXBElement<CollateralRegistrationType>(_CollateralRegistration_QNAME, CollateralRegistrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorSearchDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorSearchDetail")
    public JAXBElement<GrantorSearchDetailType> createGrantorSearchDetail(GrantorSearchDetailType value) {
        return new JAXBElement<GrantorSearchDetailType>(_GrantorSearchDetail_QNAME, GrantorSearchDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNevdisVehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfNevdisVehicle")
    public JAXBElement<ArrayOfNevdisVehicleType> createArrayOfNevdisVehicle(ArrayOfNevdisVehicleType value) {
        return new JAXBElement<ArrayOfNevdisVehicleType>(_ArrayOfNevdisVehicle_QNAME, ArrayOfNevdisVehicleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverifySecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReverifySecuredParty")
    public JAXBElement<ReverifySecuredPartyType> createReverifySecuredParty(ReverifySecuredPartyType value) {
        return new JAXBElement<ReverifySecuredPartyType>(_ReverifySecuredParty_QNAME, ReverifySecuredPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerialNumberSearchCriteriaTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SerialNumberSearchCriteriaType")
    public JAXBElement<SerialNumberSearchCriteriaTypeType> createSerialNumberSearchCriteriaType(SerialNumberSearchCriteriaTypeType value) {
        return new JAXBElement<SerialNumberSearchCriteriaTypeType>(_SerialNumberSearchCriteriaType_QNAME, SerialNumberSearchCriteriaTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferSingleRegistrationResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "TransferSingleRegistrationResponseType")
    public JAXBElement<TransferSingleRegistrationResponseTypeType> createTransferSingleRegistrationResponseType(TransferSingleRegistrationResponseTypeType value) {
        return new JAXBElement<TransferSingleRegistrationResponseTypeType>(_TransferSingleRegistrationResponseType_QNAME, TransferSingleRegistrationResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWrittenOffDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfWrittenOffDetail")
    public JAXBElement<ArrayOfWrittenOffDetailType> createArrayOfWrittenOffDetail(ArrayOfWrittenOffDetailType value) {
        return new JAXBElement<ArrayOfWrittenOffDetailType>(_ArrayOfWrittenOffDetail_QNAME, ArrayOfWrittenOffDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySerialNumberResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchBySerialNumberResponseType")
    public JAXBElement<SearchBySerialNumberResponseTypeType> createSearchBySerialNumberResponseType(SearchBySerialNumberResponseTypeType value) {
        return new JAXBElement<SearchBySerialNumberResponseTypeType>(_SearchBySerialNumberResponseType_QNAME, SearchBySerialNumberResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchResult")
    public JAXBElement<SearchResultType> createSearchResult(SearchResultType value) {
        return new JAXBElement<SearchResultType>(_SearchResult_QNAME, SearchResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMessagePdfRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveMessagePdfRequestType")
    public JAXBElement<RetrieveMessagePdfRequestTypeType> createRetrieveMessagePdfRequestType(RetrieveMessagePdfRequestTypeType value) {
        return new JAXBElement<RetrieveMessagePdfRequestTypeType>(_RetrieveMessagePdfRequestType_QNAME, RetrieveMessagePdfRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMessagesResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "DeleteMessagesResponseType")
    public JAXBElement<DeleteMessagesResponseTypeType> createDeleteMessagesResponseType(DeleteMessagesResponseTypeType value) {
        return new JAXBElement<DeleteMessagesResponseTypeType>(_DeleteMessagesResponseType_QNAME, DeleteMessagesResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadRegistrationAttachmentRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "UploadRegistrationAttachmentRequestType")
    public JAXBElement<UploadRegistrationAttachmentRequestTypeType> createUploadRegistrationAttachmentRequestType(UploadRegistrationAttachmentRequestTypeType value) {
        return new JAXBElement<UploadRegistrationAttachmentRequestTypeType>(_UploadRegistrationAttachmentRequestType_QNAME, UploadRegistrationAttachmentRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorType")
    public JAXBElement<GrantorTypeType> createGrantorType(GrantorTypeType value) {
        return new JAXBElement<GrantorTypeType>(_GrantorType_QNAME, GrantorTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfAttachmentDetail")
    public JAXBElement<ArrayOfAttachmentDetailType> createArrayOfAttachmentDetail(ArrayOfAttachmentDetailType value) {
        return new JAXBElement<ArrayOfAttachmentDetailType>(_ArrayOfAttachmentDetail_QNAME, ArrayOfAttachmentDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRegistrationCollateralClassTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NewRegistrationCollateralClassType")
    public JAXBElement<NewRegistrationCollateralClassTypeType> createNewRegistrationCollateralClassType(NewRegistrationCollateralClassTypeType value) {
        return new JAXBElement<NewRegistrationCollateralClassTypeType>(_NewRegistrationCollateralClassType_QNAME, NewRegistrationCollateralClassTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeAccessCodeRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ChangeAccessCodeRequestType")
    public JAXBElement<ChangeAccessCodeRequestTypeType> createChangeAccessCodeRequestType(ChangeAccessCodeRequestTypeType value) {
        return new JAXBElement<ChangeAccessCodeRequestTypeType>(_ChangeAccessCodeRequestType_QNAME, ChangeAccessCodeRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorAndEventDateRangeFilterCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorAndEventDateRangeFilterCriteria")
    public JAXBElement<SearchByGrantorAndEventDateRangeFilterCriteriaType> createSearchByGrantorAndEventDateRangeFilterCriteria(SearchByGrantorAndEventDateRangeFilterCriteriaType value) {
        return new JAXBElement<SearchByGrantorAndEventDateRangeFilterCriteriaType>(_SearchByGrantorAndEventDateRangeFilterCriteria_QNAME, SearchByGrantorAndEventDateRangeFilterCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NevdisRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NevdisRegistration")
    public JAXBElement<NevdisRegistrationType> createNevdisRegistration(NevdisRegistrationType value) {
        return new JAXBElement<NevdisRegistrationType>(_NevdisRegistration_QNAME, NevdisRegistrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByRegistrationNumberResponseType")
    public JAXBElement<SearchByRegistrationNumberResponseTypeType> createSearchByRegistrationNumberResponseType(SearchByRegistrationNumberResponseTypeType value) {
        return new JAXBElement<SearchByRegistrationNumberResponseTypeType>(_SearchByRegistrationNumberResponseType_QNAME, SearchByRegistrationNumberResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ArrayOfNewAttachment")
    public JAXBElement<ArrayOfNewAttachmentType> createArrayOfNewAttachment(ArrayOfNewAttachmentType value) {
        return new JAXBElement<ArrayOfNewAttachmentType>(_ArrayOfNewAttachment_QNAME, ArrayOfNewAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmendRegistrationRequestTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AmendRegistrationRequestType")
    public JAXBElement<AmendRegistrationRequestTypeType> createAmendRegistrationRequestType(AmendRegistrationRequestTypeType value) {
        return new JAXBElement<AmendRegistrationRequestTypeType>(_AmendRegistrationRequestType_QNAME, AmendRegistrationRequestTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationInfo")
    public JAXBElement<RegistrationInfoType> createRegistrationInfo(RegistrationInfoType value) {
        return new JAXBElement<RegistrationInfoType>(_RegistrationInfo_QNAME, RegistrationInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollateralRegistrationSecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralRegistrationSecuredParty")
    public JAXBElement<CollateralRegistrationSecuredPartyType> createCollateralRegistrationSecuredParty(CollateralRegistrationSecuredPartyType value) {
        return new JAXBElement<CollateralRegistrationSecuredPartyType>(_CollateralRegistrationSecuredParty_QNAME, CollateralRegistrationSecuredPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorAndEventDateRangeResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorAndEventDateRangeResponseType")
    public JAXBElement<SearchByGrantorAndEventDateRangeResponseTypeType> createSearchByGrantorAndEventDateRangeResponseType(SearchByGrantorAndEventDateRangeResponseTypeType value) {
        return new JAXBElement<SearchByGrantorAndEventDateRangeResponseTypeType>(_SearchByGrantorAndEventDateRangeResponseType_QNAME, SearchByGrantorAndEventDateRangeResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyType")
    public JAXBElement<SecuredPartyTypeType> createSecuredPartyType(SecuredPartyTypeType value) {
        return new JAXBElement<SecuredPartyTypeType>(_SecuredPartyType_QNAME, SecuredPartyTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveReportResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveReportResponseType")
    public JAXBElement<RetrieveReportResponseTypeType> createRetrieveReportResponseType(RetrieveReportResponseTypeType value) {
        return new JAXBElement<RetrieveReportResponseTypeType>(_RetrieveReportResponseType_QNAME, RetrieveReportResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMessagePdfResponseTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RetrieveMessagePdfResponseType")
    public JAXBElement<RetrieveMessagePdfResponseTypeType> createRetrieveMessagePdfResponseType(RetrieveMessagePdfResponseTypeType value) {
        return new JAXBElement<RetrieveMessagePdfResponseTypeType>(_RetrieveMessagePdfResponseType_QNAME, RetrieveMessagePdfResponseTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Value", scope = IsLaxSupportedResponseTypeType.class)
    public JAXBElement<String> createIsLaxSupportedResponseTypeTypeValue(String value) {
        return new JAXBElement<String>(_IsLaxSupportedResponseTypeTypeValue_QNAME, String.class, IsLaxSupportedResponseTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportType", scope = RetrieveReportSummariesRequestTypeType.class)
    public JAXBElement<String> createRetrieveReportSummariesRequestTypeTypeReportType(String value) {
        return new JAXBElement<String>(_RetrieveReportSummariesRequestTypeTypeReportType_QNAME, String.class, RetrieveReportSummariesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportNumber", scope = RetrieveReportSummariesRequestTypeType.class)
    public JAXBElement<String> createRetrieveReportSummariesRequestTypeTypeReportNumber(String value) {
        return new JAXBElement<String>(_RetrieveReportSummariesRequestTypeTypeReportNumber_QNAME, String.class, RetrieveReportSummariesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AircraftNationality", scope = AdditionalAircraftCollateralDescriptionAmendmentsType.class)
    public JAXBElement<String> createAdditionalAircraftCollateralDescriptionAmendmentsTypeAircraftNationality(String value) {
        return new JAXBElement<String>(_AdditionalAircraftCollateralDescriptionAmendmentsTypeAircraftNationality_QNAME, String.class, AdditionalAircraftCollateralDescriptionAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AircraftNationalityCodeAndRegistrationMark", scope = AdditionalAircraftCollateralDescriptionAmendmentsType.class)
    public JAXBElement<String> createAdditionalAircraftCollateralDescriptionAmendmentsTypeAircraftNationalityCodeAndRegistrationMark(String value) {
        return new JAXBElement<String>(_AdditionalAircraftCollateralDescriptionAmendmentsTypeAircraftNationalityCodeAndRegistrationMark_QNAME, String.class, AdditionalAircraftCollateralDescriptionAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupAccessCode", scope = DischargeRegistrationRequestTypeType.class)
    public JAXBElement<String> createDischargeRegistrationRequestTypeTypeSecuredPartyGroupAccessCode(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupAccessCode_QNAME, String.class, DischargeRegistrationRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationToken", scope = DischargeRegistrationRequestTypeType.class)
    public JAXBElement<String> createDischargeRegistrationRequestTypeTypeRegistrationToken(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeRegistrationToken_QNAME, String.class, DischargeRegistrationRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupNumber", scope = DischargeRegistrationRequestTypeType.class)
    public JAXBElement<String> createDischargeRegistrationRequestTypeTypeSecuredPartyGroupNumber(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupNumber_QNAME, String.class, DischargeRegistrationRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorOrganisationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Organisation", scope = GrantorSearchDetailType.class)
    public JAXBElement<GrantorOrganisationType> createGrantorSearchDetailTypeOrganisation(GrantorOrganisationType value) {
        return new JAXBElement<GrantorOrganisationType>(_GrantorSearchDetailTypeOrganisation_QNAME, GrantorOrganisationType.class, GrantorSearchDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorIndividualSearchDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Individual", scope = GrantorSearchDetailType.class)
    public JAXBElement<GrantorIndividualSearchDetailType> createGrantorSearchDetailTypeIndividual(GrantorIndividualSearchDetailType value) {
        return new JAXBElement<GrantorIndividualSearchDetailType>(_GrantorSearchDetailTypeIndividual_QNAME, GrantorIndividualSearchDetailType.class, GrantorSearchDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GivingOfNoticeIdentifier", scope = RetrieveMessagesRequestTypeType.class)
    public JAXBElement<String> createRetrieveMessagesRequestTypeTypeGivingOfNoticeIdentifier(String value) {
        return new JAXBElement<String>(_RetrieveMessagesRequestTypeTypeGivingOfNoticeIdentifier_QNAME, String.class, RetrieveMessagesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ChangeNumber", scope = RetrieveMessagesRequestTypeType.class)
    public JAXBElement<Long> createRetrieveMessagesRequestTypeTypeChangeNumber(Long value) {
        return new JAXBElement<Long>(_RetrieveMessagesRequestTypeTypeChangeNumber_QNAME, Long.class, RetrieveMessagesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "MessagesAddedFromDateTime", scope = RetrieveMessagesRequestTypeType.class)
    public JAXBElement<XMLGregorianCalendar> createRetrieveMessagesRequestTypeTypeMessagesAddedFromDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RetrieveMessagesRequestTypeTypeMessagesAddedFromDateTime_QNAME, XMLGregorianCalendar.class, RetrieveMessagesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "MessagesBeforeMessageId", scope = RetrieveMessagesRequestTypeType.class)
    public JAXBElement<Long> createRetrieveMessagesRequestTypeTypeMessagesBeforeMessageId(Long value) {
        return new JAXBElement<Long>(_RetrieveMessagesRequestTypeTypeMessagesBeforeMessageId_QNAME, Long.class, RetrieveMessagesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IncludePreviouslyRetrievedMessages", scope = RetrieveMessagesRequestTypeType.class)
    public JAXBElement<Boolean> createRetrieveMessagesRequestTypeTypeIncludePreviouslyRetrievedMessages(Boolean value) {
        return new JAXBElement<Boolean>(_RetrieveMessagesRequestTypeTypeIncludePreviouslyRetrievedMessages_QNAME, Boolean.class, RetrieveMessagesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "MessagesAfterMessageId", scope = RetrieveMessagesRequestTypeType.class)
    public JAXBElement<Long> createRetrieveMessagesRequestTypeTypeMessagesAfterMessageId(Long value) {
        return new JAXBElement<Long>(_RetrieveMessagesRequestTypeTypeMessagesAfterMessageId_QNAME, Long.class, RetrieveMessagesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "MessagesAddedToDateTime", scope = RetrieveMessagesRequestTypeType.class)
    public JAXBElement<XMLGregorianCalendar> createRetrieveMessagesRequestTypeTypeMessagesAddedToDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RetrieveMessagesRequestTypeTypeMessagesAddedToDateTime_QNAME, XMLGregorianCalendar.class, RetrieveMessagesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OriginalCustomersRequestMessageId", scope = RetrieveMessagesRequestTypeType.class)
    public JAXBElement<String> createRetrieveMessagesRequestTypeTypeOriginalCustomersRequestMessageId(String value) {
        return new JAXBElement<String>(_RetrieveMessagesRequestTypeTypeOriginalCustomersRequestMessageId_QNAME, String.class, RetrieveMessagesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupNumber", scope = RetrieveMessagesRequestTypeType.class)
    public JAXBElement<String> createRetrieveMessagesRequestTypeTypeSecuredPartyGroupNumber(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupNumber_QNAME, String.class, RetrieveMessagesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationNumber", scope = RetrieveMessagesRequestTypeType.class)
    public JAXBElement<String> createRetrieveMessagesRequestTypeTypeRegistrationNumber(String value) {
        return new JAXBElement<String>(_RetrieveMessagesRequestTypeTypeRegistrationNumber_QNAME, String.class, RetrieveMessagesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NotificationType", scope = RetrieveMessagesRequestTypeType.class)
    public JAXBElement<String> createRetrieveMessagesRequestTypeTypeNotificationType(String value) {
        return new JAXBElement<String>(_RetrieveMessagesRequestTypeTypeNotificationType_QNAME, String.class, RetrieveMessagesRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatedAddressForServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "UpdatedAddressForService", scope = UpdateSecuredPartyGroupRequestTypeType.class)
    public JAXBElement<UpdatedAddressForServiceType> createUpdateSecuredPartyGroupRequestTypeTypeUpdatedAddressForService(UpdatedAddressForServiceType value) {
        return new JAXBElement<UpdatedAddressForServiceType>(_UpdatedAddressForService_QNAME, UpdatedAddressForServiceType.class, UpdateSecuredPartyGroupRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReverifySecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReverifySecuredParties", scope = UpdateSecuredPartyGroupRequestTypeType.class)
    public JAXBElement<ArrayOfReverifySecuredPartyType> createUpdateSecuredPartyGroupRequestTypeTypeReverifySecuredParties(ArrayOfReverifySecuredPartyType value) {
        return new JAXBElement<ArrayOfReverifySecuredPartyType>(_UpdateSecuredPartyGroupRequestTypeTypeReverifySecuredParties_QNAME, ArrayOfReverifySecuredPartyType.class, UpdateSecuredPartyGroupRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdatedSecuredPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "UpdatedSecuredParties", scope = UpdateSecuredPartyGroupRequestTypeType.class)
    public JAXBElement<ArrayOfUpdatedSecuredPartyType> createUpdateSecuredPartyGroupRequestTypeTypeUpdatedSecuredParties(ArrayOfUpdatedSecuredPartyType value) {
        return new JAXBElement<ArrayOfUpdatedSecuredPartyType>(_UpdateSecuredPartyGroupRequestTypeTypeUpdatedSecuredParties_QNAME, ArrayOfUpdatedSecuredPartyType.class, UpdateSecuredPartyGroupRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupAccessCode", scope = RetrieveSecuredPartyGroupHistoryRequestTypeType.class)
    public JAXBElement<String> createRetrieveSecuredPartyGroupHistoryRequestTypeTypeSecuredPartyGroupAccessCode(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupAccessCode_QNAME, String.class, RetrieveSecuredPartyGroupHistoryRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "TransferFromSecuredPartyGroupAccessCode", scope = TransferSingleRegistrationRequestTypeType.class)
    public JAXBElement<String> createTransferSingleRegistrationRequestTypeTypeTransferFromSecuredPartyGroupAccessCode(String value) {
        return new JAXBElement<String>(_TransferSingleRegistrationRequestTypeTypeTransferFromSecuredPartyGroupAccessCode_QNAME, String.class, TransferSingleRegistrationRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationToken", scope = TransferSingleRegistrationRequestTypeType.class)
    public JAXBElement<String> createTransferSingleRegistrationRequestTypeTypeRegistrationToken(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeRegistrationToken_QNAME, String.class, TransferSingleRegistrationRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySerialNumberSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchBySerialNumberSearchCriteria", scope = SearchCriteriaType.class)
    public JAXBElement<SearchBySerialNumberSearchCriteriaType> createSearchCriteriaTypeSearchBySerialNumberSearchCriteria(SearchBySerialNumberSearchCriteriaType value) {
        return new JAXBElement<SearchBySerialNumberSearchCriteriaType>(_SearchBySerialNumberSearchCriteria_QNAME, SearchBySerialNumberSearchCriteriaType.class, SearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinalSearchSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrdinalSearchSearchCriteria", scope = SearchCriteriaType.class)
    public JAXBElement<OrdinalSearchSearchCriteriaType> createSearchCriteriaTypeOrdinalSearchSearchCriteria(OrdinalSearchSearchCriteriaType value) {
        return new JAXBElement<OrdinalSearchSearchCriteriaType>(_OrdinalSearchSearchCriteria_QNAME, OrdinalSearchSearchCriteriaType.class, SearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByRegistrationNumberSearchCriteria", scope = SearchCriteriaType.class)
    public JAXBElement<SearchByRegistrationNumberSearchCriteriaType> createSearchCriteriaTypeSearchByRegistrationNumberSearchCriteria(SearchByRegistrationNumberSearchCriteriaType value) {
        return new JAXBElement<SearchByRegistrationNumberSearchCriteriaType>(_SearchByRegistrationNumberSearchCriteria_QNAME, SearchByRegistrationNumberSearchCriteriaType.class, SearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorSearchCriteria", scope = SearchCriteriaType.class)
    public JAXBElement<SearchByGrantorSearchCriteriaType> createSearchCriteriaTypeSearchByGrantorSearchCriteria(SearchByGrantorSearchCriteriaType value) {
        return new JAXBElement<SearchByGrantorSearchCriteriaType>(_SearchByGrantorSearchCriteria_QNAME, SearchByGrantorSearchCriteriaType.class, SearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorAndEventDateRangeSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorAndEventDateRangeSearchCriteria", scope = SearchCriteriaType.class)
    public JAXBElement<SearchByGrantorAndEventDateRangeSearchCriteriaType> createSearchCriteriaTypeSearchByGrantorAndEventDateRangeSearchCriteria(SearchByGrantorAndEventDateRangeSearchCriteriaType value) {
        return new JAXBElement<SearchByGrantorAndEventDateRangeSearchCriteriaType>(_SearchByGrantorAndEventDateRangeSearchCriteria_QNAME, SearchByGrantorAndEventDateRangeSearchCriteriaType.class, SearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Addressee", scope = AddressForServiceType.class)
    public JAXBElement<String> createAddressForServiceTypeAddressee(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeAddressee_QNAME, String.class, AddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "B2GAccountCustomerName", scope = AddressForServiceType.class)
    public JAXBElement<String> createAddressForServiceTypeB2GAccountCustomerName(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeB2GAccountCustomerName_QNAME, String.class, AddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EmailAddress", scope = AddressForServiceType.class)
    public JAXBElement<String> createAddressForServiceTypeEmailAddress(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeEmailAddress_QNAME, String.class, AddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "B2GAccountCustomerNumber", scope = AddressForServiceType.class)
    public JAXBElement<String> createAddressForServiceTypeB2GAccountCustomerNumber(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeB2GAccountCustomerNumber_QNAME, String.class, AddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "PhysicalAddress", scope = AddressForServiceType.class)
    public JAXBElement<AddressType> createAddressForServiceTypePhysicalAddress(AddressType value) {
        return new JAXBElement<AddressType>(_AddressForServiceTypePhysicalAddress_QNAME, AddressType.class, AddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "FaxNumber", scope = AddressForServiceType.class)
    public JAXBElement<String> createAddressForServiceTypeFaxNumber(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeFaxNumber_QNAME, String.class, AddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationNumberTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumberType", scope = SecuredPartyOrganisationType.class)
    public JAXBElement<OrganisationNumberTypeType> createSecuredPartyOrganisationTypeOrganisationNumberType(OrganisationNumberTypeType value) {
        return new JAXBElement<OrganisationNumberTypeType>(_OrganisationNumberType_QNAME, OrganisationNumberTypeType.class, SecuredPartyOrganisationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationName", scope = SecuredPartyOrganisationType.class)
    public JAXBElement<String> createSecuredPartyOrganisationTypeOrganisationName(String value) {
        return new JAXBElement<String>(_SecuredPartyOrganisationTypeOrganisationName_QNAME, String.class, SecuredPartyOrganisationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumber", scope = SecuredPartyOrganisationType.class)
    public JAXBElement<String> createSecuredPartyOrganisationTypeOrganisationNumber(String value) {
        return new JAXBElement<String>(_SecuredPartyOrganisationTypeOrganisationNumber_QNAME, String.class, SecuredPartyOrganisationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ISO3166CountryCode", scope = NewAddressType.class)
    public JAXBElement<String> createNewAddressTypeISO3166CountryCode(String value) {
        return new JAXBElement<String>(_NewAddressTypeISO3166CountryCode_QNAME, String.class, NewAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Line2", scope = NewAddressType.class)
    public JAXBElement<String> createNewAddressTypeLine2(String value) {
        return new JAXBElement<String>(_NewAddressTypeLine2_QNAME, String.class, NewAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Postcode", scope = NewAddressType.class)
    public JAXBElement<String> createNewAddressTypePostcode(String value) {
        return new JAXBElement<String>(_NewAddressTypePostcode_QNAME, String.class, NewAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Line3", scope = NewAddressType.class)
    public JAXBElement<String> createNewAddressTypeLine3(String value) {
        return new JAXBElement<String>(_NewAddressTypeLine3_QNAME, String.class, NewAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Locality", scope = NewAddressType.class)
    public JAXBElement<String> createNewAddressTypeLocality(String value) {
        return new JAXBElement<String>(_NewAddressTypeLocality_QNAME, String.class, NewAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "State", scope = NewAddressType.class)
    public JAXBElement<String> createNewAddressTypeState(String value) {
        return new JAXBElement<String>(_NewAddressTypeState_QNAME, String.class, NewAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ContactPhone", scope = UpdatedSecuredPartyType.class)
    public JAXBElement<String> createUpdatedSecuredPartyTypeContactPhone(String value) {
        return new JAXBElement<String>(_UpdatedSecuredPartyTypeContactPhone_QNAME, String.class, UpdatedSecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyOrganisationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Organisation", scope = UpdatedSecuredPartyType.class)
    public JAXBElement<SecuredPartyOrganisationType> createUpdatedSecuredPartyTypeOrganisation(SecuredPartyOrganisationType value) {
        return new JAXBElement<SecuredPartyOrganisationType>(_GrantorSearchDetailTypeOrganisation_QNAME, SecuredPartyOrganisationType.class, UpdatedSecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EmailAddress", scope = UpdatedSecuredPartyType.class)
    public JAXBElement<String> createUpdatedSecuredPartyTypeEmailAddress(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeEmailAddress_QNAME, String.class, UpdatedSecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "MailingAddress", scope = UpdatedSecuredPartyType.class)
    public JAXBElement<NewAddressType> createUpdatedSecuredPartyTypeMailingAddress(NewAddressType value) {
        return new JAXBElement<NewAddressType>(_UpdatedSecuredPartyTypeMailingAddress_QNAME, NewAddressType.class, UpdatedSecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Individual", scope = UpdatedSecuredPartyType.class)
    public JAXBElement<SecuredPartyIndividualType> createUpdatedSecuredPartyTypeIndividual(SecuredPartyIndividualType value) {
        return new JAXBElement<SecuredPartyIndividualType>(_GrantorSearchDetailTypeIndividual_QNAME, SecuredPartyIndividualType.class, UpdatedSecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ContactName", scope = UpdatedSecuredPartyType.class)
    public JAXBElement<String> createUpdatedSecuredPartyTypeContactName(String value) {
        return new JAXBElement<String>(_UpdatedSecuredPartyTypeContactName_QNAME, String.class, UpdatedSecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RestrictedAccessReasonDescription", scope = RestrictedAccessDetailType.class)
    public JAXBElement<String> createRestrictedAccessDetailTypeRestrictedAccessReasonDescription(String value) {
        return new JAXBElement<String>(_RestrictedAccessDetailTypeRestrictedAccessReasonDescription_QNAME, String.class, RestrictedAccessDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationEndTime", scope = RestrictedAccessDetailType.class)
    public JAXBElement<XMLGregorianCalendar> createRestrictedAccessDetailTypeRegistrationEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictedAccessDetailTypeRegistrationEndTime_QNAME, XMLGregorianCalendar.class, RestrictedAccessDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationEndTime", scope = AmendRegistrationResponseTypeType.class)
    public JAXBElement<XMLGregorianCalendar> createAmendRegistrationResponseTypeTypeRegistrationEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictedAccessDetailTypeRegistrationEndTime_QNAME, XMLGregorianCalendar.class, AmendRegistrationResponseTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportProducedDateTime", scope = ReportSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createReportSummaryTypeReportProducedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ReportSummaryTypeReportProducedDateTime_QNAME, XMLGregorianCalendar.class, ReportSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportExpiryDateTime", scope = ReportSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createReportSummaryTypeReportExpiryDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ReportSummaryTypeReportExpiryDateTime_QNAME, XMLGregorianCalendar.class, ReportSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "PdfFilePageCount", scope = ReportSummaryType.class)
    public JAXBElement<Integer> createReportSummaryTypePdfFilePageCount(Integer value) {
        return new JAXBElement<Integer>(_ReportSummaryTypePdfFilePageCount_QNAME, Integer.class, ReportSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportRequestedB2GAccountCustomerLocation", scope = ReportSummaryType.class)
    public JAXBElement<String> createReportSummaryTypeReportRequestedB2GAccountCustomerLocation(String value) {
        return new JAXBElement<String>(_ReportSummaryTypeReportRequestedB2GAccountCustomerLocation_QNAME, String.class, ReportSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportFileName", scope = ReportSummaryType.class)
    public JAXBElement<String> createReportSummaryTypeReportFileName(String value) {
        return new JAXBElement<String>(_ReportSummaryTypeReportFileName_QNAME, String.class, ReportSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportFileSizeBytes", scope = ReportSummaryType.class)
    public JAXBElement<Integer> createReportSummaryTypeReportFileSizeBytes(Integer value) {
        return new JAXBElement<Integer>(_ReportSummaryTypeReportFileSizeBytes_QNAME, Integer.class, ReportSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationNumberTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumberType", scope = SecuredPartyOrganisationWithVerificationType.class)
    public JAXBElement<OrganisationNumberTypeType> createSecuredPartyOrganisationWithVerificationTypeOrganisationNumberType(OrganisationNumberTypeType value) {
        return new JAXBElement<OrganisationNumberTypeType>(_OrganisationNumberType_QNAME, OrganisationNumberTypeType.class, SecuredPartyOrganisationWithVerificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierVerificationStatusTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumberVerificationStatus", scope = SecuredPartyOrganisationWithVerificationType.class)
    public JAXBElement<IdentifierVerificationStatusTypeType> createSecuredPartyOrganisationWithVerificationTypeOrganisationNumberVerificationStatus(IdentifierVerificationStatusTypeType value) {
        return new JAXBElement<IdentifierVerificationStatusTypeType>(_SecuredPartyOrganisationWithVerificationTypeOrganisationNumberVerificationStatus_QNAME, IdentifierVerificationStatusTypeType.class, SecuredPartyOrganisationWithVerificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumberVerificationDateTime", scope = SecuredPartyOrganisationWithVerificationType.class)
    public JAXBElement<XMLGregorianCalendar> createSecuredPartyOrganisationWithVerificationTypeOrganisationNumberVerificationDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SecuredPartyOrganisationWithVerificationTypeOrganisationNumberVerificationDateTime_QNAME, XMLGregorianCalendar.class, SecuredPartyOrganisationWithVerificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationName", scope = SecuredPartyOrganisationWithVerificationType.class)
    public JAXBElement<String> createSecuredPartyOrganisationWithVerificationTypeOrganisationName(String value) {
        return new JAXBElement<String>(_SecuredPartyOrganisationTypeOrganisationName_QNAME, String.class, SecuredPartyOrganisationWithVerificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumber", scope = SecuredPartyOrganisationWithVerificationType.class)
    public JAXBElement<String> createSecuredPartyOrganisationWithVerificationTypeOrganisationNumber(String value) {
        return new JAXBElement<String>(_SecuredPartyOrganisationTypeOrganisationNumber_QNAME, String.class, SecuredPartyOrganisationWithVerificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupAccessCode", scope = RetrieveRegistrationRequestTypeType.class)
    public JAXBElement<String> createRetrieveRegistrationRequestTypeTypeSecuredPartyGroupAccessCode(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupAccessCode_QNAME, String.class, RetrieveRegistrationRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationToken", scope = RetrieveRegistrationRequestTypeType.class)
    public JAXBElement<String> createRetrieveRegistrationRequestTypeTypeRegistrationToken(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeRegistrationToken_QNAME, String.class, RetrieveRegistrationRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupNumber", scope = RetrieveRegistrationRequestTypeType.class)
    public JAXBElement<String> createRetrieveRegistrationRequestTypeTypeSecuredPartyGroupNumber(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupNumber_QNAME, String.class, RetrieveRegistrationRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "MessageLastRetrievedDateTime", scope = B2GMailboxMessageType.class)
    public JAXBElement<XMLGregorianCalendar> createB2GMailboxMessageTypeMessageLastRetrievedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_B2GMailboxMessageTypeMessageLastRetrievedDateTime_QNAME, XMLGregorianCalendar.class, B2GMailboxMessageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ExpiryDate", scope = NevdisRegistrationType.class)
    public JAXBElement<String> createNevdisRegistrationTypeExpiryDate(String value) {
        return new JAXBElement<String>(_NevdisRegistrationTypeExpiryDate_QNAME, String.class, NevdisRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "PlateNumber", scope = NevdisRegistrationType.class)
    public JAXBElement<String> createNevdisRegistrationTypePlateNumber(String value) {
        return new JAXBElement<String>(_NevdisRegistrationTypePlateNumber_QNAME, String.class, NevdisRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalVehicleCollateralDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AdditionalVehicleDetails", scope = NewRegistrationSerialisedCollateralDescriptionType.class)
    public JAXBElement<AdditionalVehicleCollateralDescriptionType> createNewRegistrationSerialisedCollateralDescriptionTypeAdditionalVehicleDetails(AdditionalVehicleCollateralDescriptionType value) {
        return new JAXBElement<AdditionalVehicleCollateralDescriptionType>(_NewRegistrationSerialisedCollateralDescriptionTypeAdditionalVehicleDetails_QNAME, AdditionalVehicleCollateralDescriptionType.class, NewRegistrationSerialisedCollateralDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalAircraftCollateralDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AdditionalAircraftDetails", scope = NewRegistrationSerialisedCollateralDescriptionType.class)
    public JAXBElement<AdditionalAircraftCollateralDescriptionType> createNewRegistrationSerialisedCollateralDescriptionTypeAdditionalAircraftDetails(AdditionalAircraftCollateralDescriptionType value) {
        return new JAXBElement<AdditionalAircraftCollateralDescriptionType>(_NewRegistrationSerialisedCollateralDescriptionTypeAdditionalAircraftDetails_QNAME, AdditionalAircraftCollateralDescriptionType.class, NewRegistrationSerialisedCollateralDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "VehicleRegistrationNumber", scope = AdditionalVehicleCollateralDescriptionType.class)
    public JAXBElement<String> createAdditionalVehicleCollateralDescriptionTypeVehicleRegistrationNumber(String value) {
        return new JAXBElement<String>(_AdditionalVehicleCollateralDescriptionTypeVehicleRegistrationNumber_QNAME, String.class, AdditionalVehicleCollateralDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "VehicleDescriptiveText", scope = AdditionalVehicleCollateralDescriptionType.class)
    public JAXBElement<String> createAdditionalVehicleCollateralDescriptionTypeVehicleDescriptiveText(String value) {
        return new JAXBElement<String>(_AdditionalVehicleCollateralDescriptionTypeVehicleDescriptiveText_QNAME, String.class, AdditionalVehicleCollateralDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorOrganisationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Organisation", scope = NewGrantorType.class)
    public JAXBElement<GrantorOrganisationType> createNewGrantorTypeOrganisation(GrantorOrganisationType value) {
        return new JAXBElement<GrantorOrganisationType>(_GrantorSearchDetailTypeOrganisation_QNAME, GrantorOrganisationType.class, NewGrantorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewGrantorIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Individual", scope = NewGrantorType.class)
    public JAXBElement<NewGrantorIndividualType> createNewGrantorTypeIndividual(NewGrantorIndividualType value) {
        return new JAXBElement<NewGrantorIndividualType>(_GrantorSearchDetailTypeIndividual_QNAME, NewGrantorIndividualType.class, NewGrantorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyOrganisationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Organisation", scope = NewSecuredPartyType.class)
    public JAXBElement<SecuredPartyOrganisationType> createNewSecuredPartyTypeOrganisation(SecuredPartyOrganisationType value) {
        return new JAXBElement<SecuredPartyOrganisationType>(_GrantorSearchDetailTypeOrganisation_QNAME, SecuredPartyOrganisationType.class, NewSecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EmailAddress", scope = NewSecuredPartyType.class)
    public JAXBElement<String> createNewSecuredPartyTypeEmailAddress(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeEmailAddress_QNAME, String.class, NewSecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Individual", scope = NewSecuredPartyType.class)
    public JAXBElement<SecuredPartyIndividualType> createNewSecuredPartyTypeIndividual(SecuredPartyIndividualType value) {
        return new JAXBElement<SecuredPartyIndividualType>(_GrantorSearchDetailTypeIndividual_QNAME, SecuredPartyIndividualType.class, NewSecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AreProceedsClaimed", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<ExtendedBooleanTypeType> createCollateralRegistrationAmendmentsTypeAreProceedsClaimed(ExtendedBooleanTypeType value) {
        return new JAXBElement<ExtendedBooleanTypeType>(_CollateralRegistrationAmendmentsTypeAreProceedsClaimed_QNAME, ExtendedBooleanTypeType.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GivingOfNoticeIdentifier", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<String> createCollateralRegistrationAmendmentsTypeGivingOfNoticeIdentifier(String value) {
        return new JAXBElement<String>(_RetrieveMessagesRequestTypeTypeGivingOfNoticeIdentifier_QNAME, String.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AttachmentIdsToAdd", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<ArrayOfNewAttachmentType> createCollateralRegistrationAmendmentsTypeAttachmentIdsToAdd(ArrayOfNewAttachmentType value) {
        return new JAXBElement<ArrayOfNewAttachmentType>(_CollateralRegistrationAmendmentsTypeAttachmentIdsToAdd_QNAME, ArrayOfNewAttachmentType.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ProceedsClaimedDescription", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<String> createCollateralRegistrationAmendmentsTypeProceedsClaimedDescription(String value) {
        return new JAXBElement<String>(_CollateralRegistrationAmendmentsTypeProceedsClaimedDescription_QNAME, String.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsRegistrationEndTimeNotStated", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<Boolean> createCollateralRegistrationAmendmentsTypeIsRegistrationEndTimeNotStated(Boolean value) {
        return new JAXBElement<Boolean>(_CollateralRegistrationAmendmentsTypeIsRegistrationEndTimeNotStated_QNAME, Boolean.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemovedGrantorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorsToRemove", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<ArrayOfRemovedGrantorType> createCollateralRegistrationAmendmentsTypeGrantorsToRemove(ArrayOfRemovedGrantorType value) {
        return new JAXBElement<ArrayOfRemovedGrantorType>(_CollateralRegistrationAmendmentsTypeGrantorsToRemove_QNAME, ArrayOfRemovedGrantorType.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralDescription", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<String> createCollateralRegistrationAmendmentsTypeCollateralDescription(String value) {
        return new JAXBElement<String>(_CollateralRegistrationAmendmentsTypeCollateralDescription_QNAME, String.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemovedAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AttachmentIdsToRemove", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<ArrayOfRemovedAttachmentType> createCollateralRegistrationAmendmentsTypeAttachmentIdsToRemove(ArrayOfRemovedAttachmentType value) {
        return new JAXBElement<ArrayOfRemovedAttachmentType>(_CollateralRegistrationAmendmentsTypeAttachmentIdsToRemove_QNAME, ArrayOfRemovedAttachmentType.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalVehicleCollateralDescriptionAmendmentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AdditionalVehicleDetails", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<AdditionalVehicleCollateralDescriptionAmendmentsType> createCollateralRegistrationAmendmentsTypeAdditionalVehicleDetails(AdditionalVehicleCollateralDescriptionAmendmentsType value) {
        return new JAXBElement<AdditionalVehicleCollateralDescriptionAmendmentsType>(_NewRegistrationSerialisedCollateralDescriptionTypeAdditionalVehicleDetails_QNAME, AdditionalVehicleCollateralDescriptionAmendmentsType.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewGrantorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorsToAdd", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<ArrayOfNewGrantorType> createCollateralRegistrationAmendmentsTypeGrantorsToAdd(ArrayOfNewGrantorType value) {
        return new JAXBElement<ArrayOfNewGrantorType>(_CollateralRegistrationAmendmentsTypeGrantorsToAdd_QNAME, ArrayOfNewGrantorType.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsSubordinate", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<Boolean> createCollateralRegistrationAmendmentsTypeIsSubordinate(Boolean value) {
        return new JAXBElement<Boolean>(_CollateralRegistrationAmendmentsTypeIsSubordinate_QNAME, Boolean.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalAircraftCollateralDescriptionAmendmentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AdditionalAircraftDetails", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<AdditionalAircraftCollateralDescriptionAmendmentsType> createCollateralRegistrationAmendmentsTypeAdditionalAircraftDetails(AdditionalAircraftCollateralDescriptionAmendmentsType value) {
        return new JAXBElement<AdditionalAircraftCollateralDescriptionAmendmentsType>(_NewRegistrationSerialisedCollateralDescriptionTypeAdditionalAircraftDetails_QNAME, AdditionalAircraftCollateralDescriptionAmendmentsType.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationEndTime", scope = CollateralRegistrationAmendmentsType.class)
    public JAXBElement<XMLGregorianCalendar> createCollateralRegistrationAmendmentsTypeRegistrationEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictedAccessDetailTypeRegistrationEndTime_QNAME, XMLGregorianCalendar.class, CollateralRegistrationAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsAccessRestricted", scope = OrdinalRegistrationDetailType.class)
    public JAXBElement<Boolean> createOrdinalRegistrationDetailTypeIsAccessRestricted(Boolean value) {
        return new JAXBElement<Boolean>(_OrdinalRegistrationDetailTypeIsAccessRestricted_QNAME, Boolean.class, OrdinalRegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EventTime", scope = OrdinalRegistrationDetailType.class)
    public JAXBElement<XMLGregorianCalendar> createOrdinalRegistrationDetailTypeEventTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrdinalRegistrationDetailTypeEventTime_QNAME, XMLGregorianCalendar.class, OrdinalRegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationNumberTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumberType", scope = GrantorOrganisationSearchCriteriaType.class)
    public JAXBElement<OrganisationNumberTypeType> createGrantorOrganisationSearchCriteriaTypeOrganisationNumberType(OrganisationNumberTypeType value) {
        return new JAXBElement<OrganisationNumberTypeType>(_OrganisationNumberType_QNAME, OrganisationNumberTypeType.class, GrantorOrganisationSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationName", scope = GrantorOrganisationSearchCriteriaType.class)
    public JAXBElement<String> createGrantorOrganisationSearchCriteriaTypeOrganisationName(String value) {
        return new JAXBElement<String>(_SecuredPartyOrganisationTypeOrganisationName_QNAME, String.class, GrantorOrganisationSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumber", scope = GrantorOrganisationSearchCriteriaType.class)
    public JAXBElement<String> createGrantorOrganisationSearchCriteriaTypeOrganisationNumber(String value) {
        return new JAXBElement<String>(_SecuredPartyOrganisationTypeOrganisationNumber_QNAME, String.class, GrantorOrganisationSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "TransferFromSecuredPartyGroupAccessCode", scope = TransferAllRegistrationsRequestTypeType.class)
    public JAXBElement<String> createTransferAllRegistrationsRequestTypeTypeTransferFromSecuredPartyGroupAccessCode(String value) {
        return new JAXBElement<String>(_TransferSingleRegistrationRequestTypeTypeTransferFromSecuredPartyGroupAccessCode_QNAME, String.class, TransferAllRegistrationsRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CompletionNotificationEmailAddress", scope = TransferAllRegistrationsRequestTypeType.class)
    public JAXBElement<String> createTransferAllRegistrationsRequestTypeTypeCompletionNotificationEmailAddress(String value) {
        return new JAXBElement<String>(_TransferAllRegistrationsRequestTypeTypeCompletionNotificationEmailAddress_QNAME, String.class, TransferAllRegistrationsRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWrittenOffDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "WrittenOffDetails", scope = NevdisVehicleType.class)
    public JAXBElement<ArrayOfWrittenOffDetailType> createNevdisVehicleTypeWrittenOffDetails(ArrayOfWrittenOffDetailType value) {
        return new JAXBElement<ArrayOfWrittenOffDetailType>(_NevdisVehicleTypeWrittenOffDetails_QNAME, ArrayOfWrittenOffDetailType.class, NevdisVehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStolenDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "StolenDetails", scope = NevdisVehicleType.class)
    public JAXBElement<ArrayOfStolenDetailType> createNevdisVehicleTypeStolenDetails(ArrayOfStolenDetailType value) {
        return new JAXBElement<ArrayOfStolenDetailType>(_NevdisVehicleTypeStolenDetails_QNAME, ArrayOfStolenDetailType.class, NevdisVehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CompletionNotificationEmailAddress", scope = UpdatedAddressForServiceType.class)
    public JAXBElement<String> createUpdatedAddressForServiceTypeCompletionNotificationEmailAddress(String value) {
        return new JAXBElement<String>(_TransferAllRegistrationsRequestTypeTypeCompletionNotificationEmailAddress_QNAME, String.class, UpdatedAddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "DateOfBirth", scope = GrantorIndividualType.class)
    public JAXBElement<XMLGregorianCalendar> createGrantorIndividualTypeDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GrantorIndividualTypeDateOfBirth_QNAME, XMLGregorianCalendar.class, GrantorIndividualType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupAccessCode", scope = ReissueVerificationStatementRequestTypeType.class)
    public JAXBElement<String> createReissueVerificationStatementRequestTypeTypeSecuredPartyGroupAccessCode(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupAccessCode_QNAME, String.class, ReissueVerificationStatementRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationToken", scope = ReissueVerificationStatementRequestTypeType.class)
    public JAXBElement<String> createReissueVerificationStatementRequestTypeTypeRegistrationToken(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeRegistrationToken_QNAME, String.class, ReissueVerificationStatementRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupNumber", scope = ReissueVerificationStatementRequestTypeType.class)
    public JAXBElement<String> createReissueVerificationStatementRequestTypeTypeSecuredPartyGroupNumber(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupNumber_QNAME, String.class, ReissueVerificationStatementRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyOrganisationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Organisation", scope = CollateralRegistrationSecuredPartyType.class)
    public JAXBElement<SecuredPartyOrganisationType> createCollateralRegistrationSecuredPartyTypeOrganisation(SecuredPartyOrganisationType value) {
        return new JAXBElement<SecuredPartyOrganisationType>(_GrantorSearchDetailTypeOrganisation_QNAME, SecuredPartyOrganisationType.class, CollateralRegistrationSecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Individual", scope = CollateralRegistrationSecuredPartyType.class)
    public JAXBElement<SecuredPartyIndividualType> createCollateralRegistrationSecuredPartyTypeIndividual(SecuredPartyIndividualType value) {
        return new JAXBElement<SecuredPartyIndividualType>(_GrantorSearchDetailTypeIndividual_QNAME, SecuredPartyIndividualType.class, CollateralRegistrationSecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalVehicleCollateralDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AdditionalVehicleDetails", scope = SerialisedCollateralDescriptionType.class)
    public JAXBElement<AdditionalVehicleCollateralDescriptionType> createSerialisedCollateralDescriptionTypeAdditionalVehicleDetails(AdditionalVehicleCollateralDescriptionType value) {
        return new JAXBElement<AdditionalVehicleCollateralDescriptionType>(_NewRegistrationSerialisedCollateralDescriptionTypeAdditionalVehicleDetails_QNAME, AdditionalVehicleCollateralDescriptionType.class, SerialisedCollateralDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalAircraftCollateralDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AdditionalAircraftDetails", scope = SerialisedCollateralDescriptionType.class)
    public JAXBElement<AdditionalAircraftCollateralDescriptionType> createSerialisedCollateralDescriptionTypeAdditionalAircraftDetails(AdditionalAircraftCollateralDescriptionType value) {
        return new JAXBElement<AdditionalAircraftCollateralDescriptionType>(_NewRegistrationSerialisedCollateralDescriptionTypeAdditionalAircraftDetails_QNAME, AdditionalAircraftCollateralDescriptionType.class, SerialisedCollateralDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ChangeNumber", scope = RequestSearchCertificateRequestTypeType.class)
    public JAXBElement<Long> createRequestSearchCertificateRequestTypeTypeChangeNumber(Long value) {
        return new JAXBElement<Long>(_RetrieveMessagesRequestTypeTypeChangeNumber_QNAME, Long.class, RequestSearchCertificateRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationNumber", scope = RequestSearchCertificateRequestTypeType.class)
    public JAXBElement<String> createRequestSearchCertificateRequestTypeTypeRegistrationNumber(String value) {
        return new JAXBElement<String>(_RetrieveMessagesRequestTypeTypeRegistrationNumber_QNAME, String.class, RequestSearchCertificateRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationNumberTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumberType", scope = GrantorOrganisationType.class)
    public JAXBElement<OrganisationNumberTypeType> createGrantorOrganisationTypeOrganisationNumberType(OrganisationNumberTypeType value) {
        return new JAXBElement<OrganisationNumberTypeType>(_OrganisationNumberType_QNAME, OrganisationNumberTypeType.class, GrantorOrganisationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationName", scope = GrantorOrganisationType.class)
    public JAXBElement<String> createGrantorOrganisationTypeOrganisationName(String value) {
        return new JAXBElement<String>(_SecuredPartyOrganisationTypeOrganisationName_QNAME, String.class, GrantorOrganisationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumber", scope = GrantorOrganisationType.class)
    public JAXBElement<String> createGrantorOrganisationTypeOrganisationNumber(String value) {
        return new JAXBElement<String>(_SecuredPartyOrganisationTypeOrganisationNumber_QNAME, String.class, GrantorOrganisationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrationDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "MigrationDetail", scope = RegistrationDetailType.class)
    public JAXBElement<MigrationDetailType> createRegistrationDetailTypeMigrationDetail(MigrationDetailType value) {
        return new JAXBElement<MigrationDetailType>(_MigrationDetail_QNAME, MigrationDetailType.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AreProceedsClaimed", scope = RegistrationDetailType.class)
    public JAXBElement<ExtendedBooleanTypeType> createRegistrationDetailTypeAreProceedsClaimed(ExtendedBooleanTypeType value) {
        return new JAXBElement<ExtendedBooleanTypeType>(_CollateralRegistrationAmendmentsTypeAreProceedsClaimed_QNAME, ExtendedBooleanTypeType.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GivingOfNoticeIdentifier", scope = RegistrationDetailType.class)
    public JAXBElement<String> createRegistrationDetailTypeGivingOfNoticeIdentifier(String value) {
        return new JAXBElement<String>(_RetrieveMessagesRequestTypeTypeGivingOfNoticeIdentifier_QNAME, String.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ProceedsClaimedDescription", scope = RegistrationDetailType.class)
    public JAXBElement<String> createRegistrationDetailTypeProceedsClaimedDescription(String value) {
        return new JAXBElement<String>(_CollateralRegistrationAmendmentsTypeProceedsClaimedDescription_QNAME, String.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AreAssetsSubjectToControl", scope = RegistrationDetailType.class)
    public JAXBElement<ExtendedBooleanTypeType> createRegistrationDetailTypeAreAssetsSubjectToControl(ExtendedBooleanTypeType value) {
        return new JAXBElement<ExtendedBooleanTypeType>(_RegistrationDetailTypeAreAssetsSubjectToControl_QNAME, ExtendedBooleanTypeType.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Attachments", scope = RegistrationDetailType.class)
    public JAXBElement<ArrayOfAttachmentDetailType> createRegistrationDetailTypeAttachments(ArrayOfAttachmentDetailType value) {
        return new JAXBElement<ArrayOfAttachmentDetailType>(_RegistrationDetailTypeAttachments_QNAME, ArrayOfAttachmentDetailType.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralDescription", scope = RegistrationDetailType.class)
    public JAXBElement<String> createRegistrationDetailTypeCollateralDescription(String value) {
        return new JAXBElement<String>(_CollateralRegistrationAmendmentsTypeCollateralDescription_QNAME, String.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsInventory", scope = RegistrationDetailType.class)
    public JAXBElement<ExtendedBooleanTypeType> createRegistrationDetailTypeIsInventory(ExtendedBooleanTypeType value) {
        return new JAXBElement<ExtendedBooleanTypeType>(_RegistrationDetailTypeIsInventory_QNAME, ExtendedBooleanTypeType.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerialisedCollateralDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SerialNumberDetails", scope = RegistrationDetailType.class)
    public JAXBElement<SerialisedCollateralDescriptionType> createRegistrationDetailTypeSerialNumberDetails(SerialisedCollateralDescriptionType value) {
        return new JAXBElement<SerialisedCollateralDescriptionType>(_RegistrationDetailTypeSerialNumberDetails_QNAME, SerialisedCollateralDescriptionType.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsPMSI", scope = RegistrationDetailType.class)
    public JAXBElement<ExtendedBooleanTypeType> createRegistrationDetailTypeIsPMSI(ExtendedBooleanTypeType value) {
        return new JAXBElement<ExtendedBooleanTypeType>(_RegistrationDetailTypeIsPMSI_QNAME, ExtendedBooleanTypeType.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGrantorSearchDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Grantors", scope = RegistrationDetailType.class)
    public JAXBElement<ArrayOfGrantorSearchDetailType> createRegistrationDetailTypeGrantors(ArrayOfGrantorSearchDetailType value) {
        return new JAXBElement<ArrayOfGrantorSearchDetailType>(_RegistrationDetailTypeGrantors_QNAME, ArrayOfGrantorSearchDetailType.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EarlierRegistrationNumber", scope = RegistrationDetailType.class)
    public JAXBElement<String> createRegistrationDetailTypeEarlierRegistrationNumber(String value) {
        return new JAXBElement<String>(_RegistrationDetailTypeEarlierRegistrationNumber_QNAME, String.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationEndTime", scope = RegistrationDetailType.class)
    public JAXBElement<XMLGregorianCalendar> createRegistrationDetailTypeRegistrationEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictedAccessDetailTypeRegistrationEndTime_QNAME, XMLGregorianCalendar.class, RegistrationDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorIndividualSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorIndividualSearchCriteria", scope = SearchByGrantorAndEventDateRangeSearchCriteriaType.class)
    public JAXBElement<GrantorIndividualSearchCriteriaType> createSearchByGrantorAndEventDateRangeSearchCriteriaTypeGrantorIndividualSearchCriteria(GrantorIndividualSearchCriteriaType value) {
        return new JAXBElement<GrantorIndividualSearchCriteriaType>(_GrantorIndividualSearchCriteria_QNAME, GrantorIndividualSearchCriteriaType.class, SearchByGrantorAndEventDateRangeSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorOrganisationSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorOrganisationSearchCriteria", scope = SearchByGrantorAndEventDateRangeSearchCriteriaType.class)
    public JAXBElement<GrantorOrganisationSearchCriteriaType> createSearchByGrantorAndEventDateRangeSearchCriteriaTypeGrantorOrganisationSearchCriteria(GrantorOrganisationSearchCriteriaType value) {
        return new JAXBElement<GrantorOrganisationSearchCriteriaType>(_GrantorOrganisationSearchCriteria_QNAME, GrantorOrganisationSearchCriteriaType.class, SearchByGrantorAndEventDateRangeSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Attachments", scope = NewCollateralRegistrationType.class)
    public JAXBElement<ArrayOfNewAttachmentType> createNewCollateralRegistrationTypeAttachments(ArrayOfNewAttachmentType value) {
        return new JAXBElement<ArrayOfNewAttachmentType>(_RegistrationDetailTypeAttachments_QNAME, ArrayOfNewAttachmentType.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AreProceedsClaimed", scope = NewCollateralRegistrationType.class)
    public JAXBElement<Boolean> createNewCollateralRegistrationTypeAreProceedsClaimed(Boolean value) {
        return new JAXBElement<Boolean>(_CollateralRegistrationAmendmentsTypeAreProceedsClaimed_QNAME, Boolean.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GivingOfNoticeIdentifier", scope = NewCollateralRegistrationType.class)
    public JAXBElement<String> createNewCollateralRegistrationTypeGivingOfNoticeIdentifier(String value) {
        return new JAXBElement<String>(_RetrieveMessagesRequestTypeTypeGivingOfNoticeIdentifier_QNAME, String.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ProceedsClaimedDescription", scope = NewCollateralRegistrationType.class)
    public JAXBElement<String> createNewCollateralRegistrationTypeProceedsClaimedDescription(String value) {
        return new JAXBElement<String>(_CollateralRegistrationAmendmentsTypeProceedsClaimedDescription_QNAME, String.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralDescription", scope = NewCollateralRegistrationType.class)
    public JAXBElement<String> createNewCollateralRegistrationTypeCollateralDescription(String value) {
        return new JAXBElement<String>(_CollateralRegistrationAmendmentsTypeCollateralDescription_QNAME, String.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsInventory", scope = NewCollateralRegistrationType.class)
    public JAXBElement<Boolean> createNewCollateralRegistrationTypeIsInventory(Boolean value) {
        return new JAXBElement<Boolean>(_RegistrationDetailTypeIsInventory_QNAME, Boolean.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AreAssetsSubjectToControl", scope = NewCollateralRegistrationType.class)
    public JAXBElement<Boolean> createNewCollateralRegistrationTypeAreAssetsSubjectToControl(Boolean value) {
        return new JAXBElement<Boolean>(_RegistrationDetailTypeAreAssetsSubjectToControl_QNAME, Boolean.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRegistrationSerialisedCollateralDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SerialNumberDetails", scope = NewCollateralRegistrationType.class)
    public JAXBElement<NewRegistrationSerialisedCollateralDescriptionType> createNewCollateralRegistrationTypeSerialNumberDetails(NewRegistrationSerialisedCollateralDescriptionType value) {
        return new JAXBElement<NewRegistrationSerialisedCollateralDescriptionType>(_RegistrationDetailTypeSerialNumberDetails_QNAME, NewRegistrationSerialisedCollateralDescriptionType.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsRegistrationEndTimeNotStated", scope = NewCollateralRegistrationType.class)
    public JAXBElement<Boolean> createNewCollateralRegistrationTypeIsRegistrationEndTimeNotStated(Boolean value) {
        return new JAXBElement<Boolean>(_CollateralRegistrationAmendmentsTypeIsRegistrationEndTimeNotStated_QNAME, Boolean.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsPMSI", scope = NewCollateralRegistrationType.class)
    public JAXBElement<Boolean> createNewCollateralRegistrationTypeIsPMSI(Boolean value) {
        return new JAXBElement<Boolean>(_RegistrationDetailTypeIsPMSI_QNAME, Boolean.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationEndTime", scope = NewCollateralRegistrationType.class)
    public JAXBElement<XMLGregorianCalendar> createNewCollateralRegistrationTypeRegistrationEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictedAccessDetailTypeRegistrationEndTime_QNAME, XMLGregorianCalendar.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EarlierRegistrationNumber", scope = NewCollateralRegistrationType.class)
    public JAXBElement<String> createNewCollateralRegistrationTypeEarlierRegistrationNumber(String value) {
        return new JAXBElement<String>(_RegistrationDetailTypeEarlierRegistrationNumber_QNAME, String.class, NewCollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewGrantorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Grantors", scope = CreateRegistrationsRequestTypeType.class)
    public JAXBElement<ArrayOfNewGrantorType> createCreateRegistrationsRequestTypeTypeGrantors(ArrayOfNewGrantorType value) {
        return new JAXBElement<ArrayOfNewGrantorType>(_RegistrationDetailTypeGrantors_QNAME, ArrayOfNewGrantorType.class, CreateRegistrationsRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ChangeNumber", scope = RegistrationEventType.class)
    public JAXBElement<Long> createRegistrationEventTypeChangeNumber(Long value) {
        return new JAXBElement<Long>(_RetrieveMessagesRequestTypeTypeChangeNumber_QNAME, Long.class, RegistrationEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationEndTime", scope = RegistrationInfoType.class)
    public JAXBElement<XMLGregorianCalendar> createRegistrationInfoTypeRegistrationEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictedAccessDetailTypeRegistrationEndTime_QNAME, XMLGregorianCalendar.class, RegistrationInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "WrittenOffSummary", scope = WrittenOffDetailType.class)
    public JAXBElement<String> createWrittenOffDetailTypeWrittenOffSummary(String value) {
        return new JAXBElement<String>(_WrittenOffDetailTypeWrittenOffSummary_QNAME, String.class, WrittenOffDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNevdisVehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NevdisVehicles", scope = NevdisDataType.class)
    public JAXBElement<ArrayOfNevdisVehicleType> createNevdisDataTypeNevdisVehicles(ArrayOfNevdisVehicleType value) {
        return new JAXBElement<ArrayOfNevdisVehicleType>(_NevdisDataTypeNevdisVehicles_QNAME, ArrayOfNevdisVehicleType.class, NevdisDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResultDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ResultDetails", scope = RetrieveGrantorSearchResultDetailResponseTypeType.class)
    public JAXBElement<ArrayOfResultDetailType> createRetrieveGrantorSearchResultDetailResponseTypeTypeResultDetails(ArrayOfResultDetailType value) {
        return new JAXBElement<ArrayOfResultDetailType>(_RetrieveGrantorSearchResultDetailResponseTypeTypeResultDetails_QNAME, ArrayOfResultDetailType.class, RetrieveGrantorSearchResultDetailResponseTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ResultDetail", scope = SearchByRegistrationNumberSearchResultType.class)
    public JAXBElement<ResultDetailType> createSearchByRegistrationNumberSearchResultTypeResultDetail(ResultDetailType value) {
        return new JAXBElement<ResultDetailType>(_ResultDetail_QNAME, ResultDetailType.class, SearchByRegistrationNumberSearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupAccessCode", scope = AmendRegistrationRequestTypeType.class)
    public JAXBElement<String> createAmendRegistrationRequestTypeTypeSecuredPartyGroupAccessCode(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupAccessCode_QNAME, String.class, AmendRegistrationRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationToken", scope = AmendRegistrationRequestTypeType.class)
    public JAXBElement<String> createAmendRegistrationRequestTypeTypeRegistrationToken(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeRegistrationToken_QNAME, String.class, AmendRegistrationRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupNumber", scope = AmendRegistrationRequestTypeType.class)
    public JAXBElement<String> createAmendRegistrationRequestTypeTypeSecuredPartyGroupNumber(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupNumber_QNAME, String.class, AmendRegistrationRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ISO3166CountryCode", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeISO3166CountryCode(String value) {
        return new JAXBElement<String>(_NewAddressTypeISO3166CountryCode_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CountryName", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeCountryName(String value) {
        return new JAXBElement<String>(_AddressTypeCountryName_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Line2", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeLine2(String value) {
        return new JAXBElement<String>(_NewAddressTypeLine2_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Postcode", scope = AddressType.class)
    public JAXBElement<String> createAddressTypePostcode(String value) {
        return new JAXBElement<String>(_NewAddressTypePostcode_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Line3", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeLine3(String value) {
        return new JAXBElement<String>(_NewAddressTypeLine3_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Locality", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeLocality(String value) {
        return new JAXBElement<String>(_NewAddressTypeLocality_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "State", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeState(String value) {
        return new JAXBElement<String>(_NewAddressTypeState_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorOrganisationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Organisation", scope = GrantorType.class)
    public JAXBElement<GrantorOrganisationType> createGrantorTypeOrganisation(GrantorOrganisationType value) {
        return new JAXBElement<GrantorOrganisationType>(_GrantorSearchDetailTypeOrganisation_QNAME, GrantorOrganisationType.class, GrantorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Individual", scope = GrantorType.class)
    public JAXBElement<GrantorIndividualType> createGrantorTypeIndividual(GrantorIndividualType value) {
        return new JAXBElement<GrantorIndividualType>(_GrantorSearchDetailTypeIndividual_QNAME, GrantorIndividualType.class, GrantorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AttachmentDescription", scope = UploadRegistrationAttachmentRequestTypeType.class)
    public JAXBElement<String> createUploadRegistrationAttachmentRequestTypeTypeAttachmentDescription(String value) {
        return new JAXBElement<String>(_UploadRegistrationAttachmentRequestTypeTypeAttachmentDescription_QNAME, String.class, UploadRegistrationAttachmentRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyOrganisationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Organisation", scope = SecuredPartyType.class)
    public JAXBElement<SecuredPartyOrganisationType> createSecuredPartyTypeOrganisation(SecuredPartyOrganisationType value) {
        return new JAXBElement<SecuredPartyOrganisationType>(_GrantorSearchDetailTypeOrganisation_QNAME, SecuredPartyOrganisationType.class, SecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EmailAddress", scope = SecuredPartyType.class)
    public JAXBElement<String> createSecuredPartyTypeEmailAddress(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeEmailAddress_QNAME, String.class, SecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Individual", scope = SecuredPartyType.class)
    public JAXBElement<SecuredPartyIndividualType> createSecuredPartyTypeIndividual(SecuredPartyIndividualType value) {
        return new JAXBElement<SecuredPartyIndividualType>(_GrantorSearchDetailTypeIndividual_QNAME, SecuredPartyIndividualType.class, SecuredPartyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "FamilyName", scope = GrantorIndividualSearchDetailType.class)
    public JAXBElement<String> createGrantorIndividualSearchDetailTypeFamilyName(String value) {
        return new JAXBElement<String>(_GrantorIndividualSearchDetailTypeFamilyName_QNAME, String.class, GrantorIndividualSearchDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GivenNames", scope = GrantorIndividualSearchDetailType.class)
    public JAXBElement<String> createGrantorIndividualSearchDetailTypeGivenNames(String value) {
        return new JAXBElement<String>(_GrantorIndividualSearchDetailTypeGivenNames_QNAME, String.class, GrantorIndividualSearchDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ChangeHistory", scope = ResultDetailType.class)
    public JAXBElement<ChangeHistoryType> createResultDetailTypeChangeHistory(ChangeHistoryType value) {
        return new JAXBElement<ChangeHistoryType>(_ChangeHistory_QNAME, ChangeHistoryType.class, ResultDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationDetail", scope = ResultDetailType.class)
    public JAXBElement<RegistrationDetailType> createResultDetailTypeRegistrationDetail(RegistrationDetailType value) {
        return new JAXBElement<RegistrationDetailType>(_RegistrationDetail_QNAME, RegistrationDetailType.class, ResultDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ResultSequenceNumber", scope = ResultDetailType.class)
    public JAXBElement<Short> createResultDetailTypeResultSequenceNumber(Short value) {
        return new JAXBElement<Short>(_ResultDetailTypeResultSequenceNumber_QNAME, Short.class, ResultDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictionDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RestrictionDetail", scope = ResultDetailType.class)
    public JAXBElement<RestrictionDetailType> createResultDetailTypeRestrictionDetail(RestrictionDetailType value) {
        return new JAXBElement<RestrictionDetailType>(_RestrictionDetail_QNAME, RestrictionDetailType.class, ResultDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "StolenSummary", scope = StolenDetailType.class)
    public JAXBElement<String> createStolenDetailTypeStolenSummary(String value) {
        return new JAXBElement<String>(_StolenDetailTypeStolenSummary_QNAME, String.class, StolenDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Addressee", scope = NewAddressForServiceType.class)
    public JAXBElement<String> createNewAddressForServiceTypeAddressee(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeAddressee_QNAME, String.class, NewAddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EmailAddress", scope = NewAddressForServiceType.class)
    public JAXBElement<String> createNewAddressForServiceTypeEmailAddress(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeEmailAddress_QNAME, String.class, NewAddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "B2GAccountCustomerNumber", scope = NewAddressForServiceType.class)
    public JAXBElement<String> createNewAddressForServiceTypeB2GAccountCustomerNumber(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeB2GAccountCustomerNumber_QNAME, String.class, NewAddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "PhysicalAddress", scope = NewAddressForServiceType.class)
    public JAXBElement<NewAddressType> createNewAddressForServiceTypePhysicalAddress(NewAddressType value) {
        return new JAXBElement<NewAddressType>(_AddressForServiceTypePhysicalAddress_QNAME, NewAddressType.class, NewAddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "FaxNumber", scope = NewAddressForServiceType.class)
    public JAXBElement<String> createNewAddressForServiceTypeFaxNumber(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeFaxNumber_QNAME, String.class, NewAddressForServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AttachmentDescription", scope = AttachmentDetailType.class)
    public JAXBElement<String> createAttachmentDetailTypeAttachmentDescription(String value) {
        return new JAXBElement<String>(_UploadRegistrationAttachmentRequestTypeTypeAttachmentDescription_QNAME, String.class, AttachmentDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResultDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ResultDetails", scope = SearchBySerialNumberSearchResultType.class)
    public JAXBElement<ArrayOfResultDetailType> createSearchBySerialNumberSearchResultTypeResultDetails(ArrayOfResultDetailType value) {
        return new JAXBElement<ArrayOfResultDetailType>(_RetrieveGrantorSearchResultDetailResponseTypeTypeResultDetails_QNAME, ArrayOfResultDetailType.class, SearchBySerialNumberSearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NevdisDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "NevdisData", scope = SearchBySerialNumberSearchResultType.class)
    public JAXBElement<NevdisDataType> createSearchBySerialNumberSearchResultTypeNevdisData(NevdisDataType value) {
        return new JAXBElement<NevdisDataType>(_NevdisData_QNAME, NevdisDataType.class, SearchBySerialNumberSearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "TransitionalPeriodMessage", scope = SearchBySerialNumberSearchResultType.class)
    public JAXBElement<String> createSearchBySerialNumberSearchResultTypeTransitionalPeriodMessage(String value) {
        return new JAXBElement<String>(_SearchBySerialNumberSearchResultTypeTransitionalPeriodMessage_QNAME, String.class, SearchBySerialNumberSearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportReadyNotificationEmailAddress", scope = RequestReportRequestTypeType.class)
    public JAXBElement<String> createRequestReportRequestTypeTypeReportReadyNotificationEmailAddress(String value) {
        return new JAXBElement<String>(_RequestReportRequestTypeTypeReportReadyNotificationEmailAddress_QNAME, String.class, RequestReportRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Attachment", scope = RetrieveSearchResultRegistrationAttachmentResponseTypeType.class)
    public JAXBElement<byte[]> createRetrieveSearchResultRegistrationAttachmentResponseTypeTypeAttachment(byte[] value) {
        return new JAXBElement<byte[]>(_RetrieveSearchResultRegistrationAttachmentResponseTypeTypeAttachment_QNAME, byte[].class, RetrieveSearchResultRegistrationAttachmentResponseTypeType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "PointInTimeDateTime", scope = SearchBySerialNumberSearchCriteriaType.class)
    public JAXBElement<XMLGregorianCalendar> createSearchBySerialNumberSearchCriteriaTypePointInTimeDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SearchBySerialNumberSearchCriteriaTypePointInTimeDateTime_QNAME, XMLGregorianCalendar.class, SearchBySerialNumberSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "VehicleRegistrationNumber", scope = AdditionalVehicleCollateralDescriptionAmendmentsType.class)
    public JAXBElement<String> createAdditionalVehicleCollateralDescriptionAmendmentsTypeVehicleRegistrationNumber(String value) {
        return new JAXBElement<String>(_AdditionalVehicleCollateralDescriptionTypeVehicleRegistrationNumber_QNAME, String.class, AdditionalVehicleCollateralDescriptionAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "VehicleDescriptiveText", scope = AdditionalVehicleCollateralDescriptionAmendmentsType.class)
    public JAXBElement<String> createAdditionalVehicleCollateralDescriptionAmendmentsTypeVehicleDescriptiveText(String value) {
        return new JAXBElement<String>(_AdditionalVehicleCollateralDescriptionTypeVehicleDescriptiveText_QNAME, String.class, AdditionalVehicleCollateralDescriptionAmendmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponseTypeType.Extension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Extension", scope = PingResponseTypeType.class)
    public JAXBElement<PingResponseTypeType.Extension> createPingResponseTypeTypeExtension(PingResponseTypeType.Extension value) {
        return new JAXBElement<PingResponseTypeType.Extension>(_PingResponseTypeTypeExtension_QNAME, PingResponseTypeType.Extension.class, PingResponseTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportExpiryDateTime", scope = RetrieveReportResponseTypeType.class)
    public JAXBElement<XMLGregorianCalendar> createRetrieveReportResponseTypeTypeReportExpiryDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ReportSummaryTypeReportExpiryDateTime_QNAME, XMLGregorianCalendar.class, RetrieveReportResponseTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportFile", scope = RetrieveReportResponseTypeType.class)
    public JAXBElement<byte[]> createRetrieveReportResponseTypeTypeReportFile(byte[] value) {
        return new JAXBElement<byte[]>(_RetrieveReportResponseTypeTypeReportFile_QNAME, byte[].class, RetrieveReportResponseTypeType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ReportFileName", scope = RetrieveReportResponseTypeType.class)
    public JAXBElement<String> createRetrieveReportResponseTypeTypeReportFileName(String value) {
        return new JAXBElement<String>(_ReportSummaryTypeReportFileName_QNAME, String.class, RetrieveReportResponseTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "TransitionalMessage", scope = OrdinalSearchSearchResultDetailType.class)
    public JAXBElement<String> createOrdinalSearchSearchResultDetailTypeTransitionalMessage(String value) {
        return new JAXBElement<String>(_OrdinalSearchSearchResultDetailTypeTransitionalMessage_QNAME, String.class, OrdinalSearchSearchResultDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "PointInTimeDateTime", scope = SearchByGrantorSearchCriteriaType.class)
    public JAXBElement<XMLGregorianCalendar> createSearchByGrantorSearchCriteriaTypePointInTimeDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SearchBySerialNumberSearchCriteriaTypePointInTimeDateTime_QNAME, XMLGregorianCalendar.class, SearchByGrantorSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorIndividualSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorIndividualSearchCriteria", scope = SearchByGrantorSearchCriteriaType.class)
    public JAXBElement<GrantorIndividualSearchCriteriaType> createSearchByGrantorSearchCriteriaTypeGrantorIndividualSearchCriteria(GrantorIndividualSearchCriteriaType value) {
        return new JAXBElement<GrantorIndividualSearchCriteriaType>(_GrantorIndividualSearchCriteria_QNAME, GrantorIndividualSearchCriteriaType.class, SearchByGrantorSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCollateralClassSearchCriteriaTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralClassSearchCriteria", scope = SearchByGrantorSearchCriteriaType.class)
    public JAXBElement<ArrayOfCollateralClassSearchCriteriaTypeType> createSearchByGrantorSearchCriteriaTypeCollateralClassSearchCriteria(ArrayOfCollateralClassSearchCriteriaTypeType value) {
        return new JAXBElement<ArrayOfCollateralClassSearchCriteriaTypeType>(_SearchByGrantorSearchCriteriaTypeCollateralClassSearchCriteria_QNAME, ArrayOfCollateralClassSearchCriteriaTypeType.class, SearchByGrantorSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorOrganisationSearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorOrganisationSearchCriteria", scope = SearchByGrantorSearchCriteriaType.class)
    public JAXBElement<GrantorOrganisationSearchCriteriaType> createSearchByGrantorSearchCriteriaTypeGrantorOrganisationSearchCriteria(GrantorOrganisationSearchCriteriaType value) {
        return new JAXBElement<GrantorOrganisationSearchCriteriaType>(_GrantorOrganisationSearchCriteria_QNAME, GrantorOrganisationSearchCriteriaType.class, SearchByGrantorSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovalDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RemovalDetail", scope = RestrictionDetailType.class)
    public JAXBElement<RemovalDetailType> createRestrictionDetailTypeRemovalDetail(RemovalDetailType value) {
        return new JAXBElement<RemovalDetailType>(_RemovalDetail_QNAME, RemovalDetailType.class, RestrictionDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictedAccessDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RestrictedAccessDetail", scope = RestrictionDetailType.class)
    public JAXBElement<RestrictedAccessDetailType> createRestrictionDetailTypeRestrictedAccessDetail(RestrictedAccessDetailType value) {
        return new JAXBElement<RestrictedAccessDetailType>(_RestrictedAccessDetail_QNAME, RestrictedAccessDetailType.class, RestrictionDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsAccessRestricted", scope = RestrictionDetailType.class)
    public JAXBElement<Boolean> createRestrictionDetailTypeIsAccessRestricted(Boolean value) {
        return new JAXBElement<Boolean>(_OrdinalRegistrationDetailTypeIsAccessRestricted_QNAME, Boolean.class, RestrictionDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyOrganisationWithVerificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Organisation", scope = SecuredPartyWithVerificationType.class)
    public JAXBElement<SecuredPartyOrganisationWithVerificationType> createSecuredPartyWithVerificationTypeOrganisation(SecuredPartyOrganisationWithVerificationType value) {
        return new JAXBElement<SecuredPartyOrganisationWithVerificationType>(_GrantorSearchDetailTypeOrganisation_QNAME, SecuredPartyOrganisationWithVerificationType.class, SecuredPartyWithVerificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EmailAddress", scope = SecuredPartyWithVerificationType.class)
    public JAXBElement<String> createSecuredPartyWithVerificationTypeEmailAddress(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeEmailAddress_QNAME, String.class, SecuredPartyWithVerificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredPartyIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Individual", scope = SecuredPartyWithVerificationType.class)
    public JAXBElement<SecuredPartyIndividualType> createSecuredPartyWithVerificationTypeIndividual(SecuredPartyIndividualType value) {
        return new JAXBElement<SecuredPartyIndividualType>(_GrantorSearchDetailTypeIndividual_QNAME, SecuredPartyIndividualType.class, SecuredPartyWithVerificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NevdisVehicleDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "VehicleDescription", scope = NevdisVehicleDetailType.class)
    public JAXBElement<NevdisVehicleDescriptionType> createNevdisVehicleDetailTypeVehicleDescription(NevdisVehicleDescriptionType value) {
        return new JAXBElement<NevdisVehicleDescriptionType>(_NevdisVehicleDetailTypeVehicleDescription_QNAME, NevdisVehicleDescriptionType.class, NevdisVehicleDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NevdisRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Registration", scope = NevdisVehicleDetailType.class)
    public JAXBElement<NevdisRegistrationType> createNevdisVehicleDetailTypeRegistration(NevdisRegistrationType value) {
        return new JAXBElement<NevdisRegistrationType>(_NevdisVehicleDetailTypeRegistration_QNAME, NevdisRegistrationType.class, NevdisVehicleDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Jurisdiction", scope = NevdisVehicleDetailType.class)
    public JAXBElement<String> createNevdisVehicleDetailTypeJurisdiction(String value) {
        return new JAXBElement<String>(_NevdisVehicleDetailTypeJurisdiction_QNAME, String.class, NevdisVehicleDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationNumberTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumberType", scope = GrantorOrganisationWithVerificationStatusType.class)
    public JAXBElement<OrganisationNumberTypeType> createGrantorOrganisationWithVerificationStatusTypeOrganisationNumberType(OrganisationNumberTypeType value) {
        return new JAXBElement<OrganisationNumberTypeType>(_OrganisationNumberType_QNAME, OrganisationNumberTypeType.class, GrantorOrganisationWithVerificationStatusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierVerificationStatusTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumberVerificationStatus", scope = GrantorOrganisationWithVerificationStatusType.class)
    public JAXBElement<IdentifierVerificationStatusTypeType> createGrantorOrganisationWithVerificationStatusTypeOrganisationNumberVerificationStatus(IdentifierVerificationStatusTypeType value) {
        return new JAXBElement<IdentifierVerificationStatusTypeType>(_SecuredPartyOrganisationWithVerificationTypeOrganisationNumberVerificationStatus_QNAME, IdentifierVerificationStatusTypeType.class, GrantorOrganisationWithVerificationStatusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationName", scope = GrantorOrganisationWithVerificationStatusType.class)
    public JAXBElement<String> createGrantorOrganisationWithVerificationStatusTypeOrganisationName(String value) {
        return new JAXBElement<String>(_SecuredPartyOrganisationTypeOrganisationName_QNAME, String.class, GrantorOrganisationWithVerificationStatusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrganisationNumber", scope = GrantorOrganisationWithVerificationStatusType.class)
    public JAXBElement<String> createGrantorOrganisationWithVerificationStatusTypeOrganisationNumber(String value) {
        return new JAXBElement<String>(_SecuredPartyOrganisationTypeOrganisationNumber_QNAME, String.class, GrantorOrganisationWithVerificationStatusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Addressee", scope = AddressForServiceSearchDetailType.class)
    public JAXBElement<String> createAddressForServiceSearchDetailTypeAddressee(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeAddressee_QNAME, String.class, AddressForServiceSearchDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EmailAddress", scope = AddressForServiceSearchDetailType.class)
    public JAXBElement<String> createAddressForServiceSearchDetailTypeEmailAddress(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeEmailAddress_QNAME, String.class, AddressForServiceSearchDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "PhysicalAddress", scope = AddressForServiceSearchDetailType.class)
    public JAXBElement<AddressType> createAddressForServiceSearchDetailTypePhysicalAddress(AddressType value) {
        return new JAXBElement<AddressType>(_AddressForServiceTypePhysicalAddress_QNAME, AddressType.class, AddressForServiceSearchDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "FaxNumber", scope = AddressForServiceSearchDetailType.class)
    public JAXBElement<String> createAddressForServiceSearchDetailTypeFaxNumber(String value) {
        return new JAXBElement<String>(_AddressForServiceTypeFaxNumber_QNAME, String.class, AddressForServiceSearchDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AircraftNationality", scope = AdditionalAircraftCollateralDescriptionType.class)
    public JAXBElement<String> createAdditionalAircraftCollateralDescriptionTypeAircraftNationality(String value) {
        return new JAXBElement<String>(_AdditionalAircraftCollateralDescriptionAmendmentsTypeAircraftNationality_QNAME, String.class, AdditionalAircraftCollateralDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ManufacturersName", scope = AdditionalAircraftCollateralDescriptionType.class)
    public JAXBElement<String> createAdditionalAircraftCollateralDescriptionTypeManufacturersName(String value) {
        return new JAXBElement<String>(_AdditionalAircraftCollateralDescriptionTypeManufacturersName_QNAME, String.class, AdditionalAircraftCollateralDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AircraftNationalityCodeAndRegistrationMark", scope = AdditionalAircraftCollateralDescriptionType.class)
    public JAXBElement<String> createAdditionalAircraftCollateralDescriptionTypeAircraftNationalityCodeAndRegistrationMark(String value) {
        return new JAXBElement<String>(_AdditionalAircraftCollateralDescriptionAmendmentsTypeAircraftNationalityCodeAndRegistrationMark_QNAME, String.class, AdditionalAircraftCollateralDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ManufacturersModel", scope = AdditionalAircraftCollateralDescriptionType.class)
    public JAXBElement<String> createAdditionalAircraftCollateralDescriptionTypeManufacturersModel(String value) {
        return new JAXBElement<String>(_AdditionalAircraftCollateralDescriptionTypeManufacturersModel_QNAME, String.class, AdditionalAircraftCollateralDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrationDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "MigrationDetail", scope = CollateralRegistrationType.class)
    public JAXBElement<MigrationDetailType> createCollateralRegistrationTypeMigrationDetail(MigrationDetailType value) {
        return new JAXBElement<MigrationDetailType>(_MigrationDetail_QNAME, MigrationDetailType.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AreProceedsClaimed", scope = CollateralRegistrationType.class)
    public JAXBElement<ExtendedBooleanTypeType> createCollateralRegistrationTypeAreProceedsClaimed(ExtendedBooleanTypeType value) {
        return new JAXBElement<ExtendedBooleanTypeType>(_CollateralRegistrationAmendmentsTypeAreProceedsClaimed_QNAME, ExtendedBooleanTypeType.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GivingOfNoticeIdentifier", scope = CollateralRegistrationType.class)
    public JAXBElement<String> createCollateralRegistrationTypeGivingOfNoticeIdentifier(String value) {
        return new JAXBElement<String>(_RetrieveMessagesRequestTypeTypeGivingOfNoticeIdentifier_QNAME, String.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ProceedsClaimedDescription", scope = CollateralRegistrationType.class)
    public JAXBElement<String> createCollateralRegistrationTypeProceedsClaimedDescription(String value) {
        return new JAXBElement<String>(_CollateralRegistrationAmendmentsTypeProceedsClaimedDescription_QNAME, String.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralDescription", scope = CollateralRegistrationType.class)
    public JAXBElement<String> createCollateralRegistrationTypeCollateralDescription(String value) {
        return new JAXBElement<String>(_CollateralRegistrationAmendmentsTypeCollateralDescription_QNAME, String.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsInventory", scope = CollateralRegistrationType.class)
    public JAXBElement<ExtendedBooleanTypeType> createCollateralRegistrationTypeIsInventory(ExtendedBooleanTypeType value) {
        return new JAXBElement<ExtendedBooleanTypeType>(_RegistrationDetailTypeIsInventory_QNAME, ExtendedBooleanTypeType.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "AreAssetsSubjectToControl", scope = CollateralRegistrationType.class)
    public JAXBElement<ExtendedBooleanTypeType> createCollateralRegistrationTypeAreAssetsSubjectToControl(ExtendedBooleanTypeType value) {
        return new JAXBElement<ExtendedBooleanTypeType>(_RegistrationDetailTypeAreAssetsSubjectToControl_QNAME, ExtendedBooleanTypeType.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerialisedCollateralDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SerialNumberDetails", scope = CollateralRegistrationType.class)
    public JAXBElement<SerialisedCollateralDescriptionType> createCollateralRegistrationTypeSerialNumberDetails(SerialisedCollateralDescriptionType value) {
        return new JAXBElement<SerialisedCollateralDescriptionType>(_RegistrationDetailTypeSerialNumberDetails_QNAME, SerialisedCollateralDescriptionType.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsRegistrationEndTimeNotStated", scope = CollateralRegistrationType.class)
    public JAXBElement<Boolean> createCollateralRegistrationTypeIsRegistrationEndTimeNotStated(Boolean value) {
        return new JAXBElement<Boolean>(_CollateralRegistrationAmendmentsTypeIsRegistrationEndTimeNotStated_QNAME, Boolean.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedBooleanTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "IsPMSI", scope = CollateralRegistrationType.class)
    public JAXBElement<ExtendedBooleanTypeType> createCollateralRegistrationTypeIsPMSI(ExtendedBooleanTypeType value) {
        return new JAXBElement<ExtendedBooleanTypeType>(_RegistrationDetailTypeIsPMSI_QNAME, ExtendedBooleanTypeType.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationEndTime", scope = CollateralRegistrationType.class)
    public JAXBElement<XMLGregorianCalendar> createCollateralRegistrationTypeRegistrationEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictedAccessDetailTypeRegistrationEndTime_QNAME, XMLGregorianCalendar.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EarlierRegistrationNumber", scope = CollateralRegistrationType.class)
    public JAXBElement<String> createCollateralRegistrationTypeEarlierRegistrationNumber(String value) {
        return new JAXBElement<String>(_RegistrationDetailTypeEarlierRegistrationNumber_QNAME, String.class, CollateralRegistrationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupAccessCode", scope = RetrieveRegistrationAttachmentRequestTypeType.class)
    public JAXBElement<String> createRetrieveRegistrationAttachmentRequestTypeTypeSecuredPartyGroupAccessCode(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupAccessCode_QNAME, String.class, RetrieveRegistrationAttachmentRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RegistrationToken", scope = RetrieveRegistrationAttachmentRequestTypeType.class)
    public JAXBElement<String> createRetrieveRegistrationAttachmentRequestTypeTypeRegistrationToken(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeRegistrationToken_QNAME, String.class, RetrieveRegistrationAttachmentRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SecuredPartyGroupNumber", scope = RetrieveRegistrationAttachmentRequestTypeType.class)
    public JAXBElement<String> createRetrieveRegistrationAttachmentRequestTypeTypeSecuredPartyGroupNumber(String value) {
        return new JAXBElement<String>(_DischargeRegistrationRequestTypeTypeSecuredPartyGroupNumber_QNAME, String.class, RetrieveRegistrationAttachmentRequestTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "RemovalReasonFurtherDetails", scope = RemovalDetailType.class)
    public JAXBElement<String> createRemovalDetailTypeRemovalReasonFurtherDetails(String value) {
        return new JAXBElement<String>(_RemovalDetailTypeRemovalReasonFurtherDetails_QNAME, String.class, RemovalDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorAndEventDateRangeSearchResult", scope = SearchResultType.class)
    public JAXBElement<SearchByGrantorSearchResultType> createSearchResultTypeSearchByGrantorAndEventDateRangeSearchResult(SearchByGrantorSearchResultType value) {
        return new JAXBElement<SearchByGrantorSearchResultType>(_SearchResultTypeSearchByGrantorAndEventDateRangeSearchResult_QNAME, SearchByGrantorSearchResultType.class, SearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySerialNumberSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchBySerialNumberSearchResult", scope = SearchResultType.class)
    public JAXBElement<SearchBySerialNumberSearchResultType> createSearchResultTypeSearchBySerialNumberSearchResult(SearchBySerialNumberSearchResultType value) {
        return new JAXBElement<SearchBySerialNumberSearchResultType>(_SearchBySerialNumberSearchResult_QNAME, SearchBySerialNumberSearchResultType.class, SearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinalSearchSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "OrdinalSearchSearchResult", scope = SearchResultType.class)
    public JAXBElement<OrdinalSearchSearchResultType> createSearchResultTypeOrdinalSearchSearchResult(OrdinalSearchSearchResultType value) {
        return new JAXBElement<OrdinalSearchSearchResultType>(_OrdinalSearchSearchResult_QNAME, OrdinalSearchSearchResultType.class, SearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByRegistrationNumberSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByRegistrationNumberSearchResult", scope = SearchResultType.class)
    public JAXBElement<SearchByRegistrationNumberSearchResultType> createSearchResultTypeSearchByRegistrationNumberSearchResult(SearchByRegistrationNumberSearchResultType value) {
        return new JAXBElement<SearchByRegistrationNumberSearchResultType>(_SearchByRegistrationNumberSearchResult_QNAME, SearchByRegistrationNumberSearchResultType.class, SearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByGrantorSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchByGrantorSearchResult", scope = SearchResultType.class)
    public JAXBElement<SearchByGrantorSearchResultType> createSearchResultTypeSearchByGrantorSearchResult(SearchByGrantorSearchResultType value) {
        return new JAXBElement<SearchByGrantorSearchResultType>(_SearchByGrantorSearchResult_QNAME, SearchByGrantorSearchResultType.class, SearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorOrganisationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Organisation", scope = RemovedGrantorType.class)
    public JAXBElement<GrantorOrganisationType> createRemovedGrantorTypeOrganisation(GrantorOrganisationType value) {
        return new JAXBElement<GrantorOrganisationType>(_GrantorSearchDetailTypeOrganisation_QNAME, GrantorOrganisationType.class, RemovedGrantorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Individual", scope = RemovedGrantorType.class)
    public JAXBElement<GrantorIndividualType> createRemovedGrantorTypeIndividual(GrantorIndividualType value) {
        return new JAXBElement<GrantorIndividualType>(_GrantorSearchDetailTypeIndividual_QNAME, GrantorIndividualType.class, RemovedGrantorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "StartTimeYear", scope = SearchByGrantorFilterCriteriaType.class)
    public JAXBElement<Integer> createSearchByGrantorFilterCriteriaTypeStartTimeYear(Integer value) {
        return new JAXBElement<Integer>(_SearchByGrantorFilterCriteriaTypeStartTimeYear_QNAME, Integer.class, SearchByGrantorFilterCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCollateralTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralTypeFilterCriteria", scope = SearchByGrantorFilterCriteriaType.class)
    public JAXBElement<ArrayOfCollateralTypeType> createSearchByGrantorFilterCriteriaTypeCollateralTypeFilterCriteria(ArrayOfCollateralTypeType value) {
        return new JAXBElement<ArrayOfCollateralTypeType>(_SearchByGrantorFilterCriteriaTypeCollateralTypeFilterCriteria_QNAME, ArrayOfCollateralTypeType.class, SearchByGrantorFilterCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCollateralClassFilterCriteriaTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "CollateralClassFilterCriteria", scope = SearchByGrantorFilterCriteriaType.class)
    public JAXBElement<ArrayOfCollateralClassFilterCriteriaTypeType> createSearchByGrantorFilterCriteriaTypeCollateralClassFilterCriteria(ArrayOfCollateralClassFilterCriteriaTypeType value) {
        return new JAXBElement<ArrayOfCollateralClassFilterCriteriaTypeType>(_SearchByGrantorFilterCriteriaTypeCollateralClassFilterCriteria_QNAME, ArrayOfCollateralClassFilterCriteriaTypeType.class, SearchByGrantorFilterCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "LastChangeTimeYear", scope = SearchByGrantorFilterCriteriaType.class)
    public JAXBElement<Integer> createSearchByGrantorFilterCriteriaTypeLastChangeTimeYear(Integer value) {
        return new JAXBElement<Integer>(_SearchByGrantorFilterCriteriaTypeLastChangeTimeYear_QNAME, Integer.class, SearchByGrantorFilterCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "VehicleType", scope = NevdisVehicleDescriptionType.class)
    public JAXBElement<String> createNevdisVehicleDescriptionTypeVehicleType(String value) {
        return new JAXBElement<String>(_NevdisVehicleDescriptionTypeVehicleType_QNAME, String.class, NevdisVehicleDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ManufactureYear", scope = NevdisVehicleDescriptionType.class)
    public JAXBElement<String> createNevdisVehicleDescriptionTypeManufactureYear(String value) {
        return new JAXBElement<String>(_NevdisVehicleDescriptionTypeManufactureYear_QNAME, String.class, NevdisVehicleDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Make", scope = NevdisVehicleDescriptionType.class)
    public JAXBElement<String> createNevdisVehicleDescriptionTypeMake(String value) {
        return new JAXBElement<String>(_NevdisVehicleDescriptionTypeMake_QNAME, String.class, NevdisVehicleDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Model", scope = NevdisVehicleDescriptionType.class)
    public JAXBElement<String> createNevdisVehicleDescriptionTypeModel(String value) {
        return new JAXBElement<String>(_NevdisVehicleDescriptionTypeModel_QNAME, String.class, NevdisVehicleDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "EngineNumber", scope = NevdisVehicleDescriptionType.class)
    public JAXBElement<String> createNevdisVehicleDescriptionTypeEngineNumber(String value) {
        return new JAXBElement<String>(_NevdisVehicleDescriptionTypeEngineNumber_QNAME, String.class, NevdisVehicleDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Colour", scope = NevdisVehicleDescriptionType.class)
    public JAXBElement<String> createNevdisVehicleDescriptionTypeColour(String value) {
        return new JAXBElement<String>(_NevdisVehicleDescriptionTypeColour_QNAME, String.class, NevdisVehicleDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "BodyType", scope = NevdisVehicleDescriptionType.class)
    public JAXBElement<String> createNevdisVehicleDescriptionTypeBodyType(String value) {
        return new JAXBElement<String>(_NevdisVehicleDescriptionTypeBodyType_QNAME, String.class, NevdisVehicleDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "ComplianceYearMonth", scope = NevdisVehicleDescriptionType.class)
    public JAXBElement<String> createNevdisVehicleDescriptionTypeComplianceYearMonth(String value) {
        return new JAXBElement<String>(_NevdisVehicleDescriptionTypeComplianceYearMonth_QNAME, String.class, NevdisVehicleDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "TransitionalPeriodMessage", scope = SearchByGrantorSearchResultType.class)
    public JAXBElement<String> createSearchByGrantorSearchResultTypeTransitionalPeriodMessage(String value) {
        return new JAXBElement<String>(_SearchBySerialNumberSearchResultTypeTransitionalPeriodMessage_QNAME, String.class, SearchByGrantorSearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantorOrganisationWithVerificationStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "GrantorOrganisationSearchCriteriaVerificationDetail", scope = SearchByGrantorSearchResultType.class)
    public JAXBElement<GrantorOrganisationWithVerificationStatusType> createSearchByGrantorSearchResultTypeGrantorOrganisationSearchCriteriaVerificationDetail(GrantorOrganisationWithVerificationStatusType value) {
        return new JAXBElement<GrantorOrganisationWithVerificationStatusType>(_SearchByGrantorSearchResultTypeGrantorOrganisationSearchCriteriaVerificationDetail_QNAME, GrantorOrganisationWithVerificationStatusType.class, SearchByGrantorSearchResultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "Attachments", scope = RetrieveSearchCertificateResponseTypeType.class)
    public JAXBElement<ArrayOfAttachmentDetailType> createRetrieveSearchCertificateResponseTypeTypeAttachments(ArrayOfAttachmentDetailType value) {
        return new JAXBElement<ArrayOfAttachmentDetailType>(_RegistrationDetailTypeAttachments_QNAME, ArrayOfAttachmentDetailType.class, RetrieveSearchCertificateResponseTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchCertificateFile", scope = RetrieveSearchCertificateResponseTypeType.class)
    public JAXBElement<byte[]> createRetrieveSearchCertificateResponseTypeTypeSearchCertificateFile(byte[] value) {
        return new JAXBElement<byte[]>(_RetrieveSearchCertificateResponseTypeTypeSearchCertificateFile_QNAME, byte[].class, RetrieveSearchCertificateResponseTypeType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ppsr.gov.au/2011/04/data", name = "SearchCertificateFileName", scope = RetrieveSearchCertificateResponseTypeType.class)
    public JAXBElement<String> createRetrieveSearchCertificateResponseTypeTypeSearchCertificateFileName(String value) {
        return new JAXBElement<String>(_RetrieveSearchCertificateResponseTypeTypeSearchCertificateFileName_QNAME, String.class, RetrieveSearchCertificateResponseTypeType.class, value);
    }

}
