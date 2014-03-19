
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemovalDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemovalDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemovalReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RemovalReasonFurtherDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovalDetail", propOrder = {
    "removalReasonDescription",
    "removalReasonFurtherDetails"
})
public class RemovalDetailType {

    @XmlElement(name = "RemovalReasonDescription", required = true, nillable = true)
    protected String removalReasonDescription;
    @XmlElementRef(name = "RemovalReasonFurtherDetails", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> removalReasonFurtherDetails;

    /**
     * Gets the value of the removalReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovalReasonDescription() {
        return removalReasonDescription;
    }

    /**
     * Sets the value of the removalReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovalReasonDescription(String value) {
        this.removalReasonDescription = value;
    }

    /**
     * Gets the value of the removalReasonFurtherDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemovalReasonFurtherDetails() {
        return removalReasonFurtherDetails;
    }

    /**
     * Sets the value of the removalReasonFurtherDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemovalReasonFurtherDetails(JAXBElement<String> value) {
        this.removalReasonFurtherDetails = ((JAXBElement<String> ) value);
    }

}
