package com.olexyn.min.http.server.servlets;

import ch.cmiag.cdws.mitglieder.Mitglied;
import ch.opendata.hackdaysbe.DataHolder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class MitgliedServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        Map<String,String[]> param = request.getParameterMap();
        Mitglied mitglied = DataHolder.MITGLIED_MAP.get("c0f76d872b1549c39a9714d5df37664c");
        String json = new ObjectMapper().writeValueAsString(mitglied);
        response.getWriter().println(json);
    }
}