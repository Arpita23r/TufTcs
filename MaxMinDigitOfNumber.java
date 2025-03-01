import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(n!=0) {
            int d=n%10;
            min=Math.min(min,d);
            max=Math.max(max,d);
            n=n/10;
        }
        System.out.println(max);
        System.out.println(min);
}
}
