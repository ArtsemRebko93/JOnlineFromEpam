package by.jonline.module3.regular;

// Cоздать приложение, разбирающее текст (текст хранится в строке)
// и позволяющее выполнять с текстом три различных операции:
// - отсортировать абзацы по количеству предложений;
// - в каждом предложении отсортировать слова по длине;
// - отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
// - а в случае равенства – по алфавиту.

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormater {

    private static void sortParagraph(String text) {
        String [] paragraph = text.split("\n");
        int [] counterSentences = new int[paragraph.length];
        int maxLegthParagraph = 0; //
        for (int i = 0; i < paragraph.length; i++) {
            String [] sentences = splitOnSentences(paragraph[i]);
            counterSentences[i] = sentences.length;
            if (maxLegthParagraph < sentences.length) {
                maxLegthParagraph = sentences.length;
            }
        }

        for (int i = 1; i <= maxLegthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraph[j]);
                }
            }
        }
    }

    private static void sortSentences (String text) {
       String [] paragraph = text.split("\n");
       for (String paragrath: paragraph) {
           String [] sentences = splitOnSentences(paragrath);
           for (String sentensec: sentences) {
               sortWord(sentensec);
           }
       }
    }
    private static void sortLexeme (String text, char letter) {
        int [] countLetter;
        String [] sentences = splitOnSentences(text);
        for (String sentens: sentences) {
            String [] word = splitOnWords(sentens);
            countLetter = new int[word.length];
            for (int i = 0; i < word.length; i++) {
                countLetter[i] = countLetter(word[i],letter);
            }

        }

    }

    private static int countLetter (String word, char letter) {
        Pattern pattern = Pattern.compile(String.valueOf(letter));
        Matcher matcher = pattern.matcher(word);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }


    private static void sortWord (String sentences) {
        String [] word = splitOnWords(sentences);
        for (int i = word.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (word[j].length() >= word[j+1].length()) {
                    String temp = word[j];
                    word[j] = word[j+1];
                    word[j+1] = temp;
                }
            }
        }
        for (String  words : word) {
            System.out.print(words + " ");
        }
    }


    private static String [] splitOnWords (String s) {
        Pattern pattern = Pattern.compile("\\s*(\\.|:|,|\\s|;|\\?|\\!)\\s*");
        return pattern.split(s);
    }

    private static String [] splitOnSentences (String string) {
        Pattern pattern = Pattern.compile("\\.*[.!?][^)]\\s*");
        return pattern.split(string);
    }



    public static void main(String[] args) {
        String s = "Трагедия Пушкина «Моцарт и Сальери» занимает всего десять страниц. О чем она? О зависти или о том, что «гений и злодейство — две вещи несовместные»? Есть ли оправдание Сальери, который, по версии Пушкина, отравил Моцарта?\n" +
                "История предумышленного убийства рассказывается самим преступником: и Моцарта, и все происходящее мы видим глазами Сальери. Пьеса начинается с его монолога: «Все говорят: нет правды на земле. Но правды нет и выше». Это похоже на речь обвиняемого. Оказывается, убийство задумано давно, готово и орудие — «последний дар моей Изоры». Но кто такая Изора? Где целых восемнадцать лет Сальери хранил яд — в пузырьке? Поэт Арсений Тарковский считал, что яд был в перстне: «Ты безумна, Изора, безумна и зла. Ты кому подарила свой перстень с отравой?» Что за Черный человек приходил к Моцарту заказать «Реквием» и почему в трактире Моцарту кажется, что он (или она?) где-то рядом? Тарковский полагал, что это Изора «за дверью трактирной тихонько ждала...» Не было ли сговора между ней и Сальери?\n" +
                "Перед нами «теоретическое преступление», то есть совершенное ради идеи. «Нет, никогда я зависти не знал», — говорит Сальери. Настоящий завистник не признает гениальности соперника, а Сальери не сомневается в величии Моцарта, но верит, что его смерть принесет человечеству благо.\n" +
                "На этот же путь встанет и Родион Раскольников. Сальери убивает гения, Раскольников — никому не нужную старуху-процентщицу, но в обоих случаях это злодейство. Однако рядом с Раскольниковым окажется не Изора с ее черными очами и черной душой, а Соня Мармеладова, которая сердцем объяснит, почему он несчастный убийца, а не герой.";
        System.out.println(s);

    }
}
