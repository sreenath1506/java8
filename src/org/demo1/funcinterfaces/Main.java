package org.demo1.funcinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //1 category- Supplier ->doesn't take any object ,provides a new object
        Supplier<String> stringSupplier = () -> new String("Hello");
        System.out.println(stringSupplier.get());

        //2 category -Consumer -> takes an object ,doest return anything
        //variants //BiConsumer
        Consumer<String> stringConsumerC1 = s -> System.out.println(s);
        //chaining consumers
        Consumer<String> stringConsumerC2 = stringConsumerC1.andThen(s -> System.out.println("Hi,"+s));
        stringConsumerC2.accept("Hello");

        //3rd category -Predicate,variants BiPredicate
        Predicate<String> p1 = s -> s.length()<20;

        Predicate<String> p2 = s -> s.length()>5;

        Predicate<String> p3 = p1.and(p2);

        Predicate<String> p4 = p1.or(p2);

        System.out.println(p1.test("Hello World"));
        System.out.println(p2.test("Happy New Year 2020!!"));
        System.out.println(p3.test("Hi, hello!!"));
        System.out.println(p3.test("Hi"));
        System.out.println(p4.test("Hi!!"));


        System.out.println("-----Functions-----");
        //Function //biFuntion
        //special functions ,UnaryOperator and binary operator
        Function<String,Boolean> f1 = s -> s.length()>20;

        System.out.println(f1.apply("Hello, How do you do!"));

        BiFunction<String,String, Map> f2 = (s, s2) -> {
            HashMap<String,String> hm = new HashMap<>();
            hm.put(s,s2);
            return hm;
        } ;

        System.out.println(f2.apply("C1","Person"));

        UnaryOperator<String> f3 = s -> "Hello, " +s;
        System.out.println(f3.apply("World"));

        BinaryOperator<String> f4 = (s, s2) -> "Hello, "+s +" and "+s2;
        System.out.println(f4.apply("Harish","Ramesh"));

        //compilation error if wrong return type is returned
        //BinaryOperator<String> f5 = (s, s2) -> s.length()>5 && s2.length()<10;

        //Primitive predicates
        IntPredicate intPredicate = i-> (i%2==0);
        Predicate<Integer> wrapperIntPredicate = integer -> (integer%2==1);

        System.out.println(intPredicate.test(4));
        System.out.println(wrapperIntPredicate.test(4));




    }
}
