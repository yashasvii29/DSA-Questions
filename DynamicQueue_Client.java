public class DynamicQueue_Client {
    public static void main(String[] args) throws Exception {
        Dynamic_Queue dq=new Dynamic_Queue();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        System.out.println(dq.Dequeue());
        System.out.println(dq.Dequeue());
        dq.Enqueue(50);
        dq.Enqueue(60);
        dq.Enqueue(70);
        dq.Enqueue(80);
        dq.Display();
        
    }
  
    
}
