package test;

import java.util.Scanner;

public class beackjun1037 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < N ; i++)
		{	
			int temp = sc.nextInt();
			max = Math.max(max, temp);
			min = Math.min(min, temp);
		}
		System.out.println(max * min);
	}

}
