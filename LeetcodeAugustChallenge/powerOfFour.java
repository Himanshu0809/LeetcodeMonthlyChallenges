package LeetcodeAugustChallenge;

public class powerOfFour {
	public boolean isPowerOfFour(int n) {
		for (int i = 0; i < n; i++) {
			if (Math.pow(4, i) == n) {
				return true;
			}
			if (Math.pow(4, i) > n) {
				return false;
			}
		}
		return false;
	}
}
