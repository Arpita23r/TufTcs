import java.util.*;
public class Main{
    public static int binary(int[] arr,int target) {
        int left=0,right=arr.length-1;
        while(left<=right) {
            int mid=left+(right-left)/2;
            
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,8,9};
        int target=5;
        int index=binary(arr,target);
        if(index!=-1)
        System.out.println(index);
        else
        System.out.println("nf");
    }
}
