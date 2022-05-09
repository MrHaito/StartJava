package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int count;
    private int arrayCount;
    private int[] nums = new int[GuessNumber.getGlobalCount()];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setArrayCount(int arrayCount) {
        this.arrayCount = arrayCount;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, arrayCount);
    }

    public void addNum(int num) {
        if (num > 0 && num < 101) {
            nums[arrayCount] = num;
            arrayCount++;
        }
        count++;
    }

    public void fillZero() {
        Arrays.fill(nums, 0, arrayCount, 0);
    }
}