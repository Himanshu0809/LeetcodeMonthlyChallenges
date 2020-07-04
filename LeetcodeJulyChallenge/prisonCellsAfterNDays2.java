package LeetcodeJulyChallenge;

import java.util.Arrays;
import java.util.HashSet;

public class prisonCellsAfterNDays2 {
	public int[] prisonAfterNDays(int[] cells, int N) {
		HashSet<String> set = new HashSet<String>();

		int arr[] = new int[cells.length];
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < N; i++) {
			int[] temp = nextDay(cells);
			String str = Arrays.toString(temp);
			if (set.contains(str)) {
				flag = true;
				break;
			} else {
				count++;
				set.add(str);
			}
			cells = temp;
		}

		if (flag) {
			N = N % count;
			for (int i = 0; i < N; i++) {
				cells = nextDay(cells);
			}
		}
		return cells;
	}

	public int[] nextDay(int[] cells) {
		int arr[] = new int[cells.length];
		for (int j = 1; j < 7; j++) {
			if (cells[j - 1] == cells[j + 1]) {
				arr[j] = 1;
			} else {
				arr[j] = 0;
			}
		}
		return arr;
	}
}
