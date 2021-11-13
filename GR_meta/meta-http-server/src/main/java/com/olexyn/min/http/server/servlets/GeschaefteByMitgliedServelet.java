package com.olexyn.min.http.server.servlets;

import ch.cmiag.cdws.geschaefte.EingereichtVon;
import ch.cmiag.cdws.geschaefte.Geschaeft;
import ch.cmiag.cdws.mitglieder.Mitglied;
import ch.opendata.hackdaysbe.RawDataHolder;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GeschaefteByMitgliedServelet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        Map<String, String[]> param = request.getParameterMap();

        List<Geschaeft> geschaeftList = new ArrayList<>();
        final String[] name = param.get("name");
        final String[] vorname = param.get("vorname");
        Mitglied mitglied = RawDataHolder.MITGLIED_MAP.entrySet().stream()
            .filter(x -> x.getValue().getVorname().equals(vorname[0]))
            .filter(x -> x.getValue().getName().equals(name[0]))
            .findFirst().orElseThrow(NullPointerException::new)
            .getValue();

        for (Entry<String, Geschaeft> geschaeft : RawDataHolder.getGeschaeftMap().entrySet()) {
            for (EingereichtVon eingereichtVon : geschaeft.getValue().getEingereichtVon().getBeteiligung()) {
                if (eingereichtVon.getGuid().equals("f9f6a64f12064a3390b7cfa9d1e079ff")) {
                    int br = 0;
                }
                if (eingereichtVon.getGuid().equals(mitglied.getOBJGUID())) {
                    geschaeftList.add(geschaeft.getValue());
                }
            }
        }
        String json = new ObjectMapper().writeValueAsString(geschaeftList);
        response.getWriter().println(json);
    }
}