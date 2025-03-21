import java.util.*;
public class Main{
    public static boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right) {
            char l=s.charAt(left),r=s.charAt(right);
            if(!Character.isLetterOrDigit(l))
            left++;
            else if(!Character.isLetterOrDigit(r))
            right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r))
            return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean ans=isPalindrome(str);
        if(ans==true) {
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
}
