package ru.tinkoff.fintech.homework;

public class Boy {

    private final String name;
    private int age;

    public Boy(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public final String getName() {
        return name;
    }

    public final void setAge(final int age) {
        this.age = age;
    }

    public final int getAge() {
        return age;
    }

    @Override
    public final String toString() {
        return name + "-" + age;
    }

}
