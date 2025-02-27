import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 1 || n == 0) {
            System.out.println(n);
                    }

        int flag = 0;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
             
            }
        }

        if (flag == 0) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
