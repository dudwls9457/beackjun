package test;

import java.util.Scanner;

public class beackjun4153 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int input[] = new int[3];
			
			int temp = 0;
			int max = 0 ;
			int sum = 0;
			for(int i = 0 ; i < 3 ; i++)
			{
				input[i] = sc.nextInt();
				if(input[i] > max) 
				{
					temp = i;
					max = input[i];
				}
			}
			if(input[0] == 0) break;
			for(int i = 0 ; i < 3 ; i++)
			{
				if(i != temp)
				{
					sum += input[i] * input[i];
				}
			}
			if(max * max == sum) System.out.println("right");
			else System.out.println("wrong");
		}
		
	}

}
