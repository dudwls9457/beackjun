package test;

import java.util.Scanner;

public class beackjun5347 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			long num1 = sc.nextInt();
			long num2 = sc.nextInt();
			
			stb.append(num1 * num2 / gcd(num1,num2) +"\n");
		}
		System.out.println(stb);
		
	}
	
	public static long gcd(long a , long b)
	{
		if(b == 0) return a;
		else
		{
			return gcd(b, a % b);
		}
	}

}
