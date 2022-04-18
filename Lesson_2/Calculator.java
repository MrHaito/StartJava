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

    void calculation() {
        switch(sign) {
            case '+':
                this.result = a + b;
                break;
            case '-':
                this.result = a - b;
                break;
            case '*':
                this.result = a * b;
                break;
            case '/':
                this.result = a / b;
                break;
            case '^':
                this.result = a;
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