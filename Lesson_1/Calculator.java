public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        String sign = "%";
        int result = 0;
        if (sign.equals("+")) {
            result = a + b;
        } else if (sign.equals("-")) {
            result = a - b;
        } else if (sign.equals("*")) {
            result = a * b;
        } else if (sign.equals("/")) {
            result = a / b;
        } else if (sign.equals("^")) {
            result = a;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } else if (sign.equals("%")) {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}