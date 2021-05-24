package by.jonline.module4.task9;

public class BookTest {
    public static void main(String[] args) {

        Library library = new Library(8);
        Book lunatik = new Book("Mark Tven","Lunatik",
                "BMZ",1970,1234,
                "120$","Pereplet");

        Book head_first = new Book("Syerra K.","Head First",
                "Dom",2005,710,
                "100$","Net pages");

        Book skazka = new Book("Mama","Kolobok","HomeMade",
                2021,25,"0$","solid");

        library.addBook(lunatik);
        library.addBook(head_first);
        library.addBook(skazka);
        library.addBook(skazka);
        library.addBook(skazka);
        library.addBook(skazka);
        BookView view = new BookView();
        view.printTitleAfterCurrentYear(library,2005);

    }
}
