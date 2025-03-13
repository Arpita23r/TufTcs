import java.util.*;
public class Main{
    public static String shift(String str) {
        StringBuilder result=new StringBuilder();
        for(char c:str.toCharArray()) {
            if(Character.isLetter(c)) {
                if(c=='z') {
                    result.append('a');
                } else if(c=='Z') {
                    result.append('A');
                } else {
                    result.append((char) (c+1));
                } 
            } else{
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(shift(str));
    }
}
