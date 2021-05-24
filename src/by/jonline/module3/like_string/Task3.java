package by.jonline.module3.like_string;

// Проверить, является ли заданное слово палиндромом.

public class Task3 {
    private static boolean isPalindrome (String str) {
        boolean palindrome = false;
        for (int i = 0, j = str.length() - 1;  i < str.length() / 2 && j > str.length() / 2; i++, j--) {
                if (str.charAt(i) == str.charAt(j)) {
                    palindrome = true;
                } else {
                    palindrome = false;
                    break;
                }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        String stroka = "abaasdabba";
        System.out.println(Task3.isPalindrome(stroka));
    }
}
