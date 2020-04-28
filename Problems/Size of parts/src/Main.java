import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int ready = 0;
        int toBeFixed = 0;
        int reject = 0;
        for (int i = 0; i < count; i++) {
            int n = scanner.nextInt();
            if (n == 0) {
                ready++;
            } else if (n > 0) {
                toBeFixed++;
            } else {
                reject++;
            }
        }
        System.out.println(ready + " " + toBeFixed + " " + reject);
    }
}