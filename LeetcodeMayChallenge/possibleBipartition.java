package LeetcodeMayChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class possibleBipartition {
	public boolean possibleBipartition(int N, int[][] dislikes) {
		ArrayList<ArrayList<Integer>> Graph = new ArrayList<>(N + 1);
		int group[] = new int[N + 1];
		for (int i = 0; i <= N; i++)
			Graph.add(new ArrayList<Integer>());
		for (int i = 0; i < dislikes.length; i++) {
			Graph.get(dislikes[i][0]).add(dislikes[i][1]);
			Graph.get(dislikes[i][1]).add(dislikes[i][0]);

		}
		// groups are 1 and 2
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			if (group[i] == 0) {
				group[i] = 1;
				q.offer(i);
				while (!q.isEmpty()) {
					int u = q.poll();
					for (int j : Graph.get(u)) {
						if (group[j] == 0) {
							if (group[u] == 1)
								group[j] = 2;
							else
								group[j] = 1;
							q.offer(j);
						} else if (group[u] == group[j]) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}
