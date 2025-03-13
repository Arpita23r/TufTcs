public class Main{
    public static void main(String[] args) {
        String str="hello,welcome to java programming!";
        String subStr="java";
        int position=str.indexOf(subStr);
        if(position!=-1) {
            System.out.println(position);
        }
    }
}


public class Main{
    public static void main(String[] args) {
        String str="banana";
        String subStr="an";
        int index=str.indexOf(subStr);
        while(index!=-1) {
            System.out.println(index);
            index=str.indexOf(subStr,index+1);
        }
    }
}
