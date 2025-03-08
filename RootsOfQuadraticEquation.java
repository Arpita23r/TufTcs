import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double d=b*b-4*a*c;
        if(d>0) {
            double root1=(-b+Math.sqrt(d))/(2*a);
            double root2=(-b-Math.sqrt(d))/(2*a);
            System.out.println(root1+" , "+root2);
        } else if(d==0) {
            double root=-b/(2*a);
            System.out.println(root);
        } else{
            double realPart=-b/(2*a);
            double imaginaryPart=Math.sqrt(-d)/(2*a);
            System.out.println(realPart +" , "+imaginaryPart);
        }
    }
}
