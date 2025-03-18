package sports_player_assi;

import Staff.Person;

public class Player extends Person{
	private int player_id;
	private double contractFees;
	public Player(String name, int d, int m, int y, int player_id, double contractFees) {
		super(name, d, m, y);
		this.player_id = player_id;
		this.contractFees = contractFees;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"player_id=" + player_id + ", contractFees=" + contractFees;
	}
	
	
	

}
