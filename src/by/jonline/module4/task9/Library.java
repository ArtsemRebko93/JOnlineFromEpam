package by.jonline.module4.task9;

public class Library {

    private Book [] books;
    private int size;
    private int capacity;

    public Library() {
        this(10);
    }

    public Library(int capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
    }

    public void printArray () {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i].toString());
        }
    }

    public void addBook (Book book) {
        if (size < capacity) {
            books[size] = book;
            size++;
        } else {
            Book [] booksLarger = new Book[capacity * 2];
            for (int i = 0; i < size; i++) {
                booksLarger[i] = books[i];
            }
            books = booksLarger;
            capacity = capacity * 2;
            books[size] = book;
            size++;
        }
    }

    public int lenght () {
        return books.length;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getSize() {
        return size;
    }
}
