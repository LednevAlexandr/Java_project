import java.util.Arrays;
public class Main {
static int moveNum = 1;
static int[][] board = new int[5][5];
static int[][] moves = { { -2, 1 }, { -2, -1 }, { 2, 1 }, { 2, -1 }, { -1, 2 }, { -1, -2 }, { 1, 2 }, { 1, -2 } };
static int maxMoves =25;
	public static void main(String[] args) {
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (!findPath(i,j,moveNum)) {
				    continue;
				}
				else {
					for (int k = 0; k < board.length; k++) {
						for (int l = 0; l < board.length; l++) {
							System.out.print(board[k][l] + " ");
						}
						System.out.println();
					}
					return;
				}
			}
		}
	}

    public static boolean findPath(int curX, int curY, int moveNum) {
             board[curX][curY]=moveNum;
             if (moveNum >= maxMoves) return true;

            for (int i = 0;i<8;i++){
                int nextX = curX + moves[i][0];
                int nexty = curY + moves[i][1];
                if (isPossibleMove(nextX,nexty) && findPath(nextX, nexty, moveNum+1)){
                    return true;
                }
            }
            board[curX][curY]=0;
		    return false;
}
    public static boolean isPossibleMove(int curX,int curY){
        if (curX > board.length-1 || curY > board.length-1 || curX < 0 || curY < 0){
            return false;
        }
        else{
            return true;
        }
    }
}
