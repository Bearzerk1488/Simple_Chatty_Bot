//put imports you need here


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        String[] line2 = scanner.nextLine().split(" ");
        String[] line3 = scanner.nextLine().split(" ");
        String[] line4 = scanner.nextLine().split(" ");
        for (int i = line4.length - 1; i >= 0; i--) {
            System.out.println(line4[i]);
        }
        for (int i = line3.length - 1; i >= 0; i--) {
            System.out.println(line3[i]);
        }
        for (int i = line2.length - 1; i >= 0; i--) {
            System.out.println(line2[i]);
        }
        for (int i = line1.length - 1; i >= 0; i--) {
            System.out.println(line1[i]);
        }
    }
}
