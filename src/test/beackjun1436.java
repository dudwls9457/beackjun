package test;

import java.util.Scanner;

public class beackjun1436 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		int i = 666;
		while(true)
		{		
			String temp = String.valueOf(i);
			
			if(temp.contains("666"))
			{	
				count++;
				if(N == count) break;
			}
			i++;
		}
		System.out.println(i);
	}

}
