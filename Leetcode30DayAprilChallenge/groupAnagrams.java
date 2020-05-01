package Leetcode30DayAprilChallenge;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class groupAnagrams {
	public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (String str : strs) {
			char arr[] = new char[26];
			for (int i = 0; i < str.length(); i++) {
				arr[str.charAt(i) - 'a']++;
			}
			String temp = new String(arr);
			if (map.containsKey(temp)) {
				map.get(temp).add(str);
			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(str);
				map.put(temp, list);
			}
		}
		for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
			res.add(entry.getValue());
		}
		return res;
	}

	public static void solve() {
		int n = s.nextInt();
		String str[] = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = s.next();
		}
		ArrayList<ArrayList<String>> ans = groupAnagrams(str);
		for (int i = 0; i < ans.size(); i++) {
			out.println(ans.get(i));
		}
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
