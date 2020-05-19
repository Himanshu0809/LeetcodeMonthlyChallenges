package LeetcodeMayChallenge;

public class maximumSumCircularSubarray {
	public int maxSubarraySumCircular(int[] arr) {
		int flag = 0;
		int sum = 0;
		int max = arr[0];
		int maxans = arr[0];
		int min = arr[0];
		int minans = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] >= 0) {
				flag = 1;
			}
		}
		if (flag == 1) {
			for (int i = 1; i < arr.length; i++) {
				max = Math.max(arr[i], arr[i] + max);
				if (maxans < max) {
					maxans = max;
				}
				min = Math.min(arr[i], arr[i] + min);
				if (minans > min) {
					minans = min;
				}
			}
		} else {

			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}
		return Math.max(maxans, sum - minans);
	}
}
