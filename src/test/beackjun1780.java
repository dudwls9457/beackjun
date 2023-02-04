package test;

import java.util.Scanner;

public class beackjun1780 {
	
	static int minusCount = 0;
	static int zeroCount = 0;
	static int plusCount = 0;
	
	static int [][] input;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		input = new int [N][N];
		
		for(int i = 0 ; i < N ; i++)
		{
			for(int j = 0 ; j < N ; j++)
			{
				input[i][j] = sc.nextInt();
			}
		}
		rec(N, 0 , 0);
		System.out.println(minusCount +"\n" + zeroCount + "\n" + plusCount);
		
	}
	
	public static void rec(int N, int r , int c)
	{
		
		if(check(N , r , c))
		{
			if(input[r][c] == -1) minusCount++;
			else if(input[r][c] == 0) zeroCount++;
			else plusCount++;
			
			return;
		}
		
		int next = N / 3;
		
		
		rec(next , r , c);
		rec(next , r , c + next);
		rec(next , r , c + next * 2);
		
		rec(next , r + next , c);
		rec(next , r + next , c + next);
		rec(next , r + next , c + next * 2);
		
		rec(next , r + next * 2 , c);
		rec(next , r + next * 2 , c + next);
		rec(next , r + next * 2 , c + next * 2);
	
	}
	public static boolean check(int size , int r , int c)
	{
		int temp = input[r][c];
		
		for(int i = r ; i < r + size ; i++)
		{
			for(int j = c ; j < c + size ; j++)
			{
				if(temp != input[i][j]) return false;
			}
		}
		return true;
	}
}
