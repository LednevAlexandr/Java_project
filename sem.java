import java.util.ArrayList;

/**
 * sem
 */
public class sem {
    ArrayList<Integer> posit = new ArrayList<>();

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

    }

    public boolean comb(int[][] matrix,int x, int y){
        for (int i = 0; i < y;i--){
            if (matrix[x][i] == 1) return false;
        }
        for (int i = x - 1,int j = y-1;i<=0 && j>=0;i--,j--){
            if (matrix[i][j] == 1) return false;
        }
        for (int i = x - 1,int j = y-1;i<=0 && j>=0;i--,j--){
            if (matrix[i][j] == 1) return false;

        for (int i = x - 1,int j = y-1;i<=0 && j>=0;i--,j--){
                if (matrix[i][j] == 1) return false;
        comb(matrix,x+1,y);
        comb(matrix,x,y+1 );
    }
}