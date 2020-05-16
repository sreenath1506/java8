package org.demo1.funcinterfaces;

public class Apple {



    public Apple()
    {

    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Apple(int weight)
    {
        this.weight=weight;

    }

    public Apple(String colour,int weight)
    {
        this.weight=weight;
        this.colour=colour;
    }
    private int weight;
    private String colour;
}
