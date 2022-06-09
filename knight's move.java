public class knight_move {
	static int globalCount = 1;
	static int y1;
	static int x1;

	public static void main(String[] args) {

		int[][] board = new int[5][5];
		int[][] step = { { -2, 1 }, { -2, -1 }, { 2, 1 }, { 2, -1 }, { -1, 2 }, { -1, -2 }, { 1, 2 }, { 1, -2 } };
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = 1;
				if (!method(board, step, i, j, 0, 0)) { // заходим с текущими i и j
					// обнуление масива перед следующим начальным положением
					for (int e = 0; e < board.length; e++) {
						for (int t = 0; t < board.length; t++) {
							board[e][t] = 0;
						}
					}
					continue;
				} else {
					// печатаем масив если True, т.е. globalCount достиг 26
					for (int k = 0; k < board.length; k++) {
						for (int l = 0; l < board.length; l++) {
							System.out.print(board[k][l] + " ");
						}
						System.out.println();
						break;
					}
				}
			}
		}
		System.out.println("Решения нет");
	}

	public static boolean method(int[][] board, int[][] step, int rawBoard, int collBoard, int rawstep, int collstep) {

		if (rawstep > step.length - 1) {
			// если в step шаги закончились, значит count = 1 и выходим в main, чтобы
			// передвинуть начальное положение.
			globalCount = 1;
			return false;
		}
		if (globalCount > 25)
			return true;
		y1 = rawBoard + step[rawstep][collstep];
		x1 = collBoard + step[rawstep][collstep + 1];
		if (y1 > board.length - 1 || x1 > board.length - 1 || y1 < 0 || x1 < 0) {
			y1 = y1 - step[rawstep][collstep];
			x1 = x1 - step[rawstep][collstep + 1];
			return method(board, step, rawBoard, collBoard, rawstep + 1, collstep); // следующий ход с предыдущей
																					// координаты
		}
		if (board[y1][x1] == 0) {
			board[y1][x1] = globalCount + 1;
			globalCount++;// увеличиваем
			return method(board, step, y1, x1, rawstep, collstep);// y1 x1 - новый rawBoard и collBoard, идем дальше по
																	// тому же ходу
		} else {
			y1 = y1 - step[rawstep][collstep];
			x1 = x1 - step[rawstep][collstep + 1];
			return method(board, step, rawBoard, collBoard, rawstep + 1, collstep); // следующий ход с предыдущей
																					// координаты
		}

	}
}
