package by.jonline.module4.task3;
/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String fullName;
    private int numberOfGroup;
    private int[] marks = new int[5];

    Student(String fullName, int numberOfGroup) {
        this.fullName = fullName;
        this.numberOfGroup = numberOfGroup;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", numberOfGroup=" + numberOfGroup +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numberOfGroup == student.numberOfGroup &&
                Objects.equals(fullName, student.fullName) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fullName, numberOfGroup);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }
}

