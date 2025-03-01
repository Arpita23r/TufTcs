import java.util.Scanner;

public class Main {
    // Function to compute GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();

        // LCM Formula: (num1 * num2) / GCD(num1, num2)
        int lcm = (num1 * num2) / gcd(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
