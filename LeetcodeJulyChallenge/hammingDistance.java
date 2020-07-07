package LeetcodeJulyChallenge;

public class hammingDistance {
	public int hammingDistance(int x, int y) {
		int setbits = 0;
		int num = x ^ y;
		while (num > 0) {
			setbits = setbits + (num & 1);
			num = num >> 1;
		}
		return setbits;
	}
}
