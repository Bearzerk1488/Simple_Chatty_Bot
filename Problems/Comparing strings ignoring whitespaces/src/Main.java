import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        System.out.println(firstString.trim().replaceAll(" ", "").equals(secondString.trim().replaceAll(" ", "")));
    }
}