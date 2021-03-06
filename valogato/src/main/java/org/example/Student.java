package org.example;

public class Student implements PersonChecker {
   private String name;
    private int age;
    private int cheatNumber;
    private float average;

    public Student(String name, int age, int cheatNumber, float average) {
        this.name = name;
        this.age = age;
        this.cheatNumber = cheatNumber;
        this.average = average;
    }

    public static double GOOD_AVERAGE_MINIMUM = 4.0;

    @Override
    public boolean isOk() {
        return average > GOOD_AVERAGE_MINIMUM && cheatNumber == 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cheatNumber=" + cheatNumber +
                ", average=" + average +
                '}';
    }
}
