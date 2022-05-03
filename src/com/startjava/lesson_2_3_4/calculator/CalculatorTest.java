package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        while(!answer.equals("no")) {
            System.out.print("Введите математическое выражение: ");
            calculator.setMath(scanner.nextLine());
            calculator.calculate();
            System.out.println(calculator.getA() + " " + calculator.getSign() + " " + calculator.getB() + " = " + calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}
