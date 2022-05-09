package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookShelfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                1. Добавить книгу
                2. Удалить книгу
                3. Найти книгу по названию
                4. Вывести количество книг
                5. Показать свободное место
                """;
        String answer = "";
        String menuSelect = "";

        while (!answer.equals("no")) {
            System.out.println("Доступные команды: ");
            System.out.print(menu);
            System.out.println("Текущее состояние полки:");
            BookShelf.seeBookShelf();
            System.out.print("Для выбора команды введите цифру (например, 1): ");
            menuSelect = scanner.nextLine();
            switch (menuSelect) {
                case "1" -> BookShelf.addBook();
                case "2" -> BookShelf.removeBook();
                case "3" -> BookShelf.findBook();
                case "4" -> System.out.println("Количество книг на полке: " + BookShelf.getBookCount());
                case "5" -> System.out.println("Количество свободного места на полке: " + BookShelf.findFreeSpace());
            }

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }

    }

}
