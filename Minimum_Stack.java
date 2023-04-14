import java.util.*; 
public class Minimum_Stack {
    public static void main (String args[]) {
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i = 0 ; i<n ; i++ ){
			str[i] = sc.next();
		}
		for(int i = 0 ; i<n ; i++ ){
			if(str[i].equals("push")){
				int j = sc.nextInt();
				st.push(j);
			}
			else if(str[i].equals("pop")){
				st.pop();
			}
			else if(str[i].equals("top")){
				System.out.print(st.peek()+" ");
			} else{
				// continue;
				getmin(st);
			}
		}

    }
	public static void getmin(Stack<Integer> st){
				Object arr[] = st.toArray();  // convert stack into array
				Arrays.sort(arr);
				System.out.print(arr[0]+" ");
	}

}
