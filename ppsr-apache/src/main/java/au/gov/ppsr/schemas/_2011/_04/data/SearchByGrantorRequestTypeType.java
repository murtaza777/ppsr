
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByGrantorRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByGrantorRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="AcceptGrantorIndividualSearchDeclaration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SearchCriteria" type="{http://schemas.ppsr.gov.au/2011/04/data}SearchByGrantorSearchCriteria"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByGrantorRequestType", propOrder = {
    "acceptGrantorIndividualSearchDeclaration",
    "searchCriteria"
})
public class SearchByGrantorRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "AcceptGrantorIndividualSearchDeclaration")
    protected Boolean acceptGrantorIndividualSearchDeclaration;
    @XmlElement(name = "SearchCriteria", required = true, nillable = true)
    protected SearchByGrantorSearchCriteriaType searchCriteria;

    /**
     * Gets the value of the acceptGrantorIndividualSearchDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptGrantorIndividualSearchDeclaration() {
        return acceptGrantorIndividualSearchDeclaration;
    }

    /**
     * Sets the value of the acceptGrantorIndividualSearchDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptGrantorIndividualSearchDeclaration(Boolean value) {
        this.acceptGrantorIndividualSearchDeclaration = value;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByGrantorSearchCriteriaType }
     *     
     */
    public SearchByGrantorSearchCriteriaType getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByGrantorSearchCriteriaType }
     *     
     */
    public void setSearchCriteria(SearchByGrantorSearchCriteriaType value) {
        this.searchCriteria = value;
    }

}
