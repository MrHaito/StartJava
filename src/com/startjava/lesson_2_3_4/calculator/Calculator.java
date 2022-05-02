package com.startjava.lesson_2_3_4.calculator;

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

    int calculate() {
        switch(sign) {
            case '+':
                return Math.addExact(a, b);
            case '-':
                return Math.subtractExact(a, b);
            case '*':
                return Math.multiplyExact(a, b);
            case '/':
                return Math.floorDiv(a, b);
            case '^':
                return (int) Math.pow(a, b);
            case '%':
                return a % b;
            default:
                return 0;
        }
    }
}
