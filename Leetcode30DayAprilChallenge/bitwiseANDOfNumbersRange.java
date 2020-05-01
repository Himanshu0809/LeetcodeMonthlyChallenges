package Leetcode30DayAprilChallenge;
public class bitwiseANDOfNumbersRange {

	public int rangeBitwiseAnd(int m, int n) {
		while (m < n) {
			n = n & n - 1;
		}
		return n;
	}
}