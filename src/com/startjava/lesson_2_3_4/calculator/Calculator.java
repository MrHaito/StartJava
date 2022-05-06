package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static String calculate(String math) {
        String[] partsExpression = math.split(" ");
        try {
            int a = Integer.parseInt(partsExpression[0]);
            int b = Integer.parseInt(partsExpression[2]);
        } catch (NumberFormatException e) {
            System.out.println("Числа должны быть целыми");
            return "Неправильно";
        }
        int a = Integer.parseInt(partsExpression[0]);
        char sign = partsExpression[1].charAt(0);
        int b = Integer.parseInt(partsExpression[2]);

        if (!checkNums(a, b)) {
            return "Неправильно";
        }

        return switch (sign) {
            case '+' -> math + " = " + Math.addExact(a, b);
            case '-' -> math + " = " + Math.subtractExact(a, b);
            case '*' -> math + " = " + Math.multiplyExact(a, b);
            case '/' -> math + " = " + Math.floorDiv(a, b);
            case '^' -> math + " = " + (int) Math.pow(a, b);
            case '%' -> math + " = " + a % b;
            default -> "0";
        };
    }

    private static boolean checkNums(int a, int b) {
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
        return true;
    }
}
