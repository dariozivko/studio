package replaceArrayWithObject;

import static org.junit.Assert.*;

import org.junit.Test;

public class TeamTest {

	@Test
	public void statistic() {
		Team team = new Team("Juventus", "150");
	    assertEquals("Juventus wins 150 games", team.statistic());
	}

}
