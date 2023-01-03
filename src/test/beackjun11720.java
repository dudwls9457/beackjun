package test;

import java.util.Scanner;

public class beackjun11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String get = sc.next();
		int result = 0 ;
		
		for(int i = 0 ; i < N ; i++)
		{
			result += Integer.parseInt(get.substring(i, i+1)) ;
		}
		System.out.println(result);
	}

}
