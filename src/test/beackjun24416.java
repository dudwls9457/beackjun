package test;

import java.util.Scanner;

public class beackjun24416 {
	
	static Integer [] dp;
	static int count = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new Integer[n + 1];
		
		dp[0] = 0;
		dp[1] = 1;
		
		rec(n);
		System.out.println(dp[n] + " " + (n-2));
		
	}
	public static int rec(int n)
	{
		if(dp[n] == null)
		{
			dp[n] = rec(n-1) + rec(n-2);
		}
		return dp[n];
	}

}
