package Leetcode30DayAprilChallenge;
import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {

	public int cap;
	HashMap<Integer, Integer> map;
	LinkedList<Integer> list;

	public LRUCache(int capacity) {
		cap = capacity;
		map = new HashMap<Integer, Integer>();
		list = new LinkedList<Integer>();
	}

	public int get(int key) {
		if (!map.containsKey(key))
			return -1;
		else {
			list.remove(key);
			list.add(key);
			return map.get(key);
		}
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			list.remove(key);
			map.remove(key);

		}
		if (list.size() == cap) {
			int temp = list.getFirst();
			list.removeFirst();
			map.remove(temp);
		}
		map.put(key, value);
		list.add(key);
	}

	/**
	 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
	 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
	 */
}
