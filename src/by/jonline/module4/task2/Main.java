package by.jonline.module4.task2;

public class Main {
    public static void main(String[] args) {
        Test2 test = new Test2();
        Test2 test1 = new Test2("M.Y.Lermontov",1786);
        System.out.println(test.getAuthor() + " " + test.getYear());
        System.out.println(test1.getAuthor() + " " + test1.getYear());
        test.setAuthor("No name");
        System.out.println(test.getAuthor());
    }
}
