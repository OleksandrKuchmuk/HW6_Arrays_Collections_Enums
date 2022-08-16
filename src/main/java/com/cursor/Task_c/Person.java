package com.cursor.Task_c;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;

    ArrayList<Account> accountsList= new ArrayList<>();
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
