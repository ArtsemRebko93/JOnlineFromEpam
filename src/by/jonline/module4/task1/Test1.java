package by.jonline.module4.task1;

public class Test1 {
    int count;
    int count2;

    public void showYourCharacters () {
        System.out.println("Интовая переменная count равна: " + count + ", " +
                "count2: " + count2);
    }

    public int changeMyCount (int couter) {
        count = couter;
        return count;
    }

    public int changeMyCount2 (int couter) {
        count2 = couter;
        return count2;
    }

    public int getSum () {
        return count + count2;
    }

    public int getBiggestCount () {
        if (count > count2) {
            return count;
        } else {
            return count2;
        }
    }
}
