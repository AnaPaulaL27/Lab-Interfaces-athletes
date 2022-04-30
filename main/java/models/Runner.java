package models;

import Interfaces.IRun;

public class Runner implements IRun {

    private String name;


    // constructor
    public Runner(String name) {
        this.name = name;
    }
    //implementing the method from Irun interface:

    public String run(int distance){
        return this.name + " ran " + distance + "m";
        }


    }

