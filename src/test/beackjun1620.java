package test;

import java.util.HashMap;
import java.util.Scanner;

public class beackjun1620 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		HashMap<String, Integer> myList = new HashMap<>();
		String value[] = new String[N];
		for(int i = 0 ; i < N ; i++)
		{	
			String temp = sc.next();
			myList.put(temp, i + 1);
			value[i] = temp;
		}
		
		for(int i = 0 ; i < M ; i++)
		{	
			String temp = sc.next();
			if(myList.get(temp) == null)
			{
				stb.append(value[Integer.valueOf(temp) - 1] + " \n");
			}else stb.append(myList.get(temp) + "\n");
		}
		System.out.println(stb);
		
	}

}
