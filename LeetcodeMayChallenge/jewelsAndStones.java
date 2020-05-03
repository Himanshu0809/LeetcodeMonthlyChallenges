package LeetcodeMayChallenge;

public class jewelsAndStones {
	public int numJewelsInStones(String j, String s) {
		int count = 0;
		for (int i = 0; i < j.length(); i++) {
			for (int z = 0; z < s.length(); z++) {
				if (j.charAt(i) == s.charAt(z)) {
					count++;
				}
			}
		}
		return count;
	}
}
