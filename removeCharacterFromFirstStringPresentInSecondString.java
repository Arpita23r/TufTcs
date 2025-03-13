import java.util.*;
public class Main{
    public static String removeCharacter(String str1,String str2) {
        HashSet<Character>set=new HashSet<>();
        for(char c:str2.toCharArray()) {
            set.add(c);
        }
        StringBuilder result=new StringBuilder();
        for(char c:str1.toCharArray()) {
            if(!set.contains(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(removeCharacter(str1,str2));
    }
}
