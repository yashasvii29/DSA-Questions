package Bitmasking;

// find a number x such that (x xor a ) is minimum and the count of set bits in x and b are equal

public class Find_min {

    // in this que we have to return the minimum xor
    public static void main(String[] args) {
        int a =11;
        int b=125;
        System.out.println(Min_Val(a, b));
    }
    public static int Min_Val(int a,int b){
        int c=CountSet(b);
        int x=0;
        for(int i=31;i>=0;i--){
            if((a&(1<<i))!=0){
                x+=(1<<i);
                c--;
            }
        }
        for(int i=0;i<=31 && c>0;i++){
            if((a&(1<<i))==0){
                x+= (1<<i);
                c--;
            }
            
        }
        return x;
    }

    public static int CountSet(int b){
        int c=0;
        while(b>0){
            c++;
             b=(b&(b-1));
        }
        return c;
    }
}
