package test;

import java.util.Scanner;

public class beackjun11660 {

	public static void main(String[] args) {
		
		StringBuilder stb = new StringBuilder(); 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int input[][] = new int[N+1][N+1];
		int normal[][] = new int[N+1][N+1];
		int temp[][] = new int[N+1][N+1];
		
		for(int i = 1 ; i <= N ; i++)
		{
			for(int j = 1 ; j <= N ; j++)
			{	
				normal[i][j] = sc.nextInt();
				temp[i][j] = normal[i][j] + temp[i][j - 1];
				input[i][j] = input[i - 1][j] + temp[i][j];
//				System.out.print(input [i][j] + " ");
			}
//			System.out.println();
		}
		
		for(int i = 0 ; i < M ; i++)
		{
			int startNum1 = sc.nextInt(); // 2
			int startNum2 = sc.nextInt(); // 2
			
			int secondNum1 = sc.nextInt(); // 3
			int secondNum2 = sc.nextInt(); // 4
			
			if(startNum1 == secondNum1 && startNum2 == secondNum2) stb.append(normal[startNum1][startNum2] + "\n");
			else
			{
				int whole = input[secondNum1][secondNum2];
				int top = input[startNum1 - 1][secondNum2];
				int left = input[secondNum1][startNum2 - 1];
				int result = whole - top - left + input[startNum1-1][startNum2-1];
				stb.append(result + "\n");
			}
		}
		System.out.println(stb);

	}

}
