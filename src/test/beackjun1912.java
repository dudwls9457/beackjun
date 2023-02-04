package test;

import java.util.Scanner;

public class beackjun1912 {
	
	static int [] input;
	static Integer [] dp;
	static int max;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		input = new int[n];
		dp = new Integer[n];
		
		for(int i = 0 ; i < n ; i++)
		{
			input[i] = sc.nextInt();
		}
		
		dp[0] = input[0];
		max = input[0];
		
		rec(n - 1);
		System.out.println(max);
		
	}
	public static int rec(int n)
	{
		if(dp[n] == null)
		{
			dp[n] = Math.max(rec(n - 1) + input[n], input[n]);
		}
		max = Math.max(dp[n], max);
		return dp[n];
	}

}
