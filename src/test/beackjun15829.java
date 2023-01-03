package test;

import java.math.BigInteger;
import java.util.Scanner;

public class beackjun15829 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String input = sc.next(); // - 96;
		char ch = input.charAt(0);
		
		BigInteger sum =  new BigInteger("0");
		
		for(int i = 0 ; i < input.length() ; i++)
		{
			char temp = input.charAt(i);
			sum = sum.add(BigInteger.valueOf(temp - 96).multiply(BigInteger.valueOf(31).pow(i)));
			
		}
		System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));
	}
	

}
