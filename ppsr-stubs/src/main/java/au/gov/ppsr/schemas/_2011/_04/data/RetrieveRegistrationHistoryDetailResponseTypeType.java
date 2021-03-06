
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveRegistrationHistoryDetailResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveRegistrationHistoryDetailResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResultDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}ResultDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveRegistrationHistoryDetailResponseType", propOrder = {
    "resultDetail"
})
public class RetrieveRegistrationHistoryDetailResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "ResultDetail", required = true, nillable = true)
    protected ResultDetailType resultDetail;

    /**
     * Gets the value of the resultDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ResultDetailType }
     *     
     */
    public ResultDetailType getResultDetail() {
        return resultDetail;
    }

    /**
     * Sets the value of the resultDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDetailType }
     *     
     */
    public void setResultDetail(ResultDetailType value) {
        this.resultDetail = value;
    }

}
