package Leetcode30DayAprilChallenge;
public class leftmostColumnWithAtLeastAOne {
	/**
	 * // This is the BinaryMatrix's API interface.
	 * // You should not implement it, or speculate about its implementation
	 * interface BinaryMatrix {
	 *     public int get(int x, int y) {}
	 *     public List<Integer> dimensions {}
	 * };
	 */

//	public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
//		int ans = Integer.MAX_VALUE;
//		int flag = 0;
//		List<Integer> list = new ArrayList<>();
//		list = binaryMatrix.dimensions();
//		int j = list.get(1) - 1;
//		for (int i = 0; i < list.get(0) && j >= 0;) {
//
//			if (binaryMatrix.get(i, j) == 1) {
//				if (j < ans) {
//					ans = j;
//					flag = 1;
//				}
//				j--;
//			} else {
//				i++;
//			}
//
//		}
//		if (flag == 1) {
//			return ans;
//		}
//		return -1;
//	}
}
