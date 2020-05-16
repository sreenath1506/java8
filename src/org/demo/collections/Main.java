package org.demo.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person(23,"Alice");
        Person p2 = new Person(56,"Brian");
        Person p3 = new Person(46,"Chelsa");
        Person p4 = new Person(28,"David");
        Person p5 = new Person(37,"Erica");
        Person p6 = new Person(18,"Fransico");

        List<Person> people = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6));

        people.removeIf(person -> person.getAge()<30);

        people.replaceAll(person -> new Person(person.getAge(),person.getName().toUpperCase()));

        people.sort(Comparator.comparing(Person::getAge).reversed());

        people.forEach(System.out::println);

        City newYork = new City("New york");
        City shangai = new City("shangai");
        City paris = new City("paris");

        Map<City,List<Person>> map = new HashMap<>();
        map.putIfAbsent(paris,new ArrayList<>());
        map.get(paris).add(p1);

        map.computeIfAbsent(newYork,city -> new ArrayList<>()).add(p2);
        map.computeIfAbsent(newYork,city -> new ArrayList<>()).add(p3);

        System.out.println("people from paris "+map.getOrDefault(paris,new ArrayList<>()));
        System.out.println("people from newyork "+map.getOrDefault(newYork,new ArrayList<>()));

        Map<City,List<Person>> map1 = new HashMap<>();
        map1.computeIfAbsent(shangai,city -> new ArrayList<>()).add(p2);
        map1.computeIfAbsent(shangai,city -> new ArrayList<>()).add(p3);
        map1.computeIfAbsent(newYork,city -> new ArrayList<>()).add(p1);

        System.out.println("Map1");
        map1.forEach((city, people1) -> System.out.println(city +" :" +people1));

        Map<City,List<Person>> map2 = new HashMap<>();
        map2.computeIfAbsent(shangai,city -> new ArrayList<>()).add(p4);
        map2.computeIfAbsent(paris,city -> new ArrayList<>()).add(p5);
        map2.computeIfAbsent(paris,city -> new ArrayList<>()).add(p6);

        System.out.println("Map2");
        map2.forEach((city, people1) -> System.out.println(city +" :" +people1));

        map2.forEach((city, people1) -> {
            map1.merge(city,people1,
                    ((peopleFromMap1, peopleFromMap2) -> {
                        peopleFromMap1.addAll(peopleFromMap2);
                        return  peopleFromMap1;
                    }));
        });

        System.out.println("Map1");
        map1.forEach((city, people1) -> System.out.println(city +" :" +people1));

    }

}
