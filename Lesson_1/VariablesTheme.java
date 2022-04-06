public class VariablesTheme {
    public static void main (String[] args) {
        //Создание переменных и вывод их значений на консоль
        System.out.println("Создание переменных и вывод их значений на консоль");
        boolean pc = true;
        System.out.println(pc);
        byte monitors = 2;
        System.out.println(monitors);
        short gpuRam = 8148;
        System.out.println(gpuRam);
        int cpus = 6;
        System.out.println(cpus);
        long cpuName = 8400;
        System.out.println(cpuName);
        char cpuGeneration = 'i';
        System.out.println(cpuGeneration);
        float cpuGhz = 2.8F;
        System.out.println(cpuGhz);
        double monitorFirstHz = 144;
        System.out.println(monitorFirstHz);

        //Расчет стоимости товара со скидкой
        System.out.println("\nРасчет стоимости товара со скидкой");
        int fullPriceX = 100;
        int fullPriceY = 200;
        double descont = (fullPriceX + fullPriceY) * 0.11;
        double sumWithDescont = fullPriceX + fullPriceY - descont;
        System.out.println("Сумма скидки составляет: " + descont);
        System.out.println("Стоимость обоих товаров с учетом скидки: " + sumWithDescont);

        //Вывод на консоль слова JAVA
        System.out.println("\nВывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        //Отображение min и max значений числовых типов данных
        System.out.println("\nОтображение min и max значений числовых типов данных");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println(byteMax);
        System.out.println(shortMax);
        System.out.println(intMax);
        System.out.println(longMax);
        System.out.println(byteMax++);
        System.out.println(byteMax--);
        System.out.println(shortMax++);
        System.out.println(shortMax--);
        System.out.println(intMax++);
        System.out.println(intMax--);
        System.out.println(longMax++);
        System.out.println(longMax--);

        //Перестановка значений переменных
        System.out.println("\nПерестановка значений переменных");
        float a = 1.2F;
        double b = 2.4;
        double c;
        c = a;
        a = (float) b;
        b = c;
        System.out.println(a);
        System.out.println(b);

        //Вывод символов и их кодов
        System.out.println("\nВывод символов и их кодов");
        int char35 = 35;
        int char38 = 38;
        int char64 = 64;
        int char94 = 94;
        int char95 = 95;
        System.out.println("35 - " + (char) char35);
        System.out.println("38 - " + (char) char38);
        System.out.println("64 - " + (char) char64);
        System.out.println("94 - " + (char) char94);
        System.out.println("95 - " + (char) char95);

        //Произведение и сумма цифр числа
        System.out.println("\nПроизведение и сумма цифр числа");
        int scrNum = 345;
        int digit1 = scrNum / 100;
        int digit2 = scrNum / 10 % 10;
        int digit3 = scrNum % 10;
        System.out.println("Сумма: " + digit1 + digit2 + digit3);
        System.out.println("Произведение: " + digit1 * digit2 * digit3);

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("\nВывод на консоль ASCII-арт Дюка");
        char slash = 47;
        char backslash = 92;
        char underscore = 95;
        char leftBracket = 40;
        char rightBracket = 41;
        char space = 0;
        System.out.println(space + "" + space + "" + space + "" + space + "" + slash + "" + "" + backslash + "" + space + "" + space + "" + space + "" + space);
        System.out.println(space + "" + space + "" + space + "" + slash + "" + space + "" + space + "" + backslash + "" + space + "" + space + "" + space);
        System.out.println(space + "" + space + "" + slash + "" + underscore + "" + leftBracket + "" + space + "" + rightBracket + "" + backslash + "" + space + "" + space);
        System.out.println(space + "" + slash + "" + space + "" + space + "" + space + "" + space + "" + space + "" + space + "" + backslash + "" + space);
        System.out.println(slash + "" + underscore + "" + underscore + "" + underscore + "" + underscore + "" + slash + "" + backslash + "" + underscore + "" + underscore + "" + backslash);

        //Отображение количества сотен, десятков и единиц числа
        System.out.println("\nОтображение количества сотен, десятков и единиц числа");
        scrNum = 123;
        digit1 = scrNum / 100;
        digit2 = scrNum / 10 % 10;
        digit3 = scrNum % 10;
        System.out.println("сотая часть - " + digit1);
        System.out.println("десятая часть - " + digit2);
        System.out.println("единичная часть - " + digit3);

        //Преобразование секунд
        System.out.println("\nПреобразование секунд");
        int totalSec = 86399;
        int totalMin = totalSec / 60;
        int hours = totalMin / 60;
        int minutes = totalMin % 60;
        int seconds = minutes % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}