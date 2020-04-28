import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = start; i < end + 1; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}