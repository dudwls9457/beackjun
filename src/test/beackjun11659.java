package test;

import java.util.Scanner;

public class beackjun11659 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		StringBuilder stb = new StringBuilder();
		
		int getNum [] = new int [N + 1];
		
		for(int i = 1 ; i <= N ; i ++)
		{
			getNum[i] = getNum[i-1] + sc.nextInt();
		}
		
		for(int i = 0 ; i < M ; i++)
		{
			int firstNum = sc.nextInt();
			int secondNum = sc.nextInt();
			
			stb.append(getNum[secondNum] - getNum[firstNum - 1] + "\n");
		}
		System.out.println(stb);
	}

}
