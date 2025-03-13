import java.util.*;
public class Main{
    public static void printDuplicate(String str) {
      HashMap<Character,Integer>map=new HashMap<>();
      for(char c:str.toCharArray()) {
          map.put(c,map.getOrDefault(c,0)+1);
      }
      for(Map.Entry<Character,Integer>entry:map.entrySet()) {
          if(entry.getValue()>1) {
              System.out.println(entry.getKey()+" "+entry.getValue());
          }
      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printDuplicate(str);
    }
    
}
