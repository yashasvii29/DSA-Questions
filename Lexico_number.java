public class Lexico_number {
    public static void main(String[] args) {
        int n=1000;
        PrintCounting(0,n);
    }
    public static void PrintCounting(int curr,int n) {
        if(curr>n){
            return; //lexicocounting print karani hai from 0 to 1000 
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;      // In lexicounting 100<11 because char by char ascii compare karte hai  
        }
        for(;i<=9;i++){
            PrintCounting(curr*10+i,n);
        }
        
    }
}
