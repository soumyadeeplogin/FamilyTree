package com.familytree.structure;
/*
 * This is a POJO that stores the details of the Person
 * @String name is the name of the person
 * @int age is the age of the person
 */

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age)
            return 1;
        if (this.age < o.age)
            return -1;
        return 0;
    }
}