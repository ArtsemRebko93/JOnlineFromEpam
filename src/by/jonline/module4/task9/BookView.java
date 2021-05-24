package by.jonline.module4.task9;

public class BookView {

    public void printTitleByAuthor (Library library,String author) {
        for (int i = 0; i < library.getSize(); i++) {
            if (library.getBooks()[i].getAuthor().equalsIgnoreCase(author)) {
                print(library.getBooks()[i]);
            }
        }
    }

    public void printTitleByPublishingHouse (Library library,String publishing_house) {
        for (int i = 0; i < library.getSize(); i++) {
            if(library.getBooks()[i].getPublishing_house().equalsIgnoreCase(publishing_house)) {
                print(library.getBooks()[i]);
            }
        }
    }

    public void printTitleAfterCurrentYear (Library library,int year) {
        for (int i = 0; i < library.getSize(); i++) {
            if (library.getBooks()[i].getYear_of_publishing() > year) {
                print(library.getBooks()[i]);
            }
        }
    }

    private void print (Book book) {
        System.out.println(book.toString());
    }

}
