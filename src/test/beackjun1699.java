package test;

import java.util.Scanner;

public class beackjun1699 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int temp = (int) Math.sqrt(N);
		
		int count = 0;
		while(N != 0)
		{
			int temp2 = N - temp * temp;
			if(temp2 >= 0)
			{
				N -= temp * temp;
				count++;
			}else
				temp--;
		}
		System.out.println(count);
	}

}
