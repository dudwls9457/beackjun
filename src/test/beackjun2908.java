package test;

import java.util.Scanner;

public class beackjun2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int tempA = 0;
		int tempB = 0;
		
		tempA += A / 100;
		tempA += ((A/10) % 10) * 10;
		tempA += (A % 10) * 100;
		
		tempB += B / 100;
		tempB += ((B/10) % 10) * 10;;
		tempB += (B % 10) * 100;
		
		if(tempA > tempB)
		{
			System.out.println(tempA);
		}else
		{
			System.out.println(tempB);
		}
	}

}
