
public abstract class Board {

	private int size;
	private String[][] board;

	//construct board with the number of rows/colums
	public Board(int size) {
		setSize(size);
		this.board = new String[size][size];
	}

	//construct board without argument
	public Board() {
		this.board = new String[3][3];
	}

	//assign white space to all blanks
	public String[][] boardInitial() {
		System.out.println("");
		System.out.println("The board has been initialized.");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				board[i][j] = "  ";
			}
		}
		return board;
	}


	public int getSize() {
		return size;
	}

	public void setSize(int newSize) {
		this.size = newSize;
	}


	public void setValue(int row, int col, String value) {
		this.board[row][col] = value;
	}

	public String getValue(int row, int col) {
		return board[row][col];
	}

	//abstract method, which will be overridden in subclasses
	public abstract boolean winCheck(int row, int col, String value);

	public void boardPrint() {

		System.out.println("");
		//print the line +--+--+--+--+ in board
		String style1 = "";
		String style2 = "";
		for(int i = 0; i < size; i++) {
			style1 += "+--";
		}
		style1 += "+";

		//print the line |  |  |  |  | in board
		for(int j = 0; j < size; j++) {
			System.out.println(style1);
			for(int m = 0; m < size; m++) {
				style2 += "|";
				style2 += board[j][m];
			}
			style2 += "|";
			System.out.println(style2);
			style2 = "";
		}
		System.out.println(style1);
		System.out.println("");

	}

}
