//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.21 at 12:25:11 nachm. MESZ 
//

package de.fhg.iais.roberta.blockly.generated;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instance" type="{http://de.fhg.iais.roberta.blockly}instance" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="robottype" type="{http://www.w3.org/2001/XMLSchema}string" default="ev3" />
 *       &lt;attribute name="xmlversion" type="{http://www.w3.org/2001/XMLSchema}string" default="2.0" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="tags" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "instance"
})
@XmlRootElement(name = "block_set")
public class BlockSet {

    @XmlElement(required = true)
    protected List<Instance> instance;
    @XmlAttribute(name = "robottype")
    protected String robottype;
    @XmlAttribute(name = "xmlversion")
    protected String xmlversion;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "tags")
    protected String tags;

    /**
     * Gets the value of the instance property.
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instance property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getInstance().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instance }
     */
    public List<Instance> getInstance() {
        if ( instance == null ) {
            instance = new ArrayList<Instance>();
        }
        return this.instance;
    }

    /**
     * Gets the value of the robottype property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getRobottype() {
        if ( robottype == null ) {
            return "ev3";
        } else {
            return robottype;
        }
    }

    /**
     * Sets the value of the robottype property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setRobottype(String value) {
        this.robottype = value;
    }

    /**
     * Gets the value of the xmlversion property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getXmlversion() {
        if ( xmlversion == null ) {
            return "2.0";
        } else {
            return xmlversion;
        }
    }

    /**
     * Sets the value of the xmlversion property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setXmlversion(String value) {
        this.xmlversion = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getDescription() {
        if ( description == null ) {
            return "";
        } else {
            return description;
        }
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getTags() {
        if ( tags == null ) {
            return "";
        } else {
            return tags;
        }
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setTags(String value) {
        this.tags = value;
    }

}
