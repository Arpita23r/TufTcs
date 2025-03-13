import java.util.*;
public class Main{
    public static char max(String str) {
        HashMap<Character,Integer>map=new HashMap<>();
        int maxCount=0;
        char maxChar=' ';
        for(char c:str.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)>maxCount) {
                maxCount=map.get(c);
                maxChar=c;
            }
        }
        return maxChar;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(max(str));
    }
}
