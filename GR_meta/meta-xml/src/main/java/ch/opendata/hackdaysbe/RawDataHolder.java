package ch.opendata.hackdaysbe;

import ch.cmiag.cdws.dokumente.Dokument;
import ch.cmiag.cdws.geschaefte.Geschaeft;
import ch.cmiag.cdws.gremien.Gremium;
import ch.cmiag.cdws.mitglieder.Mitglied;
import ch.cmiag.cdws.mitgliedschaften.Mitgliedschaft;
import ch.cmiag.cdws.sitzungen.Sitzung;
import ch.cmiag.cdws.traktanden.Traktandum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ivan@olexyn.com
 */
public class RawDataHolder {

    public static final Map<String, Dokument> DOKUMENT_MAP = new HashMap<>();
    public static final Map<String, Geschaeft> GESCHAEFT_MAP = new HashMap<>();
    public static final Map<String, Gremium>  GREMIUM_MAP = new HashMap<>();
    public static final Map<String, Mitglied>  MITGLIED_MAP = new HashMap<>();
    public static final Map<String, Mitgliedschaft>  MITGLIEDSCHAFT_MAP = new HashMap<>();
    public static final Map<String, Sitzung>  SITZUNG_MAP = new HashMap<>();
    public static final Map<String, Traktandum>  TRAKTANDUM_MAP = new HashMap<>();







}
