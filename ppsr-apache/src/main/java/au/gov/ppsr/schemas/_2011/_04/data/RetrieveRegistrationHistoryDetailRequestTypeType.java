
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveRegistrationHistoryDetailRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveRegistrationHistoryDetailRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="ChangeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SearchNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveRegistrationHistoryDetailRequestType", propOrder = {
    "changeNumber",
    "registrationNumber",
    "searchNumber"
})
public class RetrieveRegistrationHistoryDetailRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "ChangeNumber")
    protected long changeNumber;
    @XmlElement(name = "RegistrationNumber", required = true, nillable = true)
    protected String registrationNumber;
    @XmlElement(name = "SearchNumber", required = true, nillable = true)
    protected String searchNumber;

    /**
     * Gets the value of the changeNumber property.
     * 
     */
    public long getChangeNumber() {
        return changeNumber;
    }

    /**
     * Sets the value of the changeNumber property.
     * 
     */
    public void setChangeNumber(long value) {
        this.changeNumber = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the searchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchNumber() {
        return searchNumber;
    }

    /**
     * Sets the value of the searchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchNumber(String value) {
        this.searchNumber = value;
    }

}
