package test;

import java.util.Scanner;

public class beackjun2748 {

	static Long [] dp = new Long[91];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		dp[0] = 0L;
		dp[1] = 1L;
		
		System.out.println(rec(n));
		
	}
	
	public static long rec(int n)
	{
		if(dp[n] == null)
		{
			return dp[n] = rec(n-1) + rec(n-2);
		}
		return dp[n];
	}
}
