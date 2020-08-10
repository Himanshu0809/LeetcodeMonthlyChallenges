package LeetcodeAugustChallenge;

import java.util.ArrayList;

public class findAllDuplicatesInAnArray {
	public ArrayList<Integer> findDuplicates(int[] nums) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0) {
				nums[index] = -nums[index];
			} else {
				list.add(Math.abs(nums[i]));
			}
		}
		return list;
	}
}
