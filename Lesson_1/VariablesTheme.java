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
        long cpu_name = 8400;
        System.out.println(cpu_name);
        char cpu_generation = 'i';
        System.out.println(cpu_generation);
        float cpu_ghz = 2.8F;
        System.out.println(cpu_ghz);
        double monitor_1_hz = 144;
        System.out.println(monitor_1_hz);
        System.out.println("");

        //Расчет стоимости товара со скидкой
        System.out.println("Расчет стоимости товара со скидкой");
        int x = 100;
        int y = 200;
        double descont = (x + y) * 0.11;
        double sum = x + y - descont;
        System.out.println(descont);
        System.out.println(sum);
        System.out.println("");

        //Вывод на консоль слова JAVA
        System.out.println("Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println("");

        //Отображение min и max значений числовых типов данных
        System.out.println("Отображение min и max значений числовых типов данных");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println(byteMax);
        System.out.println(shortMax);
        System.out.println(intMax);
        System.out.println(longMax);
        System.out.println(byteMax+1);
        System.out.println(byteMax-1);
        System.out.println(shortMax+1);
        System.out.println(shortMax-1);
        System.out.println(intMax+1);
        System.out.println(intMax-1);
        System.out.println(longMax+1);
        System.out.println(longMax-1);

        //Перестановка значений переменных
        System.out.println("Перестановка значений переменных");
        float a = 1.2F;
        double b = 2.4;
        double c;
        c = a;
        a = (float) b;
        b = c;
        System.out.println(a);
        System.out.println(b);
        System.out.println("");

        //Вывод символов и их кодов
        System.out.println("Вывод символов и их кодов");
        int char_35 = 35;
        int char_38 = 38;
        int char_64 = 64;
        int char_94 = 94;
        int char_95 = 95;
        System.out.println("35 - " + (char) char_35 );
        System.out.println("38 - " + (char) char_38 );
        System.out.println("64 - " + (char) char_64 );
        System.out.println("94 - " + (char) char_94 );
        System.out.println("95 - " + (char) char_95 );

        //Произведение и сумма цифр числа
        System.out.println("Произведение и сумма цифр числа");
        int int_full = 345;
        int int_1 = int_full / 100;
        int int_2 = int_full / 10 % 10;
        int int_3 = int_full % 100 % 10;
        System.out.println(int_1 + int_2 + int_3);
        System.out.println(int_1 * int_2 * int_3);
        System.out.println("");

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("Вывод на консоль ASCII-арт Дюка");
        String s1 = "/";
        String s2 = "\\";
        String s3 = "_";
        String s4 = "(";
        String s5 = ")";
        String s6 =" ";
        System.out.println(s6 + s6 +s6 + s6 +s1 + s2 + s6 + s6 +s6 + s6);
        System.out.println(s6 + s6 +s6 + s1 +s6 + s6 + s2 + s6 +s6 + s6);
        System.out.println(s6 + s6 +s1 + s3 +s4 + s6 + s5 + s2 +s6 + s6);
        System.out.println(s6 + s1 +s6 + s6 +s6 + s6 + s6 + s6 +s2 + s6);
        System.out.println(s1 + s3 +s3 + s3 +s3 + s1 + s2 + s3 +s3 + s2);
        System.out.println("");

        //Отображение количества сотен, десятков и единиц числа
        System.out.println("Отображение количества сотен, десятков и единиц числа");
        int full = 123;
        int full_1 = full / 100;
        int full_2 = full / 10 % 10;
        int full_3 = full % 100 % 10;
        System.out.println("сотая часть - " + full_1);
        System.out.println("десятая часть - " + full_2);
        System.out.println("единичная часть - " + full_3);
        System.out.println("");

        //Преобразование секунд
        System.out.println("Преобразование секунд");
        int seconds_full = 86399;
        int minutes_full = seconds_full / 60;
        int hours = minutes_full / 60;
        int minutes = minutes_full % 60;
        int seconds = minutes % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}