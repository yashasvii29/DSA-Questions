import java.util.Queue;
// import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
public class Is_Cycle {
    HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        public Is_Cycle(int v){
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
        public boolean Topological(){
            int in[] = Indegree();
            Queue<Integer> q = new LinkedList<>();
            for(int i=1;i<in.length;i++){
                if(in[i]==0){
                    q.add(i);
                }
            }
            int c=0;
            while(!q.isEmpty()){
                int v = q.poll();
                c++;
                // System.out.print(v+" ");
                for(int nbrs: map.get(v).keySet()){
                    in[nbrs]--;
                    if(in[nbrs]==0){
                        q.add(nbrs);
                    }
                }
            }
            return c == map.size();
        }
  
        public static void main(String[] args) {
            Is_Cycle tp = new Is_Cycle(7);
            tp.addEdge(1, 2);
            tp.addEdge(1, 4);
            tp.addEdge(4, 3);
            tp.addEdge(3, 2);
            tp.addEdge(2, 5);
            tp.addEdge(4,3);
            System.out.println(tp.Topological());
            
        }
}
