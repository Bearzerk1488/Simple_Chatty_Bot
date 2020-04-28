import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int elem = 0;
        while ((elem = scanner.nextInt()) != 0) {
            sum += elem;
        }
        System.out.println(sum);
    }
}