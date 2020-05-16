package org.demo.functionalinterfaces;

public class Main {

    public static void main(String[] args) {
        Predicate<String> p1 = s -> {
            return s.length()<20;
        };
        Predicate<String> p2 = s -> s.length()>5;
        boolean b = p1.test("Hello");

        /*System.out.println("p1s hashcode "+p1.hashCode());
        System.out.println("p1s equals "+p1.equals(p2));
*/
        System.out.println("Hello is shorter than 20 chars "+b);
        Predicate<String> p3 = p1.and(p2);
        System.out.println("P3 for Yes "+p3.test("Yes"));
        System.out.println("P3 for Good Morning "+p3.test("Good Morning"));
        System.out.println("Hello is shorter than 20 chars "+p3.test("Good morning Gentelmen"));

        Predicate<String> p4  = p1.or(p2);
        System.out.println("P4 for Yes "+p4.test("Yes"));

        Predicate<String> p5 = Predicate.isEqualsTo("Yes");
        System.out.println("P5 for Yes "+p5.test("Yes"));
        System.out.println("P5 for No "+p5.test("No"));

        Predicate<Integer> p6 = Predicate.isEqualsTo(1);
    }
}
