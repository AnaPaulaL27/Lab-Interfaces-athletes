package models;

import Interfaces.Cyclable;

public class Cyclist implements Cyclable {

    //give it a name
    private String name;

    // constructor

    public Cyclist(String name) {
        this.name = name;
    }

    //implementing method from Cyclable interface

    public String cycle(int distance){
        return this.name + " cycled " + distance + "m" ;

    }



}


