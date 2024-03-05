package Bitmasking;

public class Print_Subsequence {
    public static void main(String[] args) {
        String str="abc";
        Subsequence(str);

    }
    public static void Subsequence(String str){
        int n=str.length();
        //2^n = 1<<n
        for(int i=0;i<(1<<n);i++){
            // har i ke corresponding subsequence print karayenge
            Pattern(str,i);

        }
    }

    private static void Pattern(String str, int i) {
        int pos=0;
        while(i!=0){
            if((i&1)!=0){  // last bit check kr rhe hai
                // i ki last bit check kr rhe hai ..if last bit is not equal to 0 means last bit  1 ke equal hai toh char print kr denge
                System.out.print(str.charAt(pos));
            }
            pos++;
            i>>=1;// i ki last bit ko drop kr rhe hai
        }
        System.out.println();
   }

}
