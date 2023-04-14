import java.util.Stack;
public class Insert_AtLast {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(89);
        st.push(21);
        st.push(19);
        st.push(11);
        st.push(18);
        Insert(st,8);
        System.out.println(st);
        
    }
    public static void Insert(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int item=st.pop();
        Insert(st,ele);
        st.push(item);
    }
}
