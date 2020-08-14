package LeetcodeAugustChallenge;

public class longestPalindrome {
	public int longestPalindrome(String s) {
		int smallchars[] = new int[26];
		int largechars[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 'a') {
				largechars[s.charAt(i) - 'A']++;

			} else {
				smallchars[s.charAt(i) - 'a']++;
			}
		}
		int count = 0;
		int flag = 0;
		for (int i = 0; i < 26; i++) {
			if (largechars[i] % 2 == 0) {
				count += largechars[i];
			} else {
				count += largechars[i] - 1;
				flag = 1;
			}
			if (smallchars[i] % 2 == 0) {
				count += smallchars[i];

			} else {
				count += smallchars[i] - 1;
				flag = 1;
			}
		}
		if (flag == 1) {
			count++;
		}
		return count;
	}
}
