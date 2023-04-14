import java.util.*;
public class Dearrangement {
    public static void main(String[] args){
        Scanner yashu = new Scanner(System.in);
        int n = yashu.nextInt();
        String str = "";
        for(int i=0;i<n;i++){
            str+=i;
        }
        System.out.println(permutation(str,str,""));
    }
    static int c = 0;
    public static int permutation(String str,String a,String result){
        if(str.length() == 0){
            for(int i=0;i<result.length();i++){
                if(a.charAt(i) == result.charAt(i)){  
                    return 0;  
                    // means permutation hai 
                }
            }
            c++;
            return 1;
        }
        for(int i=0;i<str.length();i++){
            String str1 = str.substring(0,i);
            String str2 = str.substring(i+1);
            char character = str.charAt(i);
            permutation(str1+str2,a,result+character);
        }
        return c;
    }

}
