import java.util.*;
public class bostonnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(Sumofdigit(n)==Bostonno(n)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
    public static int Sumofdigit(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }   
    public static int Bostonno(int n){
        int sum=0;
        int fact=0;
        for(int i=2;i<=n;++i){
            while(n%i==0){
                sum+=Sumofdigit(i);
                n/=i;
            }
        }
        return sum;
    }
  
}
