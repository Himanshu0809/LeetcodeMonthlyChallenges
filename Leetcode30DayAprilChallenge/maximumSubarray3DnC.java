package Leetcode30DayAprilChallenge;
import java.util.Scanner;

public class maximumSubarray3DnC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();

		}
		System.out.println(maxSubArray(arr, 0, n - 1));
	}

	public static int maxSubArray(int[] nums, int l, int h) {
		if (l == h) {
			return nums[l];
		}
		int m = (l + h) / 2;
		int left = maxSubArray(nums, l, m);
		int right = maxSubArray(nums, m + 1, h);

		int left_sum = Integer.MIN_VALUE;
		int right_sum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = m + 1; i <= h; i++) {
			sum += nums[i];
			right_sum = Math.max(sum, right_sum);
		}
		sum = 0;
		for (int i = m; i >= l; i--) {
			sum += nums[i];
			left_sum = Math.max(left_sum, sum);
		}
		int ans = Math.max(left, right);

		return Math.max(ans, left_sum + right_sum);
	}
}
