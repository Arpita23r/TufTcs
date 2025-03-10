import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder result=new StringBuilder();
        int n=2;
        for(int i=0;i<str.length();i++) {
            result.append(str.charAt(i));
            if((i+1)% n==0 && i!=str.length()-1) {
                result.append(" ");
            }
        }
        System.out.println(result);
    }
}
