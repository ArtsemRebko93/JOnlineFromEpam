package by.jonline.module4.task2;

public class Test2 {
    private String author;
    private int year;

    Test2 (String author, int year) {
        this.author = author;
        this.year = year;
    }

    Test2 () {
        author = "Pushkin A.S";
        year = 1812;
    }

    public void setYear (int year) {
        this.year = year;
    }
    public int getYear () {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
