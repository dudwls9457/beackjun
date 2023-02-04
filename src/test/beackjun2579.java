package test;

import java.util.Scanner;

public class beackjun2579 {
	
	static Integer dp [];
	static int value [];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp = new Integer[n + 1];
		value = new int[n + 1];
		
		for(int i = 1 ; i <= n ; i++)
		{
			value[i] = sc.nextInt();
		}
		
		dp[0] = 0;
		dp[1] = value[1];
		if(n >= 2)
		{
			dp[2] = value[1] + value[2];
		}
		
		rec(n);
		
		System.out.println(dp[n]);
	}
	public static Integer rec(int n)
	{
		if(dp[n] == null)
		{	
		
				dp[n] = Math.max(rec(n-2), rec(n-3) + value[n-1]) + value[n];	
		}
		return dp[n];
	}
}
