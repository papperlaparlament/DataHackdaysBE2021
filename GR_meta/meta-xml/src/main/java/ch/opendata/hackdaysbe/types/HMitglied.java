package ch.opendata.hackdaysbe.types;

import java.util.ArrayList;
import java.util.List;

public class HMitglied {

    public final List<HGeschaeft> geschaefts = new ArrayList<>();
    public final List<HMitgliedschaft> mitgliedschafts = new ArrayList<>();
    public final List<HGremium> gremiens = new ArrayList<>();

}
