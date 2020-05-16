package org.demo1.funcinterfaces;

//Functional interface with one abstract method
//JDK's Functional interfaces  java.util.Functional
//43 of them divided into 4 categories
@FunctionalInterface
public interface Greeting {

    public String message();


    /*public int hashCode();

    public boolean equals(Object o);*/

    public default String birthDayGreeting()
    {
        return "Wish you a happy birthday!";
    }
}
