public class multiple {
    public static void main(String[] args)
    {
        int number=5,i=1;
        mul(number,i);
    }
    public static void mul(int n,int i)
    {
        if(i==6)
            return;
        System.out.println(n*i);
        mul(n,i+1);
    }
    
}
