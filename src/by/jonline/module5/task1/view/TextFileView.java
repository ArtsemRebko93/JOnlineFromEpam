package by.jonline.module5.task1.view;

import by.jonline.module5.task1.entity.TextFile;

public class TextFileView {
    public void print (TextFile textFile) {
        System.out.println("Имя файла - " + textFile.getNameFileInString() +
                "; имя директории - " + textFile.getDirectory().getNameDirectoryInString() +
                ".");
        System.out.println("Содержимое файла: " + textFile.getText().getTextInString());
        System.out.println();
    }
}
