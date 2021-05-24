package by.jonline.module5.task1.entity;

import java.util.Objects;

public class Directory {
    private StringBuilder nameDirectory = new StringBuilder();


    public Directory (String nameDirectory) {
        this.nameDirectory.append(nameDirectory);
    }

    public String getNameDirectoryInString () {
        return nameDirectory.toString();
    }

    public StringBuilder getNameDirectory() {
        return nameDirectory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(nameDirectory, directory.nameDirectory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDirectory);
    }

}
