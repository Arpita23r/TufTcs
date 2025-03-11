import java.util.*;
public class Main{
    public static int count(String s1,String s2) {
        int m=s1.length();
        int n=s2.length();
        int[] dp=new int[n+1];
        for(int i=1;i<=m;i++) {
            int prev=0;
            for(int j=1;j<=n;j++) {
                int temp=dp[j];
                if(s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[j]=dp[j]+dp[j-1]+1;
                } else {
                    dp[j]=dp[j]+dp[j-1]-prev;
                }
                prev=temp;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="abc";
        String s2="ac";
        System.out.println(count(s1,s2));
    }
}
