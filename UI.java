
public class UI {

	public void menuIntro() {
		System.out.println("Welcome to the Menu!");
		System.out.println("There are 2 different types of turn based board game.");
		System.out.println("Enter 1 to play Tic Tac Toe. Enter 2 to play Order and Chaos. Enter 3 to exit.");
		System.out.println("");
		System.out.println("1. Tic Tac Toe");
		System.out.println("2. Order and Chaos");
		System.out.println("3. Exit");
		System.out.println("");
	}

	public void End() {
		System.out.println("");
		System.out.println("Thank you for enjoying the game!");
		System.out.println("Goodbye!");
	}


	public void HalvingLine() {
		System.out.println("");
		System.out.println("--------------------------------------Back to Menu-----------------------------------------");
		System.out.println("");
	}

	public void tttHalvingLine() {
		System.out.println("");
		System.out.println("--------------------------------------Tic Tac Toe------------------------------------------");
		System.out.println("");
	}

	public void oacHalvingLine() {
		System.out.println("");
		System.out.println("------------------------------------Order and Chaos----------------------------------------");
		System.out.println("");
	}

	public void tttIntro() {
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println("In this game player 1 draws O and player 2 draws X.");
		System.out.println("When it comes to your turn, enter row and column number of the position. Player O Goes First");
		System.out.println("");
	}

	public void tttPlayerOWins() {
		System.out.println("Player O Wins the Game! Congratulations!");
		System.out.println("");
	}

	public void tttPlayerXWins() {
		System.out.println("Player X Wins the Game! Congratulations!");
		System.out.println("");
	}

	public void tttDraw() {
		System.out.println("Draw");
		System.out.println("");
	}

	public void oacIntro() {
		System.out.println("Welcome to Order and Chaos!");
		System.out.println("In this game there are 2 players. Both can draw O or X.");
		System.out.println("Player Order needs to create continuous 5 Os or Xs. Player Chaos needs to stop until the board is full.");
		System.out.println("Enter row and column number of the position. Player Order Goes First.");
		System.out.println("");
	}

	public void oacPlayerChaosWins() {
		System.out.println("Player Chaos Wins the Game! Congratulations!");
		System.out.println("");
	}

	public void oacPlayerOrderWins() {
		System.out.println("Player Order Wins the Game! Congratulations!");
		System.out.println("");
	}

	public void Six_in_a_row() {
		System.out.println("Six in a row condition");
		System.out.println("");
	}

	public void Summary(Team A, Team B) {
		System.out.println("");
		System.out.println("SUMMARY  ");
		System.out.println("Team " + A.getTeamName() + "                 Total Score: " + A.getTeamScore());
		for(int i = 0; i<A.getTeamSize(); i++) {
			System.out.println("Player " + A.Player[i].getID() + "                     Score: " + A.Player[i].getScore());
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Team " + B.getTeamName() + "                 Total Score: " + B.getTeamScore());
		for(int i = 0; i<B.getTeamSize(); i++) {
			System.out.println("Player " + B.Player[i].getID() + "                     Score: " + B.Player[i].getScore());
		}
		System.out.println("");
	}


}
