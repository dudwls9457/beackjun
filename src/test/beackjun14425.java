package test;

import java.util.HashMap;
import java.util.Scanner;

public class beackjun14425 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		HashMap<String, Integer> inside = new HashMap<>();
		
		int count = 0;
		for(int i = 0 ; i < N ; i++)
		{
			inside.put(sc.next(), 1);
		}
		for(int i = 0 ; i < M ; i++)
		{
			String temp = sc.next();
			if(inside.get(temp) != null) count++;
		}
		System.out.println(count);
	}

}
