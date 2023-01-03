package test;

import java.util.Scanner;

public class beackjun11653 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 2;
		if(N != 1)
		{
			while(true)
			{
				
				if(N % i == 0)
				{
					System.out.println(i);
					N = N / i;
				}else
				{
					i++;
				}
				
				if(N == 1) break;
			}
		}
		
	}

}
