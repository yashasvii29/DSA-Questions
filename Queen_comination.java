public class Queen_comination {
    public static void main(String[] args) {
        int n=4;
        int tq=2;//total queen
        //qpsf...queen place so far
        boolean board[]=new boolean[n];
        Permutation(board, tq,0, "",0);

    }
    public static void Permutation(boolean board[],int tq,int qpsf,String ans,int idx) { 
        if(qpsf==tq){
            System.out.println(ans+" ");
            return;
        }
        for(int i=idx;i<board.length;i++){
            if(board[i]==false){    // false means queen is not placed...... uss index pr queen nhi hai
                board[i]=true;      // true means queen is palced.....uss index pr queen ko placed kr diya hai
                Permutation(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf,i+1);
                board[i]=false;        // false means jahan pr queen lo place kiya tha vahan se hata denge 
            }

        }
    }
}
