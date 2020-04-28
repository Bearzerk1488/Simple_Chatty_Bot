import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count < 1) {
            System.out.println("no army");
        } else if (count < 20) {
            System.out.println("pack");
        } else if (count < 250) {
            System.out.println("throng");
        } else if (count < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}