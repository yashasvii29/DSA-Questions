public class transpse {
    public static void main(String[] args) {
        int arr[][]={{2,3,4,7},{8,12,15,16},{18,1,2,4},{20,5,6,2}};
        Print(arr);
    }
    public static void Print(int arr[][]) {
        for(int col=0;col<arr[0].length;col++){
            for(int row=0;row<arr.length;row++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        
    }
}
