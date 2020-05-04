package LeetcodeMayChallenge;

public class numberComplement2 {
	public int findComplement(int num) {

		int totalBits = (int) (Math.floor(Math.log(num) / Math.log(2))) + 1;
		return (int) (Math.pow(2, totalBits) - 1) ^ num;

	}
}
