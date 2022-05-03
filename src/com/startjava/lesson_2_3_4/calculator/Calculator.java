package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;
    private String math = "";

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public char getSign() {
        return sign;
    }

    public void setMath(String math) {
        this.math = math;
    }

    int calculate() {
        String[] mathArray = math.split(" ");
        a = Integer.parseInt(mathArray[0]);
        sign = mathArray[1].charAt(0);
        b = Integer.parseInt(mathArray[2]);
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
