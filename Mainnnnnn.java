import java.util.*;
public class Mainnnnnn {
    static int k=0;
    public static void main(String args[]) 
    {
        Scanner a=new Scanner(System.in);
        int row=a.nextInt();
        int col=a.nextInt();
        char arr[][]=new char[row][col];
        for(int i=0;i<row;i++)
        {
            String s=a.next();
            for(int j=0;j<col;j++)
            {
                arr[i][j]=s.charAt(j);
            }
        } 
        int ans[][]=new int[row][col];
        rat_in_chase(arr,ans,0,0,row,col);
        k=90;
        if(k==0)
        {
            System.out.print("-1");
        }
    }
    public static void rat_in_chase(char arr[][],int ans[][],int cr,int cc,int row,int col)
    {
        if(cc==col-1 && cr==row-1 && k==0 && arr[cr][cc]=='O')
        {
            k=90;
            ans[cr][cc]=1;
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }
        if(cc<0 || cr<0 ||cc>=col || cr>=row || arr[cr][cc]=='X')
            return;
        arr[cr][cc]='X';
        ans[cr][cc]=1;
        rat_in_chase(arr,ans,cr+1,cc,row,col);
        rat_in_chase(arr,ans,cr,cc+1,row,col);
        arr[cr][cc]='X';
        ans[cr][cc]=1;
        
    }
}
    

