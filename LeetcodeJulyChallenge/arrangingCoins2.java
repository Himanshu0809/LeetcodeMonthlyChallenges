package LeetcodeJulyChallenge;

public class arrangingCoins2 {
	public int arrangeCoins(int n) {
		long ans = 0;
		long start = 0, last = n;
		while (start <= last) {
			long mid = (start + last) / 2;
			long val = (mid * (mid + 1)) / 2;
			if (val == n) {
				return (int) mid;
			} else if (val > n) {
				last = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return (int) last;
	}
}
