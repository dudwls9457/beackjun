package test;

import java.util.Scanner;

public class beackjun7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int big [][] = new int [N][2];
		int rank [] = new int [N];
		
		for(int i = 0 ; i < N ; i++)
		{
			big[i][0] = sc.nextInt(); // 몸무게
			big[i][1] = sc.nextInt(); // 키
			rank[i] = 1; // 본인 순번을 1로 초기화
		}
		
		for(int i = 0 ; i < N ; i++)
		{
			for(int j = 0 ; j < N ; j++)
			{
				if(big[i][0] < big[j][0] && big[i][1] < big[j][1])
				{
					rank[i]++;
				}
			}
		}
		for(int i = 0 ; i < N ; i++)
		{
			System.out.println(rank[i]);
		}
	}

}
