public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        System.out.println("Перевод псевдокода на язык Java");
        int age = 22;
        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else {
            System.out.println("Возраст меньше 20 лет");
        }
        boolean genderMale = false;
        if (!genderMale) {
            System.out.println("Женский пол");
        }
        double height = 1.75;
        if (height < 1.80) {
            System.out.println("Рост меньше 180 см");
        }
        char firstLetterName = "Олег".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени - M");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени - I");
        } else {
            System.out.println("Первая буква имени неизвестна");
        }

        //Поиск максимального и минимального числа
        System.out.println("\nПоиск максимального и минимального числа");
        int num1 = 6;
        int num2 = 7;
        if (num1 > num2) {
            System.out.println("Переменная num1: " + num1 + " больше переменной num2: " + num2);
        } else if (num1 == num2) {
            System.out.println("Переменная num1: " + num1 + " равна переменной num2: " + num2);
        } else {
            System.out.println("Переменная num1: " + num1 + " меньше переменной num2: " + num2);
        }

        //Работа с числом
        System.out.println("\nРабота с числом");
        int srcNum = 123;
        if (srcNum % 2 == 0) {
            System.out.println("Число " + srcNum + " является четным");
        } else {
            System.out.println("Число " + srcNum + " является нечетным");
        }
        if (srcNum > 0) {
            System.out.println("Число " + srcNum + " является положительным");
        } else if (srcNum < 0) {
            System.out.println("Число " + srcNum + " является отрицательным");
        } else {
            System.out.println("Число " + srcNum + " равно нулю");
        }

        //Поиск общей цифры в числах
        System.out.println("\nПоиск общей цифры в числах");
        num1 = 123;
        num2 = 456;
        boolean matchingFirstDigit = false;
        boolean matchingSecondDigit = false;
        boolean matchingThirdDigit = false;
        if (num1 / 100 == num2 / 100) {
            System.out.println("У чисел " + num1 + " и " + num2 + " совпадает число в первом разряде - " + num1 / 100);
            matchingFirstDigit = true;
        }
        if (num1 % 100 / 10 == num2 % 100 / 10) {
            System.out.println("У чисел " + num1 + " и " + num2 + " совпадает число во втором разряде - " + num1 % 100 / 10);
            matchingSecondDigit = true;
        } 
        if (num1 % 10 == num2 % 10) {
            System.out.println("У чисел " + num1 + " и " + num2 + " совпадает число в третьем разряде - " + num1 % 10);
            matchingThirdDigit = true;

        }
        if (!matchingFirstDigit && !matchingSecondDigit && !matchingThirdDigit) {
            System.out.println("У чисел " + num1 + " и " + num2 + " нет совпадающих цифр, стоящих в одном разряде");
        }

        //Определение буквы, числа или символа по их коду
        System.out.println("\nОпределение буквы, числа или символа по их коду");
        char unknownChar = '\u005A';
        if (unknownChar >= 48 && unknownChar <= 57) {
            System.out.println(unknownChar + " - это цифра");
        } else if (unknownChar >= 65 && unknownChar <= 90) {
            System.out.println(unknownChar + " - это большая буква");
        } else if (unknownChar >= 97 && unknownChar <= 122) {
            System.out.println(unknownChar + " - это маленькая буква");
        } else {
            System.out.println(unknownChar + " - это не число и не буква");
        }

        //Определение суммы вкладка и начисленных банком %
        System.out.println("\nОпределение суммы вкладка и начисленных банком %");
        int deposit = 300_000;
        double depositTotal = 0;
        double interestRate = 0; 
        if (deposit <= 100_000) {
            interestRate = 0.05;
        } else if (deposit > 100_000 && deposit < 300_000) {
            interestRate = 0.07;
        } else {
            interestRate = 0.1;
        }
        depositTotal = deposit + deposit * interestRate;
        System.out.println("Сумма вклада = " + deposit);
        System.out.println("Процентная ставка = " + interestRate * 100 + "%");
        System.out.println("Итоговая сумма вклада с процентами = " + depositTotal);

        //Определение оценки по предметам
        System.out.println("\nОпределение оценки по предметам");
        int history = 59;
        int programming = 91;
        int historyResult = 0;
        int programmingResult = 0;
        if (history <= 60) {
            historyResult = 2;
        } else if (history > 60 && history <= 73) {
            historyResult = 3;
        } else if (history > 73 && history <= 91) {
            historyResult = 4;
        } else {
            historyResult = 5;
        }
        if (programming <= 60) {
            programmingResult = 2;
        } else if (programming > 60 && programming <= 73) {
            programmingResult = 3;
        } else if (programming > 73 && programming <= 91) {
            programmingResult = 4;
        } else {
            programmingResult = 5;
        }
        System.out.println("История - " + historyResult);
        System.out.println("Программирование - " + programmingResult);
        System.out.println("Средний балл - " + (historyResult + programmingResult) / 2);
        System.out.println("Средний % по предметам - " + (history + programming) / 2 + "%");

        //Расчет прибыли (убытка)
        System.out.println("\nРасчет прибыли (убытка)");
        int rent = 5_000;
        int mediumCost = 15_000;
        int selfCost = 9_000;
        int yearProfit = (mediumCost - selfCost - rent) * 12;
        if (yearProfit > 0) {
            System.out.println ("Прибыль продавца за год составляет +" + yearProfit + " руб");
        } else {
            System.out.println ("Убыток продавца за год составляет " + yearProfit + " руб");
        }

        //Определение существования треугольника
        System.out.println("\nОпределение существования треугольника");
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int angleA = 90;
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("Треугольник со сторонами " + sideA + ", " + sideB + ", " + sideC + " может существовать.");
        } else {
            System.out.println("Треугольник со сторонами " + sideA + ", " + sideB + ", " + sideC + " не может существовать.");
        }
        if (sideC > sideA && sideC > sideB) {
            System.out.println("Катет a = " + sideA + "\nКатет b = " + sideB + "\nГипотенуза c = " + sideC);
        }
        if (sideB > sideA && sideB > sideC) {
            System.out.println("Катет a = " + sideA + "\nКатет b = " + sideC + "\nГипотенуза c = " + sideB);
        }
        if (sideA > sideB && sideA > sideC) {
            System.out.println("Катет a = " + sideB + "\nКатет b = " + sideC + "\nГипотенуза c = " + sideA);
        }
        double halfPerimetr = (sideA + sideB + sideC) / 2;
        double square = Math.sqrt(halfPerimetr * (halfPerimetr - sideA) * (halfPerimetr - sideB) * (halfPerimetr - sideC));
        System.out.println("Площадь треугольника равна " + square);
        System.out.println("Изображение треугольника");
        System.out.println("|\\");
        System.out.println("| \\");
        System.out.println("|  \\");
        System.out.println("|___\\");

        //Подсчет количества банкнот
        System.out.println("\nПодсчет количества банкнот");
        int moneyTotal = 567;
        int banknoteCount = 0;
        int banknoteCount50 = 567 / 50;
        banknoteCount = banknoteCount + banknoteCount50;
        System.out.println("Банкнот по 50 нужно " + banknoteCount50);
        int banknoteCount10 = (moneyTotal - 50 * banknoteCount50) / 10;
        banknoteCount = banknoteCount + banknoteCount10;
        System.out.println("Банкнот по 10 нужно " + banknoteCount10);
        int banknoteCount1 = moneyTotal - (50 * banknoteCount50 + 10 * banknoteCount10);
        banknoteCount = banknoteCount + banknoteCount1;
        System.out.println("Банкнот по 1 нужно " + banknoteCount1);
        System.out.println("Общее количество банкнот - " + banknoteCount);
        System.out.println("Расчет исходной суммы по полученному количеству номиналов банкнот");
        System.out.println(banknoteCount50 + " по 50 + " + banknoteCount10 + " по 10 + " + banknoteCount1 + " по 1 = " + (banknoteCount50 * 50 + banknoteCount10 * 10 + banknoteCount1));
    }
}