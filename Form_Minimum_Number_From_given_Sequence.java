
import java.util.*;
import java.util.Stack;
public class Form_Minimum_Number_From_given_Sequence {
    public static void main(String args[]) {
		Scanner yashu=new Scanner(System.in);
		int s=yashu.nextInt();
		String board[]=new String[s];
		for(int k=0;k<board.length;k++){
			board[k]=yashu.next();
		}
		for(int i=0;i<board.length;i++){
			String st=board[i];
			PrintMinimum(st);
		}
        // input s=4  and  input the elements of an board[]=[D,I,DD,II];
    }
	public static void PrintMinimum(String st){
		int sol[]=new int[st.length()+1];
		Stack<Integer> obj=new Stack<>();
		int p=1;
		for(int i=0;i<=st.length();i++){
			if(i==st.length()||st.charAt(i)=='I'){
				sol[i]=p;
				p++;
				while(!obj.isEmpty()){
					sol[obj.pop()]=p;
					p++;
				}
			}
				else{
					obj.push(i);
				}
		}
			for(int j=0;j<sol.length;j++){
				System.out.print(sol[j]);
			}
			System.out.println();
		
	}
}
