package Leetcode30DayAprilChallenge;
public class productOfArrayExceptItself {
	public int[] productExceptSelf(int[] nums) {
		int res[] = new int[nums.length];
		int left[] = new int[nums.length];
		int right[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			res[i] = 1;
			left[i] = 1;
			right[i] = 1;
		}
		int prod = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			prod = prod * nums[i];
			left[i + 1] = prod;
		}
		prod = 1;
		for (int i = nums.length - 1; i > 0; i--) {
			prod = prod * nums[i];
			right[i - 1] = prod;
		}
		for (int i = 0; i < nums.length; i++) {
			res[i] = left[i] * right[i];
		}
		return res;
	}
}
