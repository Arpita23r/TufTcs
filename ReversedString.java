import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String reversed="";
        for(int i=0;i<str.length();i++) {
            reversed=str.charAt(i)+reversed;
        }
        System.out.println(reversed);
    }
}
