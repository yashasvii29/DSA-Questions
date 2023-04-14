import java.util.*;
public class Hoodies_At_Coding_Blocks {
    public static void main(String[] args) {
        Scanner yashu=new Scanner(System.in);
        int n=yashu.nextInt();
        ArrayList<LinkedList<Integer>> course=new ArrayList<>();
        // question m 4 course given h so 4 size ki array list banayenge which will contain linkedlist of integer
        for(int i=0;i<5;i++){
            // Arraylist ke har index pr khali linked list add karenge as a queue beacuse hume queue m entry add krni hai
            course.add(new LinkedList<Integer>());
        }
        ArrayList<Integer> track =new ArrayList<>();
        // track array list banayenge jo course ka track rakhegi ( pehle kis course ko add kiya hai usi ke according students ko hoodies provide krenge)
        // track arraylist ke according hi course and roll no. print krenge
        while(n-->0){
            char ch=yashu.next().charAt(0);
            if(ch=='E'){
                int x=yashu.nextInt();
                int y=yashu.nextInt();
                if(track.contains(x)){
                    course.get(x).add(y);
                }
                else{
                    track.add(x);
                    course.get(x).add(y);
                }
            }
            else{
                int course_id=track.get(0);
                int roll_no=course.get(course_id).removeFirst();
                System.out.println(course_id+" "+roll_no);
                if(course.get(course_id).isEmpty()){
                    track.remove(0);
                }
            }
        }
 
    }
}
