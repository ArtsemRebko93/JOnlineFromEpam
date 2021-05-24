package by.jonline.module5.task1.entity;

import java.util.Objects;

public class TextFile extends File {
    private Text text;

    public TextFile(Directory directory, String fileName, Text text) {
        super(directory, fileName);
        this.text = text;
    }

    public Text getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(text, textFile.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }

    @Override
    public String toString() {
        return text.toString();
    }
}
