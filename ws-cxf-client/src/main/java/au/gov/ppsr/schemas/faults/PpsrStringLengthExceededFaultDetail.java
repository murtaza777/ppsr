
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrStringLengthExceededFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrStringLengthExceededFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="ElementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElementValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAllowedLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrStringLengthExceededFaultDetail", propOrder = {
    "elementName",
    "elementValue",
    "maxAllowedLength"
})
public class PpsrStringLengthExceededFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElementRef(name = "ElementName", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<String> elementName;
    @XmlElementRef(name = "ElementValue", namespace = "http://schemas.ppsr.gov.au/faults", type = JAXBElement.class)
    protected JAXBElement<String> elementValue;
    @XmlElement(name = "MaxAllowedLength")
    protected Integer maxAllowedLength;

    /**
     * Gets the value of the elementName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setElementName(JAXBElement<String> value) {
        this.elementName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the elementValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getElementValue() {
        return elementValue;
    }

    /**
     * Sets the value of the elementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setElementValue(JAXBElement<String> value) {
        this.elementValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the maxAllowedLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAllowedLength() {
        return maxAllowedLength;
    }

    /**
     * Sets the value of the maxAllowedLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAllowedLength(Integer value) {
        this.maxAllowedLength = value;
    }

}
