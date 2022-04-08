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
        int varX = 6;
        int varY = 7;
        if (varX > varY) {
            System.out.println("Переменная varX: " + varX + " больше переменной varY: " + varY);
        } else if (varX == varY) {
            System.out.println("Переменная varX: " + varX + " равна переменной varY: " + varY);
        } else {
            System.out.println("Переменная varX: " + varX + " меньше переменной varY: " + varY);
        }

        //Работа с числом
        System.out.println("\nРабота с числом");
        int workWithNumber = 123;
        if (workWithNumber % 2 == 0) {
            System.out.println("Число " + workWithNumber + " является четным");
        } else {
            System.out.println("Число " + workWithNumber + " является нечетным");
        }
        if (workWithNumber > 0) {
            System.out.println("Число " + workWithNumber + " является положительным");
        } else if (workWithNumber < 0) {
            System.out.println("Число " + workWithNumber + " является отрицательным");
        } else {
            System.out.println("Число " + workWithNumber + " равно нулю");
        }

        //Поиск общей цифры в числах
        System.out.println("\nПоиск общей цифры в числах");
        int matchingDigitX = 333;
        int matchingDigitY = 333;
        boolean matchingFirstDigit = false;
        boolean matchingSecondDigit = false;
        boolean matchingThirdDigit = false;
        int valueFirstDigit = 0;
        int valueSecondDigit = 0;
        int valueThirdDigit = 0;
        if (matchingDigitX / 100 == matchingDigitY / 100) {
            matchingFirstDigit = true;
            valueFirstDigit = matchingDigitX / 100;
        } 
        if (matchingDigitX % 100 / 10 == matchingDigitY % 100 / 10) {
            matchingSecondDigit = true;
            valueSecondDigit = matchingDigitX % 100 / 10;
        } 
        if (matchingDigitX % 10 == matchingDigitY % 10) {
            matchingThirdDigit = true;
            valueThirdDigit = matchingDigitX % 10;
        }
        if (!matchingFirstDigit && !matchingSecondDigit && !matchingThirdDigit) {
            System.out.println("У чисел " + matchingDigitX + " и " + matchingDigitY + " нет совпадающих цифр, стоящих в одном разряде");
        }
        if (matchingFirstDigit) {
            System.out.println("У чисел " + matchingDigitX + " и " + matchingDigitY + " совпадает число в первом разряде - " + valueFirstDigit);
        }
        if (matchingSecondDigit) {
            System.out.println("У чисел " + matchingDigitX + " и " + matchingDigitY + " совпадает число во втором разряде - " + valueSecondDigit);
        }
        if (matchingThirdDigit) {
            System.out.println("У чисел " + matchingDigitX + " и " + matchingDigitY + " совпадает число в третьем разряде - " + valueThirdDigit);
        }

        //Определение буквы, числа или символа по их коду
        System.out.println("\nОпределение буквы, числа или символа по их коду");
        char testChar = '\u005A';
        if (testChar >= 48 && testChar <= 57) {
            System.out.println(testChar + " - это цифра");
        } else if (testChar >= 65 && testChar <= 90) {
            System.out.println(testChar + " - это большая буква");
        } else if (testChar >= 97 && testChar <= 122) {
            System.out.println(testChar + " - это маленькая буква");
        } else {
            System.out.println(testChar + " - это не число и не буква");
        }

        //Определение суммы вкладка и начисленных банком %
        System.out.println("\nОпределение суммы вкладка и начисленных банком %");
        int deposit = 300_000;
        double depositTotal = 0;
        double interestRate = 0; 
        if (deposit <= 100_000) {
            depositTotal = deposit + deposit * 0.05;
            interestRate = 5;
        } else if (deposit > 100_000 && deposit < 300_000) {
            depositTotal = deposit + deposit * 0.07;
            interestRate = 7;
        } else {
            depositTotal = deposit + deposit * 0.1;
            interestRate = 10;
        }
        System.out.println("Сумма вклада = " + deposit);
        System.out.println("Процентная ставка = " + interestRate + "%");
        System.out.println("Итоговая сумма вклада с процентами = " + depositTotal);

        //Определение оценки по предметам
        System.out.println("\nОпределение оценки по предметам");
        int history = 59;
        int programming = 91;
        int historyResult = 0;
        int programmingResult = 0;
        if (history <= 60) {
            historyResult = 2;
        } else if (history > 91) {
            historyResult = 5;
        } else if (history > 73) {
            historyResult = 4;
        } else {
            historyResult = 3;
        }
        if (programming <= 60) {
            programmingResult = 2;
        } else if (programming > 91) {
            programmingResult = 5;
        } else if (programming > 73) {
            programmingResult = 4;
        } else {
            programmingResult = 3;
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
            System.out.println ("Прибыль продавца за год составляет + " + yearProfit + " руб");
        } else {
            System.out.println ("Убыток продавца за год составляет - " + yearProfit + " руб");
        }

        //Определение существования треугольника
        System.out.println("\nОпределение существования треугольника");
        int triangleA = 3;
        int triangleB = 4;
        int triangleC = 5;
        int angleA = 90;
        if (triangleA + triangleB > triangleC && triangleA + triangleC > triangleB && triangleB + triangleC > triangleA) {
            System.out.println("Треугольник со сторонами " + triangleA + ", " + triangleB + ", " + triangleC + " может существовать.");
        } else {
            System.out.println("Треугольник со сторонами " + triangleA + ", " + triangleB + ", " + triangleC + " не может существовать.");
        }
        if (triangleA < triangleC && triangleB < triangleC) {
            System.out.println("Катет a = " + triangleA + "\nКатет b = " + triangleB + "\nГипотенуза c = " + triangleC);
        }
        if (triangleA < triangleB && triangleC < triangleB) {
            System.out.println("Катет a = " + triangleA + "\nКатет b = " + triangleC + "\nГипотенуза c = " + triangleB);
        }
        if (triangleB < triangleA && triangleC < triangleA) {
            System.out.println("Катет a = " + triangleB + "\nКатет b = " + triangleC + "\nГипотенуза c = " + triangleA);
        }
        double p = (triangleA + triangleB + triangleC) / 2;
        double s = Math.sqrt(p * (p - triangleA) * (p - triangleB) * (p - triangleC));
        System.out.println("Площадь треугольника равно " + s);
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