
public class OAC_Logic {
	//in OAC game, the size of the board is fixed to 6
	private final int fixSize = 6;

	public void run(UI oacUI, Input_Check userInput, Player firstPlayer, Player secondPlayer) {
		//introduce OAC's rules
		oacUI.oacIntro();
		//create a new OAC board
		OAC_Board board = new OAC_Board(fixSize);
		//initialize and print the board
		board.boardInitial();
		board.boardPrint();
		boolean flagWinPlayerOrder = false;
		boolean Six_in_a_row = false;

		int round = 1;
		int[] position = {-1, -1};
		String value = "";

		//total round = 6*6 + 1 = 37
		while(round < fixSize*fixSize + 1) {
			//Player order's turn
			if(round % 2 == 1) {
				//player 1 chooses to enter O or X
				value = userInput.oacPlayerChoice(round);
				//get player 1's coordinate
				position = userInput.oacPlayerPosition(position, board, round);
				board.setValue(position[0], position[1], value);
				board.boardPrint();
				//check if it reaches addition condition 6 in a row
				Six_in_a_row = board.Six_in_a_row(position[0], position[1], value);
				//check if player order reaches winning condition
				flagWinPlayerOrder = board.winCheck(position[0], position[1], value);
				//Print UI if it reaches 6 in a row condition
				if(Six_in_a_row == true) {
					oacUI.Six_in_a_row();
				}
				else if(flagWinPlayerOrder == true && !Six_in_a_row) {
					//if the game reaches order condition, player order wins
					oacUI.oacPlayerOrderWins();
					firstPlayer.addScore();
					break;
				}
			}
			//Player chao's turn
			else if(round % 2 == 0) {
				//player 2 chooses to enter O or X
				value = userInput.oacPlayerChoice(round);
				//get player 2's coordinate
				position = userInput.oacPlayerPosition(position, board, round);
				board.setValue(position[0], position[1], value);
				board.boardPrint();
				//check if it reaches addition condition 6 in a row
				Six_in_a_row = board.Six_in_a_row(position[0], position[1], value);
				//check if player order reaches winning condition
				flagWinPlayerOrder = board.winCheck(position[0], position[1], value);
				//Print UI if it reaches 6 in a row condition
				if(Six_in_a_row == true) {
					oacUI.Six_in_a_row();
				}
				else if(flagWinPlayerOrder == true && !Six_in_a_row) {
					//if the game reaches order condition, player order wins
					oacUI.oacPlayerOrderWins();
					firstPlayer.addScore();
					break;
				}
			}
			round++;
		}
		if(round==fixSize*fixSize + 1) {
			//player chaos wins only if the board is full
			secondPlayer.addScore();
			oacUI.oacPlayerChaosWins();
		}

	}

}
