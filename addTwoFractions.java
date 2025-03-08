import java.util.*;
public class Main{
    public static int gcd(int a,int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void addFractions(int num1,int den1,int num2,int den2) {
        int numerator=(num1*den2)+(num2*den1);
        int denominator=den1*den2;
        int gcd=gcd(numerator,denominator);
        numerator /=gcd;
        denominator /=gcd;
        System.out.println("sum of fractions:"+ numerator +"/"+ denominator);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int den1=sc.nextInt();
        int num2=sc.nextInt();
        int den2=sc.nextInt();
        addFractions(num1,den1,num2,den2);
    }
}
