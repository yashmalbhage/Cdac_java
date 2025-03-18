package sports_player_assi;

public class FootballPlayer extends Player {
	private int totalGoalsScored;

	public FootballPlayer(String name, int d, int m, int y, int player_id, double contractFees, int totalGoalsScored) {
		super(name, d, m, y, player_id, contractFees);
		this.totalGoalsScored = totalGoalsScored;
	}
	

	public FootballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return super.toString()+"FootballPlayer [totalGoalsScored=" + totalGoalsScored + "]";
		
	}
	
	

}
