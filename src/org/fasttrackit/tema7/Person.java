package org.fasttrackit.tema7;

public class Person {

    private String name;

    private int age;

    private boolean married;


    Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isMarried() {
        return this.married;
    }

    public String toString() {

        return (String.format("%s are %d de ani si este maritat? ", name, age) + married);
    }
}
