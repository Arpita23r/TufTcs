import java.util.*;
public class Main{
    public static int max(String word) {
        int[] count=new int[256];
        int maxFreq=0;
        for(char c:word.toCharArray()) {
            count[c]++;
            maxFreq=Math.max(maxFreq,count[c]);
        }
        return maxFreq;
    }
    public static String wordMostRepeated(String str) {
        String[] words=str.split("\\s+");
        String maxWord="";
        int maxRepeat=0;
        for(String word:words) {
            int repeatCount=max(word);
            if(repeatCount>maxRepeat) {
                maxRepeat=repeatCount;
                maxWord=word;
            }
        }
        return maxWord;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(wordMostRepeated(str));
    }
}
