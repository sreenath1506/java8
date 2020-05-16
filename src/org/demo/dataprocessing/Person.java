package org.demo.dataprocessing;

public class Person {

    public Person(int age, String firstName, String lastName)
    {
        this.age=age;
        this.firstName=firstName;
        this.lastName=lastName;

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private int age;
    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;


}
