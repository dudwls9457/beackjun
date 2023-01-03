package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class beackjun18870 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		int N = sc.nextInt();
		int rank = 0;
		
		int [] original = new int[N];
		int [] sortArr = new int[N];
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i < N ; i++)
		{
			original[i] = sortArr[i] = sc.nextInt();
		}
		
		Arrays.sort(sortArr);
		
		for(int value : sortArr)
		{
			if(!hashmap.containsKey(value))
			{
				hashmap.put(value, rank);
				rank++;
			}
		}
		
		for(int key : original)
		{
			int ranking = hashmap.get(key);
			stb.append(ranking + " ");
		}
		System.out.println(stb);
	}

}
