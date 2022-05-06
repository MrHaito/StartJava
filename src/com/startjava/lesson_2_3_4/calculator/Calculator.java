package com.startjava.lesson_2_3_4.calculator;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {

    static int[] getNums(String math) {
        String[] partsExpression = math.split(" ");
        int[] nums = new int[2];
        nums[0] = Integer.parseInt(partsExpression[0]);
        nums[1] = Integer.parseInt(partsExpression[2]);
        return nums;
    }

    static char getSign(String math) {
        String[] partsExpression = math.split(" ");
        return partsExpression[1].charAt(0);
    }

    static boolean checkNums(String math) {
        try {
            int a = getNums(math)[0];
            int b = getNums(math)[1];

            if (a < 0 && b < 0) {
                System.out.println("Оба числа должны быть положительными");
                return false;
            }
            if (a < 0) {
                System.out.println("Первое число должно быть положительными");
                return false;
            }
            if (b < 0) {
                System.out.println("Второе число должно быть положительным");
                return false;
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Числа должны быть целыми");
            return false;
        }
        return true;
    }

    static int calculate(String math) {
        int a = getNums(math)[0];
        char sign = getSign(math);
        int b = getNums(math)[1];
        return switch (sign) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> Math.floorDiv(a, b);
            case '^' -> (int) Math.pow(a, b);
            case '%' -> a % b;
            default -> 0;
        };
    }
}
