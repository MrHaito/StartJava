public class CyclesTheme {
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int num1 = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (num1 % 2 == 0) {
                sumEven += num1;
            } else {
                sumOdd += num1;
            }
            num1++;
        } while (num1 <= 21);
        System.out.println("Сумма четных чисел = " + sumEven);
        System.out.println("Сумма нечетных чисел = " + sumOdd);

        //2. Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min");
        num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        int max = num2;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num1 > max) {
            max = num1;
        }
        if (num3 > max) {
            max = num3;
        }
        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int count = 0;
        int digit = 0;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (srcNum != 0) {
            digit = srcNum % 10;
            sumDigits += digit;
            srcNum /= 10;
            System.out.print(digit);
        }
        System.out.println("\nСумма полученных чисел: " + sumDigits);

        //4. Вывод чисел на консоль в несколько строк
        int start = 1;
        int end = 24;
        int countNumbers = 0;
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (int i = 1, j = 0; i < end; i+=2, j++) {
            if (j % 5 == 0 && j != 0) {
                System.out.print("\n");
            }
            System.out.format("%3d ", i);
            countNumbers++;
        }
        int countZeros = 5 - countNumbers % 5;
        for (int i = 0; i < countZeros; i++) {
            System.out.format("%3d ", 0);
        }

        //5. Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");
        srcNum = 3141591;
        int unitCount = 0;
        count = 0;
        while (srcNum != 0) {
            if (srcNum % 10 == 1) {
                unitCount++;
            }
            srcNum /= 10;
        }
        System.out.println("Количество единиц: " + unitCount);
        if (unitCount % 2 == 0) {
            System.out.println("Количество единиц четное");
        } else {
            System.out.println("Количество единиц нечетное");
        }

        //6. Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.print("\n");
            }
            System.out.print("*");
        }
        System.out.print("\n\n");
        int count1 = 5;
        while (count1 >= 0) {
            int count2 = 0;
            while (count2 < count1) {
                System.out.print("#");
                count2++;
            }
            count1--;
            System.out.print("\n");
        }
        count1 = 0;
        do {
            if (count1 < 3) {
                int count2 = 0;
                do {
                    System.out.print("$");
                    count2++;
                } while (count2 <= count1);
            } else {
                int count2 = 2;
                do {
                    count2--;
                    System.out.print("$");
                } while (count2 > count1 - 3);
            }
            System.out.print("\n");
            count1++;
        } while (count1 < 5);

        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        for (int i = 0; i <= 127; i++) {
            if ((i < 48 || i > 57) && (i < 65 || i > 90) && (i < 97 || i > 122)) {
                if (i % 2 != 0) {
                    System.out.print((char) i + " ");
                }
            }
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        srcNum = 12321;
        int srcNumBuffer = srcNum;
        int reversedSrcNum = 0;
        while(srcNum != 0) {
            digit = srcNum % 10;
            reversedSrcNum = reversedSrcNum * 10 + digit;
            srcNum /= 10;
        }
        if (reversedSrcNum == srcNumBuffer) {
            System.out.println("Число " + srcNumBuffer + " является палиндромом");
        } else {
            System.out.println("Число " + srcNumBuffer + " не является палиндромом");
        }

        //9. Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 123321;
        int srcNumFirst = srcNum / 1000;
        int srcNumSecond = srcNum % 1000;
        int digitSumFirst = 0;
        int digitSumSecond = 0;
        count = 0;
        while (count < 3) {
            digitSumFirst += srcNumFirst % 10;
            srcNumFirst = srcNumFirst / 10;
            count++;
        }
        count = 0;
        while (count < 3) {
            digitSumSecond += srcNumSecond % 10;
            srcNumSecond = srcNumSecond / 10;
            count++;
        }
        if (digitSumFirst == digitSumSecond) {
            System.out.println("Число " + srcNum + " является счастливым");
        } else {
            System.out.println("Число " + srcNum + " не является счастливым");
        }

        //10. Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0 && i == 0) {
                    System.out.print("   ");
                    continue;
                }
                if (j == 0 && i != 1) {
                    System.out.format("%2d ", i);
                }
                if (i == 0 && j != 1) {
                    System.out.format("%2d ", j);
                    continue;
                }
                if (i == 1) {
                    System.out.print(" - ");
                    continue;
                }
                if (j == 1) {
                    System.out.print(" | ");
                } 
                if (i > 1 && j > 1) {
                    int k = i * j;
                    System.out.format("%2d ", k);
                }
            }
            System.out.print("\n");
        }
    }
}