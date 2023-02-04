package test;

import java.util.Scanner;

public class beackjun1011 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int dis = y - x;
			
			if((int)(2 * Math.sqrt(dis)) == 2 * Math.sqrt(dis))
				System.out.println((int)(2 * Math.sqrt(dis)) - 1);
			else
			System.out.println((int)(2 * Math.sqrt(dis)));
		}
	}

}
