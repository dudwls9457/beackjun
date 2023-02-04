package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class beackjun2667 {

	static int [] dx = {-1 , 0 , 1 , 0};
	static int [] dy = {0 , -1 , 0 , 1};
	
	static int [][] map;
	static Deque<position> que = new ArrayDeque<>();
	static int N;
	static boolean [][] visited;
	static int count = 0;
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		map = new int[N][N];
		visited = new boolean[N][N];
		for(int i = 0 ; i < N ; i++)
		{
			String temp = sc.next();
			for(int j = 0 ; j < N ; j++)
			{
				map[i][j] = temp.charAt(j) - 48;
			}
		}
		for(int i = 0 ; i < N ; i++)
		{
			for(int j = 0 ; j < N ; j++)
			{
				if(map[i][j] == 1 && visited[i][j] == false)
				{
					dfs(i,j);
				}
			}
		}
		System.out.println(count);
		Collections.sort(list);
		StringBuilder stb = new StringBuilder();
		
		for(int i : list)
		{
			stb.append(i + "\n");
		}
		System.out.println(stb);
	}
	public static void dfs(int i , int j)
	{
		que.add(new position(i, j));
		visited[i][j] = true;
		count++;
		int house = 1;
		
		while(que.size() != 0)
		{
			position p = que.pollFirst();
			
			for(int k = 0 ; k < 4 ; k++)
			{
				int nX = p.x + dx[k];
				int nY = p.y + dy[k];
				
				if(nX < 0 || nX >= N || nY < 0 || nY >= N) continue;
				if(map[nX][nY] == 0) continue;
				
				if(visited[nX][nY] == false)
				{
					house++;
					que.add(new position(nX, nY));
					visited[nX][nY] = true;
				}
			}
		}
		list.add(house);
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
