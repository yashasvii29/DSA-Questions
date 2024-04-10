// package GraphQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Graph_validTree {
    public static void main(String[] args) {
        int n=5; // no. of vertices
        int edges[][] = {{0,1}, {0,2}, {0,3}, {1,4}};
        System.out.println(validTree(n,edges));
        

    }
    public static boolean validTree(int n,int edges[][]){
        // we have to find graph validtree hai ya nhi
        // if graph validtree hai then we will return true
        HashMap<Integer ,HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashMap<>());
            // har index ke corresponding ek list add krenge

        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            map.get(v1).put(v2,1);
            // map.se get krenge v1 ke corresponding hashmap and put v2 vertex nad cost
            map.get(v2).put(v1,1);
               // map.se get krenge v2 ke corresponding hashmap and put v1 vertex nad cost

        }
        

         Queue<Integer> q=new LinkedList<>() ;
            HashSet<Integer> visited=new HashSet<>();
            int c=0;
            for(int src:map.keySet()){
                if(visited.contains(src)){
                    // if src already visited h then ignore
                    continue;
                }
                c++;
                q.add(src);
                while(!q.isEmpty()){
                // 1. remove
                int rv=q.poll();
                // 2. if already visited then ignore
                if(visited.contains(rv)){ // if rv already visited hai  means graph m cycle hai
                    // if graph m cycle h means graph is not a valid tree then we will return false 
                    return false;
                    // continue;
                }
                // marked visited
                visited.add(rv);
                // 4. self work
                // System.out.println(rv+" ");
                   // 5. add nbrs..nbrs add krenge queue m
                for(int nbrs: map.get(rv).keySet()){
                    if(!visited.contains(nbrs)){
                            // if nbrs visited marked nhi hai toh q m add krenge
                        q.add(nbrs);
                    }
                }
            }
            
            }
            return c==1;
        
        // submit this leetcode que on lintcode
        // bfs 100% guarantee leta hai shortest path ka
        // dfs can give wrong shortest path

    }
}
