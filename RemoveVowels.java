import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U' && ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
