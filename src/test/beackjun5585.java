package test;

import java.util.Scanner;

public class beackjun5585 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int pay = 1000 - price;
		
		int count = 0;
		if(pay >= 500)
		{
			count += pay / 500;
			pay %= 500;
		}
		if(pay >= 100)
		{
			count += pay / 100;
			pay %= 100;
		}
		if(pay >= 50)
		{
			count += pay / 50;
			pay %= 50;
		}
		if(pay >= 10)
		{
			count += pay / 10;
			pay %= 10;
		}
		if(pay >= 5)
		{
			count += pay / 5;
			pay %= 5;
		}
		if(pay >= 1)
		{
			count += pay;
			pay = 0;
		}
		System.out.println(count);
		
	}

}
