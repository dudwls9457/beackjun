package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class beackjun16236 {

	static int dx[] = {-1 , 0 , 1 , 0};
	static int dy[] = {0 , -1 , 0 , 1};
	
	static Deque<positin> que = new ArrayDeque<>();
	
	static int map[][];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		map = new int[N][N];
		
		for(int i = 0 ; i < N ; i++)
		{
			for(int j = 0 ; j < N ; j++)
			{
				map[i][j] = sc.nextInt();
				
				if(map[i][j] == 9) que.add(new positin(i, j)); 
			}
		}
	}
	
	
	public static void dfs(int N)
	{
		boolean vistied[][] = new boolean[N][N];
		int shark = 2;
		
		while(que.size() != 0)
		{
			positin p = que.pollFirst();
			int count = 0;
			vistied[p.x][p.y] = true;
				
				for(int i = 0 ; i < 4 ; i++)
				{
					int nX = p.x + dx[i];
					int nY = p.y + dy[i];
					
					if(nX < 0 || nX >= N || nY < 0 || nY >= N) continue; // 벽에 부딪혔는지
					if(map[nX][nY] > shark) continue; // 상어보다 큰지
					
					if(vistied[nX][nY] == false)
					{
						//방문한적이 없다면
						que.add(new positin(nX, nY));
						count++;
					}
					
				}
			
		}
	}
	
	public static class positin{
		int x , y;

		public positin(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
}
