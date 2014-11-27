package introtocs.intermediate;

public class BaseballGame {

	private String team1;
	private String team2;
	private static int totalGamesPlayed = 0;
	
	public BaseballGame(String team1, String team2) {
		this.team1 = team1;
		this.team2 = team2;
		totalGamesPlayed++;
	}
	
	public static void main(String[] args) {
		BaseballGame game1 = new BaseballGame("Chelsea", "Real Madrid");
		BaseballGame game2 = new BaseballGame("Juventus", "Inter Milan");
		
		System.out.println(game1.getTeams());
		System.out.println(game2.getTeams());
		
		System.out.println(BaseballGame.getTotalGamesPlayed());
	}
	
	public String getTeams() {
		return "For todays game we have the " + this.team1 + " versus the " + team2;
	}
	
	public static int getTotalGamesPlayed() {
		return totalGamesPlayed;
	}

}
