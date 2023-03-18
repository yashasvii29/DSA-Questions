 import java.util.*;
public class evenodd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        printodd(N,0);
        printeven(N,0);
    }
    public static void printodd(int n,int ans){
        if(ans==n||ans<n && ans!=0){
            System.out.println(ans);
        }
        if(n%2==1){
            ans=n;
            printodd(n-1,ans);
        }
    }
    public static void printeven(int n,int ans){
        if(ans==n||ans<n && ans!=0){
            System.out.println(ans);
        }
        int i=1;
        while(1<=n)
        if(i%2==0){
            ans=i;
            printodd(n,ans);
        }
    }
}
 
