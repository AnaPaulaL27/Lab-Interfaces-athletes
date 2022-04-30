package Interfaces;

public interface IRun {

    //define the abstract method- defining behaviour we want
    //every class that implements this interface to have

    // the method  run
    //no access modifier- all methods in interfaces are public
    //by default

    //run method must return a string + take in an int

    String run(int distance);
}
