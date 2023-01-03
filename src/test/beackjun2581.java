package test;

import java.util.Scanner;

public class beackjun2581 {
	
	public static boolean prime[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0 ;
		int min = 0 ;
		
		prime = new boolean[N + 1];
		get();
		
		for(int i = M ; i <= N ; i++)
		{
			if(prime[i] == false)
			{	
				if(sum == 0) min = i;
				sum += i;
			}
		}
		if(sum == 0)
		{
			System.out.println("-1");
		}else
		{
			System.out.println(sum);
			System.out.println(min);
		}
	}
	public static void get()
	{
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
		
	}
}
