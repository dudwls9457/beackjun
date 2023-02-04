package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun1931 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int input [][] = new int[N][2];
		
		
		for(int i = 0 ; i < N ; i++)
		{
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
		}
		Arrays.sort(input, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.  
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
 
		});
		
		int endTime = 0;
		int count = 0;
		
		for(int i = 0 ; i < N ; i++)
		{
			if(input[i][0] >= endTime)
			{
				endTime = input[i][1];
				count++;
			}
		}
		System.out.println(count);
	}

}
