package com.startjava.lesson_2_3_4.person;

public class Person {
    String gender = "man";
    String name = "John";
    int height = 180;
    int weight = 80;
    int age = 25;

    void move() {
        System.out.println("Идти");
    }

    void sit() {
        System.out.println("Сидеть");
    }

    void run() {
        System.out.println("Бежать");
    }

    void talk() {
        System.out.println("Говорить");
    }

    void learnJava() {
        System.out.println("Учить Java");
    }
}