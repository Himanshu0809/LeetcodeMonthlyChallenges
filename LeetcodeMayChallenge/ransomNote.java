package LeetcodeMayChallenge;

import java.util.HashMap;

public class ransomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			char c = ransomNote.charAt(i);
			if (map.containsKey(c)) {
				int count = (int) map.get(c);
				count--;
				if (count < 0) {
					return false;
				} else {
					map.put(c, count);
				}
			} else {
				return false;
			}
		}
		return true;
	}
}
