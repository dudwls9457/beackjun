package test;

import java.util.Scanner;

public class beackjun4948 {
	
	public static boolean prime[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int N = sc.nextInt();
			if(N == 0)
			{
				break;
			}
			int count = 0;
			prime = new boolean[N*2 + 1];
			get();
			
			for(int i = N + 1 ; i <= 2 * N ; i++)
			{
				if(prime[i] == false)
				{
					count++;
				}
			}
			System.out.println(count);
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
