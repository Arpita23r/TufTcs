import java.util.*;
public class Main{
    public static String find(String str) {
        String[] words=str.split("\\s+");
        String longestWord="";
        for(String word:words) {
            if(word.length()>longestWord.length()) {
                longestWord=word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(find(str));
    }
}
