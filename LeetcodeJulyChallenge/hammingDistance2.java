package LeetcodeJulyChallenge;

public class hammingDistance2 {
	public int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}
}
