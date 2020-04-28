import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int startIndex = scanner.nextInt();
        int stopIndex = scanner.nextInt();
        System.out.println(str.substring(startIndex, stopIndex + 1));
    }
}