import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        char[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        boolean isVowel = false;
        for (char c : arr) {
            if (c == ch) {
                isVowel = true;
                break;
            }
        }
        return isVowel;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}