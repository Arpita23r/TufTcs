public class Main{
    public  static String reverseWord(String str) {
        String[] words=str.trim().split("\\s+");
        StringBuilder result=new StringBuilder();
        for(int i=words.length-1;i>=0;i--) {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        String str="hello world from java";
        System.out.println(reverseWord(str));
}
}
