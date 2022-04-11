public class CyclesTheme {
    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел
        System.out.println("\nПодсчет суммы четных и нечетных чисел");
        int num1 = -10;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (num1 % 2 == 0) {
                evenSum += num1;
            } else {
                oddSum += num1;
            }
            num1++;
        } while (num1 < 22);
        System.out.println("Сумма четных чисел = " + evenSum);
        System.out.println("Сумма нечетных чисел = " + oddSum);
    }
}