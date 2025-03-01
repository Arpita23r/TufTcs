import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n%400==0) && (n%100!=0) ||(n%4==0)) {
            System.out.println("leapyear");
        }
        else{
            System.out.println("no");
        }
        }
    }
