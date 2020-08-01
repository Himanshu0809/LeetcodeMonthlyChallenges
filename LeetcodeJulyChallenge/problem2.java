package LeetcodeJulyChallenge;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class problem2 {
	

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
	public static void solve() {
		// TODO Auto-generated method stub

		int t = s.nextInt();
		while (t > 0) {
			int n = s.nextInt();
			long arr[] = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextLong();
			}

			for (int i = n; i >= 1; i--) {
				for (int j = i + i; j <= n; j += i) {
					arr[j - 1] += arr[i - 1];
				}
			}
			for (int i = 0; i < n; i++) {
				out.print(arr[i] + " ");
			}
			out.println();
			t--;
		}

	}
}
