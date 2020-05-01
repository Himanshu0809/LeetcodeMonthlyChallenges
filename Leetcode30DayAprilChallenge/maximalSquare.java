package Leetcode30DayAprilChallenge;
public class maximalSquare {
	public int maximalSquare(char[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return 0;
		}

		int result = 0;
		int[][] dp = new int[matrix.length][matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			dp[i][0] = matrix[i][0] - '0';
			result = Math.max(result, dp[i][0]);
		}

		for (int j = 0; j < matrix[0].length; j++) {
			dp[0][j] = matrix[0][j] - '0';
			result = Math.max(result, dp[0][j]);
		}

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == '1') {
					int min = Math.min(dp[i - 1][j], dp[i][j - 1]);
					min = Math.min(min, dp[i - 1][j - 1]);
					dp[i][j] = min + 1;

					result = Math.max(result, min + 1);
				} else {
					dp[i][j] = 0;
				}
			}
		}

		return result * result;
	}
}
