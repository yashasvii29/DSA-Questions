public class Word_Search {
    public static void main(String[] args) {
        char maze[][]={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E',' '}};
        String word="ABCCED";
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                if(maze[i][j]==word.charAt(0)){
                    boolean ans=Search(maze, i, j, word, 0);
                    if(ans){
                    System.out.println(ans);
                    return;
                }
                
                
                }
            }     
        
        }
        System.out.println(false);
            

    }
        public static boolean Search(char maze[][],int cr,int cc,String word,int idx){
            if(idx==word.length()){
                return true;
            }
            if(cr<0||cc<0||cr>=maze.length||cc>=maze[0].length||maze[cr][cc]!=word.charAt(idx)){
                return false;
            }
            int r[]={-1,1,0,0};
            int c[]={0,0,1,-1};
            maze[cr][cc]='*';
            boolean ans=false;
            for(int i=0;i<c.length;i++){
                ans=Search(maze,cr+r[i],cc+c[i],word,idx+1);
                if(ans){
                    return ans;
                }
            }
            maze[cr][cc]=word.charAt(idx);
            return false;
        }
}
