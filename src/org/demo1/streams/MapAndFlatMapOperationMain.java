package org.demo1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMapOperationMain {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(7,8,9,10,11);

        List<List<Integer>> overallList = Arrays.asList(list1,list2);
        overallList.stream().map(integers -> integers.size()).forEach(System.out::println);

        System.out.println("----");
        Function<List<Integer>, Stream<Integer>> f1 = intList -> intList.stream();

       List<Integer> integerList = overallList.stream().flatMap(f1).collect(Collectors.toList());
                //forEach(System.out::println);

        //3 categories
        //foreach and peek  takes consumer
        //filter takes predicate
         //map and flatmap takes function


    }
}
