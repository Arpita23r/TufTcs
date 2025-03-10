import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String expression=sc.nextLine();
        String result="";
        for(int i=0;i<expression.length();i++) {
            char ch=expression.charAt(i);
            if(ch!='(' && ch!=')' && ch!='{' && ch!='}' && ch!='[' && ch!=']') {
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
