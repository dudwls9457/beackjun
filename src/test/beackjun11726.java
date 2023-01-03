package test;

import java.util.Scanner;

public class beackjun11726 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] dp = new int [1001];
		
		int N = sc.nextInt();
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3 ; i <= N ; i++)
		{
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		System.out.println(dp[N]);
		
	}

}
