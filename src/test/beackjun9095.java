package test;

import java.util.Scanner;

public class beackjun9095 {
	
	static Integer dp [] = new Integer [12];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb= new StringBuilder();
		
		int T = sc.nextInt();
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 0 ; i < T ; i++)
		{
			int n = sc.nextInt();
			stb.append(sum(n) + "\n");
		}
		System.out.println(stb);
	}
	public static int sum(int n)
	{
		if(dp[n] == null)
		{
			dp[n] = sum(n-1) + sum(n-2) + sum(n-3);
		}
		return dp[n];
	}
}
