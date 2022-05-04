package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int count;
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

    public int[] getNums() {
        return Arrays.copyOf(nums, count);
    }

    public void addNum(int num) {
        nums[count] = num;
        count++;
    }

    public void fillZero() {
        Arrays.fill(nums, 0, count, 0);
    }
}