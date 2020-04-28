import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int previous = scanner.nextInt();
        int i;
        boolean ordered = true;
        if ((i = scanner.nextInt()) != 0) {
            if (i <= previous) {
                previous = i;
                while ((i = scanner.nextInt()) != 0) {
                    if (i <= previous) {
                        previous = i;
                    } else {
                        System.out.println("false");
                        ordered = false;
                        break;
                    }
                }
            } else {
                previous = i;
                while ((i = scanner.nextInt()) != 0) {
                    if (i >= previous) {
                        previous = i;
                    } else {
                        System.out.println("false");
                        ordered = false;
                        break;
                    }
                }
            }
        }
        if (ordered) {
            System.out.println("true");
        }
    }
}