import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase(); 
        Map<Character, Integer> charCount = new HashMap<>(); 

        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }

        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
