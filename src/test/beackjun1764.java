package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class beackjun1764 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String arr[] = new String[M];
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < N ; i++)
		{
			map.put(sc.next(), 1);
		}
		int count = 0;
		for(int i = 0 ; i < M ; i++)
		{	
			String temp = sc.next();
			arr[i] = temp;
		}
		Arrays.sort(arr);
		
		for(int i = 0 ; i < M ; i++)
		{
			if(map.get(arr[i]) != null)
			{
				count++;
				stb.append(arr[i] + "\n");
			}
		}

		System.out.println(count);
		System.out.println(stb);
	}

}
