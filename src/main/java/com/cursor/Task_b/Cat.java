package com.cursor.Task_b;

public class Cat implements Comparable<Cat>{
    private int age;
    private String name, catBreed;

    public Cat(int age, String name, String catBreed) {
        this.age = age;
        this.name = name;
        this.catBreed = catBreed;
    }

    @Override
    public String toString() {
        return "Cat{" + "age=" + age + ", name='" + name + '\'' + ", catBreed='" + catBreed + '\'' + '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return this.catBreed.compareTo(cat.catBreed);
    }
}