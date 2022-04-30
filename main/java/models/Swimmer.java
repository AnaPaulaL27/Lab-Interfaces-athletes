package models;
import Interfaces.Swimable;

public class Swimmer implements Swimable {

    //give it a name
    private String name;

   // constructor
    public Swimmer(String name) {
        this.name = name;
    }
    //implementing the method from swimable interface:
    public String swim(int distance){
        return this.name + " swam " + distance + "m"; //Jane swam 10m
    }

}
