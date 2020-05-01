package Leetcode30DayAprilChallenge;
import java.util.HashMap;

public class contiguousArray2 {

	public int findMaxLength(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int length = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = count + ((nums[i] == 0) ? -1 : 1);
			if (map.containsKey(count)) {
				length = Math.max(length, i - map.get(count));
			} else {
				map.put(count, i);
			}
		}
		return length;
	}
}
