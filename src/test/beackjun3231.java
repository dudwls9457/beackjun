package test;

import java.util.Scanner;

public class beackjun3231 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int [] arr = new int[N+1];
		for(int i = 0 ; i < N ; i++)
		{
			arr[i] = sc.nextInt();
		}
		int count = 0;
		
		for(int i = 1 ; i <= N ; i++)
		{
			if(arr[i-1] > arr[i]) count++;
		}
		System.out.println(count);
	}

}
