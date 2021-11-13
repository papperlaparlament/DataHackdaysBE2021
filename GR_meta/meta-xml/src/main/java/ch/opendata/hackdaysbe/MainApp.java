package ch.opendata.hackdaysbe;

import ch.cmiag.cdws.dokumente.Dokument;
import ch.cmiag.cdws.geschaefte.Geschaeft;
import ch.cmiag.cdws.gremien.Gremium;
import ch.cmiag.cdws.mitglieder.Mitglied;
import ch.cmiag.cdws.mitgliedschaften.Mitgliedschaft;
import ch.cmiag.cdws.sitzungen.Sitzung;
import ch.cmiag.cdws.traktanden.Traktandum;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.DataOutput;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class  MainApp {

    public static final Map<Class<?>, Unmarshaller> UNMARSHALLER_MAP = new HashMap<>();

    static {
        Class<?>[] classes = new Class[]{
            Dokument.class, Geschaeft.class, Gremium.class, Mitglied.class,
            Mitgliedschaft.class, Sitzung.class, Traktandum.class
        };
        try {
            for (Class<?> classX : classes) {
                UNMARSHALLER_MAP.put(classX, JAXBContext.newInstance(classX).createUnmarshaller());
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private final static String XML_SUFFIX = ".xml";

    public static void main(String... args) throws JAXBException, SAXException, IOException, InterruptedException {

        for (DataType dataType : DataType.values()) {
            String filePath = Utils.filePath(dataType.getFileName(), XML_SUFFIX);
            for (String payload : Utils.readPayloads(filePath)) {
                System.out.println(payload);
                if (payload == null) {
                    int br = 0;
                }
                Object object = unmarshall(dataType.getClassName(), new StringReader(payload));
                if (dataType.getClassName() == Dokument.class) {
                    Dokument dokument = (Dokument) object;
                    System.out.println(dokument.getOBJGUID());

                    DataHolder.DOKUMENT_MAP.put(dokument.getOBJGUID(), dokument);
                }
                if (dataType.getClassName() == Geschaeft.class) {
                    Geschaeft geschaeft = (Geschaeft) object;
                    System.out.println(geschaeft.getOBJGUID());
                    DataHolder.GESCHAEFT_MAP.put(geschaeft.getOBJGUID(), geschaeft);
                }
                if (dataType.getClassName() == Gremium.class) {
                    Gremium gremium = (Gremium) object;
                    System.out.println(gremium.getOBJGUID());
                    DataHolder.GREMIUM_MAP.put(gremium.getOBJGUID(), gremium);
                }
                if (dataType.getClassName() == Mitglied.class) {
                    Mitglied mitglied = (Mitglied) object;
                    System.out.println(mitglied.getOBJGUID());
                    DataHolder.MITGLIED_MAP.put(mitglied.getOBJGUID(), mitglied);
                }
                if (dataType.getClassName() == Mitgliedschaft.class) {
                    Mitgliedschaft mitgliedschaft = (Mitgliedschaft) object;
                    DataHolder.MITGLIEDSCHAFT_MAP.put(mitgliedschaft.getOBJGUID(), mitgliedschaft);
                }
                if (dataType.getClassName() == Sitzung.class) {
                    Sitzung sitzung = (Sitzung) object;
                    DataHolder.SITZUNG_MAP.put(sitzung.getOBJGUID(), sitzung);
                }
                if (dataType.getClassName() == Traktandum.class) {
                    Traktandum traktandum = (Traktandum) object;
                    DataHolder.TRAKTANDUM_MAP.put(traktandum.getOBJGUID(), traktandum);
                }
            }
        }
        while(true) {
            Thread.sleep(1000L);
        }
    }

    public static <T> T unmarshall(Class<T> t, StringReader stringReader) throws MalformedURLException, JAXBException {
        System.out.println(stringReader);
        System.out.println(t);
        System.out.println(UNMARSHALLER_MAP.get(t));

        JAXBElement<T> element = (JAXBElement<T>) UNMARSHALLER_MAP.get(t).unmarshal(stringReader);
        return element.getValue();
    }

    public static <T> T unmarshall(Class<T> t, String name) throws MalformedURLException, JAXBException {
        URL url = Utils.getUrl(name, ".xml");
        System.out.println(name);
        System.out.println(UNMARSHALLER_MAP.get(t));

        JAXBElement<T> element = (JAXBElement<T>) UNMARSHALLER_MAP.get(t).unmarshal(url);
        return element.getValue();
    }
}
