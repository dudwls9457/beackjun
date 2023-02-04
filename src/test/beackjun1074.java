package test;

import java.util.Scanner;

public class beackjun1074 {
	
	static double sum = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		r++;
		c++;
		rec(Math.pow(2, N) , r , c );
		
	}
	
	public static void rec(double N , double r , double c)
	{
		double size = N;
		double half = size / 2;
		
		if(size == 1)
		{
			System.out.println((int)sum);
			return;
		}
		
		if(r <= half && c <= half)
		{
			// 1사분면
			rec(half , r , c);
		}
		
		if(r <= half && c > half)
		{
			// 2사분면
			sum += half * half;
			rec(half , r , c - half);
		}
		
		if(r > half && c <= half)
		{
			// 3사분면
			sum += (half * half) * 2;
			rec(half , r-half, c);
		}
		if(r > half && c > half)
		{
			// 4사분면
			sum += (half * half) * 3;
			rec(half , r-half, c-half);
		}
		
	}

}
