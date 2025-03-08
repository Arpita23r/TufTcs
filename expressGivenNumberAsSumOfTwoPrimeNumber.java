import java.util.*;
public class Main{
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++) {
            if(num%i==0) return false;
        }
        return true;
    }
    public static void check(int num) {
        boolean found=false;
        for(int i=2;i<num/2;i++) {
            if(isPrime(i) && isPrime(num-i)) {
                System.out.println(num+" = "+i+" + "+(num-i));
                found=true;
        }
    }
    if(!found) {
        System.out.println(num);
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    check(n);
}
}
