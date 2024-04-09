import java.util.*;
public class PairOfRoses {
    public static void main(String args[]) {
        Scanner yashu=new Scanner(System.in);
        int t=yashu.nextInt();
        while(t-->0){
            int roses=yashu.nextInt();
            int rose[]=new int[roses];
            for(int i=0;i<roses;i++){
                rose[i]=yashu.nextInt();
            }
            int money=yashu.nextInt();
            Display(roses,rose,money);
        }
    }
    public static void Display(int n,int arr[],int val){
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        int p1=0;
        int p2=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==val){
                    int diff=arr[j]-arr[i];
                    min=Math.min(diff,min);
                    p1=arr[i];
                    p2=arr[j];
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are " +p1+" and "+p2+".");
        
       
    }
}
