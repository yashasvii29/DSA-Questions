public class power {
    public static void main(String[] args){
        int a=2,b=3;
        pow(a,b);
        
    }
    public static int pow(int a,int b){
        if(b==0)
            return 1;
        int ans=pow(a,b-1);
        return ans*a;
    }
    
}
