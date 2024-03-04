import java.util.*;
import java.util.LinkedList;
import java.util.HashMap;
public class TopologicalSort {
   
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        public TopologicalSort(int v){
            for(int i=1;i<=v;i++){
                map.put(i, new HashMap<>());
            }
        }

        public void addEdge(int v1,int v2){
            map.get(v1).put(v2,0); //v1--> v2
        }
        // topological sort ke liye indegree find krenge
        // vertex ke neighbou rka indegree find krenge
        public int[] Indegree(){
            int v = map.size();
            int[] arr = new int[v+1];
            for(int key: map.keySet()){
                for(int nbrs: map.get(key).keySet()){
                    arr[nbrs]++;
                }
            }
            return arr;
        }
        public void Topological(){
            int in[] = Indegree();
            Queue<Integer> q = new LinkedList<>();
            for(int i=1;i<in.length;i++){
                if(in[i]==0){
                    q.add(i);
                }
            }
            while(!q.isEmpty()){
                int v = q.poll();
                System.out.print(v+" ");
                for(int nbrs: map.get(v).keySet()){
                    in[nbrs]--;
                    if(in[nbrs]==0){
                        q.add(nbrs);
                    }
                }
            }
            System.out.println();
        }
  
        public static void main(String[] args) {
            TopologicalSort tp = new TopologicalSort(7);
            tp.addEdge(1, 2);
            tp.addEdge(1, 4);
            tp.addEdge(4, 3);
            tp.addEdge(3, 2);
            tp.addEdge(2, 5);
            tp.addEdge(4,3);
            tp.Topological();
        }
}



 // one of the advanced algorithm used in OS
    // this is a dependency removed algorithm
    // directed acyclic graph pr hi topological sort apply krenge
    // directed graph m cycle detect krne ke liye we will use topological sort 
    // it is known as khans algorithm
    // indegree means kitni edges node pr aa rhi hai
    // outdegree means kitni edges node se ja rhi hai
    // topological sort m ans diff aa sakte hai
    // graph m kisi bhi vertex pr(means kisi bhi node ki) indegree 0 nhi hai means isme cycle hai