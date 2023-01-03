package test;

import java.util.HashMap;
import java.util.Scanner;

public class beackjun10816 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		int N = sc.nextInt();
		HashMap<Integer, Integer> myList = new HashMap<>();
		
		for(int i = 0 ; i < N ; i++)
		{	
			int temp = sc.nextInt();
			if(myList.containsKey(temp)) myList.put(temp , myList.get(temp) + 1);
			else myList.put(temp, 1);
		}
		int M = sc.nextInt();
		
		for(int i = 0 ; i < M ; i++)
		{
			int temp = sc.nextInt();
			if(myList.get(temp) == null) stb.append(0 + " ");
			else  stb.append(myList.get(temp) + " ");
		}
		System.out.println(stb);
	}

}
