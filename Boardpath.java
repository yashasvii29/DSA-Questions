public class Boardpath {
    public static void main(String[] args) {
        int n=4;
        boardpath(n,0,"");
        System.out.println("\n"+ c);
    }
    static int c=0;
    public static void boardpath(int des,int cur,String ans){
        if(cur==des){
            System.out.print(ans+" ");
            c++;
            return ;
        }
        if(cur>des){
            return ;
        }
       for(int dice=1;dice<=3;dice++){   // dice == 3 because its a triangular dice
            boardpath(des, cur+dice, ans+dice);
       }
    }
}

