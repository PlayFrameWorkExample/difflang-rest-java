package com.difflang.models;

/**
 * Created by ChivonChhai on 10/18/2016.
 */
public class Roles {
    private  int id;
    private  String name;
    public Roles(int id, String name) {
        this.id = id;
        this.name = name;
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
}
