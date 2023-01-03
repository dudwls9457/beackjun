package test;

import java.util.Scanner;

public class beackjun2775 {

	public static void main(String[] args) {
		// 3층 1 5 15 35
		// 2층 1 4 10 20 35 56 84 
		// 1층 1 3 6  10 15 21 28 36 45 55 66 78 91 105
		// 0층 1 2 3  4  5  6  7  8  9  10 11 12 13 14
		
		Scanner sc = new Scanner(System.in);
		
		int apt [][] = new int [15][15];
		
		for(int i = 0 ; i < apt.length ; i++ )
		{
			apt[0][i] = i + 1;
			apt[i][0] = 1;
		}
		
		
		for(int i = 1 ; i < apt.length ; i++)
		{
			for(int j = 1 ; j < apt[i].length ; j++)
			{
				apt[i][j] = apt[i-1][j] + apt[i][j-1];
			}
		}
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			System.out.println(apt[k][n-1]);
		}
		
	}

}
