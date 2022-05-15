package com.startjava.lesson_2_3_4.bookshelf;

public class BookShelf {
    private int bookCount = 0;
    private boolean open = true;
    private Book[] books = new Book[10];

    public int getBookCount() {
        return bookCount;
    }

    public boolean isOpen() {
        return open;
    }

    public void addBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        books[bookCount] = book;
        bookCount++;
    }

    public void removeBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            }
            if (books[i].getTitle().equals(title)) {
                System.arraycopy(books, i + 1, books, i, books.length - 1 - i);
            }
        }
        bookCount--;
    }

    public void findBook(String title) {
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            if (book.getTitle().equals(title)) {
                System.out.format("Автор книги %s - %s, дата выпуска - %d\n", book.getTitle(), book.getAuthor(), book.getYear());
            }
        }
    }

    public int findFreeSpace() {
        return books.length - bookCount;
    }

    public void showBookShelf() {
        for (Book book : books) {
            if (book == null) {
                System.out.println("<Пустая полка>");
            } else {
                System.out.format("<%s, %s, %d>\n", book.getAuthor(), book.getTitle(), book.getYear());
            }
        }
    }

    public void close() {
        open = false;
    }
}
