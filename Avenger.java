package Bitmasking;
import java.util.Arrays;

public class Avenger {
      public static void main(String[] args) {
        double c[]={0.30,0.60,0.80};
        int n=c.length;
        double dp[][]=new double[n][(n+4)/2];
        for(double a[]:dp){
            Arrays.fill(a, -1);
        }
        System.out.println(probability_Head(c, 0, (n+1)/2,dp));
    }
    public static double probability_Head(double c[],int i,int h,double dp[][]){
        if(h==0){
            return 1;
        }
        if(i==c.length){
            return 0;
        }
        if(dp[i][h]!=-1){
            return dp[i][h];
        }
        // 1st call for head and second call for tail
        double ans=c[i]*probability_Head(c, i+1, h-1,dp)+(1-c[i])*probability_Head(c, i+1, h,dp);
        return dp[i][h]=ans;
    }
    
}
