package com.startjava.lesson_2_3_4.array;

public class ArrayMain {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {5.1f, .5f, 200.5f};

        System.out.println(numbers.length);
        System.out.println(numbers1.length);

        for (float v : numbers1) {
            System.out.print(v + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        String[] text = new String[3];

    }
}
