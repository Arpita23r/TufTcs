import java.util.*;
public class Main{
    public static String remove(String str) {
        HashSet<Character>set=new HashSet<>();
        StringBuilder result=new StringBuilder();
        for(char c:str.toCharArray()) {
            if(!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(remove(str));
    }
}
