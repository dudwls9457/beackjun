package test;

import java.util.Scanner;

public class beackjun10826 {
	
	static Long [] dp;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		dp = new Long[n + 1];
		
		dp[0] = 0L;
		dp[1] = 1L;
		
		rec(n);
		
		System.out.println(dp[n]);
	}
	public static long rec(int n)
	{
		if(dp[n] == null)
		{
			dp[n] = rec(n-1) + rec(n-2);
		}
		return dp[n];
	}

}
