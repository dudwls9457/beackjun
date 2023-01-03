package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class beackjun12865 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int bag [][] = new int[N + 1][2];
		int save [][] = new int[N + 1][K + 1];
		
		for(int i = 0 ; i < N ; i++)
		{
			bag[i][0] = sc.nextInt();
			bag[i][1] = sc.nextInt();
		}
		
		// 무게를 기준으로 바꿈
		Arrays.sort(bag, new Comparator<int[]>() {
		    @Override
			public int compare(int[] o1, int[] o2) {
		    	 if(o1[0] == o2[0]) {
	                	 return o1[1] - o2[1];
		    	 }else {
		    		 return o1[0] - o2[0]; 
		    	 }
	           }
	        });

		for(int i = 1; i <= N ; i++)
		{
			for(int j = 1 ; j <= K ; j++)
			{	
				if(bag[i][0] > j)
				{
					save[i][j] = save[i-1][j];
				}
				else
				{	
					if(save[i-1][j] > save[i-1][j-bag[i][0]] + bag[i][1])
					{
						save[i][j] = save[i-1][j];
					}else
					{
						save[i][j] = save[i-1][j-bag[i][0]] + bag[i][1];
					}
				}
			}
		}
		System.out.println(save[N][K]);
	}
}
