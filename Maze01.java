public class Maze01 {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        ans(maze, 0, 0, "");
    }

    static void ans(boolean[][] maze , int r , int c ,String ans){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(ans);
            return;
        }

        if(r < 0 || c < 0 || r == maze.length || c == maze[0].length || maze[r][c] == true){
            return;
        }

        maze[r][c] = true;

        // GO UP
        ans(maze , r-1 , c , ans+'U');
        // GO DOWN
        ans(maze , r+1 , c , ans+'D');
        // GO LEFT
        ans(maze , r , c-1 , ans+'L');
        // GO RIGHT
        ans(maze , r , c+1 , ans+'R');

        maze[r][c] = false;
    }
}
