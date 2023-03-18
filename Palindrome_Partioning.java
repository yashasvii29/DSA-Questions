import java.util.*;

public class Palindrome_Partioning{
    public static void main(String[] args) {
        String ques="nitin";
        List<String> ll=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        Partioning(ques, ll,ans);
        System.out.println(ans);
    }
    public static void Partioning(String ques,List<String> ll,List<List<String>> ans){
        if(ques.length()==0){
            //System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for(int i=1;i<=ques.length();i++){
            String part=ques.substring(0,i);
            if(isPalindrome(part)){
                ll.add(part);
                 Partioning(ques.substring(i),ll,ans);
                 ll.remove(ll.size()-1);
        }
     }
    }
     public static boolean isPalindrome(String check) {
        int i=0;
        int j=check.length()-1;
        while(i<j){
            if(check.charAt(i)!=check.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
     }
    

}