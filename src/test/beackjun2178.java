package test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class beackjun2178 {
	
	static int [] dx = {1 , 0 , -1 , 0 };
	static int [] dy = {0 , 1 , 0 , -1 };
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		char temp[][] = new char[N][M];
		int  temp2[][] = new int[N][M];
		
		for(int i = 0 ; i < N ; i++)
		{	
			String input = sc.next();
			for(int j = 0 ; j < M ; j++)
			{
				temp[i][j] = input.charAt(j);
				temp2[i][j] = -1;
			}
		}

		System.out.println(bfs(N,M,temp,temp2));
		
	}
	
	public static int bfs(int N , int M ,char map[][] , int leng[][])
	{
		Deque<position> que = new ArrayDeque<>();
		que.add(new position(0, 0));
		leng[0][0] = 0;
		
		while(que.size() != 0)
		{
			position p = que.poll();
			
			for(int i = 0 ; i < 4 ; i++)
			{
				int nX = p.x + dx[i];
				int nY = p.y + dy[i];
				
				if(nX < 0 || nX >= N || nY < 0 || nY >= M) continue; //벽 검사
				if(map[nX][nY] == '0' || leng[nX][nY] != -1) continue; //방문 검사
			
				que.add(new position(nX, nY)); // 값 넣어주고
				leng[nX][nY] = leng[p.x][p.y] + 1; // 거리 값 더해주기
			}
		}
		return leng[N - 1][M - 1] + 1;
	}
	
	public static class position
	{
		int x , y;
		
		public position(int x , int y)
		{
			this.x = x;
			this.y = y;
		}
	}
}
