package LeetcodeJuneChallenge;

import java.util.Arrays;

public class uniquePaths2 {
	public int uniquePaths(int m, int n) {
		int arr[] = new int[105];
		Arrays.fill(arr, 1);
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				arr[j] = arr[j] + arr[j - 1];
			}
		}
		return arr[n - 1];
	}
}
