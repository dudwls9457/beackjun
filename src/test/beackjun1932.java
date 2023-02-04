package test;

import java.util.Scanner;

public class beackjun1932 {
	
	static int tree[][];
	static Integer dp [][];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		tree = new int[n][n];
		dp = new Integer[n][n];
		
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < i + 1 ; j++)
			{
				tree[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < n ; i++)
		{
			dp[n-1][i] = tree[n-1][i]; 
		}
		
		System.out.println(rec(n,0,0));
		
	}
	
	public static int rec(int n , int depth , int index)
	{
		if(depth == n - 1) return dp[depth][index];
		
		if(dp[depth][index] == null)
		{
			dp[depth][index] = Math.max(rec(n,depth + 1, index),rec(n,depth + 1,index + 1)) + tree[depth][index];
		}
		return dp[depth][index];
	}
}
