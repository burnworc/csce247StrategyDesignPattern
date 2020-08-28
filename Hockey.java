

public class Hockey {
	
	public Hockey() {}
	
	public void play() {
		Player[] players = new Player[3];
		players[0] = new Forward("John Tavares");
		players[1] = new Defenceman("Morgan Rielly");
		players[2] = new Goalie("Frederik Andersen");
		
		System.out.println("***** Players *****");
		displayPlayers(players);
		
		System.out.println("\n***** Offencive Plays *****");
		displayPlays(players);
		
		turnover(players);
		
		System.out.println("\n***** Defencive Plays *****");
		displayPlays(players);
		
	}
	
	private void displayPlayers(Player[] players) {
		for(Player player : players) {
			System.out.println(player);
		}
	}
	
	private void displayPlays(Player[] players) {
		for(Player player : players) {
			System.out.println(player.name + " " + player.play());
		}
	}
	
	private void turnover(Player[] players) {
		for(Player player : players) {
			player.turnover();
		}
	}
	
	public static void main(String[] args) {
		Hockey hockey = new Hockey();
		hockey.play();
	}

}
