package models;

import Interfaces.Cyclable;
import Interfaces.Swimable;


public class Triathlete implements Swimable, Cyclable {

    //giving it a name (property)

    private String name;

    //constructor
    public Triathlete(String name) {
        this.name = name;
    }
//we want triathelete to do all 3 things
// can implement as many interfaces you want into class

    //implementing swim method from swimable interface

    public String swim(int distance) {
        return this.name + " swam " + distance + "m after cycling"; //Jane swam 10m after cycling

    }

    //implementing method from cyclable interface

    public String cycle(int distance){
        return this.name + " cycled " + distance + "m from the start" ;

    }

    //implementing the method from Irun interface:

    public String run(int distance){
        return this.name + " ran " + distance + "m after swimming";
    }

}
