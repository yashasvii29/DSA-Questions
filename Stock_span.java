import java.util.Stack;
public class Stock_span {
    public static void main(String[] args) {
        int arr[]={3,6,1,4,18,7,5,11};
        CalSpan(arr);
/* array ke har element ke stock span find krne hai then each element ke stock span count krne hai and print karane  hai
har element khud ka stock span hoga  and uss element se pehle jo small elements hai wo bhu us element ke stock span honge */ 

    }
    public static void CalSpan(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=i+1;

            }
            else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
