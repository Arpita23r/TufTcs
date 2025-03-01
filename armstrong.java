import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0) {
		    int digit=n%10;
		    sum+=Math.pow(digit,3);
		    n=n/10;
		}
		System.out.println(temp==sum);
	}
}
