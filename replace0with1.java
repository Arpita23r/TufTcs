import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=sc.nextInt();
        
        int result=Integer.parseInt(String.valueOf(num).replace('0','1'));
        System.out.println("new Number:" + result);
    }
}
