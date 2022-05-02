package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private float height;
    private int weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, float height, int weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public float getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    public void fight() {
        System.out.println(modelName + " начинает сражение");
    }

    public void useFirstWeapon() {
        System.out.println(modelName + " использует первое оружие");
    }

    public void useSecondWeapon() {
        System.out.println(modelName + " использует второе оружие");
    }

    public void walk() {
        System.out.println(modelName + " начинает движение");
    }
}