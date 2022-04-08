package org.example;

public class Teacher implements PersonChecker {
    private String name;
    private int age;
    private float wordInMinute;

    public Teacher(String name, int age, float wordInMinute) {
        this.name = name;
        this.age = age;
        this.wordInMinute = wordInMinute;
    }

    public static final int MAXIMUM_WORD_IN_MINUTES=100;
    @Override
    public boolean isOk() {
        return wordInMinute< MAXIMUM_WORD_IN_MINUTES;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wordInMinute=" + wordInMinute +
                '}';
    }
}
