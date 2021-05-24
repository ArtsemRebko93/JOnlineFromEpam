package by.jonline.module5.task1.logic;

import by.jonline.module5.task1.entity.Directory;

public class DirectoryLogic {


    public void reNameDirectory (Directory directory,String newName) {
        directory.getNameDirectory().replace(0,directory.getNameDirectory().length() - 1,newName);
    }
}
