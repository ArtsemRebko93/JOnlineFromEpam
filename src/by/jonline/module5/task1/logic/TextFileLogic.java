package by.jonline.module5.task1.logic;

import by.jonline.module5.task1.entity.Directory;
import by.jonline.module5.task1.entity.Text;
import by.jonline.module5.task1.entity.TextFile;

public class TextFileLogic {

    public void reNameTextFile (TextFile textFile, String newName) {
        textFile.getNameFile().replace(0,textFile.getNameFile().length(),newName);
    }

    public TextFile createTextFile (Directory directory, String fileName, Text text) {
        return new TextFile(directory, fileName, text);
    }

    public void addTextFile (TextFile textFile,String text) {
        textFile.getText().getInnerText().append(text);
    }

    public void deleteTextFile (TextFile textFile) {
        textFile = null;
    }

}
