import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean firstInterval = a > -15 && a <= 12;
        boolean secondInterval = a > 14 && a < 17;
        boolean thirdInterval = a >= 19;
        if (firstInterval || secondInterval || thirdInterval) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}