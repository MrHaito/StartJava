public class CyclesTheme {
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
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
        } while (num1 <= 21);
        System.out.println("Сумма четных чисел = " + evenSum);
        System.out.println("Сумма нечетных чисел = " + oddSum);

        //2. Вывод чисел между max и min
        //В этой задаче есть еще вариант попарного сравнения числа с двумя другими, чтобы определить является ли оно минимальным или максимальным среди трех, а потом из оставшихся двух также найти минимум и максимум. Но я остановился на таком варианте, так как тут гораздо меньше кода получается.
        System.out.println("\n2. Вывод чисел между max и min");
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
        for (int i = max-1; i > min; i--) {
            System.out.print(i + " ");
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int count = 0;
        int srcNumBuffer = 0;
        int srcDigitSum = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (count < 4) {
            srcNumBuffer = srcNum % 10;
            srcDigitSum += srcNumBuffer;
            srcNum /= 10;
            System.out.print(srcNumBuffer);
            count++;
        }
        System.out.println("\nСумма полученных чисел: " + srcDigitSum);

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (int i = 1, j = 0; i < 24; i+=2, j++) {
            if (j % 5 == 0 && j != 0) {
                System.out.print("\n");
            }
            System.out.format("%2d ", i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.format("%2d ", 0);
        }

        //5. Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");
        srcNum = 3141591;
        int srcBuffer = 0;
        int unitCount = 0;
        count = 0;
        while (count < 7) {
            srcBuffer = srcNum % 10;
            if (srcBuffer == 1) {
                unitCount++;
            }
            srcNum /= 10;
            count++;
        }
        System.out.println("Количество единиц: " + unitCount);
        if (unitCount % 2 == 0) {
            System.out.println("Количество единиц четное");
        } else {
            System.out.println("Количество единиц нечетное");
        }

        //6. Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
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
        //У меня в этой задаче почему то в строчку выводятся одни символы, в столбец другие, я не могу точно проверить результат. Но вообще условия вроде заданы правильно.
        System.out.println("\n7. Отображение ASCII-символов");
        for (int i = 0; i <= 127; i++) {
            if (i < 48 || i > 57 && i < 65 || i > 90 && i < 97 || i > 122) {
                if (i % 2 != 0) {
                    System.out.print((char) i + " ");
                }
            }
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        srcNum = 12321;
        srcNumBuffer = srcNum;
        int reversedSrcNum = 0;
        while(srcNum != 0) {
            int digit = srcNum % 10;
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