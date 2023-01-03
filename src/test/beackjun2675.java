package test;

import java.util.Scanner;

public class beackjun2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			int R = sc.nextInt();
			String S = sc.next();
			for(int j = 0 ; j < S.length() ; j++)
			{
				String temp = S.substring(j, j+1);
				for(int k = 0 ; k < R ; k++)
				{
					System.out.print(temp);
				}
			}
			System.out.println();
		}
	}

}
