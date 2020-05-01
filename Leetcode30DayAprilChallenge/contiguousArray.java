package Leetcode30DayAprilChallenge;
import java.util.Arrays;

public class contiguousArray {
	public int findMaxLength(int[] nums) {
		int arr[] = new int[2 * nums.length + 1];
		Arrays.fill(arr, -2);
		arr[nums.length] = -1;
		int maxlen = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int temp = (nums[i] == 0) ? -1 : 1;
			count += temp;
			if (arr[count + nums.length] >= -1) {
				maxlen = Math.max(maxlen, i - arr[count + nums.length]);
			} else {
				arr[count + nums.length] = i;
			}
		}
		return maxlen;
	}
}
