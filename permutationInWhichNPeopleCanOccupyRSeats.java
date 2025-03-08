import java.util.Scanner;

public class Main {
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) { 
            fact *= i;
        }
        return fact;
    }

    public static long calculatePermutations(int N, int R) {
        if (N < R) {
            return 0; 
        }
        return factorial(N) / factorial(N - R);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total number of people (N): ");
        int N = sc.nextInt();

        System.out.print("Enter the number of seats (R): ");
        int R = sc.nextInt();

        sc.close();

        long permutation = calculatePermutations(N, R);
        System.out.println("Total permutations: " + permutation);
    }
}
