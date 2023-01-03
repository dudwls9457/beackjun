package test;

import java.util.Arrays;
import java.util.Scanner;

public class beackjun2587 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int getNum[] = new int[5];
		int sum = 0;
		int avg = 0;
		
		for(int i = 0 ; i < getNum.length ; i++)
		{
			getNum[i] = sc.nextInt();
			sum += getNum[i];
		}
		
		Arrays.sort(getNum);
		
		System.out.println(sum / 5);
		System.out.println(getNum[2]);
		
	}

}
