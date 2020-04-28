import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        char[] arr = scanner.nextLine().toCharArray();
        int sum = 0;
        for (char c : arr) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(sum);
    }
}