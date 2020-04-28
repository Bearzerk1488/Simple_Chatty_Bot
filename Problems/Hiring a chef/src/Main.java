//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] info = {
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine()
        };
//        String firstName = scanner.nextLine();
//        String age = scanner.nextLine();
//        String educationStage = scanner.nextLine();
//        String experience = scanner.nextLine();
//        String preference = scanner.nextLine();
        System.out.printf(
                "The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.",
                info[0], info[4]);
    }
}