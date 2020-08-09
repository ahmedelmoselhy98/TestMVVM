package com.example.testmvvm.pojo;

public class Movie {

    private int id;
    private String name;
    private String overview;

    public Movie(int id, String name, String overview) {
        this.id = id;
        this.name = name;
        this.overview = overview;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
