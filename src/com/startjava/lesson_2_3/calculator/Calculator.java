package com.startjava.lesson_2_3.calcucator;

public class Calculator {
    private int a;
    private int b;
    private char sign;
    private int result;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    void calculate() {
        switch(sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                break;
            case '%':
                result = a % b;
                break;
            default:
                break;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
