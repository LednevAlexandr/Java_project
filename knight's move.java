public class Main
{
    static int moveNum;;
	static int[][] board = new int[5][5];
	static int[][] moves = { { -2, 1 }, { -2, -1 }, { 2, 1 }, { 2, -1 }, { -1, 2 }, { -1, -2 }, { 1, 2 }, { 1, -2 } };
	static int maxMoves = 25;
	
	public static void main(String[] args) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (findPath(i, j, 1)) {
				    printSol();
				    return;
				}
			}
		}
	}

	public static boolean findPath(int curX, int curY, int moveNum) {
		board[curX][curY] = moveNum;
		if (moveNum >= maxMoves)
			return true;

		for (int i = 0; i < 8; i++) {
			int nextX = curX + moves[i][0];
			int nexty = curY + moves[i][1];
			if (isPossibleMove(nextX, nexty) && findPath(nextX, nexty, moveNum + 1)) {
				return true;
			}
		}
		board[curX][curY] = 0;
		return false;
	}

	static boolean isPossibleMove(int x, int y) {
		return x >=0 &&  x < board.length && y >=0 && y < board.length && board[x][y] == 0;
		}
		
    public static void printSol(){
        for (int i = 0; i < board.length;i++){
            for (int j = 0; j < board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
