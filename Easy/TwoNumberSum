import java.util.*;

class TwoNumberSum {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			int potentialMatch = targetSum - array[i];
			if (set.contains(potentialMatch)) {
				return new int[] {potentialMatch, array[i]};
			}
			set.add(array[i]);
		}
    return new int[0];
  }
}

class ProgramTest {
  @Test
  public void TestCase1() {
    int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
    Utils.assertTrue(output.length == 2);
    Utils.assertTrue(contains(output, -1));
    Utils.assertTrue(contains(output, 11));
  }

  public boolean contains(int[] output, int val) {
    for (var el : output) {
      if (el == val) return true;
    }
    return false;
  }
}
