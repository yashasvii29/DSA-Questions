import java.util.*;
public class MappedStringsque {
    static String arr[]={"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static void main(String[] args) {
        Scanner yashu=new Scanner(System.in);
        String str=yashu.next();//"123"
        PrintStrings(str,"");
    }
    public static void PrintStrings(String que,String ans){
        if(que.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=que.charAt(0); // 1 as a character  jiski ascii value 49 h  means ch m 49 h
        String s=arr[ch-48];
        PrintStrings(que.substring(1), ans+s);
        if(que.length()>=2){
            String s2=que.substring(0,2);
            int n=Integer.parseInt(s2);// numeric string ko integer m convert krega
            if(n<=26){
                PrintStrings(que.substring(2), ans+arr[n]);
            }
          
        }
    }
}
