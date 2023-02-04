package test;

import java.util.Scanner;

public class beackjun2167 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [][] input = new int[N + 1][M + 1];
		
		for(int i = 1 ; i <= N ; i++)
		{
			for(int j = 1 ; j <= M ; j++)
			{
				input[i][j] = input[i][j-1] + sc.nextInt();
			}
		}
		int K = sc.nextInt();
		
		for(int k = 0 ; k < K ; k++)
		{
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = 0;
			
			for(int h = i ; h <= x ; h++)
			{
				sum += input[h][y] - input[h][j - 1];
			}
			System.out.println(sum);
		}
	}

}
