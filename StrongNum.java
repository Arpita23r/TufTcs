import java.util.Scanner;

public class Main {
    
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int temp = n, sum = 0;

        
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

       
        if (sum == n) {
            System.out.println("Yes, it's a Strong Number.");
        } else {
            System.out.println("No, it's NOT a Strong Number.");
        }
    }
}
