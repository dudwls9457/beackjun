package test;

import java.util.Scanner;

public class beackjun11050 {
	
	public static int[][] dp;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		dp = new int [N + 1][K + 1];
		
		System.out.println(BC(N, K));
		

	}
	static int BC(int N, int K) {
		 
		// 이미 풀었던 sub문제일 경우 값을 재활용
		if(dp[N][K] > 0) {
			return dp[N][K];
		}
	 
		// 2번 성질
		if(N == K || K == 0) {
			return dp[N][K] = 1;
		}
	    // 1번 성질
		return dp[N][K] = BC(N - 1, K - 1) + BC(N - 1, K);
	}

}
