import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0) {
            return;
        }
        int first=0,sec=1;
        System.out.println(first);
        if(n>1) {
           System.out.println(sec); 
        }
        for(int i=2;i<n;i++) {
            int next=first+sec;System.out.println(next);
            first=sec;
            sec=next;
        }
    }
}
