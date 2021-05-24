package by.jonline.module5.task1.entity;

import java.util.Objects;

public class File  {

    private StringBuilder nameFile = new StringBuilder();
    private Directory directory;

    public File (Directory directory, String fileName) {
        this.directory = directory;
        nameFile.append(fileName);
    }



    public StringBuilder getNameFile() {
        return nameFile;
    }

    public String getNameFileInString () {
        return nameFile.toString();
    }

    public Directory getDirectory() {
        return directory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(nameFile, file.nameFile) &&
                Objects.equals(directory, file.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFile, directory);
    }
}
