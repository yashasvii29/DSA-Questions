public class que4 {
    public static void main(String[] args) {
        
    int numrows=3 ;
    int row=0,str=0;
        while(row==numrows)
        {
            int i=0;
            int ncr=1;
                if(row==3)
                {
                   while(i<=str)
                  {  
                    System.out.print(ncr+" ");
                    ncr=((row-i)*ncr)/(i+1);
                    i++;
                    
                  }
                }
        }
        row++;
    }
}
