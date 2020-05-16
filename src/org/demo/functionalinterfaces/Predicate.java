package org.demo.functionalinterfaces;

//@FunctionalInterface
public interface Predicate<T> {

    public static final String TEST =" TEST";

    public boolean test(T t);

    public default Predicate<T> and(Predicate<T> other)
    {
        return t -> test(t) && other.test(t);
    }

    public default Predicate<T> or(Predicate<T> p2)
    {
        return t -> test(t) || p2.test(t);
    }

    public static <U> Predicate<U> isEqualsTo(U string)
    {
        return s-> s.equals(string);
    }

    /*
        for adding more documentation
     */
    public int hashCode();

    public boolean equals(Object o);

    //public void test1();

}
