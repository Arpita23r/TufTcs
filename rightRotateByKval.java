import java.util.Arrays;

public class Main {
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        
        reverse(arr, 0, n - 1); // Step 1: Reverse entire array
        reverse(arr, 0, k - 1); // Step 2: Reverse first k elements
        reverse(arr, k, n - 1); // Step 3: Reverse remaining elements
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        rightRotate(arr, k);
        System.out.println("Right Rotated Array: " + Arrays.toString(arr));
    }
}
