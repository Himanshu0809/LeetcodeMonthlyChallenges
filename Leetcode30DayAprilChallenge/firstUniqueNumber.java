package Leetcode30DayAprilChallenge;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class firstUniqueNumber {
	class FirstUnique {
		public Set<Integer> set = new LinkedHashSet<>();
		public Set<Integer> check = new HashSet<>();

		public FirstUnique(int[] nums) {
			for (int i = 0; i < nums.length; i++) {
				add(nums[i]);
			}
		}

		public int showFirstUnique() {
			if (!set.isEmpty()) {
				return set.iterator().next();

			} else {
				return -1;
			}
		}

		public void add(int value) {
			if (!check.add(value)) {
				set.remove(value);
			} else {
				set.add(value);
			}
		}
	}

	/**
	 * Your FirstUnique object will be instantiated and called as such: FirstUnique
	 * obj = new FirstUnique(nums); int param_1 = obj.showFirstUnique();
	 * obj.add(value);
	 */

}
