package org.test;

import java.awt.*;

public class Employee {
    int id;
    String name;

    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj)
    {
        Employee e=(Employee)obj;
        return this.id==e.id && this.name.equals(e.name);

    }
}
