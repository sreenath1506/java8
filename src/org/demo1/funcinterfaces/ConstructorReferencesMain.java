package org.demo1.funcinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencesMain {
    public static void main(String[] args) {

        Supplier<Apple> a1= ()-> new Apple();

        System.out.println(a1.get());

        Supplier<Apple> a2 = Apple::new;
        System.out.println(a2.get());

        Function<Integer,Apple> appleFunction = Apple::new;
        Apple a3= appleFunction.apply(250);
        System.out.println(a3);

        //Compilation error when arguments of constructor doesn't match
        /*BiFunction<String,String,Apple>  appleBiFunction = Apple::new;
        Apple a4= appleBiFunction.apply("100","Green");
        System.out.println(a4);*/

        BiFunction<String,Integer,Apple>  appleBiFunction = Apple::new;
        Apple a4= appleBiFunction.apply("Green",250);
        System.out.println(a4);

    }
}
