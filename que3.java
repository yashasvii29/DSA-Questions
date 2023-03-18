public class que3 {
    public static void main(String[] args) {
        int n=1234;
        int s=0;
        while(n>0){
            int rem=n%10;
            s=s+rem;
            n=n/10;
        }
        System.out.println(s);
    }
    
}
