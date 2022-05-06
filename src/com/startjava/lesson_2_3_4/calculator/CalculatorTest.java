package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = "";

        while (!answer.equals("no")) {
            String math;

            do {
                System.out.print("Введите математическое выражение: ");
                math = scanner.nextLine();
            } while (!Calculator.checkNums(math));

            System.out.format("%s = %d\n", math, Calculator.calculate(math));
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}
