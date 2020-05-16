package org.demo1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapOperationMain {
    public static void main(String[] args) {


       Person person1 = new Person(30,"Harish");
        Person person2 = new Person(25,"Mahesh");
        Person person3 = new Person(25,"Suresh");

        List<Person> personList = Arrays.asList(person1,person2,person3);
        personList.stream().map(Person::getAge).forEach(System.out::println);
       // Stream<Person> personStream = Stream.of(person1,person2,person3);


        //Stream<Integer> integerStream = personStream.map(person -> person.getAge());
       //integerStream.forEach(System.out::println);

    }
}
