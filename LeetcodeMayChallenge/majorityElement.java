package LeetcodeMayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class majorityElement {

	public static int majorityElement(int[] nums) {
		int count = 0;
		Arrays.sort(nums);
		int num = nums[0];
		count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == num) {
				count++;
			} else {
				num = nums[i];
				count = 1;
			}
			if (count > Math.ceil(nums.length / 2)) {
				return num;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
	}

}
