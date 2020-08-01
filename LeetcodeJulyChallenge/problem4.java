package LeetcodeJulyChallenge;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class problem4 {
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

	public static int tempFunc(int pos, int curr, int a[], int dp[][], int n, int x) {
		if (pos == n) {
			return 0;
		}
		if (dp[pos][curr] != -1) {
			return dp[pos][curr];
		}
		int res = 0;
		if (curr == 0) {
			res = Math.max(res, a[pos] + tempFunc(pos + 1, 0, a, dp, n, x));
			res = Math.max(res, x * a[pos] + tempFunc(pos + 1, 1, a, dp, n, x));
		} else if (curr == 1) {
			res = Math.max(res, x * a[pos] + tempFunc(pos + 1, 1, a, dp, n, x));
			res = Math.max(res, a[pos] + tempFunc(pos + 1, 2, a, dp, n, x));
		} else {
			res = Math.max(res, a[pos] + tempFunc(pos + 1, 2, a, dp, n, x));
		}
		return dp[pos][curr] = res;
	}

	public static int getMaximumSum(int arr[], int n, int x) {
		int dp[][] = new int[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				dp[i][j] = -1;
			}
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, tempFunc(i, 0, arr, dp, n, x));
		}
		return max;
	}

	public static void solve() {
		// TODO Auto-generated method stub

		int t = s.nextInt();
		while (t > 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println(getMaximumSum(arr, n, x));
			t--;
		}
	}
}
