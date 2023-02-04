package test;

import java.util.Scanner;

public class beackjun1735 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1C = sc.nextInt();
		int num1M = sc.nextInt();
		
		int num2C = sc.nextInt();
		int num2M = sc.nextInt();
		
		int ansC = num1C * num2M + num2C * num1M;
		int ansM = num2M * num1M;
		
		int gcd = GCD(ansC , ansM);
		
		System.out.println(ansC / gcd + " " + ansM / gcd);
	}
	
	public static int GCD(int a, int b){
		 if(a % b == 0)
			 return b;
		 return GCD(b , a % b);
	}

}
