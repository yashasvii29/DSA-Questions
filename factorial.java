import javax.swing.event.AncestorEvent;

public class factorial {
    public static void main(String[] args){
        int n=5,ans=1;
        fact(n,ans);
        
    
    }
    public static void fact(int n,int ans){
        if(n==0)
        {
            System.out.println(ans);
            return ;
        }
        //int fn=fib(n-1);
        fact(n-1,ans*n);
    } 
}
