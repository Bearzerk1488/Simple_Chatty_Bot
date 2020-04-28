import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean noWeekend = cups >= 10 && cups <= 20 && !isWeekend;
        boolean weekend = cups >= 15 && cups <= 25 && isWeekend;
        System.out.println(noWeekend || weekend);
    }
}