package Leetcode30DayAprilChallenge;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class searchInRotatedSortedArray {
	
	public static int search(int []nums, int target) {
		int lo=0;
		int hi=nums.length-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[lo]<=nums[mid]) {
				if(nums[lo]<target&&nums[mid]>target) {
					hi=mid-1;
				}else {
					lo=mid+1;
				}
			}else {
				if(target>nums[mid]&&target<=nums[hi]) {
					lo=mid+1;
				}else {
					hi=mid-1;
				}
			}
		}
		return -1;
	}
	
	public static void solve() {
		int n=s.nextInt();
		int target=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(search(arr, target));
	}

	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
