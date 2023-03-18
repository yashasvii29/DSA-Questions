public class Maze_path{
    public static void main(String[] args) {
        int n=3;//row
        int m=4;//col
        String ans;
        PrintAnswer(n, m, 0, 0,ans="" );
        System.out.println(c);
    }
    static int c=0;
    public static void PrintAnswer(int n,int m,int cc,int cr,String ans){
        if(cc==m-1&& cr==n-1){
            System.out.println(ans);
            c++;
            return ;
        }
        if(cc>=m || cr>=n){
            return ;
        }
        PrintAnswer(n,m,cc,cr+1,ans+"V");
        PrintAnswer(n,m,cc+1,cr,ans+"H");
        
    }
}