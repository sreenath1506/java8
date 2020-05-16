package org.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainBuildingStreams {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> integerStream = ints.stream();

        integerStream.forEach(System.out::println);

        Stream<Integer> integerStream1 = Stream.of(0,1,2,3,4,5,6);
        integerStream1.forEach(System.out::println);

        Stream<String> stringStream2 = Stream.generate(() -> "One");
        stringStream2.limit(5).forEach(System.out::println);


        Stream<String> stringStream = Stream.iterate("+",s -> s+"+" );
        stringStream.limit(5).forEach(System.out::println);

        IntStream intStream = ThreadLocalRandom.current().ints();
        intStream.limit(5).forEach(System.out::println);

    }
}
