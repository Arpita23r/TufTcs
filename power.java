import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int result=1;
        for(int i=0;i<d;i++) {
            result*=n;
        }
        System.out.println(result);
        }
    
}
