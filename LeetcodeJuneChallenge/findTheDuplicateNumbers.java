package LeetcodeJuneChallenge;

import java.util.HashSet;

public class findTheDuplicateNumbers {
	public int findDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int num : nums) {
			if (set.contains(num)) {
				return num;
			}
			set.add(num);
		}
		return -1;
	}
}
