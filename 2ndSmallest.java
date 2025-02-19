import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int smallest = arr[0];

       
        for (int i = 1; i < n; i++) {
            if (arr[i] > smallest) {
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println("No second smallest element");
    }
}
