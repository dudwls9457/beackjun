package test;

import java.util.Scanner;

public class beackjun9461 {
	
	static Long dp[] = new Long[101];
	
	public static void main(String[] args) {
		
		dp[0] = 1L;
		dp[1] = 1L;
		dp[2] = 1L;
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			int N = sc.nextInt();
			System.out.println(pado(N - 1));
		}	
	}

	public static Long pado(int N)
	{	
		if(dp[N] == null)
		{
			dp[N] = pado(N - 2) + pado(N  - 3);
		}
		return dp[N];
	}
}
