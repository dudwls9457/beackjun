package test;

import java.util.Scanner;

public class beackjun2442 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N ; i++)
		{
			for(int j = i + 1 ; j < N ; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0 ; j < 1 + i * 2 ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
