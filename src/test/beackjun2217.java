package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class beackjun2217 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Integer lope [] = new Integer[N];
		
		for(int i = 0 ; i < N ; i++)
		{
			lope[i] = sc.nextInt();
		}
		
		Arrays.sort(lope, Collections.reverseOrder());
		int max = 0;
		
		for(int i = 0 ; i < N ; i++)
		{
			max = Math.max(max, lope[i] * (i+1));
		}
		System.out.println(max);
	}

}
