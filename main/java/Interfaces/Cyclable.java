package Interfaces;

public interface Cyclable {

    //define the abstract method- defining behaviour we want
    //every class that implements this interface to have

    // the method cycle
    //no access modifier- all methods in interfaces are public
    //by default

    //cycle method must return a string + take in an int
    String cycle(int distance);
}
