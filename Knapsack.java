import java.util.*;
public class Knapsack {
    public static void main(String[] args) {
        int wt[]={1,2,3,2,2};
        int val[]={8,4,0,5,3};
        int cap=4;
        int dp[][] = new int[cap+1][wt.length+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(knapsack(wt,val,cap,0,dp));
        
    }
    public static int knapsack(int wt[],int val[],int cap,int i,int dp[][]){
        if(i==wt.length || cap==0)
            return 0;
         if(dp[cap][i]!=-1){
            return dp[cap][i];
         }   
        int inc=0,exc=0;
        if(cap>=wt[i]){
            inc =val[i]+knapsack(wt,val,cap-wt[i],i+1,dp);
        }
        exc=knapsack(wt, val, cap, i+1,dp);
        dp[cap][i]=Math.max(inc,exc);
        return Math.max(inc,exc);
    }
}

// infinite supply nhi hai isliye i+1 pass kr rhe hai 
// this que is same as coin change2


// bottom up approach

// public static int KnapsackBU(int wt[],int val[],int cap){
//     int dp[][] = new int[cap+1][wt.length+1];
//     for(int c=1;c<dp.length;c++){
//         for(int i=1;i<dp[0].length;i++){
//             int inc=0,exc=0;
//             if(cap>=wt[i-1]){
//                 inc=val[i-1]+dp[cap-wt[i-1]][i-1];
//             }
//             exc=dp[cap][i-1];
//              dp[cap][i]=Math.max(inc,exc);
//         }
//     }
// }