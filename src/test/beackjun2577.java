package test;

import java.util.Scanner;

public class beackjun2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long sum = 1;
		int check [] = new int[10];
		for(int i = 0 ; i < 3 ; i++)
		{
			sum *= sc.nextLong();
		}
		String temp = String.valueOf(sum);
		
		for(int i = 0 ; i < temp.length() ; i++)
		{
			check[Integer.parseInt(temp.substring(i,i+1))]++;
		}
		
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println(check[i]);
		}
	}

}
