import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')) {
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
