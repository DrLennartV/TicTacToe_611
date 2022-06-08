
public class TTT_Board extends Board {

	public TTT_Board(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean winCheck(int row, int col, String value) {
		// TODO Auto-generated method stub
		//check column
		for(int i =0; i < getSize(); i++) {
			if(!getValue(row, i).equals(value)) break;
			if(i == getSize() - 1) return true;
		}

		//check row
		for(int i = 0; i < getSize(); i++) {
			if(!getValue(i, col).equals(value)) break;
			if(i == getSize() - 1) return true;
		}

		//check diagonal
		if(row == col) {
			for(int i = 0; i < getSize(); i++) {
				if(!getValue(i, i).equals(value)) break;
				if(i == getSize() - 1) return true;
			}
		}

		//check anti diagonal
		if(row + col == getSize() - 1) {
			for(int i = 0; i < getSize(); i++) {
				if(!getValue(i, getSize()-1-i).equals(value)) break;
				if(i == getSize() - 1) return true;
			}
		}


		return false;
	}

}
