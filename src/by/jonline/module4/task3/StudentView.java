package by.jonline.module4.task3;

public class StudentView {

    public void showBestStudent(Group group) {
        for (int i = 0; i < group.getStudents().length; i++) {
            if (chekOnMarks(group.getStudents()[i].getMarks())) {
                System.out.println(group.getStudents()[i].toString());
            }
        }
    }

    private boolean chekOnMarks(int[] marks) {
        boolean show = true;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 9) {
                show = false;
            }
        }
        return show;
    }
}
