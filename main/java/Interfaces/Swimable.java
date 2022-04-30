package Interfaces;

public interface Swimable {
    //define the abstract method- defining behaviour we want
    //every class that implements this interface to have

    // the method swim
    //no access modifier- all methods in interfaces are public
    //by default

    //swim method must return a string + take in an int
    String swim(int distance);
}
