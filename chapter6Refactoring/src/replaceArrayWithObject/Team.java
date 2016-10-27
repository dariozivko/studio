package replaceArrayWithObject;

public class Team {
	
	private String _name;
	private String _wins;

	public Team(String name, String wins) {
		_name = name;
		_wins = wins;
	}
	
	public String statistic() {
		Performance row = new Performance();
		
		row.setName(_name);
		row.setWins(_wins);
		
		return row.getName() + " wins " + row.getWins() + " games";
	}
}
