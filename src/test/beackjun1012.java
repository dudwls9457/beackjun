package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import test.beackjun3187.position;

public class beackjun1012 {
	
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,-1,0,1};
	
	static int count = 0;
	static boolean [][] check;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			int M = sc.nextInt(); // 10
			int N = sc.nextInt(); // 8
			int K = sc.nextInt();
			
			int [][] map = new int[N][M];
			check = new boolean[N][M];
			
			for(int j = 0 ; j < K ; j++)
			{
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();

				map[num2][num1] = 1;
			}	
			count = 0;
			for(int l = 0 ; l < N ; l++)
			{
				for(int r = 0 ; r < M ; r++)
				{	
					if(!check[l][r] && map[l][r] != 0)
					{
						bfs(M, N, map, l, r);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	
	public static void bfs(int M , int N , int map [][] , int i , int j)
	{
		
		Deque<position> que = new ArrayDeque<>();
		que.add(new position(i, j));
	
		while(que.size() != 0)
		{
			position p = que.poll();
			
			if(!check[p.x][p.y])
			{	
				check[p.x][p.y] = true;
				for(int k = 0 ; k < 4 ; k++)
				{
					int nX = p.x + dy[k];
					int nY = p.y + dx[k];
					
					if(nX < 0 || nX >= M || nY < 0 || nY >= N) continue;
					if(check[nX][nY] == true || map[nX][nY] == 0) continue;
					
					que.add(new position(nX, nY));
					check[nX][nY] = true;
				}	
			}
		}
	}
	
	public static class position{
		int x , y;
		
		public position(int x , int y) {
			this.x = x;
			this.y = y;
		}
	}

}
