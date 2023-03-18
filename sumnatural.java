public class sumnatural {
    public static void main(String[] args){
        int n=5,s=0,i=1;
        sum(n,s,i);
    }
    public static int sum(int n,int s,int i){
        if(i==6)
        {
            
            return s;
        }
        s=s+i;
         return sum(n,s,i+1);
    }
}
