package by.jonline.module4.agregation.task1;

/*
Создать объект класса Текст, используя классы Предложение, Слово.
 Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Text {

    private Proposal proposal;
    private Word word;
    private StringBuilder builder = new StringBuilder();
    private String head = "";
    private final String DELIMETER = " ";

    public Text (Proposal proposal, Word word) {
        this.proposal = proposal;
        this.word = word;
        builder.append(proposal.getProposal());
        builder.append(DELIMETER);
        builder.append(word.getWord());
    }

    public Text () {

    }

    public Text (Proposal proposal) {
        this.proposal = proposal;
        builder.append(proposal.getProposal());
    }

    public Text (Word word) {
        this.word = word;
        builder.append(word.getWord());
    }

    public void setHeading (Word word) {
        head += word.getWord() + "\n";
    }

    public void setHeading (Proposal proposal) {
        head += proposal.getProposal() + "\n";
    }

    public void supplementText (Word word) {
        builder.append(word.getWord());
    }

    public void supplementText (Proposal proposal) {
        builder.append(proposal.getProposal());
    }

    public void printText () {
        if (head.equals("")) {
            System.out.println("\"NO NAME TEXT\"" + builder.toString());
        }
        System.out.println(head + builder.toString());
    }
    public void printHeading () {
        System.out.println(head);
    }
}
