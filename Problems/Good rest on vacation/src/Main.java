import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flyCost = scanner.nextInt();
        int nightCost = scanner.nextInt();
        int totalAmount = duration * foodCost + flyCost * 2 + nightCost * (duration - 1);
        System.out.println(totalAmount);
    }
}