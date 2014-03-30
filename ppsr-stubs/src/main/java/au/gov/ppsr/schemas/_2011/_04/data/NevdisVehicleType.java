
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NevdisVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NevdisVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StolenDetails" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfStolenDetail" minOccurs="0"/>
 *         &lt;element name="VehicleDetail" type="{http://schemas.ppsr.gov.au/2011/04/data}NevdisVehicleDetail"/>
 *         &lt;element name="VehicleIdentifier" type="{http://schemas.ppsr.gov.au/2011/04/data}NevdisVehicleIdentifier"/>
 *         &lt;element name="WrittenOffDetails" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfWrittenOffDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NevdisVehicle", propOrder = {
    "stolenDetails",
    "vehicleDetail",
    "vehicleIdentifier",
    "writtenOffDetails"
})
public class NevdisVehicleType {

    @XmlElementRef(name = "StolenDetails", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStolenDetailType> stolenDetails;
    @XmlElement(name = "VehicleDetail", required = true, nillable = true)
    protected NevdisVehicleDetailType vehicleDetail;
    @XmlElement(name = "VehicleIdentifier", required = true, nillable = true)
    protected NevdisVehicleIdentifierType vehicleIdentifier;
    @XmlElementRef(name = "WrittenOffDetails", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfWrittenOffDetailType> writtenOffDetails;

    /**
     * Gets the value of the stolenDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStolenDetailType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStolenDetailType> getStolenDetails() {
        return stolenDetails;
    }

    /**
     * Sets the value of the stolenDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStolenDetailType }{@code >}
     *     
     */
    public void setStolenDetails(JAXBElement<ArrayOfStolenDetailType> value) {
        this.stolenDetails = ((JAXBElement<ArrayOfStolenDetailType> ) value);
    }

    /**
     * Gets the value of the vehicleDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NevdisVehicleDetailType }
     *     
     */
    public NevdisVehicleDetailType getVehicleDetail() {
        return vehicleDetail;
    }

    /**
     * Sets the value of the vehicleDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NevdisVehicleDetailType }
     *     
     */
    public void setVehicleDetail(NevdisVehicleDetailType value) {
        this.vehicleDetail = value;
    }

    /**
     * Gets the value of the vehicleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link NevdisVehicleIdentifierType }
     *     
     */
    public NevdisVehicleIdentifierType getVehicleIdentifier() {
        return vehicleIdentifier;
    }

    /**
     * Sets the value of the vehicleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link NevdisVehicleIdentifierType }
     *     
     */
    public void setVehicleIdentifier(NevdisVehicleIdentifierType value) {
        this.vehicleIdentifier = value;
    }

    /**
     * Gets the value of the writtenOffDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWrittenOffDetailType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWrittenOffDetailType> getWrittenOffDetails() {
        return writtenOffDetails;
    }

    /**
     * Sets the value of the writtenOffDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWrittenOffDetailType }{@code >}
     *     
     */
    public void setWrittenOffDetails(JAXBElement<ArrayOfWrittenOffDetailType> value) {
        this.writtenOffDetails = ((JAXBElement<ArrayOfWrittenOffDetailType> ) value);
    }

}
