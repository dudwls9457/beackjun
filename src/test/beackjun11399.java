package test;

import java.util.Arrays;
import java.util.Scanner;

public class beackjun11399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int getNum[] = new int [N + 1];
		
		for(int i = 1 ; i <= N ; i++)
		{
			getNum[i] = sc.nextInt();
		}
		
		Arrays.sort(getNum);
		
		int sum = 0;
		for(int i = 1 ; i <= N ; i++)
		{
			getNum[i] = getNum[i] + getNum[i-1];
			sum += getNum[i];
		}
		
	System.out.println(sum);
	}

}
