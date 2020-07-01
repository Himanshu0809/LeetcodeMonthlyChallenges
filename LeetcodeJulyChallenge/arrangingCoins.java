package LeetcodeJulyChallenge;

public class arrangingCoins {
	public int arrangeCoins(int n) {
		long sum = 0;

		for (int i = 0; i <= n; i++) {
			sum += i;
			if (sum == n) {
				return i;
			} else if (sum > n) {
				return i - 1;
			}
		}
		return 0;
	}
}
