package LeetcodeMayChallenge;

public class firstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
		char[] arr = new char[26];
		int ans = -1;
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i) - 'a'] == 1) {
				ans = i;
				break;
			}
		}
		return ans;
	}
}
