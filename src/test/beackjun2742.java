package test;

import java.util.Scanner;

public class beackjun2742 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		int N = sc.nextInt();
		
		for(int i = N ; i > 0 ; i--)
		{
			stb.append(i + "\n");
		}
		System.out.println(stb);
	}

}
