package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        while (!answer.equals("no")) {
            System.out.print("������� �������������� ���������: ");
            String math = scanner.nextLine();

            try {
                System.out.format("%s = %d\n", math, Calculator.calculate(math));
                do {
                    System.out.print("������ ���������� ����������? [yes/no]: ");
                    answer = scanner.nextLine();
                } while (!answer.equals("yes") && !answer.equals("no"));
            }
            catch (NumberFormatException e) {
                System.out.println("����� ������ ���� ������");
            } catch (Exception e) {
                System.out.println("����� ������ ���� ��������������");
            }
        }
    }
}
