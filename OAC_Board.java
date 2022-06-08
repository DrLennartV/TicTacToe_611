
public class OAC_Board extends Board{



	public OAC_Board(int size) {
		super(size);
	}

	public boolean Six_in_a_row(int row, int col, String value) {
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

	@Override
	public boolean winCheck(int row, int col, String value) {
		// TODO Auto-generated method stub
		//check column
		for(int i=0; i<5; i++) {
			if(!getValue(row, i).equals(value)) break;
			if(i == 4) return true;
		}
		for(int i=1; i< 6; i++) {
			if(!getValue(row, i).equals(value)) break;
			if(i == 5) return true;
		}

		//check row
		for(int i = 0; i < 5; i++) {
			if(!getValue(i, col).equals(value)) break;
			if(i == 4) return true;
		}

		for(int i = 1; i < 6; i++) {
			if(!getValue(i, col).equals(value)) break;
			if(i == 5) return true;
		}

		//check diagonal
		for(int i = 0; i < 5; i++) {
			if(!getValue(i, i).equals(value)) break;
			if(i == 4) return true;
		}

		for(int i = 1; i < 6; i++) {
			if(!getValue(i, i).equals(value)) break;
			if(i == 5) return true;
		}

		for(int i = 0; i < 5; i++) {
			if(!getValue(i, i+1).equals(value)) break;
			if(i == 4) return true;
		}

		for(int i = 0; i < 5; i++) {
			if(!getValue(i+1, i).equals(value)) break;
			if(i == 5) return true;
		}

		//check anti-diagonal
		for(int i=0; i<5; i++) {
			if(!getValue(4-i, i).equals(value)) break;
			if(i == 4) return true;
		}

		for(int i=1; i<6; i++) {
			if(!getValue(6-i, i).equals(value)) break;
			if(i == 5) return true;
		}


		for(int i=0; i<5; i++) {
			if(!getValue(5-i, i).equals(value)) break;
			if(i == 4) return true;
		}

		for(int i=1; i<6; i++) {
			if(!getValue(5-i, i).equals(value)) break;
			if(i == 5) return true;
		}

		return false;
	}

}
