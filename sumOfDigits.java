import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int temp=n;
        int sum=0;
        while(temp>0) {
          int  d=temp%10;
            sum+=d;
            temp=temp/10;
        }
        System.out.println(sum);
       
    }
}
