import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] classes = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int sum = 0;
        for (int students : classes
        ) {
            sum += students / 2;
            sum += students % 2;
        }
        System.out.println(sum);
    }
}