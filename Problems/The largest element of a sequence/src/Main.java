import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int elem = 0;
        while ((elem = scanner.nextInt()) != 0) {
            if (max < elem) {
                max = elem;
            }
        }
        System.out.println(max);
    }
}