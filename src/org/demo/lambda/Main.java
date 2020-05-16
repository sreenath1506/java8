



package org.demo.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
       /* Comparator<Person> compAge = (p1,p2)-> p2.getAge()-p1.getAge();

        Comparator<Person> compName = (p1,p2)-> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> compLastName = (p1,p2)-> p1.getLastName().compareTo(p2.getLastName());

        Function<Person,Integer> f1 = person -> person.getAge();
        Function<Person,String> f2 = person -> person.getFirstName();
        Function<Person,String> f3 = person -> person.getLastName();

        Comparator<Person> compPersonAge = Comparator.comparing(Person::getAge);
        Comparator<Person> compPersonLastName = Comparator.comparing(Person::getLastName);

        Comparator<Person> cmp = Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName).thenComparing(Person::getAge);
*/
        //
        List<String> strings = Arrays.asList("A","B","C","D","E","F","G");
       // al.forEach(System.out::println);
        List<String> result = new ArrayList<>();
        Consumer<String> c1 = System.out::println;
        //Consumer<String> c2 = a -> result.add(a);

        strings.forEach(c1) ;
        //strings.forEach(c1.andThen(c2)) ;
        //result.forEach(System.out::println);
        Optional<String> count = strings.parallelStream().reduce((s, s2) -> s.concat(s2));
        System.out.println("count"+count.get());
        strings.forEach(System.out::println) ;





    }
}
