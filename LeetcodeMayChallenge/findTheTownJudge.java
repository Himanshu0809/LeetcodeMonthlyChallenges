package LeetcodeMayChallenge;

import java.util.HashMap;

public class findTheTownJudge {
	public int findJudge(int N, int[][] trust) {
		if (trust.length == 0 && N == 1) {
			return 1;
		}
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		int count = 0, val = 0;
		for (int i = 0; i < trust.length; i++) {
			map1.put(trust[i][0], map1.getOrDefault(trust[i][0], 0) + 1);
			map2.put(trust[i][1], map2.getOrDefault(trust[i][1], 0) + 1);
			if (map2.get(trust[i][1]) > count) {
				count = map2.get(trust[i][1]);
				val = trust[i][1];
			}
		}
		if (count == N - 1 && !map1.containsKey(val)) {
			return val;
		} else {
			return -1;
		}
	}
}
