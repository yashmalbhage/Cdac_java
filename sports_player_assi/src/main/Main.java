package main;
import sports_player_assi.CricketPlayer;
import sports_player_assi.FootballPlayer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CricketPlayer c1 = new  CricketPlayer("Player test 1", 4,10,2002,101,40000.00,1200,290);
		 System.out.println(c1.toString());
		 FootballPlayer f1= new FootballPlayer("Player test 2",2,12,2001,102,40000.00,12);
		 System.out.println(f1.toString());
		 
		 

	}

}
