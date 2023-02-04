package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class beackjun1535 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int [] dp = new int[100];
		int [][] input = new int[N][2];
		
		for(int i = 0 ; i < N ; i++)
		{
			input[i][0] = sc.nextInt(); // 체력
		}
		
		for(int i = 0 ; i < N ; i++)
		{
			input[i][1] = sc.nextInt(); // 기쁨
		}
	
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 99; j >= input[i][0]; j--) {
				dp[j] = Math.max(dp[j- input[i][0]] + input[i][1], dp[j]);
			}
		}
		System.out.println(dp[99]);
	}

}
