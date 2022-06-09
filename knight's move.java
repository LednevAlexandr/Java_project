public class Main
{
    static int globalCount = 0;
	public static void main(String[] args) {

		int[][] board = new int[5][5];
		int[][] step = {{-2,1},{-2,-1},{2,1},{2,-1},{-1,2},{-1,-2},{1,2},{1,-2}};
		for (int i = 0;i < board.length;i++){
		    for (int j = 0;j < board.length;j++){
		        if (!method(board,step,i,j,0,0)){
		            continue;
		        }
		        else{
		            for (int k = 0;k < board.length;k++){
		                for (int l = 0;l < board.length;l++){
		                    System.out.print(board[k][l] + " ");
		                }
		                System.out.println();
		                break;
		        }
		    }
		}
		}
	}
		
	public static boolean method(int[][] board,int[][] step,int rawBoard,int collBoard,int rawstep,int collstep){

	    if (rawstep > board.length) return false;
	    if (globalCount == board.length*board.length) return true;
	    int y1 = rawBoard + step[rawstep][collstep];
	    int x1 = collBoard + step[rawstep][collstep+1];
	    if (y1 > board.length || x1 > board.length || board[y1][x1] != 0){
            //y1 = rawBoard - step[rawstep][collstep];
	        //x1 = collBoard - step[rawstep][collstep+1];
	        method(board,step,rawBoard,collBoard,rawstep + 1,collstep);
	    }
	    else {
	        board[y1][x1] = globalCount + 1;
	        method(board,step,y1,x1,rawstep,collstep);
	    }
	}
}
