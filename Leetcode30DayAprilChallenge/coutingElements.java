package Leetcode30DayAprilChallenge;
import java.util.Arrays;

public class coutingElements {
	public int countElements(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == (arr[i] + 1)) {
					count++;
					break;
				} else if (arr[j] > arr[i] + 1) {
					break;
				}
			}
		}
		return count;
	}
}
