package by.jonline.module4.task3;

public class Group {
    private Student [] students;
    int marker;

    public Student[] getStudents() {
        return students;
    }

    public Group () {
        students = new Student[10];
    }

    public void addStudent (Student student) {
        if (marker < 10) {
            students[marker] = student;
            marker++;
        } else throw new ArrayIndexOutOfBoundsException("Выход за пределы группы. Максимальное кол-во - 10");
    }

}
