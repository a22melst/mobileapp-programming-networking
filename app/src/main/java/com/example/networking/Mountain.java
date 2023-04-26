package com.example.networking;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain () {
        name="Saknar namn";
        location="Saknar plats";
        height=-1;
    }

    public Mountain(String name, String location, int height) {
        this.name = name;
        this.location = location;
        this.height = height;
    }

    public String info() {
        String tmp = new String();
        tmp+=name + " is located in mountain range " + location + "and reaches " + height + "m above sea level.";
        return tmp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}

