public class Stack_Client {
    public static void main(String[] args) throws Exception{
        Stack s=new Stack();
        s.push(10); 
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop());
        s.Display();
        System.out.println(s.peek());
        s.push(60);
        s.push(70);
        s.Display();
    }
}
