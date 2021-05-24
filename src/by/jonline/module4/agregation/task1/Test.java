package by.jonline.module4.agregation.task1;

public class Test {
    public static void main(String[] args) {

        Word name = new Word("Marix");
        Proposal firstString = new Proposal("This is how i imagined my future!");
        Text text = new Text(firstString);
        text.setHeading(name);
        text.supplementText(new Word("My best choice ever!"));
        text.printText();
    }
}
