
import java.util.*;
public class que8 {
    public static void main(String args[]) {
        Scanner yashu=new Scanner(System.in);
        int N=yashu.nextInt();
        int M=yashu.nextInt();
        boardpath(N,M,0,"");
        System.out.println("\n"+ c);
    }
    static int c=0;
    public static void boardpath(int des,int face,int cur,String ans){
        if(cur==des){
            System.out.print(ans+" ");
            c++;
            return ;
        }
        if(cur>des){
            return ;
        }
         
        boardpath(des,face,cur+1, ans+1);
        boardpath(des,face,cur+2, ans+2);
        boardpath(des,face,cur+3, ans+3);
// Your Code Here
    }
}
