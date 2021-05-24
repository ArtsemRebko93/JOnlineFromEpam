package by.jonline.module5.task1.main;

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
 Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

import java.io.File;
import by.jonline.module5.task1.entity.Directory;
import by.jonline.module5.task1.entity.Text;
import by.jonline.module5.task1.entity.TextFile;
import by.jonline.module5.task1.logic.TextFileLogic;
import by.jonline.module5.task1.view.TextFileView;


public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("by.jonline.module5.been");
        Text text = new Text("Мама мыла раму, рама мыла маму.))");
        TextFileLogic fileLogic = new TextFileLogic();
        TextFileView fileView = new TextFileView();
        TextFile file = fileLogic.createTextFile(directory,"Test.txt",text);
        fileView.print(file);
        fileLogic.reNameTextFile(file,"Test1.txt");
        fileLogic.addTextFile(file,"Мама домыла раму. Конец.");
        fileView.print(file);
    }
}
