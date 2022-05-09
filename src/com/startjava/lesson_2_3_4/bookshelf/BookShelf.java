package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookShelf {
    private static int bookCount = 0;
    private static Book[] books = new Book[10];
    static Scanner scanner = new Scanner(System.in);

    public static int getBookCount() {
        return bookCount;
    }

    public static void addBook() {
        Book book = new Book();
        System.out.print("Введите название книги: ");
        book.setTitle(scanner.nextLine());
        System.out.print("Введите имя автора: ");
        book.setAuthor(scanner.nextLine());
        System.out.print("Введите год издания: ");
        book.setYear(Integer.parseInt(scanner.nextLine()));
        books[bookCount] = book;
        bookCount++;
    }

    public static void removeBook() {
        System.out.print("Введите название книги, которую хотите удалить: ");
        String bookTitle = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            }
            if (books[i].getTitle().equals(bookTitle)) {
                System.arraycopy(books, i + 1, books, i, books.length - 1 - i);
            }
        }
        bookCount--;
    }

    public static void findBook() {
        System.out.print("Введите название книги: ");
        String bookTitle = scanner.nextLine();
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            if (book.getTitle().equals(bookTitle)) {
                System.out.format("Автор книги %s - %s, дата выпуска - %d\n", book.getTitle(), book.getAuthor(), book.getYear());
            }
        }
    }

    public static int findFreeSpace() {
        return books.length - bookCount;
    }

    public static void seeBookShelf() {
        for (Book book : books) {
            if (book == null) {
                System.out.println("<Пустая полка>");
            } else {
                System.out.format("<%s, %s, %d>\n", book.getAuthor(), book.getTitle(), book.getYear());
            }
        }
    }
}
