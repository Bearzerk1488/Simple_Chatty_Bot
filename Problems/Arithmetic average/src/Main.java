import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = start; i < stop + 1; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println((double) sum / count);
    }
}