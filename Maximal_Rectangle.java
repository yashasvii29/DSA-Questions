import java.util.Stack;
public class Maximal_Rectangle {
    public static void main(String[] args) {
        int matrix[][]={{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
    //  int matrix[][]={{1}};
    //int matrix[][]={{0}};
        int arr[]=new int[matrix[0].length];
        int n=matrix.length;
      //  arr=matrix[n-1];
    //    int ans=Area(arr);
        int ans=0;
        for(int i=n-1;i>=0;i--){  // last row se loop chalayenge
            for(int j=0;j<arr.length;j++){
                if(matrix[i][j]==1){
                    arr[j]=arr[j]+1;
                }
                else{
                    arr[j]=0;
                }
            }
            int area=Area(arr);
            ans=Math.max(ans,area);
        }
        System.out.println(ans);
    }
    public static int Area(int arr[]){
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    int a=h*r;
                    ans=Math.max(ans,a);
                }
                else{
                    int l=st.peek();
                    int a=h*(r-l-1);
                    ans=Math.max(ans,a);
                }
            }
            st.push(i);
        }
        int r=arr.length;
        while(!st.isEmpty()){
            int h=arr[st.pop()];
            if(st.isEmpty()){
                int a=h*r;
                ans=Math.max(ans,a);
            }
            else{
                int l=st.peek();
                int a=h*(r-l-1);
                ans=Math.max(ans,a);

            } // leetcode question 85
        }
        return ans;
    }// This question is same as histogram .... hum each row ko area function m bhejenege and largest rectangle ka area return krenge
}   // ist iteration m first row ko bhejenge as a histogram bar ... then 2nd iteration m (1st row + 2nd row ) ko add krke bhejenge in area function as a histogram bar 
// then 3rd iteration m (1st row + 2nd row +3rd row) ko add krke bhejenege in arae function as a histogram bar the area return kr denge
