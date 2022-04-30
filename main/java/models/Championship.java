package models;

import Interfaces.Cyclable;
import Interfaces.IRun;
import Interfaces.Swimable;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    private String name;

    //want array list of different kinds of athletes
    //categorizing as runners, swimmers, cyclists

    private List<Cyclable> cyclists;
    private List<IRun> runners;
    private List<Swimable> swimmers;
    //passing in the interfaces in <>

    //creating a constructor

    public Championship(String name){
        this.name = name;
        this.swimmers= new ArrayList<>();
        this.cyclists= new ArrayList<>();
        this.runners= new ArrayList<>();

    }

    //new method: way of adding swimmer to arraylist of swimmers

    public  void addSwimmer(Swimable swimmer){
        this.swimmers.add(swimmer);
        //can use swimmer interface to say what kind of thing
        //we are passing in
    }

    //creating method to count number of swimmers inside
    //swimmer list

    public int getSwimmerCount(){
        //not going to take in anything
        //only return size of swimmer
        return this.swimmers.size();
    }

}






//when a class implements an interface it becomes that type
