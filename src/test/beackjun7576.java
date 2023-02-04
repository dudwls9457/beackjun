package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class beackjun7576 {
	
	static Deque<position> que = new ArrayDeque<>();
	static int [] dx = {1 , 0 , -1 , 0 };
	static int [] dy = {0 , 1 , 0 , -1 };
	
	static int map[][];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		map = new int[N][M];
		int [][] temp = new int[N][M];
		
		boolean flag = false;
		boolean flag2 = false;
		for(int i = 0 ; i < N ; i++)
		{
			for(int j = 0 ; j < M ; j++)
			{
				map[i][j] = sc.nextInt();
				if(map[i][j] == 1)
				{
					que.add(new position(i, j));
				}
				temp[i][j] = -1;
				if(map[i][j] == 0) flag = true;
			}
		}
		if(flag == false) System.out.println(0);
		else
		{
			int lengMain[][] = bfs(N, M, temp);
			int max = 0;
			for(int i = 0 ; i < N ; i++)
			{
				if(flag2 == true) break;
				for(int j = 0 ; j < M ; j++)
				{	
					if(map[i][j] == 0 && lengMain[i][j] == -1)
					{
						System.out.println(-1);
						flag2 = true;
						break;
					}
					if(max < lengMain[i][j]) max = lengMain[i][j];
				}
			}
			if(flag2 == false)
			System.out.println(max + 1);
		}
	}
	
	public static int[][] bfs(int N , int M , int leng[][])
	{
		
		while(que.size() != 0)
		{
			position p = que.pollFirst();
			for(int i = 0 ; i < 4 ; i++)
			{
				int nX = p.x + dx[i];
				int nY = p.y + dy[i];
				
				if(nX < 0 || nX >= N || nY < 0 || nY >= M) continue; //벽 검사
				if(map[nX][nY] == -1 || leng[nX][nY] != -1 || map[nX][nY] == 1) continue; //방문 검사
			
				que.add(new position(nX, nY));
				leng[nX][nY] = leng[p.x][p.y] + 1;
			}
		}
		return leng;
	}
	
	public static class position{
		int x, y;

		public position(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
