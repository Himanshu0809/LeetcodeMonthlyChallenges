package LeetcodeAugustChallenge;

public class validPalindrome {
	public boolean isPalindrome(String s) {
		StringBuilder str = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
				str.append(ch);
			}
		}
		String str1 = str.toString().toLowerCase();
		String str2 = str.reverse().toString().toLowerCase();
		System.out.println(str2);
		if (str1.equals(str2)) {
			return true;
		}
		return false;
	}
}
