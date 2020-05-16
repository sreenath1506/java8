package org.demo1.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Lambdas,variants of Lambdas
//Method References
//Type of Lambda expression
//can lambda be put into a variable
//Is lambda expression an object
public class Main {
    public static void main(String[] args) {
        List<String> al = Arrays.asList("Person","Orange","Mango","Grapes");
        al.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        al.forEach(System.out::println);

        //variant 1
        Comparator<String> comparatorWithLamda = (String o1,String o2)-> o1.compareTo(o2);
        al.sort(comparatorWithLamda);
        al.forEach(s->System.out.println(s));

        //variant 2
        Comparator<String> comparatorWithLamdaV2 = (o1,o2)-> o1.compareTo(o2);
        al.sort(comparatorWithLamdaV2);
        al.forEach(s->System.out.println(s));

        //variant 3
        Comparator<String> comparatorWithLamdaV3 = (o1,o2)-> {
            return o1.compareTo(o2);
        };
        al.sort(comparatorWithLamdaV3);
        al.forEach(s->System.out.println(s));

        ////variant 4
        al.sort((o1, o2) -> o1.compareTo(o2));

    }
}
