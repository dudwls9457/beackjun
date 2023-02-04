package test;

import java.math.BigInteger;
import java.util.Scanner;

public class beackjun4134 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i = 0 ; i < T ; i++)
		{
			long n = sc.nextLong();
			BigInteger nextNumber = new BigInteger(String.valueOf(n));
			
			if(nextNumber.isProbablePrime(10))
			{
				System.out.println(nextNumber);
			}else
			{
				System.out.println(nextNumber.nextProbablePrime());
			}
			
		}
		
	}
}
