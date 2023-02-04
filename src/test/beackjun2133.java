package test;

import java.util.Scanner;

public class beackjun2133 {

	static Integer dp[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		dp = new Integer [N + 1];
		dp[0] = 1;
		if(N > 1)
			dp[2] = 3;
		
		if(N % 2 == 0)
			System.out.println(rec(N));
		else if(N % 2 != 0 || N > 2)
			System.out.println(0);
		
		
	}
	public static int rec(int N)
	{
		if(dp[N] == null)
		{
			dp[N] = rec(N-2) * dp[2];
			for(int j = N - 4 ; j >= 0 ; j-=2)
			{
				dp[N] += dp[j] * 2;
			}
		}
		return dp[N];
	}

}
