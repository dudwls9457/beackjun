package test;

import java.util.Scanner;

public class beackjun15489 {

	public static void main(String[] args) {
		
		int [][] dp = new int[31][31];
		dp[1][1] = 1;
		
		for(int i = 1 ; i <= 30 ; i++)
		{
			for(int j = 1 ; j <= i ; j++)
			{
				if(j == 1 || j == i) dp[i][j] = 1;
				else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int W = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0 ; i < W ; i++)
		{
			for(int j = 0 ; j <= i ; j++)
			{
				sum += dp[i+R][j+C];
			}
		}
		System.out.println(sum);
	}

}
