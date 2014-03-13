
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrIncorrectEnvironmentFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrIncorrectEnvironmentFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="ReceivedByEnvironment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TargetEnvironment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrIncorrectEnvironmentFaultDetail", propOrder = {
    "receivedByEnvironment",
    "targetEnvironment"
})
public class PpsrIncorrectEnvironmentFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElement(name = "ReceivedByEnvironment", required = true, nillable = true)
    protected String receivedByEnvironment;
    @XmlElement(name = "TargetEnvironment", required = true, nillable = true)
    protected String targetEnvironment;

    /**
     * Gets the value of the receivedByEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedByEnvironment() {
        return receivedByEnvironment;
    }

    /**
     * Sets the value of the receivedByEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedByEnvironment(String value) {
        this.receivedByEnvironment = value;
    }

    /**
     * Gets the value of the targetEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEnvironment() {
        return targetEnvironment;
    }

    /**
     * Sets the value of the targetEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEnvironment(String value) {
        this.targetEnvironment = value;
    }

}
