

public class Menu {
	public void Start(){

		boolean Flag_Game = true;

		//initialize the UI(context), user input
		UI gameUI = new UI();
		Input_Check userInput = new Input_Check();

		//create two teams, each consists of one player (TTT and OAC are both 1v1 game)
		Team A = new Team("A", 0, 0);
		Team B = new Team("B", 0, 0);
		//create two players
		Player firstPlayer = new Player(1, 1, "One");
		Player secondPlayer = new Player(2, 2, "Two");
		A.AddPlayer(firstPlayer);
		B.AddPlayer(secondPlayer);

		while(Flag_Game != false) {

			gameUI.menuIntro();

			//detect user's choice
			int gametype = userInput.gameType();

			//choice 1 TicTacToe
			if(gametype == 1) {
				//TTT game introduction
				gameUI.tttHalvingLine();
				//start a new TTT game
				TTT_Logic gameTTT = new TTT_Logic();
				gameTTT.run(gameUI, userInput, firstPlayer, secondPlayer);
				gameUI.HalvingLine();
			}
			//choice 2 Order and Chaos
			else if(gametype == 2) {
				//OAC game introductions
				gameUI.oacHalvingLine();
				//start a new OAC game
				OAC_Logic gameOAC = new OAC_Logic();
				gameOAC.run(gameUI, userInput, firstPlayer, secondPlayer);
				gameUI.HalvingLine();
			}

			//choice 3 exit
			else {
				Flag_Game = false;
			}

		}
		//close static scanner in class input_check
		Input_Check.input.close();
		//display the score of every team and player
		gameUI.Summary(A, B);
		gameUI.End();
	}

}
