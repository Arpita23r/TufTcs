import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words) {
            if(word.length()==1) {
                result.append(Character.toUpperCase(word.charAt(0)));
            } else {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1,word.length()-1)).append(Character.toUpperCase(word.charAt(word.length()-1)));
            }
            result.append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
