package Bitmasking;
import java.util.*;
public class Preparing_Olympid {
    public static void main(String[] args) {
        Scanner yashu = new Scanner(System.in);
        int n=yashu.nextInt();
        int l=yashu.nextInt();
        int r=yashu.nextInt();
        int x = yashu.nextInt();
        int c[]=new int[n];
        for(int i=0;i<c.length;i++){
            c[i]=yashu.nextInt();
        }
        System.out.println(Count(c, l, r, n));
    }

    public static long Count(int c[],int l,int r,int x){
        int n=c.length;
        int ans=0;
        for(int i=3;i<(1<<n);i++){
            if(FastCount(i)>=2 && isitPossible(c,i,l,r,x)){
                ans++;
            }

        }
        return ans;
    }
    public static boolean isitPossible(int c[],int i,int l ,int r,int x){
        long sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int pos = 0;
        while(i>0){
            if((i&1)!=0){
                sum+=c[pos];
                min = Math.min(min,c[pos]);
                max = Math.max(max,c[pos]);
            }
            pos++;
            i>>=1;
        }
        return sum>=l & sum<=r & max-min>=x;
    }

    public static int FastCount(int n){
        // optimise solution of count set bit 
        int c=0;
        // int ans=0;
        while(n>0){
            n=(n&(n-1));
            c++;
        }
        return c;
       }
}
