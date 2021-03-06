//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.12 at 07:19:30 PM CET 
//


package ch.cmiag.cdws.sitzungen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sitzung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sitzung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sessionsunterlagen">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Dokument" type="{http://www.cmiag.ch/cdws/Sitzungen}Sessionsunterlage"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sessionsdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="CustomSessionsdatum" type="{http://www.cmiag.ch/cdws/Sitzungen}Sessionsdatum"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Traktanden">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Traktandum" type="{http://www.cmiag.ch/cdws/Sitzungen}Traktandum"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Name" type="{http://www.cmiag.ch/cdws/Sitzungen}MultiLangTextFieldType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OBJ_GUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IDX" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sitzung", propOrder = {
    "sessionsunterlagen",
    "sessionsdaten",
    "traktanden",
    "name"
})
public class Sitzung {

    @XmlElement(name = "Sessionsunterlagen", required = true)
    protected Sitzung.Sessionsunterlagen sessionsunterlagen;
    @XmlElement(name = "Sessionsdaten", required = true)
    protected Sitzung.Sessionsdaten sessionsdaten;
    @XmlElement(name = "Traktanden", required = true)
    protected Sitzung.Traktanden traktanden;
    @XmlElement(name = "Name", required = true)
    protected MultiLangTextFieldType name;
    @XmlAttribute(name = "OBJ_GUID", required = true)
    protected String objguid;
    @XmlAttribute(name = "SEQ")
    protected String seq;
    @XmlAttribute(name = "IDX")
    protected String idx;

    /**
     * Gets the value of the sessionsunterlagen property.
     * 
     * @return
     *     possible object is
     *     {@link Sitzung.Sessionsunterlagen }
     *     
     */
    public Sitzung.Sessionsunterlagen getSessionsunterlagen() {
        return sessionsunterlagen;
    }

    /**
     * Sets the value of the sessionsunterlagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sitzung.Sessionsunterlagen }
     *     
     */
    public void setSessionsunterlagen(Sitzung.Sessionsunterlagen value) {
        this.sessionsunterlagen = value;
    }

    /**
     * Gets the value of the sessionsdaten property.
     * 
     * @return
     *     possible object is
     *     {@link Sitzung.Sessionsdaten }
     *     
     */
    public Sitzung.Sessionsdaten getSessionsdaten() {
        return sessionsdaten;
    }

    /**
     * Sets the value of the sessionsdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sitzung.Sessionsdaten }
     *     
     */
    public void setSessionsdaten(Sitzung.Sessionsdaten value) {
        this.sessionsdaten = value;
    }

    /**
     * Gets the value of the traktanden property.
     * 
     * @return
     *     possible object is
     *     {@link Sitzung.Traktanden }
     *     
     */
    public Sitzung.Traktanden getTraktanden() {
        return traktanden;
    }

    /**
     * Sets the value of the traktanden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sitzung.Traktanden }
     *     
     */
    public void setTraktanden(Sitzung.Traktanden value) {
        this.traktanden = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public MultiLangTextFieldType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLangTextFieldType }
     *     
     */
    public void setName(MultiLangTextFieldType value) {
        this.name = value;
    }

    /**
     * Gets the value of the objguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJGUID() {
        return objguid;
    }

    /**
     * Sets the value of the objguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJGUID(String value) {
        this.objguid = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQ() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQ(String value) {
        this.seq = value;
    }

    /**
     * Gets the value of the idx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDX() {
        return idx;
    }

    /**
     * Sets the value of the idx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDX(String value) {
        this.idx = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="CustomSessionsdatum" type="{http://www.cmiag.ch/cdws/Sitzungen}Sessionsdatum"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customSessionsdatum"
    })
    public static class Sessionsdaten {

        @XmlElement(name = "CustomSessionsdatum")
        protected List<Sessionsdatum> customSessionsdatum;

        /**
         * Gets the value of the customSessionsdatum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customSessionsdatum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomSessionsdatum().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Sessionsdatum }
         * 
         * 
         */
        public List<Sessionsdatum> getCustomSessionsdatum() {
            if (customSessionsdatum == null) {
                customSessionsdatum = new ArrayList<Sessionsdatum>();
            }
            return this.customSessionsdatum;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Dokument" type="{http://www.cmiag.ch/cdws/Sitzungen}Sessionsunterlage"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dokument"
    })
    public static class Sessionsunterlagen {

        @XmlElement(name = "Dokument")
        protected List<Sessionsunterlage> dokument;

        /**
         * Gets the value of the dokument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dokument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDokument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Sessionsunterlage }
         * 
         * 
         */
        public List<Sessionsunterlage> getDokument() {
            if (dokument == null) {
                dokument = new ArrayList<Sessionsunterlage>();
            }
            return this.dokument;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Traktandum" type="{http://www.cmiag.ch/cdws/Sitzungen}Traktandum"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "traktandum"
    })
    public static class Traktanden {

        @XmlElement(name = "Traktandum")
        protected List<Traktandum> traktandum;

        /**
         * Gets the value of the traktandum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the traktandum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTraktandum().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Traktandum }
         * 
         * 
         */
        public List<Traktandum> getTraktandum() {
            if (traktandum == null) {
                traktandum = new ArrayList<Traktandum>();
            }
            return this.traktandum;
        }

    }

}
