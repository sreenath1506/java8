package org.demo.dataprocessing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sreenath","Jeevika","Shruthi");
        names.replaceAll(s -> s.toUpperCase());
      names.sort(String::compareTo);
      List<Person> personList = Arrays.asList(new Person(36,"Sreenath","Bhasker"),
              new Person(32,"Shruthi","Reddy"));
      personList.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getFirstName));
      personList.forEach(System.out::println);

    }
}
