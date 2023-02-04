package test;

import java.util.Scanner;

public class beackjun14495 {

	static Long dp [] = new Long[117];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		dp[1] = 1L;
		dp[2] = 1L;
		dp[3] = 1L;
		
		System.out.println(rec(n));
	}
	
	public static Long rec(int n)
	{
		if(dp[n] == null)
		{
			dp[n] = rec(n-1) + rec(n-3);
		}
		return dp[n];
	}
}
