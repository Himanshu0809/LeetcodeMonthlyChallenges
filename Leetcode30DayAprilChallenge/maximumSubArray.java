package Leetcode30DayAprilChallenge;
public class maximumSubArray {

	public int maxSubArray(int[] nums) {
		int arr[] = new int[nums.length];
		arr[0] = nums[0];
		int sum = nums[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Math.max(nums[i], arr[i - 1] + nums[i]);
			sum = Math.max(sum, arr[i]);
		}
		return sum;
	}
}
