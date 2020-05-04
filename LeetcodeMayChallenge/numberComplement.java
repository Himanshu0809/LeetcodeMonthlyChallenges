package LeetcodeMayChallenge;

public class numberComplement {
	public int findComplement(int num) {
		if (num == 0) {
			return 1;
		}
		int comp = 0;
		int i = 0;
		while (num > 0) {
			int lastdigit = num & 1;
			if (lastdigit == 0) {
				comp = comp + (1 << i);
			}
			num = num >> 1;
			i++;
		}
		return comp;
	}
}
