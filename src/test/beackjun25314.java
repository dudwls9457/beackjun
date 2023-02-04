package test;

import java.util.Scanner;

public class beackjun25314 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N / 4 ; i++)
		{
			stb.append("long ");
		}
		stb.append("int");
		System.out.println(stb);
	}

}
