package test;

import java.util.Scanner;

public class beackjun2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		int max = 0;
		for(int i = 1 ; i <= firstNum && i <= secondNum ; i++)
		{
			if(firstNum % i == 0 && secondNum % i == 0)
			{
				max = i;
			}
		}
		int min = (firstNum * secondNum) / max; // 최소 공배수를 구하는 공식
		
		System.out.println(max);
		System.out.println(min);
		
		
	}

}
