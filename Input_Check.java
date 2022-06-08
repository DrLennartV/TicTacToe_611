
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Input_Check {

	public static Scanner input;

	//detect user's choice in menu
	public int gameType(){
		int type = -1;
		input = new Scanner(System.in);
		System.out.print("Please enter your choice here: ");
		String num1 = input.nextLine();
		while(!num1.equals("1") && !num1.equals("2") && !num1.equals("3")) {
			System.out.print("Please enter a number between 1 and 3: ");
			num1 = input.nextLine();
		}
		type = Integer.parseInt(num1);
		return type;

	}

	//detect user's input to initialize the TTT board
	public int tttBoardSize(int minimum, int maximum) {
		int size = -1;
		input = new Scanner(System.in);
		do {
			System.out.print("Please enter row/column number here (minimum " + String.valueOf(minimum) + ", maximum " + String.valueOf(maximum) + "): " );
			//if input is not an integer, ask to enter again
			while (!input.hasNextInt()) {
				input.nextLine();
				System.out.print("Please enter an integer: ");
			}
			size = input.nextInt();
			//if size is not between 3 and maximum, ask to enter again
		}while(!(size >= 3 && size <= maximum));
		return size;
	}

	public int[] tttPlayerInput(int[] position, Player player, TTT_Board board) {
		List<String> ss = new ArrayList<String>();
		input = new Scanner(System.in);
		boolean emptySpace = true;
		boolean range = true;
		int row = -1, col = -1;
		do {
			//extract two integers as row and column and save them in an array from the input string
			System.out.print("Player " + player.getName() + " Enter your move (e.g. 1,1): ");
			String s = input.nextLine();
			for(String sss:s.replaceAll("[^0-9]", ",").split(",")){
				if (sss.length()> 0)
			        ss.add(sss);
			}
			//if the input consists of less than or greater than two integers, ask to enter again
		    if(ss.size()==2) {
		    	row = Integer.parseInt(ss.get(0));
		    	col = Integer.parseInt(ss.get(1));
		    	//if the position is not within the boundary, enter again
		    	if(!(row >= 0 && row <= board.getSize())  || !(col >= 0 && col <= board.getSize())) {
			    	System.out.println("Please enter the postion within the boundary. ");
			    	range = false;
			    }else {
			    	//if the position has already been assigned with value, ask to enter again
			    	if(!board.getValue(row-1, col-1).equals("  ")) {
			    		System.out.println("Please enter an empty position");
						emptySpace = false;
				    }else {
					    emptySpace = true;
					    range = true;
				    }
			    }
		    }else {
		    	System.out.println("Please enter two appropriate integers");
		    	range = false;
		    	emptySpace = false;
		    }
		    ss.removeAll(ss);
		}while( range != true || emptySpace != true);
		//convert row and column number to index
		position[0] = row-1;
		position[1] = col-1;
		return position;
	}

	public int[] oacPlayerPosition(int[] position, OAC_Board board, int round) {
		List<String> ss = new ArrayList<String>();
		String player = "";
		if(round % 2 == 1) player = "One";
		else player="Two";
		input = new Scanner(System.in);
		boolean emptySpace = true;
		boolean range = true;
		int row=-1, col=-1;
		do {
			System.out.print("Player " + player + " Enter your move (e.g. 1,1): ");
			String s = input.nextLine();
			for(String sss:s.replaceAll("[^0-9]", ",").split(",")){
				if (sss.length()> 0)
			        ss.add(sss);
			}
			//if the input consists of less than or greater than two integers, ask to enter again
		    if(ss.size()==2) {
		    	row = Integer.parseInt(ss.get(0));
		    	col = Integer.parseInt(ss.get(1));
		    	//if the position is not within the boundary, enter again
		    	if(!(row >= 0 && row <= board.getSize())  || !(col >= 0 && col <= board.getSize())) {
			    	System.out.println("Please enter the postion within the boundary. ");
			    	range = false;
			    }else {
			    	//if the position has already been assigned with value, ask to enter again
			    	if(!board.getValue(row-1, col-1).equals("  ")) {
			    		System.out.println("Please enter an empty position");
						emptySpace = false;
				    }else {
					    emptySpace = true;
					    range = true;
				    }
			    }
		    }else {
		    	System.out.println("Please enter two appropriate integers");
		    	range = false;
		    	emptySpace = false;
		    }
		    ss.removeAll(ss);
		}while(range != true || emptySpace != true);
		//convert row and column number to index
		position[0] = row-1;
		position[1] = col-1;
		return position;
	}

	//ask user to enter O or X in OAC game
	public String oacPlayerChoice(int round) {
		String player = "";
		if(round % 2 == 1) player = "One";
		else player="Two";

		String value = "";
		input = new Scanner(System.in);
		System.out.print("Player " + player + " choose to enter O or X (o or x): ");
		String num1 = input.nextLine();
		while(!num1.equalsIgnoreCase("X") && !num1.equalsIgnoreCase("O") ) {
			System.out.print("Please enter O or X character here ");
			num1 = input.nextLine();
		}
		if(num1.equalsIgnoreCase("o")) value = "O ";
		else value = "X ";
		return value;
	}

}
