package test;

import java.util.Scanner;

public class beackjun1063 {

	public static void main(String[] args) {
		
		int [][] map = new int[8][8];
		
		Scanner sc = new Scanner(System.in);
		
		String king = sc.next();
		String stone = sc.next();
		int N = sc.nextInt();
		
		int startX = (int) king.charAt(0) - 65;
		int startY = (int) king.charAt(1) - 49;
		
		int stoneX = (int) stone.charAt(0) - 65;
		int stoneY = (int) stone.charAt(1) - 49;
		
		for(int i = 0 ; i < N ; i++)
		{
			String temp = sc.next();
			int nextX = 0, nextY = 0;
			switch(temp)
			{	
				
				case "R" :
					nextX = startX + 1;
					nextY = startY;
					break;
				case "L" :
					nextX = startX - 1;
					nextY = startY;
					break;
				case "B" :
					nextX = startX;
					nextY = startY - 1;
					break;
				case "T" :
					nextX = startX;
					nextY = startY + 1;
					break;
				case "RT" :
					nextX = startX + 1;
					nextY = startY + 1;
					break;
				case "LT" :
					nextX = startX - 1;
					nextY = startY + 1;
					break;
				case "RB" :
					nextX = startX + 1;
					nextY = startY - 1;
					break;
				case "LB" :
					nextX = startX - 1;
					nextY = startY - 1;
					break;	
			}
			if(nextX < 0 || nextX >= 8 || nextY < 0 || nextY >= 8) continue;
			if(nextX == stoneX && nextY == stoneY)
			{
				// 돌을 만났다면
				stoneX += nextX - startX;
				stoneY += nextY - startY;
				if(stoneX < 0 || stoneX >= 8 || stoneY < 0 || stoneY >= 8)
				{	
					stoneX -= nextX - startX;
					stoneY -= nextY - startY;
					continue;
				}
			}
			
			startX = nextX;
			startY = nextY;
		}
		System.out.print((char)(65 + startX));
		System.out.println((char)(startY + 49));
		
		System.out.print((char)(65 + stoneX));
		System.out.println((char)(stoneY + 49));
	}
}
