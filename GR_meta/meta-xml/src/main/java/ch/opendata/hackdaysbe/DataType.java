package ch.opendata.hackdaysbe;

import ch.cmiag.cdws.dokumente.Dokument;
import ch.cmiag.cdws.geschaefte.Geschaeft;
import ch.cmiag.cdws.gremien.Gremium;
import ch.cmiag.cdws.mitglieder.Mitglied;
import ch.cmiag.cdws.mitgliedschaften.Mitgliedschaft;
import ch.cmiag.cdws.sitzungen.Sitzung;
import ch.cmiag.cdws.traktanden.Traktandum;

/**
 * @author ivan@olexyn.com
 */
public enum DataType {
    DOKUMENT(Dokument.class, "Dokumente"),
    GESCHAEFT(Geschaeft.class, "Geschaefte"),
    GREMIUM(Gremium.class, "Gremien"),
    MITGLIED(Mitglied.class, "Mitglieder"),
    MITGLIEDSCHAFT(Mitgliedschaft.class, "Mitgliedschaften"),
    SITZUNG(Sitzung.class, "Sitzungen"),
    TRAKTANDUM(Traktandum.class, "Traktanden");

    private final Class<?> className;
    private final String fileName;

    DataType(Class<?> className, String fileName) {
        this.className = className;
        this.fileName = fileName;
    }

    public Class<?> getClassName() {
        return className;
    }

    public String getFileName() {
        return fileName;
    }

}
