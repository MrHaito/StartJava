package com.startjava.lesson_2_3_4.array_test;

public class ArrayTheme {
    public static void main(String[] args) {
        double[] nums = new double[15];
        int countOfChanges = 0;

        System.out.print("Исходный массив: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random();
            System.out.print(nums[i] + " ");
        }

        double midNum = nums[nums.length / 2];
        System.out.print("\nmidNum: " + midNum);

        System.out.print("\nИзмененный массив: ");
        for (double num : nums) {
            if (num > midNum) {
                num = 0;
                countOfChanges++;
            }
            System.out.print(num + " ");
        }
        System.out.print("\nКоличество измененных ячеек: " + countOfChanges);
    }
}
