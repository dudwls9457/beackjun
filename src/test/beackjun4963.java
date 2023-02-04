package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class beackjun4963 {
	
	static int [] dx = {0 , -1 , 0 , 1};
	static int [] dy = {-1 , 0 , 1 , 0};
		
	static int [][] map;
	static boolean [][] visited;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		while(true)
		{
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			if(w == 0 && h == 0) break;
			
			map = new int[h][w];
			visited = new boolean[h + 1][w + 1];
			
			for(int i = 0 ; i < h ; i++)
			{
				for(int j = 0 ; j < w ; j++)
				{
					map[i][j] = sc.nextInt();
				}
			}
			int count = 0;
			for(int i = 0 ; i < h ; i++)
			{
				for(int j = 0 ; j < w ; j++)
				{
					if(visited[i][j] == false && map[i][j] == 1)
					{
						bfs(i,j,w,h);
						count++;
					}
				}
			}
			stb.append(count +"\n");
		}
		System.out.println(stb);
	}
	public static void bfs(int i, int j ,int w, int h)
	{
		Deque<position> que = new ArrayDeque<>();
		visited[i][j] = true;
		que.add(new position(i, j));
		
		while(que.size() != 0)
		{
			position p = que.poll();
			
			for(int k = 0 ; k < 4 ; k++)
			{
				int nX = p.x + dx[k];
				int nY = p.y + dy[k];
				
				if(nX < 0 || nX >= w || nY < 0 || nY >= h) continue;
				if(map[nX][nY] == 0 || visited[nX][nY] == true) continue;
				
				visited[nX][nY] = true;
				que.add(new position(nX, nY));
			}
		}
		
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
