import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int vowel=0,consonants=0,spaces=0;
        for(char ch:str.toCharArray()) {
            if(ch==' ') {
                spaces++;
            } else if(ch>='a' && ch<='z') {
                if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u') {
                    vowel++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("vowels:" + vowel);
        System.out.println("consonants:"+ consonants);
        System.out.println("spaces:" + spaces);
    }
}
