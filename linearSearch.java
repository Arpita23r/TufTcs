public class Main{
    public static int search(int[] arr,int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={5,3,8,2,9,1};
        int target=8;
        int index=search(arr,target);
        if(index!=-1)
            System.out.println(index);
        
    }
}
