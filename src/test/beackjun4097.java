package test;

import java.util.Scanner;

public class beackjun4097 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int N = sc.nextInt();
			
			if(N == 0) break;
			int max = Integer.MIN_VALUE;
			int sum = 0;
			
			for(int i = 0 ; i < N ; i++)
			{
				int ben = sc.nextInt();
				sum += ben;
				max = Math.max(max, sum);
				
				if(sum < 0) sum = 0;
			}
			System.out.println(max);
		}
	}

}
