
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FilterSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilterExecutedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FilterNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SearchNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterSummary", propOrder = {
    "filterExecutedDateTime",
    "filterNumber",
    "resultCount",
    "searchNumber"
})
public class FilterSummaryType {

    @XmlElement(name = "FilterExecutedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filterExecutedDateTime;
    @XmlElement(name = "FilterNumber")
    protected int filterNumber;
    @XmlElement(name = "ResultCount")
    protected int resultCount;
    @XmlElement(name = "SearchNumber", required = true, nillable = true)
    protected String searchNumber;

    /**
     * Gets the value of the filterExecutedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterExecutedDateTime() {
        return filterExecutedDateTime;
    }

    /**
     * Sets the value of the filterExecutedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterExecutedDateTime(XMLGregorianCalendar value) {
        this.filterExecutedDateTime = value;
    }

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
     * Gets the value of the resultCount property.
     * 
     */
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(int value) {
        this.resultCount = value;
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
