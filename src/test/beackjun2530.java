package test;

import java.util.Scanner;

public class beackjun2530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		int D = sc.nextInt();
	
		hour += D / 3600;
		D %= 3600;
		
		min += D / 60;
		D %= 60;
		
		sec += D;
		
		if(sec >= 60)
		{
			sec = sec - 60;
			min++;
		}
		if(min >= 60)
		{
			min = min - 60;
			hour++;
		}
		hour %= 24;
		System.out.println(hour + " " + min + " " + sec);
	}

}
