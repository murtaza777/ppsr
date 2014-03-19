
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchBySerialNumberRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBySerialNumberRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="SearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchBySerialNumberSearchCriteria"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBySerialNumberRequestType", propOrder = {
    "searchCriteria"
})
public class SearchBySerialNumberRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "SearchCriteria", required = true, nillable = true)
    protected SearchBySerialNumberSearchCriteriaType searchCriteria;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBySerialNumberSearchCriteriaType }
     *     
     */
    public SearchBySerialNumberSearchCriteriaType getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBySerialNumberSearchCriteriaType }
     *     
     */
    public void setSearchCriteria(SearchBySerialNumberSearchCriteriaType value) {
        this.searchCriteria = value;
    }

}
