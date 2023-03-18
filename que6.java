public class que6 {
    public static void main(String[] args) {
        
        int n=32145,rem=0,ans=0,i=1;
        while(n>0){
            rem=n%10;
            ans=ans+i*(int)Math.pow(10,rem-1);
            n=n/10;
            i++;
        }
        System.out.println(ans);
        }
}
