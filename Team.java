
public class Team {

	private String TeamName;
	public Player[] Player;
	private int TeamScore;
	private int TeamSize;

	//construct default Team without arguments
	public Team() {
		setTeamName("A");
		this.TeamScore = 0;
		this.Player = new Player[0];
		setTeamSize(0);
	}
	//construct Team class with three arguments
	public Team(String name, int Score, int size) {
		setTeamName(name);
		this.TeamScore = Score;
		this.Player = new Player[0];
		setTeamSize(size);
	}

	public void setTeamName(String name) {
		this.TeamName = name;
	}

	public String getTeamName() {
		return TeamName;
	}

	//team's score is equal to the total of all players' scores
	public int getTeamScore() {
		int sum = 0;
		for(int i = 0; i< this.TeamSize; i++) {
			sum += Player[i].getScore();
		}
		this.TeamScore = sum;
		return TeamScore;
	}

	public void setTeamSize(int size) {
		this.TeamSize = size;
	}

	public int getTeamSize() {
		return TeamSize;
	}

	//add one player each time, the team size will increase one each time
	public void AddPlayer(Player player) {
		int length = this.TeamSize + 1;
		Player[] newPlayer = new Player[length];
		for(int i=0; i<length - 1; i++) {
			newPlayer[i] = this.Player[i];
		}
		newPlayer[length-1] = player;
		this.Player = newPlayer;
		setTeamSize(length);
	}

}
