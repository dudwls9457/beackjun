package test;

import java.util.Scanner;

public class beackjun11660 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int input[][] = new int[N+1][N+1];
		
		for(int i = 1 ; i <= N ; i++)
		{
			for(int j = 1 ; j <= N ; j++)
			{
				if(j != 1)
				{
					input[i][j] = input[i][j-1] + sc.nextInt();
				}else
				{
					input[i][j] = input[i-1][N] + sc.nextInt();
				}
			}
		}
		
		for(int i = 0 ; i < M ; i++)
		{
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
		
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			if(y2 != 1 )
			{	
				if(x1 == x2 && y1 == y2) System.out.println(input[x2][y2] - input[x2][y2-1]);
				else if(x2 == N  && y2 == N) System.out.println(input[x2][y2]);
				else System.out.println(input[x2][y2] - input[x1][y1]);
				 
			}
			else
			{
				System.out.println(input[x2][y2] - input[x2-1][N]);
			}
		}
	}

}
