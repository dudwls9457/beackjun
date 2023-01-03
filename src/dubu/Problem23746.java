package dubu;

import java.util.Scanner;

public class Problem23746 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String result = "";
		
		String input [][] = new String[N][2];
		
		for(int i = 0 ; i < N ; i++)
		{
			for(int j = 0 ; j < 2 ; j++)
			{
				input[i][j] = sc.next();
			}
		}
		String get = sc.next();
		
		for(int i = 0 ; i < get.length() ; i++)
		{
			String temp = get.substring(i , i + 1);
			for(int j = 0 ; j < N ; j++)
			{
				if(temp.equals(input[j][1]))
				{
					result += input[j][0];
				}
			}
		}
		int start = sc.nextInt();
		int end = sc.nextInt();
		System.out.println(result.substring(start - 1 , end));
	}

}
