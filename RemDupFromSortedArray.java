import java.util.*;


public class Main
{
	public static int remove(int[] nums){
	if(nums.length==0)
	return 0;
	
	int unique=0;
	for(int i=1;i<nums.length;i++) {
	    if(nums[i]!=nums[unique]) {
	        unique++;
	        nums[unique]=nums[i];
	    }
	}
	return unique+1;
	}
	public static void main(String[] args) {
	    int[] nums={1,1,2,2,5,5,4,6};
	    int length=remove(nums);
	    for(int i=0;i<length;i++) {
	        System.out.println(nums[i]+" ");
	    }
	}
}
