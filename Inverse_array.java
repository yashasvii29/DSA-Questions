
import java.util.*;
public class Inverse_array {
    public static void main(String args[]) {
        // Your Code Here
        Scanner yashu=new Scanner(System.in);
        int n=yashu.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=yashu.nextInt();
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int temp=arr[i];
            ans[temp]=i;

        }
        for(int i=0;i<n;i++){
             System.out.print(ans[i]+" ");
        }
       
    }
}


