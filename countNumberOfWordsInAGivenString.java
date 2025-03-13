import java.util.*;
public class Main{
    public static int countWord(String str) {
        if(str==null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words=str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(countWord(str));
    }
}
