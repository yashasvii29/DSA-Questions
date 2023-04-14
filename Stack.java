public class Stack {
   protected int data[];
   protected int top=0;
   public Stack(){
    this.data=new int[5];
   } 
   public Stack(int capacity){
    this.data=new int[capacity];
   }
   public boolean isEmpty(){
    return top==0;
   }
   public boolean isfull(){
    return this.top==this.data.length;
   }
   public void push(int item) throws Exception{
    if(isfull()){
        throw new Exception("Stack is full");
    }
    this.data[top]=item;
    top++;
   }
   public int pop() throws Exception{
    if(isEmpty()){
        throw new Exception("Stack is Empty");
    }
    this.top--;
    return this.data[top];
   }
   public int peek() throws Exception{
    if(isEmpty()){
        throw new Exception("Stack is Empty");
    }
    return this.data[top-1];
   }
   public int size(){
    return this.top;
   }
   public void Display(){
    for(int i=0;i<top;i++){
        System.out.print(this.data[i]+" ");
    }
    System.out.println();
   }
}
