public class Stack_Using_Queue {  // push efficient means push()->O(1) and pop()->O(n)
    private Dynamic_Queue data;
    public Stack_Using_Queue(){
        data=new Dynamic_Queue();
    }
    public boolean isEmpty(){
        return this.data.isEmpty();
    }
    //  Dynamic Stack banayenge usding queue(means stack ke data ko queue m store karenge)
    public int size(){
        return data.size();
    }
    public void push(int item) throws Exception{
        data.Enqueue(item);
    }
    public int pop() throws Exception{
        Dynamic_Queue hlp=new Dynamic_Queue();  // 2nd queue banayi hai jisme 1st queue ka data store karenge then 1st queue m item push krenge and then 2nd queue ke item ko 1st queue m push krene 
        while(!this.data.isEmpty()){
            hlp.Enqueue(data.Dequeue());
        }
        int x=data.Dequeue();
        while(!hlp.isEmpty()){
            data.Enqueue(hlp.Dequeue());
        }
        return x;
    }
    public int peek() throws Exception{
        return data.getfront();
    }
    /*public static void main(String[] args) throws Exception {
        Stack_Using_Queue st=new Stack_Using_Queue();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());

    }*/
}
