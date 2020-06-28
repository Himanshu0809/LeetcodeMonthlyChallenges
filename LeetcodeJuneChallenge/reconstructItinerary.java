package LeetcodeJuneChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class reconstructItinerary {
	private void dfs(HashMap<String, PriorityQueue<String>> adj, LinkedList<String> result, String s) {
		PriorityQueue<String> pq = adj.get(s);
		while (pq != null && !pq.isEmpty()) {
			String v = pq.poll();
			dfs(adj, result, v);
		}
		result.addFirst(s);
	}

	public LinkedList<String> findItinerary(ArrayList<ArrayList<String>> tickets) {
		HashMap<String, PriorityQueue<String>> adj = new HashMap();
		for (ArrayList<String> t : tickets) {
			adj.putIfAbsent(t.get(0), new PriorityQueue<>());
			adj.get(t.get(0)).add(t.get(1));
		}

		LinkedList<String> result = new LinkedList();
		dfs(adj, result, "JFK");
		return result;
	}
}
