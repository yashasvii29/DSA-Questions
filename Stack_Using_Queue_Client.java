public class Stack_Using_Queue_Client {
    public static void main(String[] args) throws Exception {
        Stack_Using_Queue st=new Stack_Using_Queue();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());

    }
}
