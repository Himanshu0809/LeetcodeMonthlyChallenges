package LeetcodeJulyChallenge;

import java.util.Scanner;

public class plusOne {
	public static int[] plusOne(int[] digits) {
		int ans[]=new int[digits.length];
		int carry=0;
		for(int i=digits.length-1;i>=0;i--){
			if(i==digits.length-1){
				if(digits[i]+1>9){
					carry=1;
				}
				ans[i]=(digits[i]+1)%10;
			}
			else{				
				ans[i]=(digits[i]+carry)%10;
				carry=(digits[i]+carry)/10;
			}
		}
		if(carry==1){
			int ans2[]=new int[digits.length+1];
			for(int i=ans2.length-1;i>=1;i--){
				ans2[i]=ans[i-1];
			}
			ans2[0]=1;
			return ans2;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		// int digits[]=plusOne(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(plusOne(arr)[i]);
		}
	}

}
