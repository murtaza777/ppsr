
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
 * <p>Java class for RetrieveGrantorSearchResultDetailResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveGrantorSearchResultDetailResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResultDetails" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfResultDetail" minOccurs="0"/>
 *         &lt;element name="SearchResultDetailRetrievedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveGrantorSearchResultDetailResponseType", propOrder = {
    "resultCount",
    "resultDetails",
    "searchResultDetailRetrievedDateTime"
})
public class RetrieveGrantorSearchResultDetailResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "ResultCount")
    protected int resultCount;
    @XmlElementRef(name = "ResultDetails", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfResultDetailType> resultDetails;
    @XmlElement(name = "SearchResultDetailRetrievedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchResultDetailRetrievedDateTime;

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
     * Gets the value of the resultDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResultDetailType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResultDetailType> getResultDetails() {
        return resultDetails;
    }

    /**
     * Sets the value of the resultDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResultDetailType }{@code >}
     *     
     */
    public void setResultDetails(JAXBElement<ArrayOfResultDetailType> value) {
        this.resultDetails = ((JAXBElement<ArrayOfResultDetailType> ) value);
    }

    /**
     * Gets the value of the searchResultDetailRetrievedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchResultDetailRetrievedDateTime() {
        return searchResultDetailRetrievedDateTime;
    }

    /**
     * Sets the value of the searchResultDetailRetrievedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchResultDetailRetrievedDateTime(XMLGregorianCalendar value) {
        this.searchResultDetailRetrievedDateTime = value;
    }

}
