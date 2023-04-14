import java.util.*;
public class Newpermutation {
  
    public static void main (String args[]) {
		Scanner yashu= new Scanner(System.in);
		String s=yashu.next();
		//ArrayList<String> ans=new ArrayList<>();
		String ans="";
        permu(s,"");
    }

	
	public static void permu(String s,String ans){
		if(s.length()==0){
			System.out.print(ans+" ");
			return;
		}
		char ch=s.charAt(0);
		if((ch>='a' && ch<='z')||(ch<='A' && ch>='Z')){
			permu(s.substring(1),ans+Character.toLowerCase(ch));
            permu(s.substring(1),ans+Character.toUpperCase(ch));
		}
		
		else 
            permu(s.substring(1),ans+ch);
	}
}
