package LeetcodeMayChallenge;

import java.util.Stack;

//O(n)
public class removeKDigits2 {
	public String removeKdigits(String num, int k) {
		if (k == 0) {
			return num;
		}
		if (num.length() == k) {
			return "0";
		}
		Stack<Character> stack = new Stack<>();
		for (char c : num.toCharArray()) {
			while (!stack.isEmpty() && k > 0 && c < stack.peek()) {
				stack.pop();
				k--;
			}
			stack.push(c);
		}
		for (int i = 0; i < k; i++) {
			stack.pop();
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		sb.reverse();
		while (sb.length() > 1 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}
}
