package test;

import java.util.HashMap;
import java.util.Scanner;

public class beackjun1920 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		int N = sc.nextInt();
		HashMap<Integer , Integer> map = new  HashMap<>();
		
		for(int i = 0 ; i < N ; i++)
		{
			map.put(sc.nextInt(), 1);
		}
		
		int M = sc.nextInt();
		
		for(int i = 0 ; i < M ; i++)
		{
			int temp = sc.nextInt();
			if(map.get(temp) != null)
				stb.append(1 + "\n");
			else stb.append(0 + "\n");
		}
		System.out.println(stb);
	}

}
