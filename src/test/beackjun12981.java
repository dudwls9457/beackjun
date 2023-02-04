package test;

import java.util.Scanner;

public class beackjun12981 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		
		int min = Math.min(R, Math.min(G, B));
		
		total += min;
		
		R -= min;
		G -= min;
		B -= min;
		
		if(R != 0)
		{
			if(R % 3 == 0)
				total += R / 3;
			else
				total += R / 3  + 1;
		}
		if(G != 0)
			if(G % 3 == 0)
				total += G / 3;
			else
				total += G / 3  + 1;
		if(B != 0)
			if(B % 3 == 0)
				total += B / 3;
			else
				total += B / 3  + 1;
		
		System.out.println(total);
	}

}
