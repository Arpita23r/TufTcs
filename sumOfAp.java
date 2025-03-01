import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int sum=(n*(2*a+(n-1)*d))/2;
        System.out.println(sum);
    }
}
