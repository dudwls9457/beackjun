package test;

import java.util.Scanner;

public class beackjun1267 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int Y = 0;
		int M = 0;
		
		for(int i = 0 ; i < N ; i++)
		{
			int call = sc.nextInt();
			
			Y += (call / 30 + 1) * 10;
			M += (call / 60 + 1) * 15;
		}
		
		if(Y == M) System.out.println("Y M " + M);
		else
		{
			if(Y > M) System.out.println("M " + M );
			else System.out.println("Y " + Y);
		}
	}

}
