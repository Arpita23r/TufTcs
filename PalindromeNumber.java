import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int reversed=0;
        while(n>0) {
            int d=n%10;
            reversed=reversed*10+d;
            n/=10;
        }
        
        System.out.println(original==reversed);
     }
}
