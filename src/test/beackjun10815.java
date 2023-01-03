package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class beackjun10815 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < N ; i++)
		{
			map.put(sc.nextInt(), 1);
		}
		
		int M = sc.nextInt();
		
		for(int i = 0 ; i < M ; i++)
		{
			int temp = sc.nextInt();
			if(map.get(temp) == null) System.out.print(0+ " ");
			else System.out.print(map.get(temp) + " ");
		}
	
	}

}
