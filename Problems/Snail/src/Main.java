import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int dayUp = scanner.nextInt();
        int nightDown = scanner.nextInt();
        int days = 1;
        height -= dayUp;
        while (height > 0) {
            height += nightDown;
            height -= dayUp;
            days++;
        }
        System.out.println(days);
    }
}