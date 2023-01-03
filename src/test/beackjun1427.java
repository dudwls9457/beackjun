package test;

import java.util.Arrays;
import java.util.Scanner;

public class beackjun1427 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int num [] = new int [N.length()];
		
		for(int i = 0 ; i < N.length() ; i++)
		{
			num[i] = Integer.parseInt(N.substring(i, i+1));
		}
		Arrays.sort(num);
		
		for(int i = N.length() - 1 ; i >= 0 ; i--)
		{
			System.out.print(num[i]);
		}
	}

}
