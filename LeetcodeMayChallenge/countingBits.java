package LeetcodeMayChallenge;

public class countingBits {
	public int[] countBits(int num) {
		int[] n = new int[num + 1];

		for (int i = 1; i < n.length; i++)
			if (i % 2 == 0) {
				n[i] = n[i / 2];
			} else {
				n[i] = n[i - 1] + 1;
			}
		return n;
	}
}
