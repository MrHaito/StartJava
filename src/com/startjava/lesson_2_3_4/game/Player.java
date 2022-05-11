package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int globalCount;
    private int countOfCurrectNumber;
    private int[] nums = new int[GuessNumber.getGlobalCount()];
    private int countOfWins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGlobalCount() {
        return globalCount;
    }

    public void setGlobalCount(int globalCount) {
        this.globalCount = globalCount;
    }

    public void setCountOfCurrectNumber(int countOfCurrectNumber) {
        this.countOfCurrectNumber = countOfCurrectNumber;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, countOfCurrectNumber);
    }

    public int getCountOfWins() {
        return countOfWins;
    }

    public void setCountOfWins(int countOfWins) {
        this.countOfWins = countOfWins;
    }

    public int addNum(int num) {
        if (num > 0 && num < 101) {
            nums[countOfCurrectNumber] = num;
            countOfCurrectNumber++;
        }
        globalCount++;
        return num;
    }

    public void fillZero() {
        Arrays.fill(nums, 0, countOfCurrectNumber, 0);
    }
}