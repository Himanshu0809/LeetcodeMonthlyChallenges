package LeetcodeJulyChallenge;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			String str=s.next();
			int arr[]=new int[26];
			int max=Integer.MIN_VALUE;
			for(int i=0;i<str.length();i++) {
				arr[str.charAt(i)-'a']++;
				if(arr[str.charAt(i)-'a']>max) {
					max=arr[str.charAt(i)-'a'];
				}
			}
			
			for(int i=0;i<26;i++) {
				if(arr[i]==max) {
					for(int j=0;j<max;j++) {
						System.out.print((char)(i+'a'));
					}
					break;
				}
			}
			System.out.println();
			t--;
		}
		
	}
}
