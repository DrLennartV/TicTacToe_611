
public class TTT_Logic {
	//the size of TTT board must vary between 3 and 10
	private final int size_Minimum = 3;
	private final int size_Maximum = 10;

	public void run(UI tttUI, Input_Check userInput, Player firstPlayer, Player secondPlayer) {
		//introduce TTT's rules
		tttUI.tttIntro();
		//let player choose the size of the board
		int size = userInput.tttBoardSize(size_Minimum,size_Maximum);
		//create a new TTT board
		TTT_Board board = new TTT_Board(size);
		//initialize and print the board
		board.boardInitial();
		board.boardPrint();
		boolean flagWin = false;

		int round = 1;
		int[] position = {-1, -1};
		String value = "";
		while(round < size*size + 1) {
			//Player 1's turn
			if(round % 2 == 1) {
				value = "O ";
				//get player 1's coordinate
				position = userInput.tttPlayerInput(position, firstPlayer, board);
				board.setValue(position[0], position[1], value);
				board.boardPrint();
				//check if it reaches winning condition
				flagWin = board.winCheck(position[0], position[1], value);
				if(flagWin == true) {
					//if player 1 wins, get one point
					tttUI.tttPlayerOWins();
					firstPlayer.addScore();
					break;
				}
			}
			//Player 2's turn
			else if(round % 2 == 0) {
				value = "X ";
				//get player 2's coordinate
				position = userInput.tttPlayerInput(position, secondPlayer, board);
				board.setValue(position[0], position[1], value);
				board.boardPrint();
				//check if it reaches winning condition
				flagWin = board.winCheck(position[0], position[1], value);
				if(flagWin == true) {
					//if player 2 wins, get one point
					tttUI.tttPlayerXWins();
					secondPlayer.addScore();
					break;
				}

			}

			round++;
		}
		//if no continuous n O or X until the board is full, draw condition and no one scores
		if(round==size*size + 1) {
			tttUI.tttDraw();
		}

	}

}
