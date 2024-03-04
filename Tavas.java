package Bitmasking;
import java.util.*;

// que => tavas and sadas (codeforces question)
public class Tavas {
    public static void main(String[] args) {
        Scanner yashu = new Scanner(System.in);
        String str=yashu.next();
        // str = "474"
        // hume y return krna hai y string sorted series m kis position pr hai
        //  sorted series given hai => 4 7 44 47 74 77 444 447 474 477  744 747 774 777...
        System.out.println(Index(str));
    }
    public static int Index(String str){
        int n=str.length();
        // 2^n...means 1<<n
        // x=2^n -2
        int x=(1<<n)-2;  // n-1 tak ke sare lucky number ke count find krenge
        int y=0,pos=0;
        for(int i=n-1;i>=0;i--){
            // loop chalaya hai laat index se 
            if(str.charAt(i)=='7'){
                y=y+(1<<pos);
            }
            pos++;
        }
        return x+y+1;
    }
}


// lucky number ka index find krna hai
//  sorted series given hai => 4 7 44 47 74 77 444 447 474 477  744 747 774 777....
// n^2 => (1<<n) - 2 
// tc=O(1)