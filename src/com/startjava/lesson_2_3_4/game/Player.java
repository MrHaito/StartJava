package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int num;
    private int count = GuessNumber.getGlobalCount();
    private int[] nums = new int[count];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getNums() {
        return nums;
    }

    void addNumInArray() {
        nums[nums.length - count] = num;
        count--;
    }
}