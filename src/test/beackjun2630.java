package test;

import java.util.Scanner;

public class beackjun2630 {
	static int [][] map;
	
	static int white = 0;
	static int blue = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		map = new int[N][N];
		
		for(int i = 0 ; i < N ; i++)
		{
			for(int j = 0 ; j < N ; j++)
			{
				map[i][j] = sc.nextInt();
			}
		}
		rec(N,0,0);
		System.out.println(white +"\n" + blue);
		
	}
	public static void rec(int N , int r , int c)
	{
		if(check(r, c, N))
		{
			if(map[r][c] == 1) blue++;
			else white++;
			return;
		}
		
		int newSize = N / 2;
		
		rec(newSize , r , c); // 1사분면
		rec(newSize , r , c + newSize); // 2사분면
		rec(newSize , r + newSize , c); //3사분면
		rec(newSize , r + newSize , c + newSize); // 4사분면

	}
	
	public static boolean check(int r , int c , int size)
	{
		int temp = map[r][c];
		for(int i = r ; i < r + size ; i++)
		{
			for(int j = c ; j < c + size ; j++)
			{
				if(map[i][j] != temp)
				{
					return false;
				}
			}
		}
		return true;
	}

}
