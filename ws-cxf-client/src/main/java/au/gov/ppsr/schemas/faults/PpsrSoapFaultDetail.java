
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrSoapFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrSoapFaultDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequestProcessedByEnvironment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrSoapFaultDetail", propOrder = {
    "errorNumber",
    "errorReferenceId",
    "requestProcessedByEnvironment"
})
@XmlSeeAlso({
    PpsrCollateralRegistrationReissueVerificationStatementFaultDetail.class,
    PpsrCollateralRegistrationAccessFaultDetail.class,
    PpsrSecuredPartyGroupUpdateValidationFaultDetail.class,
    PpsrInvalidDateTimeFormatFaultDetail.class,
    PpsrCollateralRegistrationCreateValidationFaultDetail.class,
    PpsrCollateralRegistrationRetrieveFaultDetail.class,
    PpsrSecuredPartyGroupUpdateFaultDetail.class,
    PpsrInvalidB2GRequestMessageFaultDetail.class,
    PpsrCollateralRegistrationSearchValidationFaultDetail.class,
    PpsrCollateralRegistrationSearchOrdinalSearchValidationFaultDetail.class,
    PpsrCollateralRegistrationResetRegistrationTokenFaultDetail.class,
    PpsrCollateralRegistrationRetrieveAttachmentFaultDetail.class,
    PpsrIncorrectEnvironmentFaultDetail.class,
    PpsrCollateralRegistrationDischargeFaultDetail.class,
    PpsrCollateralRegistrationAmendFaultDetail.class,
    PpsrReportFaultDetail.class,
    PpsrCollateralRegistrationTransferSingleFaultDetail.class,
    PpsrB2GMailboxRetrieveMessagesValidationFaultDetail.class,
    PpsrCollateralRegistrationUploadAttachmentFaultDetail.class,
    PpsrCollateralRegistrationAmendValidationFaultDetail.class,
    PpsrB2GMailboxRetrieveMessagePdfFaultDetail.class,
    PpsrCollateralRegistrationTransferAllFaultDetail.class,
    PpsrB2GMailboxMessageAccessFaultDetail.class,
    PpsrStringLengthExceededFaultDetail.class,
    PpsrReportValidationFaultDetail.class,
    PpsrSecuredPartyGroupCreateValidationFaultDetail.class,
    PpsrRegisterOperationsChangeB2GPasswordValidationFaultDetail.class,
    PpsrSecuredPartyGroupChangeAccessCodeValidationFaultDetail.class,
    PpsrCollateralRegistrationSearchFaultDetail.class,
    PpsrUnauthorisedFaultDetail.class,
    PpsrSecuredPartyGroupAccessFaultDetail.class
})
public class PpsrSoapFaultDetail {

    @XmlElement(name = "ErrorNumber", required = true, nillable = true)
    protected String errorNumber;
    @XmlElement(name = "ErrorReferenceId", required = true, nillable = true)
    protected String errorReferenceId;
    @XmlElement(name = "RequestProcessedByEnvironment", required = true, nillable = true)
    protected String requestProcessedByEnvironment;

    /**
     * Gets the value of the errorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorNumber() {
        return errorNumber;
    }

    /**
     * Sets the value of the errorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorNumber(String value) {
        this.errorNumber = value;
    }

    /**
     * Gets the value of the errorReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorReferenceId() {
        return errorReferenceId;
    }

    /**
     * Sets the value of the errorReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorReferenceId(String value) {
        this.errorReferenceId = value;
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

}
