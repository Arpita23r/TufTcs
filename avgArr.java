import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        double avg=sum/n;
        System.out.println(avg);
    }
}
