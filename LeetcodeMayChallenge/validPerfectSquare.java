package LeetcodeMayChallenge;

public class validPerfectSquare {
	public boolean isPerfectSquare(int num) {
		if (num == 1) {
			return true;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (i * i == num) {
				return true;
			}
		}
		return false;
	}
}
