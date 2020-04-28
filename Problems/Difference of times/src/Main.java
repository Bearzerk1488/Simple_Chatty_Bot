import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int startHours = scanner.nextInt();
        int startMinutes = scanner.nextInt();
        int startSeconds = scanner.nextInt();
        int stopHours = scanner.nextInt();
        int stopMinutes = scanner.nextInt();
        int stopSeconds = scanner.nextInt();
        int delta = (stopHours - startHours) * 3600 + (stopMinutes - startMinutes) * 60 + stopSeconds - startSeconds;
        System.out.println(delta);
    }
}