package org.demo1.streams;




import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class StreamsMain {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("A","B","C","D","AA","BB","CC","DD");

        Predicate<String> p = Predicate.isEqual("AA");
        Predicate<String> p1 = Predicate.isEqual("BB");
        /*stringStream.
                filter(p.or(p1)).forEach(System.out::println);*/

        //call to the filter method is Lazy call or intermediatery call since it returns
        //all the methods that return Stream are intermediatery operation
        //intermediatery operation doesn't do anything its only a declaration

        List<String> list = new ArrayList<>();
        stringStream.
                peek(System.out::println)
                .filter(s -> s.startsWith("A"))
                .peek(s-> list.add(s)).forEach(System.out::println);
        System.out.println("Size="+list.size());


        //forEach - Not lazy
        //peek - lazy
        //filter - lazy
        //only the final operation triggers the processisng of data that the steam is connected to





    }
}
