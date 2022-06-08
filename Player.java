
public class Player implements Player_Interface{

	private int ID, Score, TeamID, Round;
	private String Name;

	//construct default Player with no arguments
	public Player() {
		this.ID = 0;
		this.TeamID = 0;
		this.Score = 0;
		this.Name = "";
	}

	//construct Player with three arguments
	public Player(int ID, int TeamID, String Name) {
		setTeamID(TeamID);
		setID(ID);
		this.Score = 0;
		setName(Name);
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	//add one point each winning
	public void addScore() {
		this.Score += 1;
	}

	public int getScore() {
		return Score;
	}

	public void setID(int ID) {
		this.ID = ID;
	}


	public int getRound() {
		return Round;
	}

	@Override
	public int getTeamID() {
		// TODO Auto-generated method stub
		return TeamID;
	}

	@Override
	public void resetScore() {
		// TODO Auto-generated method stub
		Score = 0;
	}


	@Override
	public void setTeamID(int teamID) {
		// TODO Auto-generated method stub
		this.TeamID = teamID;

	}


}
