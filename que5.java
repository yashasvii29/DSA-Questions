/*public class que5 {
    public static void main(String[] args) {
        int n=10,c=0,j=1;
        for(int i=1;i<=10;){
            while(j<=i)
            {
                if(i%j==0){
                    c++;
                }
                j++;   
             }
            if(c==2)
            {
                System.out.println(i);  
            }
            i++;
        }
        
    }
}*/


public class que5
{
    
    public static void main(String[] args) {
        for(int i=2;i<=10;i++)
        {
            int j=2;
            int c=0;
            while(j<i)
            {
                if (i%j==0)
                {
                    c++;
                }
                j++;
                
            }
            if(c==0)
                {
                    System.out.println(i);
                }
            }
        }
        
    }

