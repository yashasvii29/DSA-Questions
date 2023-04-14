import java.util.Stack;
public class Stack_Reverse {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(21);
        st.push(19);
        st.push(11);
        st.push(18);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }
    public static void Reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int item=st.pop();
        Reverse(st);
        Insert_Down(st,item);
    }
    public static void Insert_Down(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int item=st.pop();
        Insert_Down(st,ele);
        st.push(item);
    }
    
}
