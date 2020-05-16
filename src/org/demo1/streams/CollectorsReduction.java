package org.demo1.streams;

import java.util.*;
import java.util.stream.Collectors;

//second kind of reduction,this is called mutable reduction from javadoc
public class CollectorsReduction {

    public static void main(String[] args) {
        Person p1 = new Person(10,"Harish");
        Person p2= new Person(20,"Mahesh");
        Person p3= new Person(30,"Suresh");
        Person p4= new Person(40,"Danish");
        Person p5= new Person(50,"Ramesh");
        Person p6= new Person(20,"Rakesh");
        Person p7= new Person(30,"Sam");
        Person p8= new Person(40,"Ram");
        Person p9= new Person(50,"Tom");
        Person p10 = new Person(60,"Tim");

        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);

        Optional<Person> yougestPersonlt40 = personList.stream().filter(person -> person.getAge()<40).min(Comparator.comparing(Person::getAge));
        System.out.println(yougestPersonlt40);

        List<Person> personslt40 = personList.stream().filter(person -> person.getAge()<40).collect(Collectors.toList());
        System.out.println(personslt40);

       Map<Integer,List<Person>> agePersonMap = personList.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(agePersonMap);

        Map<Integer,Long> agePersonCount = personList.stream().
                collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));
        System.out.println(agePersonCount);

        Map<Integer,List<String>> agePersonListString = personList.stream().
                collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toList())));
        System.out.println(agePersonCount);

        Map<Integer,Set<String>> agePersonSet = personList.stream().
                collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toCollection(TreeSet::new))));
        System.out.println(agePersonCount);

        Map<Integer,String> agePersonString = personList.stream().
                collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.joining(","))));
        System.out.println(agePersonCount);

    }
}
