public class CyclesTheme {
    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел
        System.out.println("Подсчет суммы четных и нечетных чисел");
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

        //Вывод чисел между max и min
        //В этой задаче есть еще вариант попарного сравнения числа с двумя другими, чтобы определить является ли оно минимальным или максимальным среди трех, а потом из оставшихся двух также найти минимум и максимум. Но я остановился на таком варианте, так как тут гораздо меньше кода получается.
        System.out.println("\nВывод чисел между max и min");
        num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if (num1 < min) {
            min = num1;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num1 > max) {
            max = num1;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }
}