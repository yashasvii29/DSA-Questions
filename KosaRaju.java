import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
public class KosaRaju {
    // Directed graph m strongly connected components find krna hai 
     HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
     public KosaRaju(int v){
        for(int i=0;i<v;i++){
            map.put(i,new HashMap<>());
        }
     }
     public void addEdge(int v1,int v2){
        map.get(v1).put(v2,5);
     }
     public void KosaRajuAlgo(){
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st =new Stack<>();
        // dfs all vertex stack m put kr do
        dfs(visited,st,0);
        // transpose krna ..means new graph banana hai(A->B ko B->A) m convert krna hai edges ko reverse krna hai graph m
        HashMap<Integer,HashMap<Integer,Integer>> map1 = new HashMap<>(); 
        Transpose(map1);
        // dfs component count krna
        int c=0;
        visited=new HashSet<>();
        while(!st.isEmpty()){
          int pop =   st.pop();
          if(!visited.contains(pop)){
            c++;
            dfs(map1,visited,pop);
          }
        }
        System.out.println(c);  
     }
     private void dfs(HashMap<Integer,HashMap<Integer,Integer>> map1,HashSet<Integer> visited,int pop){
        visited.add(pop);
        for(int nbrs:map.get(pop).keySet()){
            if(!visited.contains(nbrs)){
                dfs(map1,visited,nbrs);
            }
        }   
     }
     private void Transpose(HashMap<Integer,HashMap<Integer,Integer>> map1){
            for(int v1: map1.keySet()){
                for(int v2 : map1.get(v1).keySet()){ 
                    // y loop tabhi chalega jab vertex ka nbhr hoga 
                    if(!map1.containsKey(v2)){
                        map1.put(v2,new HashMap<>());
                    }
                    map1.get(v2).put(v1,5);
                }
            }
            for(int v1: map1.keySet()){
                if(!map1.containsKey(v1)){
                    map1.put(v1,new HashMap<>());
                }
            }
     } 
     public void dfs(HashSet<Integer> visited,Stack<Integer> st,int vtx){
        visited.add(vtx);
        for(int nbrs:map.get(vtx).keySet()){
            if(!visited.contains(nbrs)){
                dfs(visited, st, nbrs);
        }
     }
     st.push(vtx);
 }
}
