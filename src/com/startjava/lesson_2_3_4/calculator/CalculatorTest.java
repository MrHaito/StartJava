package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        while (!answer.equals("no")) {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = scanner.nextLine();

            try {
                System.out.format("%s = %d\n", mathExpression, Calculator.calculate(mathExpression));
                do {
                    System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                    answer = scanner.nextLine();
                } while (!answer.equals("yes") && !answer.equals("no"));
            } catch (NumberFormatException e) {
                System.out.println("Числа должны быть целыми");
            } catch (IllegalArgumentException e) {
                System.out.println("Числа должны быть положительными");
            }
        }
    }
}
