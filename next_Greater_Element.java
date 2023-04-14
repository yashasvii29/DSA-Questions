import java.util.Stack;
public class next_Greater_Element {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        NGE(arr);    // Time complexity = O(n)  -> O(2n)
    }
    public static void NGE(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int ele=st.pop();
                ans[ele]=arr[i];
            }
            st.push(i);
        }
        // if arr[i] greater hai stack ke top wale element se means previous element se then satck se pop krenge top wale index ko otherwise stack m us index ko push kr denge 
        // stack m index push krenge bec isse element print karana easy hoga
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(arr[i]+" "+ans[i]);
        }
    }
}
