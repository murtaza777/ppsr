
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchByRegistrationNumberSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByRegistrationNumberSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}ResultDetail" minOccurs="0"/>
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
@XmlType(name = "SearchByRegistrationNumberSearchResult", propOrder = {
    "resultDetail",
    "searchResultRetrievedDateTime"
})
public class SearchByRegistrationNumberSearchResultType {

    @XmlElementRef(name = "ResultDetail", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ResultDetailType> resultDetail;
    @XmlElement(name = "SearchResultRetrievedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchResultRetrievedDateTime;

    /**
     * Gets the value of the resultDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResultDetailType }{@code >}
     *     
     */
    public JAXBElement<ResultDetailType> getResultDetail() {
        return resultDetail;
    }

    /**
     * Sets the value of the resultDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResultDetailType }{@code >}
     *     
     */
    public void setResultDetail(JAXBElement<ResultDetailType> value) {
        this.resultDetail = ((JAXBElement<ResultDetailType> ) value);
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
