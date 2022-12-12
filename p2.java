// Write a program to build the grid.
public class p2 {
    public static void main(String[] args) {
        int[][] grid = new int[10][10];
        for(int i= 0 ;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.printf("%2d ", grid[i][j]);
            }
            System.out.println();
        }
    }
}
