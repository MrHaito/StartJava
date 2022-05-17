package com.startjava.lesson_2_3_4.bookshelf;

public class BookShelf {
    private int bookCount = 0;
    private Book[] books = new Book[10];

    public int getBookCount() {
        return bookCount;
    }

    public void addBook(String title, String author, int year) throws ArrayIndexOutOfBoundsException {
        Book book = new Book(title, author, year);
        books[bookCount] = book;
        bookCount++;
    }

    public void removeBook(String title)  {
        boolean findBook = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                System.arraycopy(books, i + 1, books, i, bookCount - 1 - i);
                books[bookCount - 1] = null;
                findBook = true;
                bookCount--;
            }
        }
        if (!findBook) {
            System.out.format("Книга %s не найдена\n", title);
        }
    }

    public void findBook(String title) {
        boolean findBook = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.format("Автор книги %s - %s, дата выпуска - %d\n",
                        books[i].getTitle(), books[i].getAuthor(), books[i].getYear());
                findBook = true;
            }
        }
        if (!findBook) {
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
}
