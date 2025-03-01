
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
        double sum=0;
        if(r==1) {
            sum=a*n;
        }
        else{
            sum=a*(1-Math.pow(r,n))/(1-r);
        }
        System.out.println(sum);
    }
}
