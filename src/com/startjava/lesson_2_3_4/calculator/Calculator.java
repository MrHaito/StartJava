package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static int calculate(String math) throws IllegalArgumentException {
        String[] partsExpression = math.split(" ");
        int a = Integer.parseInt(partsExpression[0]);
        char sign = partsExpression[1].charAt(0);
        int b = Integer.parseInt(partsExpression[2]);

        checkNums(a, b);

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

    private static void checkNums(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Числа должны быть положительными");
        }
    }
}
