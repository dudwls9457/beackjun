package dubu;

import java.util.Scanner;

public class Problem23747 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		int C = sc.nextInt();
		
		String Carr[] = new String[R];
		String RCarr[][] = new String [R][C];
		
		for(int i = 0 ; i < R ; i++)
		{
			Carr[i] = sc.next();
		}
		
		for(int i = 0 ; i < R ; i++)
		{
			for(int j = 0 ; j < C ; j++)
			{
				RCarr[i][j] = Carr[i].substring(j, j + 1);
			}
		}
		
		int nowR = sc.nextInt() - 1;
		int nowC = sc.nextInt() - 1;
		// 첫번째 값은 걍 .
		String s = sc.next();
		
			
	}

}
