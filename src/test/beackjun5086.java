package test;

import java.util.Scanner;

public class beackjun5086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int firstNum = sc.nextInt();
			int secondNum = sc.nextInt();
			
			if(firstNum == 0 && secondNum == 0) break;
			if(firstNum > secondNum)
			{
				if(firstNum % secondNum == 0) System.out.println("multiple");
				else System.out.println("neither");
			}else
			{
				if(secondNum % firstNum == 0) System.out.println("factor");
				else System.out.println("neither");
			}
		}
	}

}
