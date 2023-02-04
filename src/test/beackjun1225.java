package test;

import java.util.Scanner;

public class beackjun1225 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		
		long sumA = 0 , sumB = 0;
		for(int i = 0 ; i < A.length() ; i++)
		{
			char c = A.charAt(i);
			sumA += Integer.parseInt(c + "");
		}
		for(int i = 0 ; i < B.length() ; i++)
		{
			char c = B.charAt(i);
			sumB += Integer.parseInt(c + "");
		}

		System.out.println(sumA * sumB);
		
	}

}
