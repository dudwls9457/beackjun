package test;

import java.util.Scanner;

public class beackjun2447 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		print(N/3);
	
	}

	
	public static void print(int n)
	{	
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("***");
			System.out.println("* *");
			System.out.println("***");
		}
	}
}
