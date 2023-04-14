public class Queue {
    protected int arr[];
    protected int front;
    protected int size;
    public Queue(){
        arr=new int[5];
        front=0;
        size=0;
    }
    public Queue(int n){
        arr=new int[n];
        front=0;
        size=0;
    }
    public boolean isfull(){
        return size==arr.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public void Enqueue(int item) throws Exception{
        if(isfull()){
            throw new Exception("Queue is full");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=item;
        size++;

    }
    public int Dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int rv=arr[front];
        front=(front+1)%arr.length;
        size--;
        return rv;
    }
    public int getfront() throws Exception{
       if(isEmpty()){
        throw new Exception("Queue is Empty"); 
       } 
        int rv=arr[front];
        return rv;
    }
    public void Display(){
        for(int i=0;i<size;i++){
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }


   
  }

