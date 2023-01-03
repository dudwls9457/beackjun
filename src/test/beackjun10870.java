package test;

import java.util.Scanner;

public class beackjun10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(getNum(n));
		
	}
	
	public static int getNum(int num)
	{
		
		if(num <= 1) 
		{	
			return num;
		}
		return getNum(num - 1) + getNum(num - 2);
	}

}
