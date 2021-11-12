package hack.data;

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
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class  MainApp {

    public static final Map<Class<?>, Unmarshaller> UNMARSHALLER_MAP = new HashMap<>();

    static {
        try {
            UNMARSHALLER_MAP.put(Dokument.class, JAXBContext.newInstance(Dokument.class).createUnmarshaller());
            UNMARSHALLER_MAP.put(Geschaeft.class, JAXBContext.newInstance(Geschaeft.class).createUnmarshaller());
            UNMARSHALLER_MAP.put(Gremium.class, JAXBContext.newInstance(Gremium.class).createUnmarshaller());
            UNMARSHALLER_MAP.put(Mitglied.class, JAXBContext.newInstance(Mitglied.class).createUnmarshaller());
            UNMARSHALLER_MAP.put(Mitgliedschaft.class, JAXBContext.newInstance(Mitgliedschaft.class).createUnmarshaller());
            UNMARSHALLER_MAP.put(Sitzung.class, JAXBContext.newInstance(Sitzung.class).createUnmarshaller());
            UNMARSHALLER_MAP.put(Traktandum.class, JAXBContext.newInstance(Traktandum.class).createUnmarshaller());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String... args) throws JAXBException, SAXException, MalformedURLException {

        Dokument dokument =  unmarshall(Dokument.class, "DokumenteOne");
        Geschaeft geschaeft =  unmarshall(Geschaeft.class, "GeschaefteOne");
        Gremium gremium =  unmarshall(Gremium.class, "GremienOne");
        Mitglied mitglied =  unmarshall(Mitglied.class, "MitgliederOne");
        Mitgliedschaft mitgliedschaft =  unmarshall(Mitgliedschaft.class, "MitgliedschaftenOne");
        Sitzung sitzung =  unmarshall(Sitzung.class, "SitzungenOne");
        Traktandum traktandum =  unmarshall(Traktandum.class, "TraktandenOne");
        int br = 0;
    }

    public static <T> T unmarshall(Class<T> t, String name) throws MalformedURLException, JAXBException {
        URL url = Utils.getUrl(name, ".xml");
        JAXBElement<T> element = (JAXBElement<T>) UNMARSHALLER_MAP.get(t).unmarshal(url);
        return element.getValue();
    }
}
