import java.util.*;
public class Main{
    public static String sort(String str) {
        int[] count=new int[256];
        for(char c:str.toCharArray()) {
            count[c]++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<256;i++) {
            while(count[i]-->0) {
                sb.append((char)i);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(sort(str));
    }
}
