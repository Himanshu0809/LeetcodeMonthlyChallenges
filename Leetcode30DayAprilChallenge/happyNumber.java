package Leetcode30DayAprilChallenge;
import java.util.HashSet;

public class happyNumber {

	public boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<>();
		while (!set.contains(n)) {
			set.add(n);
			n = getSum(n);
			if (n == 1) {
				return true;
			}
		}
		return false;
	}

	public int getSum(int n) {
		int sum = 0;
		while (n != 0) {
			int dig = n % 10;
			sum += (dig * dig);
			n = n / 10;
		}
		return sum;
	}
}
