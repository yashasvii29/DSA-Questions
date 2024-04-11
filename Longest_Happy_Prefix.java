public class Longest_Happy_Prefix {
    public static void main(String[] args) {
        String s ="acccbaaacccbaac";
    }

    public static int Happy_Prefix(String s){
        int dp[] = new int[s.length()];
        int len =0;
        for(int i=1;i<dp.length;){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                dp[i]=len;
                i++;
            }
            else{
                if(len>0){
                    len = dp[len-1];
                }
                else{
                    i++;
                }
                
            }
        }
        return dp[s.length()-1];
    }
}
