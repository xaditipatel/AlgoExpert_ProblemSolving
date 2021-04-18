import java.util.*;

class ValidSubsequence {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		int seqInd = 0;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == sequence.get(seqInd)) {
				seqInd++;
			}
			if (seqInd == sequence.size()) return true;
		}
    return false ;
  }
}

class ProgramTest {
  @Test
  public void TestCase1() {
    var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
    var sequence = Arrays.asList(1, 6, -1, 10);
    Utils.assertEquals(true, ValidSubsequence.isValidSubsequence(array, sequence));
  }
}
