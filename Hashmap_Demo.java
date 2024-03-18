import java.util.*;
// map 3 types ke hote hai and set bhi 3 types ke hote hai
// hashmap is a collection of  key value pair where each key is mapped to a single value
// contain means key ki entry hai ya nhi hai
// key unique hoga , value same ho sakti hai
// add, remove ,size,getmin,contain,display
// hashmap m angular braces m two datatype pass krenge (key and value)
// map is a interface and hashmap is a class in java
public class Hashmap_Demo {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        // Add ke liye we'll use  put function
        map.put("raj",68);
        map.put("Manish",78);
        map.put("Amisha",67);
        map.put("Puneet",98);
        map.put("Atul",78);
        map.put("Ankit",78);
        map.put("Ankit",58);
        map.put("Pooja",78);
        System.out.println(map);
        // get 
        System.out.println(map.get("Ankit"));
         System.out.println(map.get("Anku"));
         // remove
         System.out.println(map.remove("Anku"));
         System.out.println(map.remove("Ankit"));
         System.out.println(map);
         // contains
         System.out.println(map.containsKey("kunal"));
         System.out.println(map.containsKey("Raj"));
         System.out.println(map.size());
         // hashmap m null as a key allowed hai
         // hashmap m implementation linkedlist ke through hoti hai
         // hashmap m sabhi function ki complexity O(1) hoti hai in constant time
         // hashmap m data randomly print hota hai



        
    }
    
}
