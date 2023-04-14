package codingblocks;
import java.util.*;

public class Importanceoftime {
   public static void main(String[] args) {
    Scanner yashu =new Scanner(System.in);
    int n=yashu.nextInt();
    Queue calling=new LinkedList<>();
    Queue ideal =new LinkedList<>();
    for(int i=0;i<n;i++){
        int x=yashu.nextInt();
        calling.Enqueue(x);
    }
    for(int i=0;i<n;i++){
        int x=yashu.nextInt();
        ideal.Enqueue(x);
    }
    importanceoftime(calling, ideal);
   } 
   public static int importanceoftime(Queue q1,Queue q2){
    int total_time=0;
    while(!q1.isEmpty()){
        if(q1.getfront()==q2.getfront()){
            q1.Dequeue();
            q2.Dequeue();
            total_time++;
        }
        else{
            while(q1.getfront()!=q2.getfront()){
                int data=q1.Dequeue();
                q1.Enqueue(data);
                total_time++;
            }
        }
    }
        return total_time;
   }
}
