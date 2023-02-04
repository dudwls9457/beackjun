package test;

import java.util.Scanner;

public class beackjun1850 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		StringBuilder stb = new StringBuilder();
		for(int i = 0 ; i < GCD(A, B) ; i++ )
		{
			stb.append(1);
		}
		System.out.println(stb);
	}
	public static long GCD(long A , long B)
	{
		if(B == 0) return A;
		
		return GCD(B , A % B);
	}
}
