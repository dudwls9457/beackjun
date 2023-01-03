package test;

import java.util.HashMap;
import java.util.Scanner;

public class beackjun17219 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder stb = new StringBuilder();
	
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		HashMap<String, String> hashmap = new HashMap<>();
		
		for(int i = 0 ; i < N ; i++)
		{
			hashmap.put(sc.next(), sc.next());
		}
		
		for(int i = 0 ; i < M ; i++)
		{
			stb.append(hashmap.get(sc.next()) +"\n");
		}
		System.out.println(stb);
	}

}
