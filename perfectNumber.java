import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++) {
            if(n%i==0) {
                sum+=i;
            }
        }
        if(n==sum) {
            System.out.println("perfect");
        } else{
            System.out.println("np");
        }
    }
}
