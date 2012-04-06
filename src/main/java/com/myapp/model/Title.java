package com.myapp.model;

/**
 * Created by IntelliJ IDEA.
 * User: UseMe
 * Date: 3/6/12
 * Time: 7:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Title {

    private String name;
    private String rating;

    public Title() {
    }

    public Title(String name, String rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
