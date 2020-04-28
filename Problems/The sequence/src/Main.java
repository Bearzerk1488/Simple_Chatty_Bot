import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int count = scanner.nextInt();
        int i = 0;
        while (i < count) {
            int elem = scanner.nextInt();
            if (elem % 4 == 0 && elem > max) {
                max = elem;
            }
            i++;
        }
        System.out.println(max);
    }
}