import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[] arr={1,4,5,2,7,6,3,9};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++) {
            System.out.println(arr[i]+" ");
        }
        for(int i=n-1;i>=n/2;i--) {
            System.out.println(arr[i]+" ");
        }
    }
}
