//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.21 at 02:24:05 nachm. MESZ 
//

package de.fhg.iais.roberta.blockly.generated;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for instance complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="block" type="{http://de.fhg.iais.roberta.blockly}block" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instance", propOrder = {
    "block"
})
public class Instance {

    @XmlElement(required = true)
    protected List<Block> block;
    @XmlAttribute(name = "x")
    protected String x;
    @XmlAttribute(name = "y")
    protected String y;

    /**
     * Gets the value of the block property.
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the block property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getBlock().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Block }
     */
    public List<Block> getBlock() {
        if ( block == null ) {
            block = new ArrayList<Block>();
        }
        return this.block;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setY(String value) {
        this.y = value;
    }

}
