package test;

import java.util.Scanner;

public class beackjun5525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			int M = sc.nextInt();
			int N = sc.nextInt();
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			stb.append(N*(x-1) + y +"\n");
		}
		System.out.println(stb);
	}

}
