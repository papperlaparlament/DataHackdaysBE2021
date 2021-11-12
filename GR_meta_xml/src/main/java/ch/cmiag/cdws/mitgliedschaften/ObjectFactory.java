//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.12 at 07:19:15 PM CET 
//


package ch.cmiag.cdws.mitgliedschaften;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.cmiag.cdws.mitgliedschaften package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Behoerdenmandat_QNAME = new QName("http://www.cmiag.ch/cdws/Mitgliedschaften", "Behoerdenmandat");
    private final static QName _DateTimeFieldTypeEnd_QNAME = new QName("http://www.cmiag.ch/cdws/Mitgliedschaften", "End");
    private final static QName _DateTimeFieldTypeStart_QNAME = new QName("http://www.cmiag.ch/cdws/Mitgliedschaften", "Start");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.cmiag.cdws.mitgliedschaften
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mitgliedschaft }
     * 
     */
    public Mitgliedschaft createMitgliedschaft() {
        return new Mitgliedschaft();
    }

    /**
     * Create an instance of {@link MultiLangTextFieldType }
     * 
     */
    public MultiLangTextFieldType createMultiLangTextFieldType() {
        return new MultiLangTextFieldType();
    }

    /**
     * Create an instance of {@link DateTimeFieldType }
     * 
     */
    public DateTimeFieldType createDateTimeFieldType() {
        return new DateTimeFieldType();
    }

    /**
     * Create an instance of {@link ch.cmiag.cdws.mitgliedschaften.Gremium }
     * 
     */
    public ch.cmiag.cdws.mitgliedschaften.Gremium createGremium() {
        return new ch.cmiag.cdws.mitgliedschaften.Gremium();
    }

    /**
     * Create an instance of {@link ch.cmiag.cdws.mitgliedschaften.Person }
     * 
     */
    public ch.cmiag.cdws.mitgliedschaften.Person createPerson() {
        return new ch.cmiag.cdws.mitgliedschaften.Person();
    }

    /**
     * Create an instance of {@link Mitgliedschaft.Gremium }
     * 
     */
    public Mitgliedschaft.Gremium createMitgliedschaftGremium() {
        return new Mitgliedschaft.Gremium();
    }

    /**
     * Create an instance of {@link Mitgliedschaft.Person }
     * 
     */
    public Mitgliedschaft.Person createMitgliedschaftPerson() {
        return new Mitgliedschaft.Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mitgliedschaft }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cmiag.ch/cdws/Mitgliedschaften", name = "Behoerdenmandat")
    public JAXBElement<Mitgliedschaft> createBehoerdenmandat(Mitgliedschaft value) {
        return new JAXBElement<Mitgliedschaft>(_Behoerdenmandat_QNAME, Mitgliedschaft.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cmiag.ch/cdws/Mitgliedschaften", name = "End", scope = DateTimeFieldType.class)
    public JAXBElement<XMLGregorianCalendar> createDateTimeFieldTypeEnd(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTimeFieldTypeEnd_QNAME, XMLGregorianCalendar.class, DateTimeFieldType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cmiag.ch/cdws/Mitgliedschaften", name = "Start", scope = DateTimeFieldType.class)
    public JAXBElement<XMLGregorianCalendar> createDateTimeFieldTypeStart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTimeFieldTypeStart_QNAME, XMLGregorianCalendar.class, DateTimeFieldType.class, value);
    }

}
