package test;

import java.util.Scanner;

public class beackjun17626 {

	static Integer dp [];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		dp = new Integer[n];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		dp[4] = 1;
		dp[5] = 2;
		
		rec(n - 1);
		System.out.println(dp[n - 1]);
		
	}
	public static int rec(int n)
	{
		if(dp[n] == null)
		{
		}
		return dp[n];
	}

}
