import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextInt();
        double percent = scanner.nextInt();
        double profit = scanner.nextInt();
        int years = 0;
        while (profit > money) {
            money += money * percent / 100;
            years++;
        }
        System.out.println(years);
    }
}