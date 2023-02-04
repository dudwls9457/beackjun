package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class beackjun21736 {
	
	static char [][] map;
	static boolean [][] visited;
	
	static int [] dx = {1 , 0 , -1 , 0};
	static int [] dy = {0 , 1 , 0 , -1};
	
	static Deque<poisiton> que = new ArrayDeque<>();

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		map = new char [N][M];
		visited = new boolean [N][M];
		
		for(int i = 0 ; i < N ; i++)
		{	
			String temp = sc.next();
			for(int j = 0 ; j < M ; j++)
			{
				map[i][j] = temp.charAt(j);
				if(map[i][j] == 'I')
				{
					que.add(new poisiton(i, j));
					visited[i][j] = true;
				}
			}
		}
		int ans = bfs(N,M);
		if(ans == 0) System.out.println("TT");
		else System.out.println(ans);
		
	}
	public static int bfs(int N , int M)
	{	
		int count = 0;
		while(que.size() != 0)
		{
			poisiton p = que.poll();
			
			for(int i = 0 ; i < 4 ; i++)
			{
				int nX = p.x + dx[i];
				int nY = p.y + dy[i];
				
				if(nX < 0 || nX >= N || nY < 0 || nY >= M) continue;
				if(map[nX][nY] == 'X' || visited[nX][nY] == true) continue;
				
				if(map[nX][nY] == 'P') count++;
				
				visited[nX][nY] = true;
				que.add(new poisiton(nX, nY));
 			}
		}
		return count;
	}
	
	public static class poisiton{
		int x , y;

		public poisiton(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
}
