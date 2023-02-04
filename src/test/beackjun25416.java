package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class beackjun25416 {
	
	static int [] dx = {-1 , 0 , 1 , 0};
	static int [] dy = {0 , -1 , 0 , 1};

	static int [][] map = new int[5][5];
	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		for(int i = 0 ; i < 5 ; i++)
		{
			for(int j = 0 ; j < 5 ; j++)
			{
				map[i][j] = sc.nextInt();
			}
		}
		int r = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(dfs(r,c));
	}
	
	public static int dfs(int x , int y)
	{
		boolean [][] visited = new boolean[6][6];
		Deque<position> que = new ArrayDeque<>();
		que.add(new position(x, y));
		visited[x][y] = true;
		
		while(que.size() != 0)
		{
			position p = que.pollFirst();
			
			for(int i = 0 ; i < 4 ; i++)
			{
				int nX = p.x + dx[i];
				int nY = p.y + dy[i];
				
				if(nX < 0 || nX >= 5 || nY < 0 || nY >= 5)continue;
				if(visited[nX][nY] == true || map[nX][nY] == -1) continue;
				
				if(map[nX][nY] == 1)
				{
					return map[p.x][p.y] + 1;
				}
				visited[nX][nY] = true;
				map[nX][nY] = map[p.x][p.y] + 1;
				que.add(new position(nX, nY));
			}
		}
		return -1;
	}

	public static class position{
		int x , y;

		public position(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
}
