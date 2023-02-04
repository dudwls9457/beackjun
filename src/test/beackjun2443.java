package test;

import java.util.Scanner;

public class beackjun2443 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N * 2 ; i++)
		{	
			for(int j = 1 ; j < i + 1 ; j++)
			{
				System.out.print(" ");
			}
			for(int j = i ; j < N * 2 -1 - i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
