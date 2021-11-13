package ch.opendata.hackdaysbe;

import ch.cmiag.cdws.dokumente.Dokument;
import ch.cmiag.cdws.geschaefte.Geschaeft;
import ch.cmiag.cdws.gremien.Gremium;
import ch.cmiag.cdws.mitglieder.Mitglied;
import ch.cmiag.cdws.mitgliedschaften.Mitgliedschaft;
import ch.cmiag.cdws.sitzungen.Sitzung;
import ch.cmiag.cdws.traktanden.Traktandum;
import ch.opendata.hackdaysbe.types.HDokument;
import ch.opendata.hackdaysbe.types.HGeschaeft;
import ch.opendata.hackdaysbe.types.HGremium;
import ch.opendata.hackdaysbe.types.HMitglied;
import ch.opendata.hackdaysbe.types.HMitgliedschaft;
import ch.opendata.hackdaysbe.types.HSitzung;
import ch.opendata.hackdaysbe.types.HTraktandum;

import java.util.HashMap;
import java.util.Map;

public class SimpleDataHolder {

    public static final Map<String, HDokument> DOKUMENT_MAP = new HashMap<>();
    public static final Map<String, HGeschaeft> GESCHAEFT_MAP = new HashMap<>();
    public static final Map<String, HGremium>  GREMIUM_MAP = new HashMap<>();
    public static final Map<String, HMitglied>  MITGLIED_MAP = new HashMap<>();
    public static final Map<String, HMitgliedschaft>  MITGLIEDSCHAFT_MAP = new HashMap<>();
    public static final Map<String, HSitzung>  SITZUNG_MAP = new HashMap<>();
    public static final Map<String, HTraktandum>  TRAKTANDUM_MAP = new HashMap<>();

}
