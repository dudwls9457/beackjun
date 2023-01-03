package test;

import java.util.Scanner;

public class beackjun2559 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int getNum [] = new int [N];
		
		int max = 0;
		
		for(int i = 0 ; i < N ; i++)
		{
			getNum[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < N - K ; i++)
		{	
			int sum = 0;
			for(int j = i ; j < i + K ; j++ )
			{
				sum += getNum[j];
			}
			max = Math.max(	max, sum);
		}
		System.out.println(max);
	}

}
