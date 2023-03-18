public class que1 {
    public static void main(String[] args)
     {
        //Scanner sc=new Scanner(System.in);
        int n1=1  ;
        int n2=1000;
        for(int i=1;i<=1000;i++){
                IsArmstrongnum(i);
        }

    }
    public static void IsArmstrongnum(int i)
    {
        int d=countofdigit(i);
        int ans=0;
        int temp=i;
        while(i>0){
            int rem=i%10;
            ans=(int)(ans+Math.pow(rem,d));
            i=i/10;
        }
        if(ans==temp)
            System.out.println(temp);
        
        
    }
    public static int countofdigit(int i){
        int c=0;
        while(i>0){
            i/=10;
            c++;
        }
        return c;
    }   
}
