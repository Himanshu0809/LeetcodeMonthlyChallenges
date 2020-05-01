package Leetcode30DayAprilChallenge;
public class minStack {
	public class Node {
		public int val;
		public int min;
		public Node next;

		public Node(int val, int min) {
			this.val = val;
			this.min = min;
		}
	}

	class MinStack {

		public Node top;

		/** initialize your data structure here. */
		public MinStack() {

		}

		public void push(int x) {
			if (top == null) {
				top = new Node(x, x);
			} else {
				Node ele = new Node(x, Math.min(x, top.min));
				ele.next = top;
				top = ele;
			}
		}

		public void pop() {
			if (top == null) {
				return;
			} else {
				Node temp = top.next;
				top.next = null;
				top = temp;
			}
		}

		public int top() {
			if (top == null)
				return -1;
			return top.val;
		}

		public int getMin() {
			if (top == null)
				return -1;
			return top.min;
		}
	}

	/**
	 * Your MinStack object will be instantiated and called as such: MinStack obj =
	 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
	 * = obj.getMin();
	 */
}
