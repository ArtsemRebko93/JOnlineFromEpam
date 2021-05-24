package by.jonline.module4.task9;


/*
Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
 Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

import java.util.Objects;

public class Book {
    private static int ID;
    private int id;
    private String author;
    private String title;
    private String publishing_house;
    private int year_of_publishing;
    private int number_of_pages;
    private String price;
    private String binding_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishing_house() {
        return publishing_house;
    }

    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }

    public int getYear_of_publishing() {
        return year_of_publishing;
    }

    public void setYear_of_publishing(int year_of_publishing) {
        this.year_of_publishing = year_of_publishing;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBinding_type() {
        return binding_type;
    }

    public void setBinding_type(String binding_type) {
        this.binding_type = binding_type;
    }


    @Override
    public String toString() {
        return "id=" + id +
                "; Книга автора: " + author + '\'' +
                "; Название: " + title + '\'' +
                "; издание: " + publishing_house + '\'' +
                "; год публикации: " + year_of_publishing +
                "; кол-во страниц: " + number_of_pages +
                "; цена: " + price + '\'' +
                "; тип переплета: " + binding_type;
    }

    public Book(String author, String title,
                String publishing_house, int year_of_publishing,
                int number_of_pages, String price, String binding_type) {
        this.id = ID;
        this.author = author;
        this.title = title;
        this.publishing_house = publishing_house;
        this.year_of_publishing = year_of_publishing;
        this.number_of_pages = number_of_pages;
        this.price = price;
        this.binding_type = binding_type;
        ID++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                year_of_publishing == book.year_of_publishing &&
                number_of_pages == book.number_of_pages &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title) &&
                Objects.equals(publishing_house, book.publishing_house) &&
                Objects.equals(price, book.price) &&
                Objects.equals(binding_type, book.binding_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title, publishing_house, year_of_publishing, number_of_pages, price, binding_type);
    }
}
