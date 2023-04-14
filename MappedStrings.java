import java.util.*;
public class MappedStrings 
{
    public static void main(String[]args){ 
        Scanner sc=new Scanner(System.in); 
        String st =sc.next(); 
        printString(st,""); 
    } 
         
    public static void printString(String st,String ans)
    { 
        if(st.isEmpty())
        { 
            System.out.println(ans); 
            return; 
        } 
         
        for(int i =1 ;i<=st.length();i++){ 
        int pre =Integer.parseInt(st.substring(0,i))-1; 
        char ch=(char)(pre+65); 
            if(ch>=65&&ch<=90) 
                printString(st.substring(i),ans+ch); 
        
        }
    } 
}
