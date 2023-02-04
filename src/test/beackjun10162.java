package test;

import java.util.Scanner;

public class beackjun10162 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int countFive = 0;
		int countMin = 0;
		int countTen = 0;
		
		if(T % 10 != 0) System.out.println(-1);
		else
		{
			if(T >= 300)
			{
				countFive += T / 300;
				T %= 300;
			}
			if(T >= 60)
			{
				countMin += T / 60;
				T %= 60;
			}
			if(T >= 10)
			{
				countTen += T / 10;
				T = 0;
			}
			System.out.println(countFive + " " + countMin +" " + countTen);
		}
	}

}
