package Leetcode30DayAprilChallenge;
public class performStringShifts {
	public String stringShift(String s, int[][] shift) {
		int count = 0;
		for (int i = 0; i < shift.length; i++) {
			count = count + ((shift[i][0] == 0) ? shift[i][1] : -shift[i][1]);

		}
		StringBuilder str = new StringBuilder();
		if (count == 0) {
			str.append(s);
		} else if (count > 0) {
			count = count % s.length();
			str.append(s.substring(count, s.length()));
			str.append(s.substring(0, count));
		} else {
			count = Math.abs(count);
			count = count % s.length();
			str.append(s.substring(s.length() - count, s.length()));
			str.append(s.substring(0, s.length() - count));
		}
		return str.toString();
	}
}
