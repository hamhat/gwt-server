package com.myapp.servlet;

import com.myapp.model.Title;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: UseMe
 * Date: 3/6/12
 * Time: 7:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Titles extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s = getCoupleOfTitlesInJson().toString();
        System.out.println(s);
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.getOutputStream().print(s);
        resp.getOutputStream().flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    private JSONArray getCoupleOfTitlesInJson() {
        List<Title> titles = getCoupleOfTitles();
        JSONArray array = new JSONArray();
        array.addAll(titles);
        return array;
    }

    private List<Title> getCoupleOfTitles() {
        Title title1 = new Title("Title1", "1.0");
        Title title2 = new Title("Title2", "2.0");
        List<Title> list = new ArrayList<Title>();
        list.add(title1);
        list.add(title2);
        return list;
    }
}
