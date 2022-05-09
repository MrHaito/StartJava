package com.startjava.lesson_2_3_4.array_test;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        double[] nums = new double[15];
        int countOfChanges = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random();
        }
        System.out.print("Исходный массив: ");
        for (double num : nums) {
            System.out.print(num + " ");
        }

        double midNum = nums[7];
        System.out.print("\nmidNum: " + midNum);

        double[] numsCopy = Arrays.copyOf(nums, nums.length);

        System.out.print("\nИзмененный массив: ");
        for (double num : numsCopy) {
            if (num > midNum) {
                num = 0;
                countOfChanges++;
            }
            System.out.print(num + " ");
        }
        System.out.print("\nКоличество измененных ячеек: " + countOfChanges);
    }
}
