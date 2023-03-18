public class queen_2dboard{
    public static void main(String[] args) {
        int n=5;
        int arr[]=new int[n];
        int q=2;//2d board pr 2 queen ko kitne ways m place kr sakte h permutation
        permutation(arr,0,0,q,"",n-1,n-1);
        System.out.println(c);
    
    }
    static int c=0;
    public static void permutation(int arr[],int row,int col,int tq,String ans,int totalcol,int totalrow){
        if(tq==0){
            System.out.println(ans);
            c++;
            return ;
        }
        if(col==totalcol){
            col=0;
            row++;
        }
        if(row==totalrow){
            return ;
        }
        permutation(arr,row, col+1, tq-1, ans+"q{"+row+","+col+"}", totalcol, totalrow);
        permutation(arr,row, col+1, tq, ans, totalcol, totalrow);
    }

}