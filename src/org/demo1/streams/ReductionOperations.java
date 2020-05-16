package org.demo1.streams;

//2 kinds of reduction in the stream api
//1.Basic aggreagate operations like min, max ,sum average..etc

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReductionOperations {
    public static void main(String[] args) {

        Person person1 = new Person(30,"Harish");
        Person person2 = new Person(25,"Mahesh");
        Person person3 = new Person(25,"Suresh");

        List<Person> personList = Arrays.asList(person1,person2,person2,person3);
        //BinaryOperator<Integer> f1 = Integer::sum;
        Integer sum =personList.stream()
                .map(person -> person.getAge()).reduce(0,Integer::sum);
        System.out.println("Sum "+sum);


        //reduction is maximum
        //max operation doesn't have an identity

       /* Stream<Integer> integerStream = Stream.of(1,2,3,4);
        Integer maxNum = integerStream.reduce(0,Integer::max);
        System.out.println("Max number "+maxNum);*/

       /* Stream<Integer> integerStream = Stream.of(-1,-2,-3,-4);
        Integer maxNum = integerStream.reduce(0,Integer::max);
        System.out.println("Max number "+maxNum);*/

        Stream<Integer> integerStream = Stream.of(-1,-2,-3,-4);
        Optional<Integer> maxNum = integerStream.reduce(Integer::max);
        System.out.println("Max number "+maxNum.get());

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> integerOpt = integerList.stream().reduce(Integer::sum);
        System.out.println("Sum "+integerOpt.get());
        //Reductions
            //max(),min()
            //count()
        //Boolean Reductions
            //allmmatch,noneMatch,anyMatch
        //Reductions that return an optional
            //findFirst(),findAny()
        //reductions are terminal opertions
    }

}
