package test;

import java.util.Scanner;

public class beackjun1629 {
	
	public static long C;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextInt();
		long B = sc.nextInt();
		C = sc.nextInt();
		
		System.out.println(mul(A,B));
		
	}
	
	public static long mul(long A , long B)
	{	
		
		if(B == 1) return A % C;
		
		long temp = mul(A , B / 2);

		if(B % 2 != 0)
		{
			return ((temp * temp % C) * A) % C;
		}
		
		return (temp * temp) % C;
	}

}
