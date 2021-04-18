import java.util.*;

class TournamentWinner {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // Write your code here.
		Map<String, Integer> map = new HashMap<>();
		int bestScore = 0;
		String finalWinner = "";
		
		for (int i = 0; i < competitions.size(); i++) {
			String winner = "";
			if (results.get(i) == 0) {
				winner = competitions.get(i).get(1);
			}
			else {
				winner = competitions.get(i).get(0);
			}
			map.put(winner, map.getOrDefault(winner, 0) + 3);
		}
		
		for (Map.Entry entry : map.entrySet()) {
			if ((int)entry.getValue() > bestScore) {
				finalWinner = entry.getKey().toString();
				bestScore = (int)entry.getValue();
			}
		}
    return finalWinner;
  }
}

class ProgramTest {
  @Test
  public void TestCase1() {
    ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
    ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
    ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
    ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
    competitions.add(competition1);
    competitions.add(competition2);
    competitions.add(competition3);
    ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
    String expected = "Python";
    var actual = new TournamentWinner().tournamentWinner(competitions, results);
    Utils.assertTrue(expected == actual);
  }
}

