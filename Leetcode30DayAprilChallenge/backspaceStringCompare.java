package Leetcode30DayAprilChallenge;

import java.util.Stack;

public class backspaceStringCompare {
	public static boolean backspaceCompare(String s, String t) {
		Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				if (!s1.isEmpty()) {
					s1.pop();
				}
			} else {
				s1.push(s.charAt(i));
			}
		}
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == '#') {
				if (!s2.isEmpty()) {
					s2.pop();
				}
			} else {
				s2.push(t.charAt(i));
			}
		}
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		while (!s1.isEmpty()) {
			str1.append(s1.pop());
		}
		while (!s2.isEmpty()) {
			str2.append(s2.pop());
		}
		System.out.println(str1.toString() + " " + str2.toString());
		if (str1.toString().equals(str2.toString())) {
			return true;

		} else {
			return false;
		}
	}
}
