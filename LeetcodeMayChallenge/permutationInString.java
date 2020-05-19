package LeetcodeMayChallenge;

import java.util.HashMap;

public class permutationInString {
	public boolean checkInclusion(String p, String s) {
		int slen = s.length();
		int plen = p.length();
		int start = 0;
		int end = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < plen; i++) {
			map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
		}
		while (end < s.length()) {
			if (map.containsKey(s.charAt(end)) && map.get(s.charAt(end)) > 0) {
				map.put(s.charAt(end), map.get(s.charAt(end)) - 1);
				end++;
				if (end - start == plen) {
					return true;
				}
			} else if (end == start) {
				end++;
				start++;
			} else {
				map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
				start++;
			}
		}
		return false;
	}
}
