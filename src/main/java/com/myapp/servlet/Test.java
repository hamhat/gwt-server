package com.myapp.servlet;

import com.myapp.model.Title;
import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: UseMe
 * Date: 3/6/12
 * Time: 8:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {
        getCoupleOfTitlesInJson();
    }

     private static JSONArray getCoupleOfTitlesInJson() {
        List<Title> titles = getCoupleOfTitles();
        JSONArray array = new JSONArray();
        array.addAll(titles);
        System.out.println(array.toString());
        return array;
    }

    private static List<Title> getCoupleOfTitles() {
        Title title1 = new Title("Title1", "1.0");
        Title title2 = new Title("Title2", "2.0");
        List<Title> list = new ArrayList<Title>();
        list.add(title1);
        list.add(title2);
        return list;
    }
}
