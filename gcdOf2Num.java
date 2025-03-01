import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int a=n1;
        int b=n2;
        while(b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
            
        }
        System.out.println(n1+n2+a);
    }
}
