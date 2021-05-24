package by.jonline.module5.task1.entity;

import java.util.Objects;

public class Text {
    private StringBuilder text = new StringBuilder();

    public Text (String text) {
        this.text.append(text);
    }

    public StringBuilder getInnerText() {
        return text;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    public String getTextInString () {
        return text.toString();
    }
}
