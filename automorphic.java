import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int temp=n;
        while(temp>0) {
            if(sq%10!=temp%10) {
                System.out.println("not automorphic");
                return;
            }
            sq/=10;
            temp/=10;
        }
        System.out.println("Automorphic");
    }
}
