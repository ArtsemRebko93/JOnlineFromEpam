package by.jonline.module4.task3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Rebko A.N.", 1);
        int[] marks1 = {9, 10, 10, 9, 10};
        student1.setMarks(marks1);
        Student student2 = new Student("F.A.Lefon", 2);
        int[] marks2 = {9, 5, 10, 9, 10};
        student2.setMarks(marks2);
        Student student3 = new Student("P.A.Monro", 3);
        int[] marks3 = {9, 10, 1, 9, 10};
        student3.setMarks(marks3);
        Student student4 = new Student("P.A.Leppo", 4);
        int[] marks4 = {9, 10, 12, 9, 10};
        student4.setMarks(marks4);
        Student student5 = new Student("P.A.Hash", 5);
        int[] marks5 = {9, 10, 10, 9, 10};
        student5.setMarks(marks5);
        Student student6 = new Student("P.A.Code", 6);
        int[] marks6 = {9, 10, 1, 9, 10};
        student6.setMarks(marks6);
        Student student7 = new Student("P.A.Nick", 7);
        int[] marks7 = {9, 10, 0, 9, 10};
        student7.setMarks(marks7);
        Student student8 = new Student("P.A.Mike", 8);
        int[] marks8 = {9, 10, 10, 9, 10};
        student8.setMarks(marks8);
        Student student9 = new Student("P.A.Omnomnom", 9);
        int[] marks9 = {9, 10, 0, 9, 10};
        student9.setMarks(marks9);
        Student student10 = new Student("P.A.Belka", 10);
        int[] marks10 = {9, 1, 10, 9, 10};
        student10.setMarks(marks10);
        Group group = new Group();
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);
        group.addStudent(student8);
        group.addStudent(student9);
        group.addStudent(student10);
        StudentView view = new StudentView();
        view.showBestStudent(group);


    }
}
