import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[] arr={1,2,3,5,8,9};
        int target=5;
        int index=Arrays.binarySearch(arr,target);
        System.out.println("found");
    }
}
