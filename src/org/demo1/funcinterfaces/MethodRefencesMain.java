package org.demo1.funcinterfaces;

import java.util.Comparator;
import java.util.function.Consumer;

public class MethodRefencesMain {
    public static void main(String[] args) {

        Consumer<String> c1 = s->System.out.println(s);

        Consumer<String> c2 = System.out::println;

        Comparator<Integer> i1 = (o1, o2) -> o1.compareTo(o2);

        Comparator<Integer> i2 = Integer::compareTo;



    }
}
