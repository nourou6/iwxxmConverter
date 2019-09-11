//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package schemabindings21._int.icao.iwxxm._2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeRunwayStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeRunwayStateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="runway" type="{http://icao.int/iwxxm/2.1}RunwayDirectionPropertyType" minOccurs="0"/>
 *         &lt;element name="depositType" type="{http://icao.int/iwxxm/2.1}RunwayDepositsType" minOccurs="0"/>
 *         &lt;element name="contamination" type="{http://icao.int/iwxxm/2.1}RunwayContaminationType" minOccurs="0"/>
 *         &lt;element name="depthOfDeposit" type="{http://icao.int/iwxxm/2.1}DistanceWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="estimatedSurfaceFrictionOrBrakingAction" type="{http://icao.int/iwxxm/2.1}RunwayFrictionCoefficientType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="allRunways" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cleared" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="snowClosure" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeRunwayStateType", propOrder = {
    "runway",
    "depositType",
    "contamination",
    "depthOfDeposit",
    "estimatedSurfaceFrictionOrBrakingAction",
    "extension"
})
public class AerodromeRunwayStateType {

    protected RunwayDirectionPropertyType runway;
    protected RunwayDepositsType depositType;
    protected RunwayContaminationType contamination;
    @XmlElementRef(name = "depthOfDeposit", namespace = "http://icao.int/iwxxm/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceWithNilReasonType> depthOfDeposit;
    protected RunwayFrictionCoefficientType estimatedSurfaceFrictionOrBrakingAction;
    protected List<Object> extension;
    @XmlAttribute(name = "allRunways")
    protected Boolean allRunways;
    @XmlAttribute(name = "cleared")
    protected Boolean cleared;
    @XmlAttribute(name = "snowClosure")
    protected Boolean snowClosure;

    /**
     * Gets the value of the runway property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayDirectionPropertyType }
     *     
     */
    public RunwayDirectionPropertyType getRunway() {
        return runway;
    }

    /**
     * Sets the value of the runway property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDirectionPropertyType }
     *     
     */
    public void setRunway(RunwayDirectionPropertyType value) {
        this.runway = value;
    }

    public boolean isSetRunway() {
        return (this.runway!= null);
    }

    /**
     * Gets the value of the depositType property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayDepositsType }
     *     
     */
    public RunwayDepositsType getDepositType() {
        return depositType;
    }

    /**
     * Sets the value of the depositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDepositsType }
     *     
     */
    public void setDepositType(RunwayDepositsType value) {
        this.depositType = value;
    }

    public boolean isSetDepositType() {
        return (this.depositType!= null);
    }

    /**
     * Gets the value of the contamination property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayContaminationType }
     *     
     */
    public RunwayContaminationType getContamination() {
        return contamination;
    }

    /**
     * Sets the value of the contamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayContaminationType }
     *     
     */
    public void setContamination(RunwayContaminationType value) {
        this.contamination = value;
    }

    public boolean isSetContamination() {
        return (this.contamination!= null);
    }

    /**
     * Gets the value of the depthOfDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<DistanceWithNilReasonType> getDepthOfDeposit() {
        return depthOfDeposit;
    }

    /**
     * Sets the value of the depthOfDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceWithNilReasonType }{@code >}
     *     
     */
    public void setDepthOfDeposit(JAXBElement<DistanceWithNilReasonType> value) {
        this.depthOfDeposit = value;
    }

    public boolean isSetDepthOfDeposit() {
        return (this.depthOfDeposit!= null);
    }

    /**
     * Gets the value of the estimatedSurfaceFrictionOrBrakingAction property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayFrictionCoefficientType }
     *     
     */
    public RunwayFrictionCoefficientType getEstimatedSurfaceFrictionOrBrakingAction() {
        return estimatedSurfaceFrictionOrBrakingAction;
    }

    /**
     * Sets the value of the estimatedSurfaceFrictionOrBrakingAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayFrictionCoefficientType }
     *     
     */
    public void setEstimatedSurfaceFrictionOrBrakingAction(RunwayFrictionCoefficientType value) {
        this.estimatedSurfaceFrictionOrBrakingAction = value;
    }

    public boolean isSetEstimatedSurfaceFrictionOrBrakingAction() {
        return (this.estimatedSurfaceFrictionOrBrakingAction!= null);
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    /**
     * Gets the value of the allRunways property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllRunways() {
        return allRunways;
    }

    /**
     * Sets the value of the allRunways property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllRunways(boolean value) {
        this.allRunways = value;
    }

    public boolean isSetAllRunways() {
        return (this.allRunways!= null);
    }

    public void unsetAllRunways() {
        this.allRunways = null;
    }

    /**
     * Gets the value of the cleared property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCleared() {
        return cleared;
    }

    /**
     * Sets the value of the cleared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCleared(boolean value) {
        this.cleared = value;
    }

    public boolean isSetCleared() {
        return (this.cleared!= null);
    }

    public void unsetCleared() {
        this.cleared = null;
    }

    /**
     * Gets the value of the snowClosure property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSnowClosure() {
        return snowClosure;
    }

    /**
     * Sets the value of the snowClosure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnowClosure(boolean value) {
        this.snowClosure = value;
    }

    public boolean isSetSnowClosure() {
        return (this.snowClosure!= null);
    }

    public void unsetSnowClosure() {
        this.snowClosure = null;
    }

}