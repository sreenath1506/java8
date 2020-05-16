package org.test;

import java.lang.reflect.Array;
import java.util.*;

public class TestMain {

   public static void main(String args[])
    {
        Employee e1=new Employee(100,"Suresh");
        Employee e2=new Employee(100,"Suresh");
        System.out.println(e1.equals(e2));
    }

}

