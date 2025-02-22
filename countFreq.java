import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
		    arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
		    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer,Integer>e:map.entrySet()) {
		    System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
