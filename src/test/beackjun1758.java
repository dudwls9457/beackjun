package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class beackjun1758 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Integer tip [] = new Integer[N];
		
		for(int i = 0 ; i < N ; i++)
		{
			tip[i] = sc.nextInt();
		}
		Arrays.sort(tip , Collections.reverseOrder());
		
		long sum = 0;
		for(int i = 0 ; i < N ; i++)
		{
			if(tip[i] - i  > 0)
			{
				sum += tip[i] - i ;
			}
		}
		System.out.println(sum);
		
	}

}
