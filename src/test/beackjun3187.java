package test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class beackjun3187 {
	
	static int [] dx = {1 , 0 , -1 , 0};
	static int [] dy = {0 , 1 , 0 , -1};

	static boolean check[][];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		int C = sc.nextInt();
		int sheepCount = 0;
		int wolfCount = 0;
		
		char [][] map = new char[R][C];
		check = new boolean[R][C];
		
		for(int i = 0 ;  i < R ; i++)
		{	
			String temp = sc.next();
			for(int j = 0 ; j < C ; j++)
			{
				map[i][j] = temp.charAt(j);
			}
		}
		for(int i = 0 ; i < R ; i++)
		{
			for(int j = 0 ; j < C ; j++)
			{
				if(check[i][j] == true)
				{
					continue;
				}else
				{
					int [] result = bfs(i, j, R, C, map);
					
					if(result[0] <= result[1]) wolfCount+= result[1];
					else sheepCount+=result[0];
				}
			}
		}
		System.out.println(sheepCount + " " + wolfCount);
	}
	
	public static int[] bfs(int i , int j , int R , int C ,char map[][])
	{
		
		Deque<position> que = new ArrayDeque<>();

		if(check[i][j] == true) return null;
		else
		{
			que.add(new position(i, j));
			check[i][j] = true;
		}

		int wolf = 0 , sheep = 0;
		int [] temp = new int[2];
		while(que.size() != 0)
		{
			position p = que.pollFirst();
			
			if(map[p.x][p.y] == 'k') sheep++;
			if(map[p.x][p.y] == 'v') wolf++;
			for(int k = 0 ; k < 4 ; k++)
			{
				int nX = p.x + dx[k];
				int nY = p.y + dy[k];
				
				if(nX < 0 || nX >= R || nY < 0 || nY >= C) continue; // 벽 검사
				if(map[nX][nY] == '#' || check[nX][nY] == true) continue; // 간곳인지 그리고 못가는곳인지 확인
				que.add(new position(nX, nY));
				check[nX][nY] = true;
			}
		}
		temp[0] = sheep;
		temp[1] = wolf;
		return temp;
	}

	public static class position
	{
		int x , y;

		public position(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}
}
