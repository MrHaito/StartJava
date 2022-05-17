package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookShelfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookShelf bookShelf = new BookShelf();
        boolean exit = false;

        String menu = """
                1. Добавить книгу
                2. Удалить книгу
                3. Найти книгу по названию
                4. Вывести количество книг
                5. Показать свободное место
                6. Закрыть полку
                """;

        do {
            System.out.println("Доступные команды: ");
            System.out.print(menu);
            System.out.println("Текущее состояние полки:");
            bookShelf.showBookShelf();
            System.out.print("Для выбора команды введите цифру (например, 1): ");
            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите имя автора: ");
                    String author = scanner.nextLine();
                    System.out.print("Введите год издания: ");
                    try {
                        int year = Integer.parseInt(scanner.nextLine());
                        bookShelf.addBook(title, author, year);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("На полке нет места.");
                    } catch (NumberFormatException e) {
                        System.out.println("Год должен быть числом");
                    }
                }
                case "2" -> {
                    System.out.print("Введите название книги, которую хотите удалить: ");
                    String title = scanner.nextLine();
                    bookShelf.removeBook(title);
                }
                case "3" -> {
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    bookShelf.findBook(title);
                }
                case "4" -> System.out.println("Количество книг на полке: " + bookShelf.getBookCount());
                case "5" -> System.out.println("Количество свободного места на полке: " + bookShelf.findFreeSpace());
                case "6" -> exit = true;
            }
        } while (!exit);
    }
}
