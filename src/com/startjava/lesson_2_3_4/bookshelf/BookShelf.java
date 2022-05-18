package com.startjava.lesson_2_3_4.bookshelf;

public class BookShelf {
    private int bookCount = 0;
    private Book[] books = new Book[10];

    public int getBookCount() {
        return bookCount;
    }

    public void addBook(String title, String author, int year) {
        int bookIndex = findIndexBook(title);
        if (bookIndex >= 0) {
            System.out.println("Книга с таким названием уже есть на полке");
            return;
        }
        if (bookCount == books.length) {
            System.out.println("На полке нет места");
        } else {
            Book book = new Book(title, author, year);
            books[bookCount] = book;
            bookCount++;
        }
    }

    public void removeBook(String title)  {
        int bookIndex = findIndexBook(title);
        if (bookIndex >= 0) {
            System.arraycopy(books,  bookIndex + 1, books, bookIndex, bookCount - 1 - bookIndex);
            books[bookCount - 1] = null;
            bookCount--;
        } else {
            System.out.format("Книга %s не найдена\n", title);
        }
    }

    public void findBook(String title) {
        int bookIndex = findIndexBook(title);
        if (bookIndex >= 0) {
            System.out.println(books[bookIndex]);
        } else {
            System.out.format("Книга %s не найдена\n", title);
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

    private int findIndexBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }
}
