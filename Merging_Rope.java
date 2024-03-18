import java.util.PriorityQueue;

public class Merging_Rope {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,5,7};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int sum=0;
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            sum+=a+b;
            pq.add(a+b);
        }
        System.out.println(sum);
    }
}

// merging rope... question of heap(min heap)
// 5 rope ki length given hai 2 rope ko merge krke min sum return krna hai
// 2 rope ki length ko add krenge an then unke sum ko again priority queue m daal denge
