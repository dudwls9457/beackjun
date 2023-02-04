package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class beackjun3184 {
	
	static int [] dx = { -1 , 0 , 1 , 0};
	static int [] dy = { 0 , -1 , 0 , 1};
	
	static int sumWolf = 0;
	static int sumSheep = 0;
	static char map[][];
	
	static boolean [][] visited;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		int C = sc.nextInt();
		
		map = new char[R + 5][C + 5];
		visited = new boolean[R + 5][C + 5];
		
		for(int i = 0 ; i < R ; i++)
		{
			String temp = sc.next();
			for(int j = 0 ; j < C ; j++)
			{
				map[i][j] = temp.charAt(j);
			}
		}
		
		for(int i = 0 ; i < R ; i++)
		{
			for(int j = 0 ; j < R ; j++)
			{
				if(map[i][j] != '#' && visited[i][j] == false)
				{
					bfs(R,C,i,j);
				}
			}
		}
		System.out.println(sumSheep +"\n" + sumWolf);
	}
	public static void bfs(int R , int C , int i , int j)
	{
		Deque<position> que = new ArrayDeque<>();
		
		que.add(new position(i, j));
		visited[i][j] = true;
		
		int wolf = 0;
		int sheep = 0;
		
		if(map[i][j] == 'v') wolf++;
		else if(map[i][j] == 'o') sheep++;
		
		while(que.size() != 0)
		{
			position p = que.poll();
			for(int k = 0 ; k < 4 ; k++)
			{
				int nX = p.x + dx[k];
				int nY = p.y + dy[k];
				
				if(nX < 0 || nX >= C || nY < 0 || nY >= R) continue;
				if(visited[nX][nY] == true || map[nX][nY] == '#') continue;
				
				if(map[nX][nY] == 'v')
				{
					// 늑대를 만났을 때
					visited[nX][nY] = true;
					wolf++;
					que.add(new position(nX, nY));
				}else if(map[nX][nY] == 'o')
				{
					visited[nX][nY] = true;
					sheep++;
					que.add(new position(nX, nY));
				}else
				{
					visited[nX][nY] = true;
					que.add(new position(nX, nY));
				}
			}
		}
		System.out.println(sheep + " " + wolf);
		if(wolf >= sheep) sumWolf += wolf;
		else sumSheep += sheep;
		
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
