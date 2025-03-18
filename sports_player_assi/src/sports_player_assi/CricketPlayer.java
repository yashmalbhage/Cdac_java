package sports_player_assi;

public class CricketPlayer extends Player{
	private int totalRunsScored;
	private int totalWicketsTaken;
	public CricketPlayer(String name, int d, int m, int y, int player_id, double contractFees, int totalRunsScored,
			int totalWicketsTaken) {
		super(name, d, m, y, player_id, contractFees);
		this.totalRunsScored = totalRunsScored;
		this.totalWicketsTaken = totalWicketsTaken;
	}
	public CricketPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"CricketPlayer [totalRunsScored=" + totalRunsScored + ", totalWicketsTaken=" + totalWicketsTaken + "]";
	}
	

}
