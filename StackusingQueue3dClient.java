public class StackusingQueue3dClient {
    public static void main(String[] args) throws Exception {
        Stackusingqueue3d st=new Stackusingqueue3d();
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
