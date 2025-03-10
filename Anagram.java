import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arp=sc.nextLine();
        String sup=sc.nextLine();
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        char a[]=arp.toCharArray();
        char s[]=sup.toCharArray();
        for(int i=0;i<arp.length();i++) {
            map1.put(a[i],map1.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<sup.length();i++) {
            map2.put(s[i],map2.getOrDefault(s[i],0)+1);
        }
        if(map1.equals(map2))
        System.out.println("Anagram");
        else
        System.out.println("not Anagram");
    }
}
