package Bitmasking;
import java.util.Scanner;

import java.util.ArrayList;

// output comes wrong ...it gives tle 
// solve this question with the help of rabincarp algorithm
// spoj question
// this is rabinkarp algorithm
public class Pattern_Find {
    public static void main(String[] args) {
        Scanner yashu=new Scanner(System.in);
        int t=yashu.nextInt();
        while(t-->0){
            String str = yashu.next();
            String pattern = yashu.next();
            Pattern(str, pattern);
        }

    //     String str = "ababab";
    //     String pattern = "ab";
    //    Pattern(str, pattern);
    }
    public static void Pattern(String s,String p){
      
            long mod = 1000000007;
            // long mod = 1000_000_007;
            long pow =1 ;
            int pr = 31;
            long hv = 0;  // hashvalue
            for(int i=0;i<p.length();i++){
                // har char ki position find krni hai
                int pos = p.charAt(i)-'a'+1;
                // uppercase ke liye A and when string is in the lowecase then we will write a when finding a position
                hv = (hv + (pos*pow) % mod) % mod;
                pow = (pow * pr) % mod;
    
            }
            long dp[] = new long[s.length()];
            long pa[] = new long[s.length()];
            dp[0] = s.charAt(0)-'a'+1;
            pa[0]=1;
            pow = 31;
            for(int i=1;i<s.length();i++){
                // p ka find krke a ka add kr denge because a ka pehle se pata hai
                dp[i]=(dp[i-1]+((s.charAt(i)-'a'+1)*pow)%mod)%mod;
                pa[i]=pow;
                pow=(pow*pr)%mod;

            }
            ArrayList<Integer> ll = new ArrayList<>();
            // apply sliding window
            for(int ei = p.length()-1,si=0;ei<s.length();ei++,si++){
                long curr = dp[ei];
                if(si>0){
                    curr-=dp[si-1];
                    curr=(curr+mod)%mod;
                }
                if(curr == (hv*pa[si]%mod)){
                    ll.add(si+1);
                }
            }
            if(ll.size()==0){
                System.out.println("Not Found");
            }
            else{
                System.out.println(ll.size());
                for(int v:ll){
                    System.out.println(v+" ");
                    // System.out.println(v+1+" ");
                }
                System.out.println();

            }
       
    }
}
