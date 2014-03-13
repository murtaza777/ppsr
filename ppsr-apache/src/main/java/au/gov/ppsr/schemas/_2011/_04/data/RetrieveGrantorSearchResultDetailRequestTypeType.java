
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveGrantorSearchResultDetailRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveGrantorSearchResultDetailRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="FilterNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaximumNumberOfRegistrationsToReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SearchNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartResultSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveGrantorSearchResultDetailRequestType", propOrder = {
    "filterNumber",
    "maximumNumberOfRegistrationsToReturn",
    "searchNumber",
    "startResultSequenceNumber"
})
public class RetrieveGrantorSearchResultDetailRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "FilterNumber")
    protected int filterNumber;
    @XmlElement(name = "MaximumNumberOfRegistrationsToReturn")
    protected int maximumNumberOfRegistrationsToReturn;
    @XmlElement(name = "SearchNumber", required = true, nillable = true)
    protected String searchNumber;
    @XmlElement(name = "StartResultSequenceNumber")
    protected int startResultSequenceNumber;

    /**
     * Gets the value of the filterNumber property.
     * 
     */
    public int getFilterNumber() {
        return filterNumber;
    }

    /**
     * Sets the value of the filterNumber property.
     * 
     */
    public void setFilterNumber(int value) {
        this.filterNumber = value;
    }

    /**
     * Gets the value of the maximumNumberOfRegistrationsToReturn property.
     * 
     */
    public int getMaximumNumberOfRegistrationsToReturn() {
        return maximumNumberOfRegistrationsToReturn;
    }

    /**
     * Sets the value of the maximumNumberOfRegistrationsToReturn property.
     * 
     */
    public void setMaximumNumberOfRegistrationsToReturn(int value) {
        this.maximumNumberOfRegistrationsToReturn = value;
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

    /**
     * Gets the value of the startResultSequenceNumber property.
     * 
     */
    public int getStartResultSequenceNumber() {
        return startResultSequenceNumber;
    }

    /**
     * Sets the value of the startResultSequenceNumber property.
     * 
     */
    public void setStartResultSequenceNumber(int value) {
        this.startResultSequenceNumber = value;
    }

}
