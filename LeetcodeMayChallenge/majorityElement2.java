package LeetcodeMayChallenge;

import java.util.Arrays;

public class majorityElement2 {
	public int majorityElement(int[] nums) {
		int count = 0;
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}
