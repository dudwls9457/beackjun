package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class beackjun10469 {

	static char map [][] = new char[8][8];
	static Deque<position> que = new ArrayDeque<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 8 ; i++)
		{	
			String temp = sc.next();
			for(int j = 0 ; j < 8 ; j++)
			{
				map[i][j] = temp.charAt(j);
				if(map[i][j] == '*') que.add(new position(i, j));
			}
		}
		boolean flag = false;
		while(que.size() != 0)
		{
			position p = que.poll();
			int x = p.x;
			int y = p.y;
			
			for(int i = 0 ; i < 8 ; i++)
			{
				if( map[x][i] == '*')
				{
					flag = true;
					break;
				}
				if(map[i][y] == '*')
				{
					flag = true;
					break;
				}
			}
			if(flag == false) System.out.println("valid");
			else 	System.out.println("invalid");
		}
	}
	public static class position{
		int x, y;

		public position(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
}
