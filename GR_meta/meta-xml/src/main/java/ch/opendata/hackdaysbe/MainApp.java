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
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ivan@olexyn.com
 */
public class MainApp {

    public static final Map<Class<?>, Unmarshaller> UNMARSHALLER_MAP = new HashMap<>();
    
    public static final DataHolder DATA = new DataHolder();
    
    static {
        try {
            for (DataType dataType : DataType.values()) {
                Class<?> className = dataType.getClassName();
                UNMARSHALLER_MAP.put(className, JAXBContext.newInstance(className).createUnmarshaller());
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
                Object object = unmarshall(dataType.getClassName(), new StringReader(payload));
                if (dataType.getClassName() == Dokument.class) {
                    Dokument dokument = (Dokument) object;
                    DATA.DOKUMENT_MAP.put(dokument.getOBJGUID(), dokument);
                }
                if (dataType.getClassName() == Geschaeft.class) {
                    Geschaeft geschaeft = (Geschaeft) object;
                    DATA.GESCHAEFT_MAP.put(geschaeft.getOBJGUID(), geschaeft);
                }
                if (dataType.getClassName() == Gremium.class) {
                    Gremium gremium = (Gremium) object;
                    DATA.GREMIUM_MAP.put(gremium.getOBJGUID(), gremium);
                }
                if (dataType.getClassName() == Mitglied.class) {
                    Mitglied mitglied = (Mitglied) object;
                    DATA.MITGLIED_MAP.put(mitglied.getOBJGUID(), mitglied);
                }
                if (dataType.getClassName() == Mitgliedschaft.class) {
                    Mitgliedschaft mitgliedschaft = (Mitgliedschaft) object;
                    DATA.MITGLIEDSCHAFT_MAP.put(mitgliedschaft.getOBJGUID(), mitgliedschaft);
                }
                if (dataType.getClassName() == Sitzung.class) {
                    Sitzung sitzung = (Sitzung) object;
                    DATA.SITZUNG_MAP.put(sitzung.getOBJGUID(), sitzung);
                }
                if (dataType.getClassName() == Traktandum.class) {
                    Traktandum traktandum = (Traktandum) object;
                    DATA.TRAKTANDUM_MAP.put(traktandum.getOBJGUID(), traktandum);
                }
            }
        }
        while (true) {
            Thread.sleep(1000L);
        }
    }

    public static <T> T unmarshall(Class<T> t, StringReader stringReader) throws JAXBException {
        JAXBElement<T> element = (JAXBElement<T>) UNMARSHALLER_MAP.get(t).unmarshal(stringReader);
        return element.getValue();
    }

}
