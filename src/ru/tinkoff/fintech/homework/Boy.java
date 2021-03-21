package ru.tinkoff.fintech.homework;

import java.util.ArrayList;

public class Boy {

    private String name;
    private int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() { return age;}

    @Override
    public String toString() { return name + "-" + age; }

}
