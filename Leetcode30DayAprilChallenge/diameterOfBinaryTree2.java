package Leetcode30DayAprilChallenge;
class Pair<U, V> {
	public U first;
	public V second;
}
//
//public class diameterOfBinaryTree2 {
//	public static Pair<Integer, Integer> heightDiameter(TreeNode root) {
//		if (root == null) {
//			Pair<Integer, Integer> output = new Pair<>();
//			output.first = 0;
//			output.second = 0;
//			return output;
//		}
//		Pair<Integer, Integer> lo = heightDiameter(root.left);
//		Pair<Integer, Integer> ro = heightDiameter(root.right);
//		int height = 1 + Math.max(lo.first, ro.first);
//		int option1 = lo.first + ro.first;
//		int option2 = lo.second;
//		int option3 = ro.second;
//		int diameter = Math.max(option1, Math.max(option2, option3));
//
//		Pair<Integer, Integer> output = new Pair<>();
//		output.first = height;
//		output.second = diameter;
//		return output;
//	}
//}
