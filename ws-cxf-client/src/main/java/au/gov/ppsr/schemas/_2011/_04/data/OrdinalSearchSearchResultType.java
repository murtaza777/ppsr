
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrdinalSearchSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdinalSearchSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchResultDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}OrdinalSearchSearchResultDetail"/>
 *         &lt;element name="SearchResultRetrievedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdinalSearchSearchResult", propOrder = {
    "searchResultDetail",
    "searchResultRetrievedDateTime"
})
public class OrdinalSearchSearchResultType {

    @XmlElement(name = "SearchResultDetail", required = true, nillable = true)
    protected OrdinalSearchSearchResultDetailType searchResultDetail;
    @XmlElement(name = "SearchResultRetrievedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchResultRetrievedDateTime;

    /**
     * Gets the value of the searchResultDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrdinalSearchSearchResultDetailType }
     *     
     */
    public OrdinalSearchSearchResultDetailType getSearchResultDetail() {
        return searchResultDetail;
    }

    /**
     * Sets the value of the searchResultDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdinalSearchSearchResultDetailType }
     *     
     */
    public void setSearchResultDetail(OrdinalSearchSearchResultDetailType value) {
        this.searchResultDetail = value;
    }

    /**
     * Gets the value of the searchResultRetrievedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchResultRetrievedDateTime() {
        return searchResultRetrievedDateTime;
    }

    /**
     * Sets the value of the searchResultRetrievedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchResultRetrievedDateTime(XMLGregorianCalendar value) {
        this.searchResultRetrievedDateTime = value;
    }

}
